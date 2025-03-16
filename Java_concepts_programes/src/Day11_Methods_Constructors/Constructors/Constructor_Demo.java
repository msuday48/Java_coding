package Java_concepts_programes.src.Day11_Methods_Constructors.Constructors;

// Java program to illustrate Constructor Chaining to
/*No, constructors cannot be overridden in Java because they are not inherited by subclasses.
    Overriding occurs when a subclass provides a new implementation for a method that it inherits from its parent class. However, constructors are not methods, and they do not participate in inheritance.


Why Can't Constructors Be Overridden?
Constructors are not inherited – Only methods are inherited by subclasses, but constructors are specific to the class in which they are defined.
Constructors have the same name as the class – If a subclass defines a constructor with the same name as the superclass constructor,
it is simply a new constructor, not an overridden one.
Constructor chaining works differently – A subclass constructor can call a superclass constructor using super(), but this is not overriding.  */

/* Constructor chaining

Constructor chaining is the process of calling one constructor from another constructor within the same class or from a parent class using
this() or super(). It helps in code reuse and ensures that object initialization happens in a controlled manner.
 */
// other class using  this() super() keyword
class Constructor_chaining
{
    String name;

    // constructor 1
    Constructor_chaining()
    {
        this("");
        System.out.println("No-argument constructor of" +
                " base class");
    }

    // constructor 2
    Constructor_chaining(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of base");
    }
}

class Derived extends  Constructor_chaining
{
    // constructor 3
    Derived()
    {
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
    Derived(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }

    public static void main(String args[])
    {
        // calls parameterized constructor 4
        Derived obj = new Derived("test");

        // Calls No-argument constructor
        // Derived obj = new Derived();
    }
}
