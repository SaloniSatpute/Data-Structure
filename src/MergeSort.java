
public class MergeSort {
	
	private static void merge(int arr[], int startIdx, int midIdx, int endIdx) {
		
		int aux[] = new int[endIdx - startIdx + 1];
		
		int i = startIdx, j = midIdx+1, k=0;
		
		while( i <= midIdx && j <=endIdx) {
			
			if(arr[i] < arr[j]) {
				aux[k] = arr[i];
				i++;
				k++;
			} else {
				aux[k] = arr[j];
				j++;
				k++;
			}
		}
		
		while(i <= midIdx) {
			aux[k] = arr[i];
			i++;
			k++;
		}
		
		while(j <= endIdx) {
			aux[k] = arr[j];
			j++;
			k++;
		}
		
		for( i = startIdx; i <= endIdx; i++) {
			arr[i] = aux[i-startIdx];
		}
	}
	
	private static void mergeSort(int arr[], int startIdx, int endIdx) {
		
		if(startIdx < endIdx) {
			int midIdx = (endIdx + startIdx)/2;
			mergeSort(arr,startIdx,midIdx);
			mergeSort(arr,midIdx+1, endIdx);
			merge(arr, startIdx, midIdx, endIdx);
		}
	}
	
	private static void printArray(int arr[]) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {427, 787, 222, 996, -359, -614, 246, 230, 107, -706, 568, 9, -246, 12, -764, -212, -484, 603, 934, -848, -646, -991, 661, -32, -348, -474, -439, -56, 507, 736, 635, -171, -215, 564, -710, 710, 565, 892, 970, -755, 55, 821, -3, -153, 240, -160, -610, -583, -27, 131};
		mergeSort(arr, 0, arr.length-1);
		printArray(arr);
	}

}
