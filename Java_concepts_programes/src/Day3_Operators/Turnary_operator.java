package Day3_Operators;

public class Turnary_operator {

	public static void main(String[] args) {
	
// var = exp? resuil1 : result2
		//Example1
		int a=100 , b=200;
		 int res=(a>b)?a:b;
		 System.out.println(res);
		 
		//
		//Ex2
		int person_age=20;
		
		String result= (person_age>18)? "Eligible" : "Not eligible";
		
		System.out.println(result);
		
		//ex3
		
		int x=(1==1)?100:200;
		
		System.out.println(x);
			
		
	}

}
