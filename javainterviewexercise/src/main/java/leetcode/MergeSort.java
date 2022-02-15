package leetcode;

public class MergeSort {

	public static void main(String[] args) {
		int[] array= new int[]{2,4,1,8,6,5};
		mergeSort(array,0,array.length-1);
		display(array);
		
	}
	
	private static void display(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print(",");
	}

	public static void mergeSort(int[] arr,int low, int high) {
		if(low<high) {
			int mid= (low+high)/2;
			mergeSort(arr,low, mid);
			System.out.println("first merge sort over");
			mergeSort(arr,mid+1, high);
			System.out.println("second merge sort over");
			merge(arr,low, mid, high);
		}
		
	}

	private static void merge(int[] arr,int low, int mid, int high) {
		System.out.println("In merge()");
		int k=low;
	
		int length1= mid-low+1;
		int length2= high-mid;
		display(arr);
		System.out.println("low,mid,high: "+low+" "+mid+" "+high);
		System.out.println("mid-low+1: "+length1);
		System.out.println("high-mid: "+length2);
		int[] l= new int[length1];
		int[] r= new int[length2];
		
		for(int j=0;j<length1; j++) {
			l[j]= arr[low+j];
		}
		for(int j=0; j<length2;j++) {
			r[j]= arr[mid+j+1];
		}
		display(l);
		display(r);
		int i=0;
		int j=0;
		while(i < length1 && j < length2 ) {
			if(l[i] <= r[j]) {
				arr[k]= l[i];
				i++;
			}
			else {
				arr[k]= r[j];
				j++;
			}
			k++;
		}
		while(i < length1) {
			arr[k]= l[i];
			i++;
			k++;
		}
		while(j < length2) {
			arr[k]= r[j];
			j++;
			k++;
		}
		display(arr);
		
	}

}
