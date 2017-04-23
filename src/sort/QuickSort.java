package sort;

import element.IElement;
import pivot.IPivotElement;

public class QuickSort implements SortingAlgorithm {

	private IPivotElement p;

	public QuickSort(IPivotElement p) {
		this.p = p;
	}

	@Override
	public <T> void sort(IElement<T>[] a) {
		if (a == null || a.length == 0) {
			return;
		}
		quicksort(0, a.length - 1, a);
	}

	private <T> void quicksort(int left, int right, IElement<T>[] a) {
		int i = left, j = right;
		long pivot = p.getPivot(left, right, a);

		while (i <= j) {
			while (a[i].getKey() < pivot) {
				i++;
			}
			while (a[j].getKey() > pivot) {
				j--;
			}

			if (i <= j) {
				swap(i, j, a);
				i++;
				j--;
			}
		}
		if (left < j)
			quicksort(left, j, a);
		if (i < right)
			quicksort(i, right, a);
	}

	private <T> void swap(int i, int j, IElement<T>[] a) {
		IElement<T> tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
