package Java_concepts_programes.src.Day5_Looping_Satements;

public class Looping_statements {
    public static void main(String[]args){

        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        for(int i=1;i<=10;i++){
            if(1==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
