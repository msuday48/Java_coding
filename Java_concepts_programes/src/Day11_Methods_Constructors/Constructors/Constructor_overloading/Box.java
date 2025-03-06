package Java_concepts_programes.src.Day11_Methods_Constructors.Constructors.Constructor_overloading;

public class Box {
  double  width, height, depth;
Box()
    {
 width=height=depth=0;
    }

    Box( double w, double h, double d)
{
  width =w;
  height=h;
  depth=d;
}

Box (double len){
    width=height=depth=len;
}

double volume()
{
    return(width*height*depth);
}
}