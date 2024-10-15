package Day3_Operators;

public class OperatorDemo {
	
	public static void main(String [] args) {
		
	//1) Arthmetic operators (+ , -, * , / ,%)
		int a=20, b=10;
		
		System.out.println("Sum of a and b is" + (a+b));
		System.out.println("Sum of a and b is" + (a-b));
		System.out.println("Sum of a and b is" + (a*b));
		System.out.println("Sum of a and b is" + (a/b));
		System.out.println("Sum of a and b is" + (a%b));
		
		//Relational/Comparison operators > >= < <= != ==
		System.out.println(a>b); // true 
		System.out.println(a>=b);  //true
		System.out.println(a<b); //false
		System.out.println(a<=b); //false
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		
		
		//Logical operators (  && || ! )		
		// returns boolean value - true/false
		// works between 2 boolean values
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y); //true
		System.out.println(x || y); //true
		System.out.println(!x); //false
		
		boolean b1 = 10>20;
		System.out.println(b1); //false
		
		boolean b2=20>10;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2 ); //false
		
		System.out.println(b1 || b2);//true
		
	    System.out.println((10<20) && (20>10));	// true
	    
		System.out.println((10<20) || (20>10)); //true
		
		System.out.println(!(10<20));

	
	
	
	
	
	
	
	
	
	
	
	
	}}


