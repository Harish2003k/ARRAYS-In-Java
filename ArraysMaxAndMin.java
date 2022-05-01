import java.util.*;
public class ArraysMaxAndMin {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int number[]=new int [size]; // only integer hold maximum value 
	for(int i=0;i<size;i++) {    // only integer hold minimum value
     number[i]=sc.nextInt();
	}
    int min=Integer.MIN_VALUE;
	int max=Integer.MAX_VALUE;
	for(int i=0;i<number.length;i++) {
		if(number[i]<min) {
			min=number[i];
		}
		if(number[i]>max) {
			max=number[i];
		}
	}
	System.out.println("Largest number is:"+max);
	System.out.println("Smallest number is:"+min);
}
}
