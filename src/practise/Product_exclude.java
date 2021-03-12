package practise;
import java.util.Arrays;
//Given a list of integers nums, return a new list such that each element at index i 
//		of the new list is the product of all the numbers in the original list except the one at i. Do this without using division.
public class Product_exclude {
	public static void method1(int ar[])
	{
		if(ar.length==1) {
			System.out.println("0");
			return;
		}
		int pr[]=new int[ar.length];
		int temp=1;
		for(int i=0;i<ar.length;i++)
		{
			pr[i]=temp;
			temp*=ar[i];
		}
		temp=1;
		for(int i=ar.length-1;i>=0;i--)
		{
			pr[i]*=temp;
			temp*=ar[i];
		}
		System.out.println(Arrays.toString(pr));
		
	}
	
	
	public void method2(int ar[])
	{
		int left[]=new int[ar.length];
		int right[]=new int[ar.length];
		int pr[]=new int[ar.length];
		left[0]=1;
		pr[ar.length-1]=1;
		int temp=1;
		for(int i=1;i<ar.length;i++)
		{
			left[i]=temp;
			temp*=ar[i];
		}
		
		
	}

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		method1(ar);

	}

}
