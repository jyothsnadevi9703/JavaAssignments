package ArrayAssignment;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[] {1,2,5,3,4,5,2};
		int c=0;
		 for(int i:arr) {
		   c++;
		 }
		
		System.out.println("Duplicate elements are: ");
		
		for(int i=0; i<c;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		
	}

}
