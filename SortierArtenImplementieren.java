public class SortierArtenImplementieren {
	private static int[] zuSortieren= {2,6,3,9,4,1};
	
	public static void main(String[] args) {
		int [] bSortiert=bubblesort(zuSortieren);
		int [] sSortiert=selectionsort(zuSortieren);
		int [] iSortiert=insertionSort(zuSortieren);
		System.out.println("Der unsortierter Array:");
		ausgabe(zuSortieren);
		System.out.println("\nBubblesort:");
		ausgabe(bSortiert);
		System.out.println("\nSelectionsort:");
		ausgabe(sSortiert);
		System.out.println("\nInsertsort:");
		ausgabe(iSortiert);		
	}
	private static void ausgabe(int[] art) {
		for (int i = 0; i < zuSortieren.length; i++) {
			System.out.print(art[i] + ", ");
		}
	}
	public static int[] bubblesort(int[] x) {
		int temp;
		for(int i=1; i<x.length; i++) {
			for(int j=0; j<x.length-i; j++) {
				if(x[j]>x[j+1]) {
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		return x;
	}
	
	public static int[] selectionsort(int[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

		return x;
	}
	
	public static int[] insertionSort(int[] x) {
		int temp;
		for (int i = 1; i < x.length; i++) {
			temp = x[i];
			int j = i;
			while (j > 0 && x[j - 1] > temp) {
				x[j] = x[j - 1];
				j--;
			}
			x[j] = temp;
		}
		return x;
	}
}