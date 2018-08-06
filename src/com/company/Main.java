package com.company;

/*
 * Line 41&42
    * the class uses the access specifier public, which indicates that our class is     accessible to other classes (public scope).
        * There two access specifier possible for our class(not inner classes): one is public and other is default
            * public --> public class Main
            * default (where you don't type anything) --> class Main
    * class is the keyword used to create java classes.
    * third word indicates the name of the class is Main (for this example)

    * IDENTIFIERS in Java represent following (more information in JAVA NOTES):
        * Name of the class
        * Name of the method
        * Name of the variable
            * EXAMPLE: Main, main, args, System(class name), out (Reference Variable name), println(method name) are examples of identifiers

 * Line 42
    * the main method is a special method which indicates the starting point of the ajva program.. this class the control goes inside the main method and starts executing statement one by one

    * public is one of the four access specifiers can be applied to methods in Java:
        * private
        * default(don't specify anything)
        * protected
        * public
            * BUT THIS SPECIAL MAIN METHOD MUST BE DECLARED PUBLIC ONLY
    * static means that the main method is shared among all instances of this class
    * void means this method does not return anything
    * method names in java(example:main) are followed by (.
        * IF method takes no arguments it should end with ).
            * Example: public void play()
        * But IF method takes arguments, add the argument declarations and then add ).
            * Example: public void play(String sport)
            * In our example, it is accepting a string array as a parameter
    * args is the name of the String array parameter (it can be whatever you like actually)
 * Line 49&51
    * System.out.println("") vs. System.out.print("");
        *println - adds a newline character that it takes you to another line
        *print - keeps the cursor at the line
 * */
public class Main {
    public static void main(String[] args) {
        /* This is how you print out Hello World - refer to JAVA NOTES for info on System.out.println()*/

        /* prints out like this:
          Hello World
          HolaCiao
         */
        System.out.println("Hello World");
        System.out.print("Hola");
        System.out.print("Ciao");
    }
}
