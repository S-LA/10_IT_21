/*
 *    JAVA BASICS
 *    
 *    Calculator.java
 *    - simple console application to add two integers.
 *    - a *.java file is usually saved in the "src" (source code) folder  
 */
package src;

// CLASS
/*
 *     public   -> This class is visible to and can be called to run
 *                 in any other class using <Calculator.method(args);>.
 *     class    -> A piece of code that serves a specific purpose.
 *                 By convention the class identifier should be 
 *                 capitilised, in this case it is Calculator.
 *                 The class name must match the name of the Java file
 */
public class Calculator {

   
  // MAIN METHOD
  /*    
   *     public   -> Allows access to the method from external classes.
   *     static   -> A static method is created at runtime and persists 
   *                 in the heap.
   *     void     -> Data type that does not require a value to be return 
   *                 before the end the method.
   *     main     -> creating a main method is required to
   *                 run the Java file.
   *     ()       -> parameters declared in the brackets allow information
   *                 to be parsed to method, when used from an external class.
   *     String[] -> A String array with the identifier <args> is a required 
   *                 parameter in the main class. The array does not have to
   *                 atually have to contain any elements or have any parsed 
   *                 to it.
   */  
   public static void main(String[] args){
      
       