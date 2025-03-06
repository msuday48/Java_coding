 package Java_concepts_programes.src.Logical_Programes.Arrays;

public class Max_Min_Array
{
   public static void main(String[]args){
    int a[]={50,10,40,20,60};

    int max=a[0];
		for(int i=1;i<a.length;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }
		System.out.println("max of array value : "+ max);

    // minimum
    int b[ ]={50,10,40,2,60};

    int min=b[0];

		for(int i=1;i<b.length;i++)
    {
        if(b[i]<min)
        {

            min=b[i];
        }
    }
		System.out.println("max of array value : "+ min);
}}