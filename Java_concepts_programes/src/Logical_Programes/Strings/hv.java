package Java_concepts_programes.src.Logical_Programes.Strings;

public class hv {
    //POLYMORPHISM

    //Method overlolading
   public void main(int a){
        System.out.println(a);
    }

   public void main(int a , int b){
        System.out.println("sum" + (a+b));
    }

    public static void main(String[]args){
        hv a=new hv();
        a.main(10);
        a.main(10+20);
    }

    //Method overriding


}



