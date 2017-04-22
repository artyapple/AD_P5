package pivot;

import element.IElement;

public class PivotFirst implements IPivotElement {

	@Override
	public <T> long getPivot(int startIndex, int endIndex, IElement<T>[] a) {
		return a[startIndex].getKey();
	}

}
