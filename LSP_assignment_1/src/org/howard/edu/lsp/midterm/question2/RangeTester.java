package org.howard.edu.lsp.midterm.question2;

public class RangeTester {
	public static void main(String[]args) {
		IntegerRange range1 = new IntegerRange(1,10);
		IntegerRange range2 = new IntegerRange(5,15);
		IntegerRange range3 = new IntegerRange(11,20);
		
		System.out.println("Range1 contains 5: " + range1.contains(5));
		System.out.println("Range1 contains 11: " + range1.contains(11));
		
		System.out.println("Range1 overlaps Range2: " + range1.overlaps(range2));
		System.out.println("Range1 overlaps Range3: " + range1.overlaps(range3));
		
		System.out.println("Size of Range1: " + range1.size());
		
		System.out.println("Range1 equals Range2: " + range1.equals(range2));
		IntegerRange range4 = new IntegerRange(1,10);
		System.out.println("Range1 equals Range4: " + range1.equals(range4));
	}
}
