//sonali2
package Question;
import java.util.Scanner;

public class Exceeptions {

	public static void main(String[] args) throws Exception {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		a=sc.nextInt();
   
		System.out.print("Enter second number : ");
		b=sc.nextInt();
		
	    	 
		try
		{
			c=a/b;
			System.out.println("Result:"+c);
			
		}	
		catch(ArithmeticException e)
		{
			System.out.println("ArithematicError:"+e.getMessage());
			System.out.println("Error:"+e);
		}
		if (a == 0 || b == 0){
	    	 {
throw new Exception("Enter vaild number");
	
	    }	
		}
}
	}

