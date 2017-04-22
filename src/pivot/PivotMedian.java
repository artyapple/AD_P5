package pivot;

import element.IElement;

public class PivotMedian implements IPivotElement{

	private final int THREE_MEDIAN = 3;
	
	@Override
	public <T> long getPivot(int startIndex, int endIndex, IElement<T>[] a) {
		long pivot = 0;
		int med[] = new int[]{startIndex, endIndex, (endIndex+startIndex)/2};
		for(int ind : med){
			pivot = pivot + a[ind].getKey(); 
		}		 
		System.out.println("Median: " + pivot/THREE_MEDIAN);
		return (pivot/THREE_MEDIAN);
	}

}
