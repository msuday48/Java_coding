package Java_concepts_programes.src.Day12_Polymorphism.Method_overloading;

public class Adder {
int a=10 ;int b=5;
void sum(){
System.out.println(a+b);
}
    void sum(int x, int y){
        System.out.println(x+y);
    }

    void sum(double x, double y){
        System.out.println(x+y);
    }
    void sum(int x,double y){
        System.out.println(x+y);
    }

    void sum(double y, int x){
        System.out.println(x+y);
    }

}
