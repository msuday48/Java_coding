package Java_concepts_programes.src.Day13Inheritance;

class A
{
    int a;
    void display()
    {
        System.out.println(a);
    }

}


class B extends A
{
    int b;

    void show()
    {
        System.out.println(b);
    }
}


class C extends B
{
    int c;

    void print()
    {
        System.out.println(c);
    }
}


public class inheritanceTypes {

    public static void main(String[] args)
    {
			/*B bobj=new B();
			bobj.a=10;
			bobj.b=20;

			bobj.display();
			bobj.show();
			*/

        C cobj=new C();

        cobj.a=100;
        cobj.b=200;
        cobj.c=300;

        cobj.display();
        cobj.show();
        cobj.print();


    }

}

