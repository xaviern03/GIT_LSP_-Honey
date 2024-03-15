package org.howard.edu.lsp.midterm.question2;

public class IntegerRange implements Range {
	private int lowerBound;
	private int upperBound;
	
	public IntegerRange(int lower, int upper) {
		this.lowerBound = lower;
		this.upperBound = upper;
	}
	
	/**
	 * Returns true if value is greater than or equal to lower bound and less than or equal to upper bound.
	 */
	
	public boolean contains(int value) {
		return value >= lowerBound && value <= upperBound;
	}
	
	/**
	 * Returns true if this range contains at least one value in common with the other range.
	 */
	public boolean overlaps(Range other) {
		if (other instanceof IntegerRange) {
			IntegerRange otherRange = (IntegerRange) other;
			return this.lowerBound <= otherRange.upperBound && this.upperBound >= otherRange.lowerBound;
		}
		return false;
	}
	
	/**
	 * Returns the number of integers in the range.
	 */
	
	public int size() {
		return upperBound - lowerBound + 1;
	}
	
	/**
	 * Two Ranges are equal if their lower and upper bounds are the same.
	 */
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass()!= obj.getClass()) return false;
		IntegerRange that = (IntegerRange) obj;
		return lowerBound == that.lowerBound && upperBound == that.upperBound;
	}
	
	public int hashCode() {
		return 31 * lowerBound + upperBound;
	}
}
