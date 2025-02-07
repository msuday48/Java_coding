package Java_concepts_programes.src.Day14_Encapsulation;

public class AccountMain {
    public static void main(String[] args) {
    Account acc=new Account();
    acc.setAccno(35789412);
    acc.setName("uday");
    acc.setAmount(12345.55);

    System.out.println(acc.getAccno());
    System.out.println(acc.getAmount());
    System.out.println(acc.getName());


    }
}