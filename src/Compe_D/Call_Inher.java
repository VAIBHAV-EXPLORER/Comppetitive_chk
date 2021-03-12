package Compe_D;

class Example
{
	 static void m1() {
		System.out.println("Exam 1");
	}
}
public class Call_Inher extends Example{
	
	 static void m1() {
		Example.m1();
		System.out.println("inherit");
		
		
	}
	public static void main(String args[]) {
		m1();
		Example.m1();
		
	}
}
