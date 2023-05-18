package Practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter Student Number To Enroll");
		Scanner sc=new Scanner(System.in);
		int stuArraySize=sc.nextInt();
		Student [] sarray=new Student[stuArraySize];
		
		
		
		for(int i=1;i<sarray.length;i++) {
			
			Student s=new Student();
			System.out.println("Enter Sudent Id");
			s.setId(sc.nextInt());
			System.out.println("Enter Sudent Name");
			s.setName(sc.next());
			System.out.println("Enter Sudent Address");
			s.setAddress(sc.next());
			sarray[i]=s;
			
			
		}
		
		for(int i=1;i<sarray.length;i++) {
			Student s1=sarray[i];
			System.out.println(s1.getId());
			System.out.println(s1.getName());
			System.out.println(s1.getAddress());
		}
		
		
		
	}
}
