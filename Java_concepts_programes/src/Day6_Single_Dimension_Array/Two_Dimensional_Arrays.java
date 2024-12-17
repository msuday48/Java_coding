package Java_concepts_programes.src.Day6_Single_Dimension_Array;

public class Two_Dimensional_Arrays {

  public static void main(String[]args){

      //declaration
/*
      //Aproach
      int a[][]=new int [3][2];
      //adding values
      a[0][0]=100;
      a[0][1]=200;

      a[1][0]=300;
      a[1][1]=400;

      a[2][0]=500;
      a[2][1]=600;
        */

      //Approach2:declaration+adding values
      int a[][]= {
              {100,200,300},
              {400,500,600},
              {700,800,1000}
                  };
      //3)Find size of an array
      System.out.println(a.length);// returns number of rows 3
      System.out.println(a[0].length);// returns number of columns in specific row 3

      //4) read single value from an array
      System.out.println(a[1][1]); //400
      System.out.println(a[2][1]); //800

      //5)reading data from 2D array
      for(int i=0;i<a.length-1;i++)
      {
      for(int j=0;j<a[i].length-1;j++){

          System.out.print(a[i][j]+"  ");
      }
      System.out.println();
  }

      //Enhanced for loop
      for(int arr[]:a){
          for (int x:arr){
              System.out.println(x+"");
          }
          System.out.println();
      }
}}
