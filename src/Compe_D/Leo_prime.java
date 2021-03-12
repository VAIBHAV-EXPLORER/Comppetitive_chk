package Compe_D;

import java.util.Scanner;

public class Leo_prime{
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
	    long t=sc.nextLong();
	    long a[]= {2,3,5,7,11,13,17,19,23,29,31,37,
	            41,43,47,53,59,61,67,71,73,79,83,89,97};
	    long i,mul,count;
	    int j;
	    for(i=1;i<=t;i++)
	    {
	        long n=sc.nextLong();
	        if(n==1)
	            count=0;
	        else if(n<=5)
	            count=1;
	        else
	        {
	            mul=1;
	            count=0;
	            for(j=0;j<a.length;j++)
	            {
	                mul=mul*a[j];
	                if(mul<=n && mul>0)
	                    count++;
	                else
	                    break;
	                }

	        }
	        System.out.println(count);


	    }
	}
}