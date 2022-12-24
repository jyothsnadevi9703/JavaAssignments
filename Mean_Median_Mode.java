package ArrayAssignment;

public class Mean_Median_Mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [] {1,2,3,4,5,5,2};
		
		int c=0;
		 for(int i:arr) {
		   c++;
		 }
		System.out.println("Mean is: ");
		
		int sum=0;
		 for(int i=0; i<c;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum/c);
		
		System.out.println("Median is: ");
		
		int c1=0;
		for(int i=0;i<c;i++) {
			c1++;
		}
		System.out.println(c1/2);
		
		System.out.println("Mode is");
		
		for(int i=0; i<c;i++) {
			for(int j=i+1;j<c;j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		

	}

}
