package sort;
import element.IElement;

public class QuickSort implements SortingAlgorithm {

	@Override
	public <T> void sort(IElement<T>[] a) {
		// TODO Auto-generated method stub

	}

	private <T> void quicksort(int ilinks, int irechts, IElement<T>[] a) {
		long pivot;
		int i, j;
		IElement<T> tmp;
		if (irechts > ilinks) {
			i = ilinks;
			j = irechts - 1;
			pivot = a[irechts].getKey();
			while (true) {
				while (a[i].getKey() < pivot) {
					i++;
				}
				while (a[j].getKey() >= pivot) {
					j--; // Vorsicht:
							// Stop-Element einbauen
				}
				if (i >= j)
					break; // in der Mitte getroffen
				swap(i, j, a); // vertauschen
			}
			swap(i, irechts, a);// Pivotelement in die Mitte tauschen
			quicksort(ilinks, i - 1, a);
			quicksort(i + 1, irechts, a);
		}
	}

	private <T> void swap(int i, int j, IElement<T>[] a) {
		IElement<T> tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
