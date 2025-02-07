package Java_concepts_programes.src.Day12_Polymorphism.Super_this_final_keywords.this_keyword;

public class ThisKeyword {

    int x, y;   // class variables/ instance variables

	/*void setData(int x, int y)    // a,b are the local variables
	{
		this.x=x;
		this.y=y;
	}
	*/

    ThisKeyword(int x, int y)
    {
        this.x=x;
        this.y=y;

    }
    void display()
    {
        System.out.println(x+"   "+y);
    }

    public static void main(String[] args)
    {
        //ThisKeyword th=new ThisKeyword();

        ThisKeyword th=new ThisKeyword(10,20);
        //th.setData(10,20);

        th.display();

    }

}
