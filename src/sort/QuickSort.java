package sort;

import java.awt.image.PixelInterleavedSampleModel;

import element.Element;
import element.IElement;
import pivot.IPivotElement;
import sun.applet.Main;

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

	private <T> void quicksort(int ilinks, int irechts, IElement<T>[] a) {
		int i = ilinks, j = irechts;
		long pivot = p.getPivot(ilinks, irechts, a);

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
		if (ilinks < j)
			quicksort(ilinks, j, a);
		if (i < irechts)
			quicksort(i, irechts, a);
	}

	private <T> void swap(int i, int j, IElement<T>[] a) {
		IElement<T> tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	
//	private <T> int part(int ilinks, int irechts, IElement<T>[] a) {
//		long pivot;
//		int i, j, pivIndex;
//
//		i = ilinks;
//		j = irechts;
//		pivIndex = p.getPivotIndex(ilinks, irechts);
//		pivot = a[pivIndex].getKey();
//
//		System.out.println("pivot index: " + pivIndex + " pivElement " + pivot);
//		boolean pr = true;
//
//		while (i < j) {
//			while (a[i].getKey() < pivot) {
//				i++;
//			}
//			while (a[j].getKey() > pivot) {
//				j--;
//			}
//			if (i <= j) {
//				swap(i, j, a);
//				if ((a[i].getKey() == a[j].getKey()) && (a[i].getKey() == pivot)) {
//					if (pr) {
//						printArray(a);
//						System.out.println("i and j and pivot are equals");
//						System.out.println("i=" + i + "and j=" + j);
//						pr = false;
//					}
//
//					if (i + 1 == j) {
//						break;
//					} else if (i == j) {
//						break;
//					} else {
//						swap(i + 1, j, a);
//					}
//
//				}
//			}
//		}
//
//		return i + 1;
//	}


	// private

	private <T> void printArray(IElement<T>[] a) {
		System.out.print("Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i].getKey() + ", ");
		}
		System.out.println("\n");
	}
}
