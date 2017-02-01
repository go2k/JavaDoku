package de.go2k.javadoku;

public class QuickSort {

	public static void main(String[] args) {

		int[] intarr = { 687, 456, 46, 456, 4564575, 3584, 8748, 478, 478, 47, 847, 8476, 86478, 679, 4345, 67367, 47,
				68, 56, 8, 3567, 478, 56, 8, 4673, 576, 73, 567, 53454, 78, 478, 4678, 4, 784678, 463, 87, 3567, 45567,
				7567, 456, 84, 578, 467, 88987, 47, 83, 56, 73, 7345, 457, 698, 476, 8978, 467, 84, 678, 48, 73, 568,
				6334, 78, 46, 78, 48678, 78, 35, 86789 };

		int[] retarr = quickSort(intarr);

		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i : retarr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		retarr = bubbleSort(intarr);

		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i : retarr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	static int[] quickSort(int[] liste) {
		/*
		 * quickSort ist nur ein bequemer Starter für die eigentliche
		 * Arbeits-Methode qSort().
		 */
		// qSort mit dem gesamten Array aufrufen:
		qSort(liste, 0, liste.length - 1);
		return liste;
	}

	static void qSort(int[] liste, int lo, int hi) {
		int median;
		if (lo < hi) {
			// Vergleichselement Median ermitteln:
			median = liste[hi];
			int i = lo - 1;
			int j = hi;
			System.out.println("-----------------------------------------");
			System.out.println(lo + " " + hi + " ");
			System.out.println("-----------------------------------------");
			for (;;) {
				// Werte von beiden Enden aus vergleichen:
				while (liste[++i] < median)
					;
				while (j > 0 && liste[--j] > median)
					;
				System.out.println(i + "\t" + liste[i] + "\t" + j + "\t" + liste[j] + "\t" + median);
				// Schleife verlassen, falls sortiert:
				if (j <= i) {
					break;
				}
				// Tauschen
				int temp = liste[i];
				liste[i] = liste[j];
				liste[j] = temp;
			}
			liste[hi] = liste[i];
			liste[i] = median;

			// Linke/rechte Partition sortieren:
			qSort(liste, lo, i - 1);
			qSort(liste, i + 1, hi);
		}
	}

	static int[] bubbleSort(int[] liste) {
		boolean sortiert;
		do {
			sortiert = true;
			for (int i = 0; i < liste.length - 1; i++) {
				if (liste[i] > liste[i + 1]) {
					// Tauschen:
					int temp = liste[i];
					liste[i] = liste[i + 1];
					liste[i + 1] = temp;
					// Nicht sortiert!
					sortiert = false;
				}
			}
		} while (!sortiert);
		return liste;
	}
}
