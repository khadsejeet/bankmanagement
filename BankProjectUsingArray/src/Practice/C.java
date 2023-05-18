



package Practice;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i <= arr.length; i++) {
			System.out.println("Enter Array Element");
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
