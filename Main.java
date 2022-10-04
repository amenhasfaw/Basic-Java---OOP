import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import org.xml.sax.InputSource;

import java.awt.*;
import java.text.NumberFormat;

//  Basics

public class Main{
    public static void main(String[] args){
        // Hello World
        System.out.println("Hello World");

        //Initializing Variables
        int age = 22;
        System.out.println(age);

        //Changing a Variable
        age = 23;
        System.out.println(age);

        //Types of Variables(Primitive)
        byte num = 55; //Takes 2 bytes and Range [-128 - 127]
        int viewCount = 2_000_000_000; //Takes 4 bytes and range[2 Billion]
        long hugeNum = 3_000_000_000L; //Takes 8 bytes 
        float Price = 10.99F; //Takes 4 bytes and Decimal
        char letter = 'A'; //Represent only one character
        boolean isEligible = true; // True or False

        // Non-primitive 
        Date now = new Date(); //Import package and assigns a new variable by using the 'new' operator
        now.getTime(); // 'now' is an instance of the DATE class. getTime is a method
        System.out.println(now);

        //Primitive vs Non-primitive(Reference) types
          // Primitive type are independent of eachother

        int x = 2;
        int y = x;
        x = 1;
        System.out.println(y); // Y is not affected
          // Non-primitive types are dependent since they just refer to the object and not store it
        Point point1 = new Point(20,20);
        Point point2 = point1;
        System.out.println(point1);
        System.out.println(point2);
        point1.x = 40;
        System.out.println(point1);
        System.out.println(point2); // The change of Point1 changes Point2

        //STRINGS

        // String myName = new String("Amen Habtamu"); // Long form
        String myName = "Amen Habtamu Asfaw"; // Short form for convenience
        System.out.println(myName);
            
        // Different Methods on String

        System.out.println(myName.endsWith("w"));
        System.out.println(myName.length());
        System.out.println(myName.indexOf("H"));
        System.out.println(myName.replace(" ", "_"));
        System.out.println(myName.toLowerCase());
        System.out.println(myName.trim()); // to get rid of white spaces
        
        System.out.println(myName); //No change on String because it is IMMUTABLE
        myName = myName.replace(" ", "_");
        System.out.println(myName); //Need reassignment to change the original string

        // ESCAPE SEQUENCE
        String name = "\"amen\""; // Escape sequence to add quotes
        System.out.println(name);
        String location = "C:\\Users\\hp\\Desktop\\CODE\\Basic Java - OOP"; // Escaping the BACKSLASH
        System.out.println(location);
        String multiLines = "FIRST LINE \nSECOND LINE\n\n";// New line Escape Sequence
        System.out.println(multiLines);

        //ARRAYS

        int[] numbers = new int[5]; //Old way of intitalizing arrays
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // This gives out the address of the Array.
        System.out.println(Arrays.toString(numbers)); // this gives out the Array elements.

                // Arrays have a fixed number of elements

        int[] numbers2 = {2,6,4,1,9}; // initializing Arrays for known elements
        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2) + "\n");

        // Two dimensional Array

        int[][] twoDimensional = new int[3][3]; //Intializing Multi-dimensional arrays
        twoDimensional[0][0] = 1;
        twoDimensional[1][1] = 1;
        twoDimensional[2][2] = 1;
        System.out.println(Arrays.toString(twoDimensional)); //use of TOSTRING method won't work
        System.out.println(Arrays.deepToString(twoDimensional)); //use DEEPTOSTRING method to show elements

        int[][] multiDim = {{1,2,3},{4,5,6}}; // intializing with known elements   
        System.out.println(Arrays.deepToString(multiDim) + "\n");
        
        // CONSTANTS

       final float PI = 3.14F; // we need this to be a CONSTANT so we add FINAL infront
       System.out.println(PI + " : PI is a constant!! \n");

       // Arithimetic in JAVA

        int p = 10;
        int o = 5;
        System.out.println("Basic Arthimetic for 10 & 5: ");
        System.out.println(p+o);
        System.out.println(p-o);
        System.out.println(p*o);
        System.out.println(p/o);
        System.out.println(p%o);

        System.out.println("Variables should be the SAME TYPE...");

        o++; //increment
        p--; //decrement
        
        System.out.println(o + " Increased by one");
        System.out.println(p + " Decreased by one");

        System.out.println("Operation order is BODMAS \n");

        //TYPE CASTING
          //Implicit Casting is under the hood

        short e = 1;
        int r = e + 2;
        System.out.println(r + " : Implicitly type casted");
            // Emplicit Casting

        double d = 3.9;
        int q = (int)d + 2;
        System.out.println(q + " : Explicitly type casted");
        System.out.println("Casting progression: byte > short > int > long > float");
        System.out.println("We use parsing methods for non-compatible types");
        String parsed = "3";
        int parsing = Integer.parseInt(parsed);
        System.out.println(parsing + " : This is parsed into Integer \n\n");

        //MATHS CLASS

        System.out.println(Math.round(PI) + " Rounded down PI.");
        System.out.println(Math.ceil(PI) + " Rounded to the Ceiling of PI.");
        System.out.println(Math.floor(PI) + " Rounded to the Floor of PI.");
        System.out.println(Math.max(4,7) + " :Maximum of 4 and 7");
        System.out.println(Math.random() + " :Random number from 0 to 1");
        System.out.println((int)(Math.random() * 100) + " : Random Number b/n 0 and 100 by Casting");
        System.out.println(Math.round(Math.random() * 100) + " : Random Number b/n 0 and 100 by Maths Rounding\n\n");

        //Formating Numbers

            //NumberFormat is an ABTRACT and cann't create an instance using NEW
        
        System.out.println("Converting to Currency Format");
        String dollar = NumberFormat.getCurrencyInstance().format(1982830.82);
        System.out.println(dollar);

        System.out.println("Converting to Percentage");
        String percent = NumberFormat.getPercentInstance().format(0.25);
        System.out.println(percent + "\n\n");

        // Accepting INPUTS

        Scanner scanner = new Scanner(System.in);
        System.out.print("RETIREMENT CALCULATOR:\nHow old are you? ");
        int old = scanner.nextInt();
        System.out.println("You will retire after " + (65 - old) + " years.\n\n");




        System.out.println("       MORGAGE CALCULATOR \n");

        Scanner mortgage = new Scanner(System.in);
        System.out.print("Input loan amount: ");
        int amount = mortgage.nextInt();
        System.out.print("Input duration in years: ");
        int time = mortgage.nextInt();
        System.out.print("Input annual interest rate: ");
        float rate = mortgage.nextFloat();
        rate = (rate/100)/12;
        int payments = time*12;
        double formula1 = rate*(Math.pow((1+rate),payments));
        double formula2 = (Math.pow((1+rate),payments)) - 1 ;
        double result = amount*(formula1/formula2);
        
        String mortgageResult = NumberFormat.getCurrencyInstance().format(result);

        System.out.println("\n\n ** YOUR MORTGAGE IS: " + mortgageResult + " **\n\n");


        System.out.println("Comparison Operators\n");

        int firstNum = 10;
        int secondNum = 10;
        System.out.println(firstNum == secondNum); // this will return true
        secondNum = 20;
        System.out.println(firstNum == secondNum); // this will return false
        System.out.println("\n");

        System.out.println("Logical Operators\n");


         int temperature = 9;
         boolean isCold = temperature < 10 && temperature > 0;
         System.out.println(isCold);

         // && = and
         // || = or
         // !X = not X

        System.out.println("If statement\n");
        
        System.out.print("Input income: ");
        Scanner income = new Scanner(System.in);
        int wage = income.nextInt();

        if(wage >= 400000)
            System.out.println("You're in the TOP 1%");
        else if(wage >= 100000)
            System.out.println("You're well off");
        else if(wage >= 50000)
            System.out.println("You're stuck in Middle Class");
        else 
          System.out.println("Work Harder Bro \n");


        String earning = wage >= 1000000 ? "You can retire" : "You can't retire" ;
        System.out.println(earning);


        System.out.println("\n\n SWITCH STATEMENT");

        System.out.println("\n Input education level: Diploma/Undergraduate/Graduate ");
        Scanner level = new Scanner(System.in);
        String educationLevel = level.nextLine();

        switch(educationLevel){
            case "Diploma" :
             System.out.println("You don't qualify");
             break;
            case "Undergraduate":
                System.out.println("You Qualify");
                break;
            case "Graduate":
                System.out.println("You Qualify");
                break;
            default:
                System.out.println("WRONG INPUT");
                break;
            }


        System.out.println("\n\n      FIZZ BUZZ CHALLENGE");
        
       

        System.out.print("Input a number: ");
        Scanner fizz = new Scanner(System.in);
        int buzz = fizz.nextInt();

        if(buzz % 15 == 0 && buzz % 3 == 0)
            System.out.println("FizzBuzz");
        else if(buzz % 5 == 0 )
            System.out.println("Fizz");
        else if(buzz % 3 == 0)
            System.out.println("Buzz");
        else 
           System.out.println(buzz);
        
        
         







    }
}