package Java_concepts_programes.src.Day11_Methods_Constructors.Methods;

public class GreetingsMain {

    public static void main(String[]args){

        Greetings gr=new Greetings();

        //no parms no return value
       gr.m1(); //Hello

        //no parms return value
       String g = gr.m2();
       System.out.println(g); //Hello, how are you?


        System.out.println(gr.m2()); //Hello, how are you?

        /* parms no return value */
        gr.m3("uday"); //Hello Uday

        //params with return value
        String sr=gr.m4("David");
        //System.out.println(sr);

        //System.out.println(gr.m4);
    }
}