package ArrayAssignment;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] =new int[] {1,2,3,4,5};
		int c=0;
		 for(int i:array1) {
		   c++;
		 }
		System.out.println("The original array is: ");
		for(int i=0;i<c;i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		System.out.println("The reverse array is ");
		for (int i=c-1;i>=0;i--) {
			System.out.print(array1[i]+" ");
		}

	}

}
