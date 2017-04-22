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

	// private <T> void quicksort(int ilinks, int irechts, IElement<T>[] a) {
	//
	// if (irechts <= ilinks) {
	// return;
	// }
	//
	// long pivot;
	// int i, j, pivIndex;
	//
	// i = ilinks;
	// j = irechts;
	// pivIndex = p.getPivotIndex(ilinks, irechts);
	// pivot = a[pivIndex].getKey();
	//
	// while (true) {
	// //while ((i < pivIndex) && (a[i].getKey() <= pivot)) {
	// while (a[i].getKey() < pivot) {
	// i++;
	// }
	// //while ((j > pivIndex) && (a[j].getKey() >= pivot)) {
	// while (a[j].getKey() >= pivot) {
	// if(j>0){
	// j--; // Vorsicht: Stop-Element einbauen
	// } else {
	// break;
	// }
	// }
	// if (i >= j) break;
	// swap(i, j, a); // vertauschen
	//
	// // if (i == pivIndex) // wenn true, dann wurde das Pivot nach rechts
	// // verschoben
	// // pivIndex = j;
	// // else if (j == pivIndex) // wenn true, dann wurde das Pivot nach
	// // links verschoben
	// // pivIndex = i;
	// // }
	// }
	// //swap(i, pivIndex, a);// Pivotelement in die Mitte tauschen
	// quicksort(ilinks, i-1, a);
	// quicksort(i+1, pivIndex, a);
	// }

	private <T> void quicksort(int ilinks, int irechts, IElement<T>[] a) {
		int i = ilinks, j = irechts;
		// Get the pivot element from the middle of the list
		// int pivot = a[low + (high-low)/2];
		int pivIndex = p.getPivotIndex(ilinks, irechts);
		long pivot = a[pivIndex].getKey();

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller than the pivot
			// element then get the next element from the left list
			while (a[i].getKey() < pivot) {
				i++;
			}
			// If the current value from the right list is larger than the pivot
			// element then get the next element from the right list
			while (a[j].getKey() > pivot) {
				j--;
			}

			// If we have found a value in the left list which is larger than
			// the pivot element and if we have found a value in the right list
			// which is smaller than the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				swap(i, j, a);
				i++;
				j--;
			}
		}
		// Recursion
		if (ilinks < j)
			quicksort(ilinks, j, a);
		if (i < irechts)
			quicksort(i, irechts, a);
	}

	// }
	// if (ilinks < irechts) {
	// int p = part(ilinks, irechts, a);
	// quicksort(ilinks, p - 1, a);
	// quicksort(p, irechts, a);
	// }
	// }

	private <T> int part(int ilinks, int irechts, IElement<T>[] a) {
		long pivot;
		int i, j, pivIndex;

		i = ilinks;
		j = irechts;
		pivIndex = p.getPivotIndex(ilinks, irechts);
		pivot = a[pivIndex].getKey();

		System.out.println("pivot index: " + pivIndex + " pivElement " + pivot);
		boolean pr = true;

		while (i < j) {
			while (a[i].getKey() < pivot) {
				i++;
			}
			while (a[j].getKey() > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j, a);
				if ((a[i].getKey() == a[j].getKey()) && (a[i].getKey() == pivot)) {
					if (pr) {
						printArray(a);
						System.out.println("i and j and pivot are equals");
						System.out.println("i=" + i + "and j=" + j);
						pr = false;
					}

					if (i + 1 == j) {
						break;
					} else if (i == j) {
						break;
					} else {
						swap(i + 1, j, a);
					}

				}
			}
		}

		return i + 1;
	}

	private <T> void swap(int i, int j, IElement<T>[] a) {
		IElement<T> tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	// private

	private <T> void printArray(IElement<T>[] a) {
		System.out.print("Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i].getKey() + ", ");
		}
		System.out.println("\n");
	}
}
