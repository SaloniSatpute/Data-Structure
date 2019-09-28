
public class InsertionSort {
	
	private static int[] sort(int []arr) {
		
		if(arr.length == 0) 
			return arr; 
		
		for(int i=1; i < arr.length;i++) {
			
			int j = i-1;
			int value = arr[i];

			//Create a hole at position i and shift the elements to right till
			//the element at i is less than element at j;
			
			while(j >= 0 && value < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = value;
		}
		
		return arr;
		
	}
	
	private static void printArr(int arr[]) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {427, 787, 222, 996, -359, -614, 246, 230, 107, -706, 568, 9, -246, 12, -764, -212, -484, 603, 934, -848, -646, -991, 661, -32, -348, -474, -439, -56, 507, 736, 635, -171, -215, 564, -710, 710, 565, 892, 970, -755, 55, 821, -3, -153, 240, -160, -610, -583, -27, 131};
		int res[] = sort(arr);
		printArr(res);
	}

}
