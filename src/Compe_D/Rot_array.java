package Compe_D;

import java.util.*;
public class Rot_array {
	public static void main(String args[])
	{
	int n,d,temp;int k;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	int ar[]=new int[n];
	d=in.nextInt();
	
	for(int i=0;i<n;i++)
	{
		ar[i]=in.nextInt();
	}
	
	for(int i=1;i<=d;i++)
	{
		temp=ar[0];
		k=1;
		for(int j=0;j<n-1;j++,k++)
		{
			ar[j]=ar[k];
		}
		ar[n-1]=temp;
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(ar[i]+" ");
	}
	in.close();
	}
}
