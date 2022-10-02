import java.util.Date;
import java.awt.*;

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
        String multiLines = "FIRST LINE \nSECOND LINE";
        System.out.println(multiLines);


    
    }
}