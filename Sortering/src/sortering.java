import java.util.Scanner;

public class sortering {

	// vi behöver en 100 array av int
	static int[] lista = new int[1000];

	static void slumpaLista() {
		for (int i = 0; i < 1000; i++)
			lista[1] = (int) (Math.random() * 1000);
	}

	public static void main(String[] args) {
		slumpaLista();

		System.out.println("Arrayen är sorterad och bubblesort ");
		
		slumpaLista();
		// Bubbelsortera
		long startTime = System.currentTimeMillis();
		bubbleSort(lista);
		long finishTime = System.currentTimeMillis();
		System.out.println("Det tog" + (finishTime - startTime) + "ms att dubbelsortera");
		
		// slumpa igen.
		slumpaLista();
		startTime = System.currentTimeMillis();
		// och insertsortera.
		// insertSort();
		finishTime = System.currentTimeMillis();
		System.out.println("Det Tog" + (finishTime - startTime) + "ms att instickssortera");
		
		slumpaLista();
		// quicksort
		long startTime2 = System.currentTimeMillis();
		quickSort(lista);
		long finnishtime = System.currentTimeMillis();
		System.out.println("Det tog" + (finnishtime - startTime2) + "ms att dubbelsortera");
		
		// slumpa igen
		slumpaLista();
		startTime = System.currentTimeMillis();
		// och insertsortera.
		// insertSort();
		finnishtime = System.currentTimeMillis();
		System.out.println("Det tog" + (finnishtime - startTime) + "ms att instickssortera");
		

	}

	private static void quickSort(int[] lista2) {
		// TODO Auto-generated method stub
		
	}

	public static void bubbleSort(int[] numArray) {

		int n = numArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (numArray[j - 1] > numArray[j]) {
					temp = numArray[j - 1];
					numArray[j - 1] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
		
		if (low >= high)
			return;
		
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
	
	
	
	
}
