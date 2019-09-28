
public class QuickSort {
	
	private static void quickSort(int startIdx, int endIdx, int arr[]) {
		
		if(startIdx >= endIdx) {
			return;
		}
		
		int pivot = arr[endIdx];
		int rightIdx = endIdx -1;
		int leftIdx = startIdx;
		
		while(leftIdx <= rightIdx) {
			
			if(arr[leftIdx] > pivot && arr[rightIdx] < pivot) {
				swap(leftIdx,rightIdx, arr);
			} 
			if(arr[leftIdx] <= pivot) {
				leftIdx++;
			}
			if(arr[rightIdx] >= pivot) {
				rightIdx--;
			}
		}
		
		swap(leftIdx, endIdx, arr);
		quickSort(startIdx, leftIdx-1, arr);
		quickSort(leftIdx+1, endIdx, arr);
	}
	
	private static void swap(int i, int j, int []arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void printArray(int arr[]) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] = {427, 787, 222, 996, -359, -614, 246, 230, 107, -706, 568, 9, -246, 12, -764, -212, -484, 603, 934, -848, -646, -991, 661, -32, -348, -474, -439, -56, 507, 736, 635, -171, -215, 564, -710, 710, 565, 892, 970, -755, 55, 821, -3, -153, 240, -160, -610, -583, -27, 131};
		int arr[] = {4};
		quickSort(0, arr.length-1, arr);
		printArray(arr);
	}

}
