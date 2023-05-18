package Practice;

public class A {

	public static void main(String[] args) {
		
		try {
		int arr[]=new int[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		//arr[5]=300;
		
		for(int i=0;i<=arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index Outof Bound"+e.getMessage());
		}
	}
}
