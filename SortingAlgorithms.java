package algorithm;

public class SortingAlgorithms {

	void bubbleSort(int[] arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			for(int j= 1;j< (n - i); j++){
				if(arr[j-1] > arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	void insertionSort(int[] arr) {
		int n = arr.length;
		int newValue;
		for(int i = 1; i < n; i++){
			newValue = arr[i];
			int j = i;
			while(j > 0 && arr[j-1] > newValue){
				arr[j] = arr[j-1];
				j--;
			}
			arr[i] = newValue;
		}
	}
	
	void selectionSort(int[] arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			int minValue = arr[i];
			int minIndex = i;
			for(int j = i + 1; j < (n - i); j++){
				if(arr[j] < minValue){
					minValue = arr[j];
					minIndex = j;
				}
			arr[minIndex] = arr[i];
			arr[i] = minValue;
			}
		}
	}
	
}
