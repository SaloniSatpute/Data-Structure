
public class SelectionSort {
	
	private static void selectionSort(int arr[]) {
		int i=0,j, minIdx;
		
		if(arr.length <= 1)
			return;
		
		while(i < arr.length-1) {
			j = i+1;
			minIdx = i;
			
			while(j < arr.length) {
				if(arr[j] < arr[minIdx])
					minIdx = j;
				j++;
			}
			
			swap(i,minIdx,arr);
			i++;
		}
	}
	
	private static void swap(int i,int j, int arr[]) {
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
		
		int arr[] = {427, 787, 222, 996, -359, -614, 246, 230, 107, -706, 568, 9, -246, 12, -764, -212, -484, 603, 934, -848, -646, -991, 661, -32, -348, -474, -439, -56, 507, 736, 635, -171, -215, 564, -710, 710, 565, 892, 970, -755, 55, 821, -3, -153, 240, -160, -610, -583, -27, 131};
		selectionSort(arr);
		printArray(arr);
	}

}
