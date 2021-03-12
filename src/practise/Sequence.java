package practise;
import java.util.Scanner;
import java.math.BigInteger;

public class Sequence {

	    /*
	     * Complete the summingSeries function below.
	     */
	    static int summingSeries(int n) {
	        int sum=0;
	        for(int i=1;i<=n;i++)
	        {
	            int t=i*i-(i-1)*(i-1);
	             sum=(int)(sum+t);
	        }
	        return sum;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args)  {
	      
	        int t = scanner.nextInt();

	        for (int tItr = 0; tItr < t; tItr++) {
	            int n = scanner.nextInt();

	            int result = summingSeries(n);

	            System.out.println(result);
	         
	        }
	    }
	}
