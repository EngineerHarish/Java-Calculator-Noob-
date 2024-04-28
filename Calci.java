import java.util.*;

public class Calci{

static int x;
static int y;
static int opt;

public static void main(String[]args)
{
 /*get the first number from the user*/
Scanner scanner1= new Scanner(System.in);
System.out.println("Enter the first number");
x= scanner1.nextInt();

/*get the second number from user*/
Scanner scanner2= new Scanner(System.in);
System.out.println("Enter the second number");
y= scanner2.nextInt();

/*get option number from user*/
Scanner scanner3= new Scanner(System.in);
System.out.println("Enter the operation to be performed: ");
System.out.println("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Modulus\n");
opt= scanner3.nextInt();


Calci obj= new Calci();

/*Conditional statements*/
if(opt==1)
{
 
 int result= obj.add();
 System.out.println("Result is: " + result);

}

else if(opt==2)
{

 int result= obj.sub();
 System.out.println("Result is: " + result);

}
else if(opt==3)
{
 
 int result= obj.multiply();
 System.out.println("Result is: " + result);

}


else if(opt==4)
{
 
 int result= obj.div();
 System.out.println("Result is: " + result);

}


else if(opt==5)
{
 
 int result= obj.mod();
 System.out.println("Result is: " + result);

}


else
{
 System.out.println("Can't operate");
}


}


/*All of the methods to perform mathematical operations*/
public int add( )
{
 return x+y; 
}


public int sub( )
{
 return x-y; 
}


public int multiply( )
{
 return x*y; 
}


public int div()
{
 return (x/y);
}


public int mod( )
{
 return x%y; 
}


}