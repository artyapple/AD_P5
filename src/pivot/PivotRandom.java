package pivot;


public class PivotRandom implements IPivotElement {

	@Override
	public int getPivotIndex(int startIndex, int endIndex) {
		return (int) (startIndex + Math.random()*(endIndex - startIndex +1));
	}

}
