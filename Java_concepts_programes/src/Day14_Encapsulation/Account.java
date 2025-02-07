package Java_concepts_programes.src.Day14_Encapsulation;

public class Account {

    private int accno;
    private String name;
    private double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccno(){
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }
}
