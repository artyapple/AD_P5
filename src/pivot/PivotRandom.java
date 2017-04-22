package pivot;

import element.IElement;

public class PivotRandom implements IPivotElement {

	@Override
	public <T> long getPivot(int startIndex, int endIndex, IElement<T>[] a) {
		int index = (int) (startIndex + Math.random()*(endIndex - startIndex +1));
		return a[index].getKey();
	}

}
