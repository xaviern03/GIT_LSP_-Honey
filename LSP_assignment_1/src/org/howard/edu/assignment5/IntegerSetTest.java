package org.howard.edu.assignment5; // Adjust this to match your actual package structure

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {

    @Test
    @DisplayName("Test case for adding elements")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1), "Set should contain the added element.");
    }

    @Test
    @DisplayName("Test case for removing elements")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(2);
        set.remove(2);
        assertFalse(set.contains(2), "Set should not contain the removed element.");
    }

    @Test
    @DisplayName("Test case for contains method")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        assertTrue(set.contains(3), "Set should contain the element 3.");
    }

    @Test
    @DisplayName("Test case for getting the largest element")
    public void testLargest() throws Exception {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(3, set.largest(), "The largest element should be 3.");
    }

    @Test
    @DisplayName("Test case for getting the smallest element")
    public void testSmallest() throws Exception {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(1, set.smallest(), "The smallest element should be 1.");
    }

    @Test
    @DisplayName("Test case for checking equality")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(1);

        assertTrue(set1.equals(set2), "Both sets should be considered equal.");
    }

    @Test
    @DisplayName("Test case for union of two sets")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        IntegerSet resultSet = set1.union(set2);
        assertTrue(resultSet.contains(1) && resultSet.contains(2) && resultSet.contains(3), "Union should contain all elements from both sets.");
    }

    @Test
    @DisplayName("Test case for intersection of two sets")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);

        IntegerSet resultSet = set1.intersect(set2);
        assertTrue(resultSet.contains(3) && !resultSet.contains(1) && !resultSet.contains(4), "Intersection should only contain common elements.");
    }

    @Test
    @DisplayName("Test case for difference of two sets")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);

        IntegerSet resultSet = set1.diff(set2);
        assertTrue(resultSet.contains(1) && !resultSet.contains(3), "Difference should contain elements unique to the first set.");
    }

    @Test
    @DisplayName("Test case for isEmpty method")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "Newly created set should be empty.");
    }

    @Test
    @DisplayName("Test case for the toString method")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        String result = set.toString();
        assertTrue(result.contains("1") && result.contains("2"), "toString should return a string representation containing all elements.");
    }

    @Test
    @DisplayName("Test for largest method with an empty set")
    public void testLargestWithEmptySet() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(Exception.class, set::largest, "Calling largest on an empty set should throw an exception.");
        assertEquals("Set is empty.", exception.getMessage());
    }

    @Test
    @DisplayName("Test for smallest method with an empty set")
    public void testSmallestWithEmptySet() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(Exception.class, set::smallest, "Calling smallest on an empty set should throw an exception.");
        assertEquals("Set is empty.", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for length method")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length(), "Empty set should have a length of 0.");
        set.add(1);
        assertEquals(1, set.length(), "Set with one element should have a length of 1.");
    }
}