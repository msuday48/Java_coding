package Java_concepts_programes.src.Day12_Polymorphism.Super_this_final_keywords.Static_keyword;

public class StaticDemo {

    static int a=10;   // static variable
        int b=20;    // nonstatic variable

        static void m1()     // static method
        {
            System.out.println("this is m1 static method...");
        }

        void m2()  // non-static
        {
            System.out.println("this is m2 non-static method...");
        }


        void m()   // non-static
        {
            System.out.println(a);
            System.out.println(b);
            m1();
            m2();
        }

	/*public static void main(String[] args)
	{
		//System.out.println(a);
		//m1();

		//System.out.println(b); // we cannot access bcoz b is non-static
		//m2();  // we cannot access bcoz m2 is non-static

		StaticDemo sd=new StaticDemo();
		//System.out.println(sd.b);
		//sd.m2();


		sd.m();

	}*/

    }
