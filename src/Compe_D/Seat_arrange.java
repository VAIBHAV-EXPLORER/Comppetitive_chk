package Compe_D;

import java.util.Scanner;

public class Seat_arrange {
	    public static void main(String args[] ) throws Exception {
	        Scanner in=new Scanner(System.in);
	        int T=in.nextInt();
	        while(T>0)
	        {
	            int n=in.nextInt();
	            if(n>=1 && n<=108)
	            {
	                int r=n%12;
	                switch(r)
	                {
	                    case 0:
	                    n-=11;
	                    System.out.println(n+" "+"WS");
	                    break;
	                    case 1:
	                    n+=11;
	                    System.out.println(n+" "+"WS");
	                    break;
	                    case 2:
	                    n+=9;
	                    System.out.println(n+" "+"MS");
	                    break;
	                    case 3:
	                    n+=7;
	                    System.out.println(n+" "+"AS");
	                    break;
	                    case 4:
	                    n+=5;
	                    System.out.println(n+" "+"AS");
	                    break;
	                    case 5:
	                    n+=3;
	                    System.out.println(n+" "+"MS");
	                    break;
	                    case 6:
	                    n+=1;
	                    System.out.println(n+" "+"WS");
	                    break;
	                    case 7:
	                    n-=1;
	                    System.out.println(n+" "+"WS");
	                    break;
	                    case 8:
	                    n-=3;
	                    System.out.println(n+" "+"MS");
	                    break;
	                    case 9:
	                    n-=5;
	                    System.out.println(n+" "+"AS");
	                    break;
	                    case 10:
	                    n-=7;
	                    System.out.println(n+" "+"AS");
	                    break;
	                    case 11:
	                    n-=9;
	                    System.out.println(n+" "+"MS");
	                    break;
	                }
	            }
	            T--;
	        }
	 

	    }


}
