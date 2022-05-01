import java.util.*;
public class FindEnterNumber {
	public static void main(String args[]) {
		System.out.println("Enter the size of an arrys:");
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		int number[]=new int [size];
		System.out.println("Enter the number of element :");
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		System.out.println("Enter the element that you want to search:");
		int x=sc.nextInt();
		for(int i=0;i<number.length;i++) {  // linear search
			if(number[i]==x) {
				System.out.println("x is found at index :"+i);
				break;
			}
			else {
				System.out.println("x id not found in arrays:"+i);
				}
			
		}
		
	}
}
