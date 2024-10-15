


	----------------- Java Programming -----------------------

	Computer ---> 
	Language --->
	Programming Languages --> 



		     SIMULA
		     COBOL								   |-- Sun Microsystem --> Java
	Assembly --> Fortran ----> ALGOL60 --> CPL --> BCPL-----> B -----> C ----> C++ ====|-- Microsoft corpo.--> .Net
		     RPG	    (1960)   (1963)    (1967)    (1970)   (1972) (1983-84) |-- CWI -------------> Python
		     BASIC								   |
		     Pascal
		     ....


	// History of Java: 


		- JAMES GOSLING Introduced the Java Programming language.

		- Initially he started with the platform independancy, and developed GreenTalk with ext. (*.gt)

		- After some days he joined the Sun Microsystem, as head of green project team, formed to develop

		- The platform independent language as a internal tools of the company to develop application
		  for different consumer electronic product.

		 - 1990 --> Touch sencetive application

		 - 1991 -> language named Oak is introduced.

		 - 1995 --> OAK renamed as Java

// Different versions of Java: 

		1995 - jdk alpha and beta
		1996 - jdk 1.0
		1997 - jdk 1.1

		1998 - J2SE 1.2
		2000 - J2SE 1.3 
		2002 - J2SE 1.4 
		
		2004 - J2SE 5.0 

		2006 - Java SE 6
		2011 - Java SE 7 
		2014 - Java SE 8 
		
		2017 - Java SE 9                   Onwards ---> JSE 9 ...
		2018 - Java SE 10 (March)
		     - Java SE 11 (September)

		2019 - Java SE 12 (March)
		     - Java SE 13 (September)

		2020 - Java SE 14 (March)
		     - Java SE 15 (September)

		2021 - Java SE 16 (March)
		     - Java SE 17 (September)

		Java SE 18 (to be released by March 2022)



// ---------------------------------------------------------------------------------------------

	Different Java Editions:


			     |-> J2SE(Standard Edition)
			     |
 		Java --------|-> J2EE(Enterprise Edition)
			     |
			     |-> J2ME( Micro Edition)


// ----------------------------------------------------------------------------------------------

	// Java Environment: 

	Platform = OS + Processor Arct.

	It is basically divided into 2 parts

		jre --> java runtime environment: Needed to run the java program
		jdk ---> java developement Needed to develop and run the java program

//----------------------------------------------------------------------------------------------------------


	
	// Java Buzzwords (Features of Java)	

		-  Simple 
		-  Object Oriented
		-  Portable
		-  Platform Independent
		-  secure
		-  Robust
		-  Architecture neutral
		-  half compiled and half Interpreted
		-  Multithreaded
		-  Distributed	(run across multiple machines:This is achieved through features like Remote Method Invocation (RMI) )
		-  Dynamic
		-  High Performance
//------------------------------------------------------------------------------------------------------------

	// Differences Between C and Java

		https://www.interviewbit.com/blog/difference-between-c-and-java/


	// Differences Between C++ and Java

		https://www.interviewbit.com/blog/difference-between-cpp-and-java/



//----------------------------------------------------------------------------------------------------------

// Execution flow of C/C++ and Java	


		C/C++									Java

	Instructions		Progr_nm					     *.java
		|_________________|							|
			 |								|	
			 |         Debug					     Compile(javac)	
	source code	*.c/*.cpp <---|							|
			 |            |							|
			 |            |						    *.class
		      Compile ------->| Compile-time 				    (byte code)	              		 ^
			 |            | error						|                	 Compile |
			 |            |							|			===================
	backup file    *.bak          |					-------------------------------------   Interpreter |
			 |            |					|		|		| ..                V
			 |            |				       JVM             JVM             JVM --> (Platform dependent JVM)	
	 Linker -------->| ---------> |  Linker error			|		|		|
			 |            |                               Windows         Linux            MAC  
			 |            |                                 | 		|		|                          
	object code    *.obj	      |				     Native code    Native code     Native code	
			 |            |					|		|		|
			 |	      ^				      Run              RUN             Run	
     Executable file   *.exe	      |                                 |               |               |
			 |	      |	                             Output           Output          Output  
		   	Run --------->| Runtime Error
			 |
		       Output							WRITE ONCE RUN EVERYWHERE	



//---------------------------------------------------------------------------------------------------------


	Java Editors and IDE's
	======================

		Editor: Notepad, Editplus, Notepad++ ...
		
		IDE: Best Java IDEs
			Eclipse. Platform – Linux/macOS/Solaris/Windows. ...
			NetBeans. Platform – Linux/macOS/Solaris/Windows. ...
			IntelliJ IDEA. Platform – Linux/macOS/Windows. ...
			BlueJ. Platform – Linux/macOS/Windows. ...
			(Oracle) JDeveloper. Platform – Linux/macOS/Windows. 


	Now we have see, how to write a code where:

		1. Use any editor/ide

		2. Install jdk/jre (https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html)

		3. Use notepad as a editor and write a code as

			class <cls_nm>
			{
				public static void main(String []args)
				{
					------------------;
					------------------;
					program_body ;
					------------------;
					------------------;
				}
			}

			class Demo
			{
				public static void main(String []args)
				{
					System.out.print("Welcome to Java Programming");
				}
			}

		4. Save the code in C:\Program Files\Java\jdk-17.0.1\bin As <class_nm>.java

		5. win+r --> cmd --> enter (attend the folder where the source file, compiler and interpreter is present) as

			C:\Users\hp>cd\
			C:\>cd "Program Files\Java\jdk-17.0.1\bin"
			C:\Program Files\Java\jdk-17.0.1\bin>javac Demo.java     (compilation where you get the bytecode (*.class) )
			C:\Program Files\Java\jdk-17.0.1\bin>java Demo  	 (Byte code interpretation)
				Welcome to Java Programming
			C:\Program Files\Java\jdk-17.0.1\bin>

	//------------------------------------------------------------------------------------------------------------------

	How to run, same code when source file (*.java) is in different folder
				
			C:\Users\hp>e:
			E:\>cd myjavafiles
			E:\myjavafiles>javac First.java

				'javac' is not recognized as an internal or external command,
				operable program or batch file.

			E:\myjavafiles>set path=C:\Program Files\Java\jdk-17.0.1\bin
			E:\myjavafiles>javac First.java
			E:\myjavafiles>java First
				Welcome to Java Programming-First
			E:\myjavafiles>

		Note that the path is applicable till the current session of the command prompt.
		to set the path in the permanent manner set the path in Environmeent variable


		Setting the environment variable: this pc --> rh+ click ---> properties --> adv. system settings
						--> Advanced tab --> environment variable --> user variable path


				-if already path is there -> edit --> new-> paste path (C:\Program Files\Java\jdk-17.0.1\bin)

				otherwise  user variable path--> new and write

				variable name --> path
				variable value --> C:\Program Files\Java\jdk-17.0.1\bin) --> ok....

//-------------------------------------------------------------------------------------------------------------
	Youtube Link: https://youtu.be/RBxum7M3B94?si=jepmNZAtetZfJKFp
//-------------------------------------------------------------------------------------------------------------


	Details of welcome program:
	============================

	class WelcomeProg
	{
		public static void main(String []args)
		{
			System.out.print("Welcome to Java by Archer InfoTech");
		}
	}
	

	Line 1: class WelcomeProg:

			class: It is keyword which allows you to create your own type.
			WelcomeProg: this is name of UDT, it must be valide identifier. Internally in java lib, the have
					  choosen, First letter of class name in uppercase and all other in lowercase if it is
					  made from from one word, if multiple words then first character of each word in ucase
					  and all other in lcase.

						e.g.	First, Demo, FirstProgram, ExampleDemoWelcome
					It is recommended, not compalsory

	Line 3: public static void main(String []args) 

			public: it is used to define the visiblity of method main(), coz the javac and java are not members of class
				as a outsiders they must have access to class members therefore visibility is public.

			static: The static members gains the memory space when class is loaded into memory, no need of object
				creation. therefore the method main() decl. as static

			void: It is returning type of method main(), it is void coz java program does not return any value to OS

			main(): It is method name, and as it is main(), it is considered as a starting point of of your program

			String []args: String is Built-in class from java.lang package, it is language support package, which is 
					imported bydefault. []args it is array of arguments, which is passed automatically at the
					time of execution from commandline, in absence null is collected.
					simply it is array of objects.

	Line 5:  System.out.print("Welcome to Java");

			"Welcome to Java" : It is data, to be displayed
			print() is a method from PrintStream class used to display the data on screen.
			out is predefined object of PrintStream class, declare ed as a static in System class
			System is a class from java.lang package.

 //-----------------------------------------------------------------------------------------------------------------------

	// Knowing more about the String []args

class KnowingArgs
{
	public static void main(String []args)
	{
		System.out.println("Welcome TechArcher");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
	}
}

output:


E:\javapfsdn23>javac KnowingArgs.java

E:\javapfsdn23>java KnowingArgs hello all of you
Welcome TechArcher
hello
all
of
you


//-------------------------------------------------------------------------------------------------------


	Now we need to proceed using the path fillowed in the C and C++

	i.e.
				constant
	charcter set -----> 	keyword ------> Instructions ----> program ----> module ---> software
				variable




	Java Character set:

		- ASCII(American Standard Code for Information Interchange):  Provides the binary string to all symbols present
		  in the US English, which are used in different electronic devices.

		- ASCII used to code in english, but java supports different human understable languages for coding. means java
		  having rich character set as cmp to c/c++. The Standard Code system names unicode system used in the 
		  java which provides the 16 bit binary string to each symbol for different languages.     



	// Constants: These are the elements in the program having fix value.

							      Java Constants
								    |
							---------------------------
							|			  |
						    Numeric 		     Non-Numeric
							|			  |
						-----------------	-----------------
						|		|	|		|	
					   Integer     floating-point  character     String
					-6,4,56    -5.3,7.0,78.6755    'a', '$'     "A", "Hello"		
									'H' '4'	     "a123"

	// Keyword: These are reserved words, whose meaning is already known to compiler. 



		abstract	continue	for		new		switch

		assert***	default		goto*		package		synchronized
	
		boolean		do		if		private		this

		break		double		implements	protected	throw

		byte		else		import		public		throws

		case		enum****	instanceof	return		transient

		catch		extends		int		short		try

		char		final		interface	static		void

		class		finally		long		strictfp**	volatile

		const*		float		native		super		while 

		*	 	not used
		**	 	added in 1.2
		***	 	added in 1.4
		****	 	added in 5.0

	(https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

 Java Data Types: Tool used for the memory allocation.

		- Primitive data types: These are provided by the language itself. e.g. int, char, byte..
		- Non-Primitive data types: The are defined by the programmers according to the need. e.g. class, interface



						Java Data Types
							|
					---------------------------------
					|				|
				Primitive Data Types		Non-Primitive Data Types
					|				|
			   --------------------------              - String
			   |			    |   	   - Array
		      Numeric		 	boolean	   	   - Vector
			  |	                (1 bit)
			------------------
			|		 |
		   Integrals	      character	
			|                |
	-------------------------      char(2)		
	|			|				
      integer		     floating point    		
      |				|					 
      |- byte (1)		|- float(4)    
      |- short (2)		|- double(8)
      |- int(4)
      |- long(8)


	- The defalt integer value is considered as a int and default fractional value considered as double.
	- When you decl the variable, java demands for the init. of variables, otherwise it will generate the
	  error message, 
				"variable xxx might not have been initialized"

	- When the value of variable having higher type is assigned to variable of lower type, then it will
	  generate the error message

		e.g.
			a=c;	gives the following error, when a is byte variable and c is int variable

			"possible lossy conversion from int to byte" 
		 
		In such case, where you want to convert the value from higther type to lower type, go for
		the type casting;

			i.e.	a=(byte)c;

		Note carefully that, lower type to higher type promoted automatically.

	- The long costant is represented using 'l' or 'L' as a prefix and for the float 'f' or 'F' is used.

	- Java allows you to decl. the variables anywhere in the program, just decl before using it.



	we have have to use al these types as per our need to decl. the variable in the program to store 
	the data entered by the user.

class DemoDataTypes
{
	public static void main(String []args)
	{
		int x=134;	
		byte b=10;	
		char ch='$';	
		double db=56.2323;
		float ft=3.4F;
		boolean b=true;

		System.out.println("x="+x);		
		System.out.println("b="+b);
		System.out.println("value of ch is "+ch);
		System.out.println("db is"+db);
		System.out.println("float value "+ft);
		System.out.println("boolean value "+b);
	}
}

//----------------------------------------------------------------------------------------------------------------------

	// Different ways of Data Input in Java

 1. Data Input by direct init

class InputUsinginit
{
	public static void main(String []args)
	{
		int x=134;	
		byte b=10;	
		char ch='$';	
		double db=56.2323;
		float ft=3.4F;
		boolean b=true;

		System.out.println("x="+x);		
		System.out.println("b="+b);
		System.out.println("value of ch is "+ch);
		System.out.println("db is"+db);
		System.out.println("float value "+ft);
		System.out.println("boolean value "+b);
	}
}

//----------------------------------------------------------------------------------------
 2. Data Input as a commandline argument

class DataInputCmdln
{
	public static void main(String []args)
	{
		String s1="-",s2="-";

		s1=args[0];
		s2=args[1];

		System.out.printn("String s1 is: "+s1);
		System.out.printn("String s2 is: "+s2);
	}
}
output:

E:\javapfsdn23>javac DataInputCmdln.java

E:\javapfsdn23>java DataInputCmdln hello all
String s1 is: hello
String s2 is: all

E:\javapfsdn23>java DataInputCmdln hello
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at DataInputCmdln.main(DataInputCmdln.java:8)

E:\javapfsdn23>java DataInputCmdln
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at DataInputCmdln.main(DataInputCmdln.java:7)


How to deal with such runtime errors called exception, which are generated when we will try to 
access the location which is not present.


class DataInputCmdln
{
	public static void main(String []args)
	{
		String s1="-",s2="-";

		try
		{
			s1=args[0];
			s2=args[1];
		}
		catch(Exception e){}

		System.out.println("String s1 is: "+s1);
		System.out.println("String s2 is: "+s2);
	}
}

output:

E:\javapfsdn23>javac DataInputCmdln.java

E:\javapfsdn23>java DataInputCmdln hello all
String s1 is: hello
String s2 is: all

E:\javapfsdn23>java DataInputCmdln hello
String s1 is: hello
String s2 is: -

E:\javapfsdn23>java DataInputCmdln
String s1 is: -
String s2 is: -


We know the input is in form of strings and is is true even when we try to pass numeric 
values coz they are automatically converted into strings, then how to input the numeric values

class DataInputCmdln
{
	public static void main(String []args)
	{
		int x=args[0];
		double y=args[1];

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
	}
}
on compile 


E:\javapfsdn23>javac DataInputCmdlnNumeric.java
DataInputCmdlnNumeric.java:6: error: incompatible types: String cannot be converted to int
                int x=args[0];
                          ^
DataInputCmdlnNumeric.java:7: error: incompatible types: String cannot be converted to double
                double y=args[1];
                             ^
2 errors

How to convert the Strings into numeric values



class DataInputCmdlnNumeric
{
	public static void main(String []args)
	{
		int x=Integer.parseInt(args[0]); // "12"--> 12
		double y=Double.parseDouble(args[1]);

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		System.out.println("Sum is: "+(x+y));
	}
}
E:\javapfsdn23>javac DataInputCmdlnNumeric.java

E:\javapfsdn23>java DataInputCmdlnNumeric
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at DataInputCmdlnNumeric.main(DataInputCmdlnNumeric.java:6)

E:\javapfsdn23>java DataInputCmdlnNumeric 12 67.45
x is: 12
y is: 67.45
Sum is: 79.45


//-------------------------------------------------------------------------------------------

	// 3. Input using java.io.InputStreamReader and java.io.BufferedReader

import java.io.InputStreamReader;
import java.io.BufferedReader;
class InputUsingIOClasses
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.printn("Enter the int value: ");
		x=Integer.parseInt(br.readLine());

		System.out.printn("Enter the fractional value: ");
		y=Double.parseDouble(br.readLine());

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		System.out.println("Sum is: "+(x+y));
	}
}

on compile:

E:\javapfsdn23>java InputUsingIOClasses.java
InputUsingIOClasses.java:15: error: unreported exception IOException; must be caught or declared to be thrown
                x=Integer.parseInt(br.readLine());
                                              ^
InputUsingIOClasses.java:18: error: unreported exception IOException; must be caught or declared to be thrown
                y=Double.parseDouble(br.readLine());
                                                ^
2 errors
error: compilation failed


To avoid this exception there are two different options

	- using the try..catch() block
	- using throws clause

	// using try..catch()

import java.io.InputStreamReader;
import java.io.BufferedReader;
class InputUsingIOClasses
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		try
		{
			System.out.println("Enter the int value: ");
			x=Integer.parseInt(br.readLine());

			System.out.println("Enter the fractional value: ");
			y=Double.parseDouble(br.readLine());
		}
		catch(Exception e){}

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		System.out.println("Sum is: "+(x+y));
	}
}

output: 

E:\javapfsdn23>java InputUsingIOClasses.java
Enter the int value:
12
Enter the fractional value:
78.453
x is: 12
y is: 78.453
Sum is: 90.453


	// This exception can be eliminated using throws clause as 


import java.io.InputStreamReader;
import java.io.BufferedReader;
class InputUsingIOClasses
{
	public static void main(String []args) throws Exception
	{
		int x=0;
		double y=0.0;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);


		System.out.println("Enter the int value: ");
		x=Integer.parseInt(br.readLine());

		System.out.println("Enter the fractional value: ");
		y=Double.parseDouble(br.readLine());


		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		System.out.println("Sum is: "+(x+y));
	}
}

output

E:\javapfsdn23>java InputUsingIOClasses.java
Enter the int value:
23
Enter the fractional value:
78.16
x is: 23
y is: 78.16
Sum is: 101.16


//-------------------------------------------------------------------------------------------

	4. Using java.util.Scanner to take the input from keyboard

import java.util.Scanner;
class InputUsingScannerObject
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		String str="";
		int x=0;
		double db=0.0;
		char ch='$';

		System.out.println("Enter any String: ");
		str=sc.nextLine();

		System.out.println("Enter any int value: ");
		x=sc.nextInt();

		System.out.println("Enter any double value: ");
		db=sc.nextDouble();

		System.out.println("Enter any character: ");
		ch=sc.next().charAt(0);

		System.out.println("String str: "+str);
		System.out.println("int value: "+x);
		System.out.println("double value: "+db);
		System.out.println("char value: "+ch);		
	}
}

output:

E:\javapfsdn23>javac InputUsingScannerObject.java

E:\javapfsdn23>java InputUsingScannerObject
Enter any String:
aaaa
Enter any int value:
12
Enter any double value:
3.3
Enter any character:
r
String str: aaaa
int value: 12
double value: 3.3
char value: r

	
//-------------------------------------------------------------------------------------------------------

	5. Using javax.swing.JOptionPane.showInputDialog()

import javax.swing.JOptionPane;
class InputUsingShowIpDialog
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;

		x=Integer.parseInt(JOptionPane.showInputDialog("Enter any int value: "));	
		y=Double.parseDouble(JOptionPane.showInputDialog("Enter any double value: "));	

		System.out.println("int value: "+x);
		System.out.println("double value: "+y);		
	}
}	


///=========================================================================================================================

// Operators in Java: Operators are used to process the data. There are following operators
			      present in the java.

			- Assignment Operators (= and short-hand operators)
			- Unary Operators ( - ++ -- (type) )
			- Arithmetic Operators ( + - * / % )
			- Relational Operators ( < <= > >= == != )
			- Logical Operators (&& || !)
			- conditional Operator ( ? : )
			- Bitwise Operators (& | ^ >> << >>>)
			- special Operators (. and instanceof )


- Assignment Operators (= and short-hand operators): will assigns constant value at its rh+, value of variable at its rh+ or
			answer of exper at its rh+ to variable at left.

		e.g.
			int x=10;	int y=x;	int z=x+y;

			shorthand expr: 	suppose,	x=x+10	can be written as x+=10;
								x=x/10  --> x/=10
								....

class DemoAssignment
{
	public static void main(String []args)
	{
		int x=10;
		int y=x;
		int z=x+y;
	
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		x+=100;
		y*=2;
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

	}
}

//-------------------------------------------------------------------------------------------------------------------

- Unary Operators ( - ++ -- (type) )

	- will gives oppisite value
	++ incr by 1
	-- decr by 1

		inc/dec
		  |
	--------------------------
	|			|
     pre 		      post
  (++x, --x)		  (x++, x--)		


	++x  <-----> x=x+1	<------> x++
	--x  <-----> x=x-1      <------> x--

	when these operators are used in the expression, 

		pre --> expr --> post

	suppose x=5, and y=9

		z = ++x + y-- ;

	- find the basic expr
	- operate all pre operators
	- calc. the basic expr. with current values
	- operator all post operators

	- x becomes 6
	- assigned 15 to z
	-y becomes 8

import java.util.Scanner;
class DemoUnary
{
	public static void main(String []args)
	{
		int x=0;
		int y=0;
		int z=0;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Enter the values of x and y: ");
		x=sc.nextInt();
		y=sc.nextInt();

		z=-x;
		x++;
		--y;
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=++x+y--;
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);
	}
}

//------------------------------------------------------------------------


	(type): It refers to type casting, means changing the data type of variable obly at the of calc.


import java.util.Scanner;
class DemoCasting
{
	public static void main(String []args)
	{
		int x=0,y=0;
		double z=0;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Enter the values of x and y: ");
		x=sc.nextInt();
		y=sc.nextInt();  // 13, 5

		z=x/y;		
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=(double)x/y;		
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=x/(double)y;		
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=(double)x/(double)y;		
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

	}
}

output: 
E:\jprodyp>javac DemoCasting.java

E:\jprodyp>java DemoCasting

 Enter the values of x and y:
13
5

 x=13    y=5     z=2.0

 x=13    y=5     z=2.6

 x=13    y=5     z=2.6

 x=13    y=5     z=2.6

//----------------------------------------------------------------------------------------
- Arithmetic Operators ( + - * / % )

	// program to calc the simple interst.

import java.io.InputStreamReader;
import java.io.BufferedReader;
class DemoArith
{
	public static void main(String []args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int p=0,n=0;
		double r=0.0,si=0.0;

		System.out.println("Enter the value of p: ");
		p=Integer.parseInt(br.readLine());

		System.out.println("Enter the value of r: ");
		r=Double.parseDouble(br.readLine());

		System.out.println("Enter the value of n: ");
		n=Integer.parseInt(br.readLine());
	
		si=(p*r*n)/100;

		System.out.println("Simple Interst is: "+si);
	}
}


	Using % and / operator

	lets see simple example, we have to calculate 13/5

		   2 <------------- (13/5)
		________
	      5 )  13
		 - 10
		---------
		    3 <----------- (13%5)

 lets see some examples, ovserve the result and write the conclusion

	13/5=2		13%5=3
	27/7=3		27%7=6
	67/9=7		67%9=4
	123/10=12	123%10=3
	459/10=45	459%10=9
	3857/10=385	3857%10=7
	7/10=0		7%10=7

	- Div by 10 eliminates the last digit from number.
	  and mod by 10 gives the last digit.
	- In N/D, when N<D then div is 0 and rem is N

   // Enter any 3 digit number from keyboard and find addition of its all digits.
  // no=285 then ans = 5+8+2 => 15

import java.util.Scanner;
class DemoDivMod
{
	public static void main(String []args)
	{
		int no=0,rem=0,tot=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("\n Enter any 3 digit number: ");
		no=sc.nextInt(); //285
	
		rem=no%10; //5
		tot=tot+rem; // 0+5=5
		no=no/10; //28
	
		rem=no%10; //8
		tot=tot+rem; // 5+8=13
		no=no/10; //2	

		rem=no%10; //2
		tot=tot+rem; // 13+2=15
		no=no/10; //0

		System.out.println("\n Total is "+tot);
	}		
} 

Unlike C/C++, Here in java you can operate the % operator on fractional and -ve values,
when you operate the % operator on -ve values the sign of ans is taken as the sign of N form N/D.
class DemoMod
{
	public static void main(String []args)
	{
		int x=-13, y=5, z=-2;

		System.out.println("-%+: "+(x%y));
		System.out.println("-%-: "+(x%z));
		System.out.println("+%-: "+(21%z));
		System.out.println("+%+: "+(33%4));

		System.out.println("+%+: "+(33.5%4));
		System.out.println("+%+: "+(36.5%2.3));
	}
}

//-----------------------------------------------------------------------------------------

	// Relational Operators: (<, <=, >, >= ==, !=): These operators are used to find the
		relation between two operands. It will forms the condition which is useful in the
		conditional conditional control statements.

		thw ans of condition is boolean value true when it is true and false when false.


	suppose x=23	y=5;

		x>y	----> true 	means if we write z=x>y then true assigned to z.

		x!=y	----> true 
		
		y<1	----> false
		
		x%10==0 ----> false 

		100%y==0 ---> true 

class DemoRel
{
	public static void main(String []args)
	{
		int x=23,y=5;
		boolean b;
		System.out.println("\n x is: "+x+"\t y is: "+y);

		b=x>y;
		System.out.println("\n (x>y) is: "+b);

		b=x!=y;
		System.out.println("\n (x!=y) is: "+b);

		b=y<1;
		System.out.println("\n (y<1) is: "+b);

		b=x%10==0;
		System.out.println("\n (x%10==0) is: "+b);

		b=100%y==0;
		System.out.println("\n (100%y==0) is: "+b);
		
	}
}
output

E:\jprodyp>javac DemoRel.java

E:\jprodyp>java DemoRel

 x is: 23 y is: 5

 (x>y) is: true

 (x!=y) is: true

 (y<1) is: false

 (x%10==0) is: false

 (100%y==0) is: true

//-----------------------------------------------------------------------------------------------

	/// Logical Operator ( && || !): These operators are used to join two or more conditions

		when the conditions are joind by

		- && --> gives true only when both true otherwise false
		- || --> gives false only when both false otherwise true
		- !  --> gives
				!(true) ---> false
				!(false) ---> true
				

	suppose x=23	y=5;

		(x>y)&&(y<100)	----> true 
		(x>y)&&(y>100)	----> false

		(x>y)||(y>100)	----> true 
		(x<y)||(y>100)	----> false
	
		!(x!=y)	----> false 	
		!(y<1)	----> true


class DemoLogical
{
	public static void main(String []args)
	{
		int x=23,y=5;
		boolean b;
		System.out.println("\n x is: "+x+"\t y is: "+y);

		b=(x>y)&&(y<100);
		System.out.println("\n ((x>y)&&(y<100)) is: "+b);

		b=(x>y)&&(y>100);
		System.out.println("\n ((x>y)&&(y>100)) is: "+b);

		b=(x>y)||(y>100);
		System.out.println("\n ((x>y)||(y>100)) is: "+b);

		b=(x<y)||(y>100);
		System.out.println("\n ((x<y)||(y>100)) is: "+b);

		b=!(x!=y);
		System.out.println("\n (!(x!=y)) is: "+b);

		b=!(y<1);
		System.out.println("\n (!(y<1)) is: "+b);
		
	}
}

output: 
E:\jprodyp>javac DemoLogical.java

E:\jprodyp>java DemoLogical

 x is: 23        y is: 5

 ((x>y)&&(y<100)) is: true

 ((x>y)&&(y>100)) is: false

 ((x>y)||(y>100)) is: true

 ((x<y)||(y>100)) is: false

 (!(x!=y)) is: false

 (!(y<1)) is: true

///--------------------------------------------------------------------------------------
// Conditional operator or ternary operator or if-then-else operator(?:):

		This is the only operator which has decision abiity.
	
		syntax:

			<condition> ? <options>;

			<condition> ? <true_part> : <false_part> ;

	// WAP to find the max from 2 nos

import java.util.Scanner;
class DemoConditionalOperator
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int x=0,y=0;

		System.out.println("\n Enter any two nos: ");
		x=sc.nextInt();
		y=sc.nextInt();

		int z = (x>y) ? x : y ;
		System.out.println("\n Max no: "+z);
	}
}

output:
E:\jprodyp>javac DemoConditionalOperator.java

E:\jprodyp>java DemoConditionalOperator

 Enter any two nos:
45
78

 Max no: 78

E:\jprodyp>java DemoConditionalOperator

 Enter any two nos:
90
23

 Max no: 90

///------- Nesting of conditional operators


	// WAP to find the max from 3 nos

import java.util.Scanner;
class DemoConditionalOperator1
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int x=0,y=0,z=0;

		System.out.println("\n Enter any three nos: ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();

		int max = (x>y) ? (x>z?x:z) : (y>z?y:z) ;
		System.out.println("\n Max no: "+max);
	}
}

output:
E:\jprodyp>javac DemoConditionalOperator1.java

E:\jprodyp>java DemoConditionalOperator1

 Enter any three  nos:
11
22
33

 Max no: 33

E:\jprodyp>java DemoConditionalOperator1

 Enter any three nos:
111
22
33

 Max no: 111

E:\jprodyp>java DemoConditionalOperator1

 Enter any three nos:
11
222
33

 Max no: 222

//-----------------------------------------------------------------------------------------------------------


//-----------------------------------------------------------------------------------------------------------------------

   	/// Bitwise Operator: [ & | ^ >> << >>> ]
 
    These operators are used in the bit level operations.

        & ==> 1 & 1 -> 1 otherwise 0
        | ==> 0 | 0 -> 0 otherwise 1

              0^0
        ^ -->     ==> 0 otherwise 1
              1^1

    suppose x=10       y=12

        (0000 1010)     (0000 1100)

    (x&y)       (x|y)       (x^y)

    1010        1010        1010
   &1100       |1100       ^1100
  ========    ========     =======
    1000        1110        0110
    (8)          (14)        (6)


    x=10 (0000 1010)     y=12  (0000 1100)

     z=x<<2              z=y>>2
       (0010 1000)       (0000 0011)
       ==>40            ==> 3


class DemoBitwise
{
	public static void main(String []args)
	{
		int x=10,y=12;
		System.out.println("\n (x&y) is"+ (x&y) );

		System.out.println("\n (x|y) is"+ (x|y) );

		System.out.println("\n (x^y) is"+ (x^y) );

		System.out.println("\n (x<<2) is"+ (x<<2) );

		System.out.println("\n (y>>2) is"+ (y>>2) );
		
	}
}

//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------

// Control Statements in Java: 


				Control Statements
					|
			-------------------------------------
			|				    |
		   Conditional				Un-Conditional
			|					|
	------------------------------	        ---------------------------------
	|		|	    |		|	|		|	|
      Decision	      Loop	  case	       break   continue     lbl.break	return
	|		|	    |				    and 
	|- if()		|- for()   switch			    lbl. continue	
	|- if() else	|- while()
	|- nesting	|- do..while()
	|- ladder


//  Decision Conditional Control statment: 

	
	// Using if(): used to decide, execute the block of code or not. That block is mentioned in the program as

			syntax:
				if(<condi>)
				{
					-------------;
					-------------;
					block of code;
					-------------;
					-------------;
				}
				
	- Block of code will be executed only when the condition is true otherwise it will be skipped

import java.io.InputStreamReader;
import java.io.BufferedReader;
class DemoIf
{
	public static void main(String []args)
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int a=0;
		try
		{
			System.out.println("Enter the value of a: ");
			a=Integer.parseInt(br.readLine());
		}
		catch(Exception e){}		

		if(a%7==0)
		{
			System.out.println("Entered no is div by 7 ");
		}
		if(a%7!=0)
		{
			System.out.println("Entered no is not div by 7 ");
		}
	}
}

//-----------------------------------------------------------------------------------


	// Using if() else: It is used when you want to execute any one code block from two different blocks
	//		    according to condition.


		syntax:
			if(<condi>)
			{
				-----------------;
				---------------;
				----------------;
			}
			else 
			{
				-----------------;
				---------------;
				----------------;
			}

		when <condi> is  TRUE --> will execute the if() block only
				 FALSE -> will execute the else block only





import java.io.InputStreamReader;
import java.io.BufferedReader;
class DemoIfElse
{
	public static void main(String []args)
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int a=0;
		try
		{
			System.out.println("Enter the value of a: ");
			a=Integer.parseInt(br.readLine());
		}
		catch(Exception e){}		

		if(a%7==0)
		{
			System.out.println("Entered no is div by 7 ");
		}
		else
		{
			System.out.println("Entered no is not div by 7 ");
		}
	}
}


	// 	Using Nesting of if() else:

			Nesting refers to using one control statment in to same or another control statement


	some combinations:


		if()				if()				if()			if()
		{				{				{			{
			if()				if()			}				if()
			{				{			else				{
			}				}			{				}
		}					else				if()		}
							{				{		else
							}				}		{
						}				}				if()
														{
														}
													}


		
		if()					if()
		{					{
			if()					if()	
			{					{
			}					}
		}						else
		else						{
		{						}
			if()				}
			{				else
			}				{
			else					if()
			{					{
			}					}
		}						else
								{
								}
							}


class DemoIfElseNesting
{
	public static void main(String []args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("\n a is max");
			}
			else
			{
				System.out.println("\n c is max");
			}
		}	
		else
		{
			if(b>c)
			{
				System.out.println("\n b is max");
			}
			else
			{
				System.out.println("\n c is max");
			}
		}
	}
}

//---------------------------------------------------------------------------------------------------------------------


	// Using if() else Ladder

	syntax:

		if(<>)
		{
			---------;
			---------;
		}
		else if(<>)
		{
			---------;
			---------;
		}
		else if(<>)
		{
			---------;
			---------;
		}
		else if(<>)
		{
			---------;
			---------;
		}
		[<else>]
		{
			---------;
			---------;
		}


	// Enter the co-ordinates of point in 2D system, and display the exact location of that point.


			       y axis
                                ^
                       II QD    |   I QD
                                |
                        -+      |   ++
                                |
                  <-------------|------------> x axis
                                |(0,0)
                                |
                        --      |   +-
                                |
                    III QD      V     IV QD



                There are 7 different possibilities.

import java.util.Scanner;
class DemoIfElseLadder
{
	public static void main(String []args)
	{
    		int x=0,y=0;
		Scanner sc=new Scanner(System.in);

    		System.out.println("\n Enter the x cord: ");
    		x=sc.nextInt();
    		System.out.println("\n Enter the y cord: ");
    		y=sc.nextInt();

    		if(x>0&&y>0)
    		{
        		System.out.println("\n Point present in I st qd");
    		}
    		else if(x<0&&y>0)
    		{
        		System.out.println("\n point present in II nd qd");
    		}
    		else if(x<0&&y<0)
    		{
        		System.out.println("\n Point is present in 3 rd qd");
    		}
    		else if(x>0&&y<0)
    		{
        		System.out.println("\n Point is present in 4 th qd");
    		}
    		else if(x!=0&&y==0)
    		{
        		System.out.println("\n Point is present on x axis");
    		}
    		else if(x==0&&y!=0)
    		{
        		System.out.println("\n Point is present on y axis");
    		}
    		else 
    		{
        		System.out.println("\n Point present at org");
    		}
	}
}


------------------------------------------------------------------------------------------------------------------------------------

		// Using the Loops in Java: Loops are used to avoid the continue repitition of code in the program.
					 There are three different loops in C.

				1. For() loop		2. While() loop		3. do..While() loop



	1. For() loop:

		syntax:	
				
			for( [<init>] ; <condi> ; [<inc/dec/stat/expr>] )					
			{									
				--------------;							   
				--------------;						
				--------------;							 
				--------------;							
				--------------;				
			}
		


import javax.swing.JOptionPane;
class DemoFor
{
	public static void main(String []args)
	{
		int no=Integer.parseInt(JOptionPane.showInputDialog("Enterany number:"));
	
		int t=0,tot=0;
		for(t=no;no!=0;no=no/10)
		{
			tot=tot+(no%10); 
		}
		System.out.println("\n Addition of all digits from "+t+" is "+tot");
	}
}

                ///-------------------------------------------------------------------------------------------------------------------------

	//  Using while loop: 

		Again the aim is same i.e. used to avoid the code rep.

		syntax:
			while(<cond>)
			{
				----------------;
				----------------;
				----------------;
				----------------;
				****************;
			}

			- It will execute the body of loop, till the condition is true.

			- <init> block is absent in while() but you have init. the iterator before starting of loop.

			- <inc/dec> block is absent, but you have to add atleast one statement which will make the <cond> false
			  after some iterations. otherwise it will attend the infinite looping


	/// WAP to display 1 to 15 nos using while loop

class DemoWhile
{
	public static void main(String []args)
	{
		int i;

		i=1;
		while(i<=15)
		{
			System.out.println(" "+i);
			i++;
		}
	}
}

//-------------------------------------------------------------------------------------------
	/// WAP to display list of odd nos from 1 to 50 using while loop.

class DemoWhile
{
	public static void main(String []args)
	{
		int i;

		i=1;
		while(i<=50)
		{
			if(i%2!=0)
			{
				System.out.println(" "+i);
			}
			i++;
		}
	}
}

//--------------------------------------------------------------------------


	// WAP to find the entered number is prime

import java.util.*;
class DemoWhile
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("\n Enter any no: ");
		int no=sc.nextInt();
		int d=2;
		int flg=0;
		while(d<=(no/2))
		{
			if(no%d==0)
			{
				flg=1;
				break;
			}
			d++;
		}
		if(flg==0)
		{
			System.out.println("\n Entered no is prime ");
		}
		else
		{
			System.out.println("\n Entered no is not prime ");
		}
	}
}

//-----------------------------------------------------------------------------------------

	/// using  do while()

	syntax:

	do
	{
		----------;
		----------;
		----------;
		----------;
		----------;
	}while(<cond>);

// Display list of prime nos from given range 

import java.util.*;
class DemoWhile
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("\n Enter the range starts from: ");
		int n1=sc.nextInt();
		System.out.println("\n Enter the range ends to: ");
		int n2=sc.nextInt();

		int d=2,flg=0;
		System.out.println("\n List of prime nos: ");
		for(no=n1;no<=n2;no++)
		{
			d=2;
			flg=0;
			while(d<=(no/2))
			{
				if(no%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}
			if(flg==0)
				System.out.println("  "+no);
		}
	}

//------------------------------------------------------------------------------------------------------------------------------
	
	// WAP to display *

class StarPattern
{
	public static void main(String []args)
	{
		System.out.print("*")
	}
}


class StarPattern
{
	public static void main(String []args)
	{
		System.out.print("*");
	}
}

//-----------------------------------------------------

	WAP to print 
	*****

class StarPattern
{
	public static void main(String []args)
	{
		int j=0;
		for(j=0;j<5;j++)
		{
			System.out.print("*");
		}
	}
}



//-----------------------------------------------------

	WAP to print 
	*****
	*****
	*****
	*****
	*****

class StarPattern
{
	public static void main(String []args)
	{
		int i, j=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

//-----------------------------------------------------

	WAP to print 
           j
        01234 
	*****  i=0
	*   *  i=1
	*   *  i=2
	*   *  i=3
	*****  i=4

class StarPattern
{
	public static void main(String []args)
	{
		int i, j=0;
		for(i=0;i<5;i++) // No of lines
		{
			for(j=0;j<5;j++) // no of cols
			{
				if(i==0 || i==4)
				{
					System.out.print("*");
				}
				else if(j==0 || j==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}

//-------------------------------------------------------------------------------------

	WAP to print 
	* 
	** 
	*** 
	**** 
	*****


class StarPattern
{
	public static void main(String []args)
	{
		int i, j=0;

		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(j<=i)
				{
					System.out.print("*");	
				}			
			}
			System.out.print("\n");
		}
	}
}



//-----------------------------------------------------

	WAP to print 
	*****
	**** 
	*** 
	** 
	* 

class StarPattern
{
	public static void main(String []args)
	{
		int i, j=0;

		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(j<(5-i))
				{
					System.out.print("*");	
				}			
			}
			System.out.print("\n");
		}
	}
}

//---------------------------------------------------------------------

		*
	       ***
	      *****
	     *******
	    *********
           *********** 	

class StarPattern
{
	public static void main(String []args)
	{
		int i, j=0;
		for(i=0;i<6;i++)
		{
			for(j=0;j<(6+i);j++)
			{
				if(j<(5-i))
				{
					System.out.print(" ");	
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}

//-------------------------------------------------------------------------
 
     1
    222
   33333
  4444444
 555555555
66666666666

class StarPattern
{
	public static void main(String []args)
	{
		int i, j=0;
		for(i=0;i<6;i++)
		{
			for(j=0;j<(6+i);j++)
			{
				if(j<(5-i))
				{
					System.out.print(" ");	
				}
				else
				{
					System.out.print(i+1);
				}
			}
			System.out.print("\n");
		}
	}
}

//---------------------------------------------------------------------------------


     A
    ABC
   ABCDE
  ABCDEFG
 ABCDEFGHI
ABCDEFGHIJK

class StarPattern
{
	public static void main(String []args)
	{
		int i, j=0;
		char ch;
		for(i=0;i<6;i++)
		{
			ch='A';
			for(j=0;j<(6+i);j++)
			{
				if(j<(5-i))
				{
					System.out.print(" ");	
				}
				else
				{
					System.out.print(ch);
					ch++;
				}
			}
			System.out.print("\n");
		}
	}
}

//----------------------------------------------------------------------------------------

switch(): It is used in the menu driven programming.

	syntax:
		
		switch(<opt>)
		{
			case <CC>:
				---------;
				---------;
				break;
			case <CC>:
				---------;
				---------;
				break;
			case <CC>:
				---------;
				---------;
				break;
			case <CC>:
				---------;
				---------;
				break;
			[<default>]:
				-----------;
				----------;
		}
		------------------;


	The switch case is used when there are more possibilities, and from which we have to 
	choose any one according to users choice.




import java.util.Scanner;
class DemoSwitch
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int opt=0;
		double a=0.0, b=0.0, ans=0.0;

		System.out.println("\n*** Menu ****");
		System.out.println("1.add \n 2.sub \n 3.multi \n 4.div ");
		System.out.println("select your option: ");
		opt=sc.nextInt();

		System.out.println("Enter any two nos: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		switch(opt)
		{
			case 1:
				ans=a+b;
				break;
			case 2:
				ans=a-b;
				break;
			case 3:
				ans=a*b;
				break;
			case 4:
				ans=a/b;
				break;
			default:
				System.out.println("\n Incorrect Option");			
		}	
		System.out.println("\n Ans is: "+ans);					
	}
}

//--------------------------------------------------------------------------------------

	// Using the character as a option (both lcase and ucase for a single case)

import java.util.Scanner;
class DemoSwitch
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		char opt=0;
		double a=0.0, b=0.0, ans=0.0;

		System.out.println("\n*** Menu ****");
		System.out.println(" a.add \n b.sub \n c.multi \n d.div ");
		System.out.println("select your option: ");
		opt=sc.nextLine().charAt(0);

		System.out.println("Enter any two nos: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		switch(opt)
		{
			case 'A':
			case 'a':
				ans=a+b;
				break;
			case 'B':
			case 'b':
				ans=a-b;
				break;
			case 'C':
			case 'c':
				ans=a*b;
				break;
			case 'D':
			case 'd':
				ans=a/b;
				break;
			default:
				System.out.println("\n Incorrect Option");			
		}	
		System.out.println("\n Ans is: "+ans);					
	}
}
//-------------------------------------------------------------------------------------------

import java.util.Scanner;
class DemoSwitch
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0, opt=0;
		double a=0.0, b=0.0, ans=0.0;

		while(i<3)
		{
			i++;
			System.out.println("\n*** Menu ****");
			System.out.println("1.add \n 2.sub \n 3.multi \n 4.div ");
			System.out.println("select your option: ");
			opt=sc.nextInt();

			System.out.println("Enter any two nos: ");
			a=sc.nextDouble();
			b=sc.nextDouble();
		
			switch(opt)
			{
				case 1:
					ans=a+b;
					break;
				case 2:
					ans=a-b;
					break;
				case 3:
					ans=a*b;
					break;
				case 4:
					ans=a/b;
					break;
				default:
					System.out.println("\n Incorrect Option");			
			}	
			System.out.println("\n Ans is: "+ans);					
		}
	}
}
//-------------------------------------------------------------------------------------------

	// Using the switch within infinite loop (Termination using break)

import java.util.Scanner;
class DemoSwitch
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int opt=0;
		double a=0.0, b=0.0, ans=0.0;

		while(true)
		{
			System.out.println("\n*** Menu ****");
			System.out.println("1.add \n 2.sub \n 3.multi \n 4.div \n 5.stop");
			System.out.println("select your option: ");
			opt=sc.nextInt();

			if(opt==5)
				break;

			System.out.println("Enter any two nos: ");
			a=sc.nextDouble();
			b=sc.nextDouble();
		
			switch(opt)
			{
				case 1:
					ans=a+b;
					break;
				case 2:
					ans=a-b;
					break;
				case 3:
					ans=a*b;
					break;
				case 4:
					ans=a/b;
					break;
				default:
					System.out.println("\n Incorrect Option");			
			}	
			System.out.println("\n Ans is: "+ans);					
		}
	}
}



//-------------------------------------------------------------------------------------------

	// Using the switch within infinite loop (Termination using System.exit(0) )

import java.util.Scanner;
class DemoSwitch
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int opt=0;
		double a=0.0, b=0.0, ans=0.0;

		while(true)
		{
			System.out.println("\n*** Menu ****");
			System.out.println("1.add \n 2.sub \n 3.multi \n 4.div \n 5.stop");
			System.out.println("select your option: ");
			opt=sc.nextInt();
			System.out.println("Enter any two nos: ");
			a=sc.nextDouble();
			b=sc.nextDouble();
		
			switch(opt)
			{
				case 1:
					ans=a+b;
					break;
				case 2:
					ans=a-b;
					break;
				case 3:
					ans=a*b;
					break;
				case 4:
					ans=a/b;
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("\n Incorrect Option");			
			}	
			System.out.println("\n Ans is: "+ans);					
		}
	}
}

//---------------------------------------------------------------------------------------

	Unconditional control statements: The control statement does not need any condition.

	NOTE: In Java goto is not present.

	- using the continue: It will keep the enclosing loop in the running condition without
			      considering the remaining body of loop.

class DemoContinue
{
	public static void main(String []args)
	{
		int i,j;

		for(i=0;i<10;i++)
		{
			System.out.print("-");
			for(j=0;j<10;j++)
			{
				if(j>i)
				{
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//-----------------------------------------------------------------------

//-----------------------------------------------------------------------

			  
		// Using Labelled Continue: It will keep loop in running condition, not only
					   enclosing, but outer loops using label(tag)

class DemoLabelledContinue
{
	public static void main(String []args)
	{
		int i,j;

		outer:for(i=0;i<10;i++)
		{			
			System.out.print("-");
			for(j=0;j<10;j++)
			{
				if(i>5)
				{
					continue outer;
				}
				if(j>i)
				{
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}		


//-----------------------------------------------------------------------

// Using the break ans labelled break


class DemoBreak
{
	public static void main(String []args)
	{
		int i,j;

		for(i=0;i<10;i++)
		{
			System.out.print("-");
			for(j=0;j<10;j++)
			{
				if(j>i)
				{
					break;
				}
				System.out.print(""+j);
			}
			System.out.println();
		}
	}
}

//----------------------------------------------------------------------------------------------

class DemoLabelledBreak
{
	public static void main(String []args)
	{
		int i,j;

		outer:for(i=0;i<10;i++)
		{
			System.out.print("-");
			for(j=0;j<10;j++)
			{
				if(i>5)
				{
					break outer;
				}
				if(j>i)
				{
					break;
				}
				System.out.print(""+j);
			}
			System.out.println();
		}
	}
}	


//---------------------------------------------------------------------------------------

	// Using return: pass back the value from called method to calling function method.

//===============================================================================================

//============================== ARRAY IN Java PROGRAMMING ====================================

//=================================================================================================


		Array is derived data type, which is indexed/ordered collection of elements having same data type and continuously 
		arranged in the memory.


	WE have seen the array initially in C Programming and it is as shown below,

			syntax:
				<data_type> <ar_nm>[<element_count>];

				e.g.
					int ar[5];

					ar 0    1    2    3    4   <--- index
					  [  ] [  ] [  ] [  ] [  ] <---- value
					 700   704  708  712  716 <---- Address  
		

			Note: 
				- Array index i.e. <element_count> must be constant.
				- Array counting starts from 0
				- ar[i] gives the value at i th location, where i is an index
				- &ar[i] gives the Address of i th location

	Now, We will see how the array is decl. in the java

		Syntax:
			<data_type> []<ar_nm>;	or	<data_type> <ar_nm>[];

	It will create a reference variable. (It is same as the pointer variable in C )

		e.g.
			int []x;	or 	int x[];

			x
			[]

	Note carefully that, Array gains the dunamic memory space, and for the allocation we
	must use the new keyword.

		i.e.
			int []x=new int[5]	or	int x[]=new int[5];

	In this case, the memory is allocated to store the five int values, and the same laocation
	refered by the reference variable x as shown below,

		x	        0    1    2    3   4	
		[ ] --------> [  ] [  ] [  ] [  ] [  ]


	Now lets start array init and display

class InitArray
{
	public static void main(String []args)
	{
		int []x={12,45,67,78,89,90};

		System.out.println("Array elements are: ");
		for(int i=0;i<6;i++)
		{
			System.out.print("   "+x[i]);
		}
	}
}


// Note that the array length property which will automatically gives the length
// of array. i.e. Element count. so it can be used as

class InitArray
{
	public static void main(String []args)
	{
		int []x={12,45,67,78,89,90};		
		System.out.println("Element count: "+x.length);
		
		System.out.println("Array elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}
	}
}

//------------------------------------------------------

	// Lets try the array input using different ways.

	// Array input using scanner class

import java.util.Scanner;
class ArrayInputScanner
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []x=new int[5];

		System.out.println("\n Enter the five nos: ");
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("    "+x[i]);
		}
	}
}

//--------------------------------------------

	// Array input using commandline

class ArrayInputCommandline
{
	public static void main(String []args)
	{
		int []x=new int[args.length];

		for(int i=0;i<args.length;i++)
		{
			x[i]=Integer.parseInt(args[i]);
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("    "+x[i]);
		}

	}
}

//--------------------------------------------

	// Array input using BufferedReader and InputStreamReader

import java.io.BufferedReader;
import java.io.InputStreamReader;
class ArrayInputBrIsr
{
	public static void main(String []args)
	{
		int []x=new int[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n Enter the five nos: ");
		for(int i=0;i<5;i++)
		{
			try{x[i]=Integer.parseInt(br.readLine());}catch(Exception e){}
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("    "+x[i]);
		}
	}
}

//------------------------------------------------------------------------------------------

	// The element count can be dynamic, the lets see how the memory is allocated


import java.io.BufferedReader;
import java.io.InputStreamReader;
class ArrayInputBrIsr
{
	public static void main(String []args)
	{
		int cnt=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Element count: ");
		try{cnt=Integer.parseInt(br.readLine());}catch(Exception e){}
		int []x=new int[cnt];

		System.out.println("\n Enter the "+cnt+" nos: ");
		for(int i=0;i<cnt;i++)
		{
			try{x[i]=Integer.parseInt(br.readLine());}catch(Exception e){}
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("    "+x[i]);
		}
	}
}


//-------------------------------------------------------------------------------------

	// Arrayinput using javax.swing.JOptionPane.showInputDialog()

import javax.swing.JOptionPane;
class ArrayInputDialog
{
	public static void main(String []args)
	{
		int cnt=Integer.parseInt(JOptionPane.showInputDialog("Enter the Element count: "));
		int []x=new int[cnt];

		for(int i=0;i<cnt;i++)
		{
			x[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter any int number: "));
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("    "+x[i]);
		}
	}
}


//----------------------------------------------------------------------------------------------------

	You can perform different operations on array, as you have done before

	// WAP to perform searching operation

		x 		0   1   2   3   4   5   6 
		[  ] --------> [ ] [ ] [ ] [ ] [ ] [ ] [ ]

import java.util.Scanner;
class ArraySearching
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i;

		System.out.println("Enter the element count: ");
		int cnt=sc.nextInt();

		int []x=new int[cnt];

		System.out.println("Enter the "+cnt+" Nos: ");
		for(i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number to be searched: ");
		int no=sc.nextInt();

		for(i=0;i<x.length;i++)
		{
			if(x[i]==no)
			{
				break;
			}
		}
		if(i<x.length)
		{
			System.out.println("Number "+no+" is present at "+i+" th location");
		}
		else
		{
			System.out.println("Number is Absent");
		}
	}
}

//----------------------------------------------------------------


	// Write a program to fill all array elements with as a 1 and the some portion with 5

class FillArray
{
	public static void main(String []args)
	{
		int []ar=new int[8];
		
		// fill all location with 1
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=1;
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("  "+ar[i]);
		}

		// now fill 3 location from 2nd with 5
		for(int i=2;i<5;i++)
		{
			ar[i]=5;
		}
		System.out.println("\n Now Array Elements are: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("  "+ar[i]);
		}
	}
}

//----------------------------------------------------

	// you can display function i a same class to avoid the rep. of code as


class FillArray
{
	public static void display(int []a)
	{
		System.out.println("Array Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+ar[i]);
		}
	}
	public static void main(String []args)
	{
		int []ar=new int[8];
		
		// fill all location with 1
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=1;
		}
		display(ar);

		// now fill 3 location from 2nd with 5
		for(int i=2;i<5;i++)
		{
			ar[i]=5;
		}
		display(ar);
	}
}


//----------------------------------------------------------------------

	// take a same efforts for fill operation


class FillArray
{
	public static void display(int []a)
	{
		System.out.println("\n Array Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}
	public static void fillArray(int []a,int val)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=val;
		}
	}
	public static void fillArray(int []a,int val, int sp, int cnt)
	{
		while(cnt>0)
		{
			a[sp]=val;
			sp++;
			cnt--;
		}
	}
	public static void main(String []args)
	{
		int []ar=new int[8];
		
		// fill all location with 1
		fillArray(ar, 1);
		display(ar);

		// now fill 3 location from 2nd with 5
		fillArray(ar, 5, 2, 3);
		display(ar);
	}
}

//--------------------------------------------------------------------------------------------------

	// Same progrm can be provided as a class to process an array


//----------------------------------------------------------------------

	// take a same efforts for fill operation


class FillArray
{
	public static void display(int []a)
	{
		System.out.println("\n Array Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}
	public static void fillArray(int []a,int val)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=val;
		}
	}
	public static void fillArray(int []a,int val, int sp, int cnt)
	{
		while(cnt>0)
		{
			a[sp]=val;
			sp++;
			cnt--;
		}
	}
}

class FillArrayExample
{
	public static void main(String []args)
	{
		int []ar=new int[8];
		
		// fill all location with 1
		FillArray.fillArray(ar, 1);
		FillArray.display(ar);

		// now fill 3 location from 2nd with 5
		FillArray.fillArray(ar, 5, 2, 3);
		FillArray.display(ar);
	}
}

//----------------------------------------------------------------------------

we can provide it as a library also so for that we need to inset the documentation comments as

/**
This class contains some static methods, which are provided to fill the entire array with
the value 1 and A method which will fill the specific part of an array with a given value
*/
public class FillMyArray
{
	/**
	This method will displays all array element in a single line.
	*/
	public static void display(int []a)
	{
		System.out.println("\n Array Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}
	/**
	This method will fill an array with a value provided by val 
	*/
	public static void fillArray(int []a,int val)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=val;
		}
	}
	/**
	This method will fill a part, from sp position and cnt elements after it,
	of array with a value provided by val 
	*/
	public static void fillArray(int []a,int val, int sp, int cnt)
	{
		while(cnt>0)
		{
			a[sp]=val;
			sp++;
			cnt--;
		}
	}
}

// save as a public class and compile it using javadoc from bin folder, you will get documentation
// for your class.

//=====================================================================================================

	// Input an array and display the list of prime nos from an array
import java.util.*;
class ArrayPrimeList
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int []x=new int[6];
		System.out.println("Enter the six nos: ");
		for(i=0;i<6;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Entered nos: ");
		for(i=0;i<6;i++)
		{
			System.out.print("  "+x[i]);
		}

		int d=2,flg=0;
		System.out.print("\n Prime List from Array: ");
		for(int no : x) // this is for each loop, and can be read as, for each
		{		// no from array
			d=2;
			flg=0;
			while(d<=(no/2))
			{
				if(no%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}	
			if(flg==0)
			{
				System.out.print("   "+no);
			}
		}
	}
}

//------------------------------------------------------------------------------------

	// WAP to sort the array in ascending form.

import java.util.Scanner;
class ArraySort
{
	public static void main(String []args)	
	{
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		System.out.println("Enter the element count: ");
		cnt=sc.nextInt();
		int []ar=new int[cnt];
		System.out.println("Enter the "+cnt+" elements:" );
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("\n Entered Element's Are:- ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(" "+ar[i]);
		}

		System.out.println("\n Element's In Asscending Order:- ");
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int tmp=ar[i];
					    ar[i]=ar[j];
					    ar[j]=tmp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("  "+ar[i]);
		}
		System.out.print("\n");
	}
}

//---------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------

		--- 2D Array in Java ---

   It is actually collection of 1D arrays. It is represented in following way,

	suppose it is array of 3x4 

	In C/C++ it is decl. as,	int ar[3][4]

       ar               ar
	[][][][]	_________________________________________________________________
	[][][][]  OR 	|		|		|		|		|
	[][][][]	|   [ ] [ ] [ ] |   [ ] [ ] [ ] |  [ ] [ ] [ ]  |   [ ] [ ] [ ] |
			|_______________|_______________|_______________|_______________|
      Matrix Form

	We know in java, array gains the memory space at runtime.
	so when we create an array as 

	<data_type> [][]<ar_nm> = new <data_type>[rows][cols];

		e.g.
			int [][]x=new int[3][4];

	Now, lets init array and display it.

class Array2D
{
	public static void main(String []args)
	{
		int [][]x={ {11,22,33,21}, {44,55,66,78}, {77,88,92,49} };
		int i,j;

		System.out.println("Array elements are: \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}

		
		System.out.println("\n Array elements are: \n");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}

//---------------------------------------------------------------------------------------

	///  Input and Display in 2D Array

import java.util.Scanner;
class Array2DInputDisplay
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][]x=new int[3][4];
		int i,j;

		System.out.println("Enter array of 3x4: \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				x[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		
		System.out.println("\n Array elements are: \n");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}

///--------------------------------------------------------------------------------------

	// WAP to perform matrix multi.

import java.util.Scanner;
class Array2DMulti
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][]x=new int[3][3];
		int [][]y=new int[3][3];
		int [][]z=new int[3][3];
		int i,j,k;

		System.out.println("Enter array of 3x4: \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				x[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Enter another array of 3x4: \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				y[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		// multi.
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				z[i][j]=0;
				for(k=0;k<x[i].length;k++)
				{
					z[i][j]=z[i][j]+(x[i][k]*y[k][j]);
				}
			}
		}
		
		System.out.println("\n Array elements are: \n");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.print("\t");
			for(j=0;j<y[i].length;j++)
			{
				System.out.print("  "+y[i][j]);
			}
			System.out.print("\t");
			for(j=0;j<z[i].length;j++)
			{
				System.out.print("  "+z[i][j]);
			}
			System.out.println();
		}
	}
}

///-----------------------------------------------------------------------------------------

	// Variable size Array or Jagged Array

	suppose, you decl. an array as,

		int [][]x=new int[3][];

	then see the memory map is as shown below,

		x
		[ ] --------->  [ ]
				[ ]
				[ ]
			  These all 3 are the references, which will able to refer
			  dynamically created location of correct type, having any SIZE. 

	Means to store data, we need to allocate memory for each location. So we need to
	write it as,
	
		x[0]=new int[5];
		x[1]=new int[7];
		x[2]=new int[4];

		x
		[ ] --------->  [ ] -------> [][][][][]
				[ ] -------> [][][][][][][]
				[ ] -------> [][][][]

	So Note that, In Jagged array(variable size array) size(length) of every row
	may be different.

lets see the example.

   // WAP to input and display the marks obtained to 3 students in different subjects.
import java.util.*;
class MarksOfThreeInNSubjects
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int [][]marks=new int[3][];
		System.out.println("Enter the marks of 3 students: ");
		for(i=0;i<3;i++)
		{
			System.out.println("Enter the subject count of student "+(i+1)+": ");
			int subs=sc.nextInt();
			marks[i]=new int[subs];
			System.out.println("Enter the marks obtained in "+subs+" subjects: ");
			for(j=0;j<subs;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n Mark List \n");
		for(i=0;i<marks.length;i++)
		{
			System.out.print("\n Student "+(i+1)+": ");
			for(j=0;j<marks[i].length;j++)
			{
				System.out.print("  "+marks[i][j]);
			}
		}
	}
}

//--------------------------------------------------------------------------------------

// In above example both student count and subject count of each student can be different
	
import java.util.*;
class MarksOfNInNSubjects
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		
		System.out.println("Enter the no of students: ");
		int stud=sc.nextInt();
		int [][]marks=new int[stud][];
		System.out.println("Enter the marks of 3 students: ");
		for(i=0;i<stud;i++)
		{
			System.out.println("Enter the subject count of student "+(i+1)+": ");
			int subs=sc.nextInt();
			marks[i]=new int[subs];
			System.out.println("Enter the marks obtained in "+subs+" subjects: ");
			for(j=0;j<subs;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n Mark List \n");
		for(i=0;i<marks.length;i++)
		{
			System.out.print("\n Student "+(i+1)+": ");
			for(j=0;j<marks[i].length;j++)
			{
				System.out.print("  "+marks[i][j]);
			}
		}
	}
}

///===============================================================================================================================
///===============================================================================================================================

	OOPS in java: 
	=============

	In the oop we must know the followong things.

		- class
		- Object
		- data hiding
		- encapsulation
		- abstraction
		- Instance variables and methods
		- constructors and destructors
		- static variable and static method
		- method overloading and method overriding
		- operator overloading
		- Interitance
		- polymorphism
		- virtual and abstract

	All these things are mentioned with ref to C++ background


	Using class in java: It allows you to create your own data type. In java standred library(JSL) all 
			     the methods are provided as a member methods of class, and in many cases there
			     are different classes which are used to represent exsisting things in its object form.
			     so we must have depth knowledge oc class as a rule or specification. 

			
		syntax:
			class <cls_nm>
			{
				<instance_variables>;
				<Member_methods>;
				.
				.
			}

		* Note: There are 4 different visibility modifiers for java classes.

			- private: Not accessible directly using . operator
			- public: can be accessed using the . operator directly(from outside of package)
			- protected: ....
			- default: can be accessed using the . operator directly(within package)

		* Bydefault the class members are default in nature.
		* Here in java you have to mention the visibility of every class member using public, private,
		  or protected. No keyword for default.		
		* There is one unwritten rule. CHOOSE THE FIRST CHARACTER OF CLASS NAME IN UPPERCASE AND ALL OTHER IN LOWER IF IT IS MADE FROM SINGLE WORD. IF IT IS MADE FROM MORE WORDS THEN FIRST CHARACTER 
		OF EACH WORD IN UCASE AND ALL OTHERS IN  LCASE, WITH NO SPACE IN BETWEEN.

	E.G.

	class Demo
	{
		// Instance variables
		private int x;
		protected double y;
		private char ch;

		// Member methods or Methods
		public void in()
		{
			.....
		}
		public void out()
		{
			.....
		}
		int getx()
		{
			....
		}
	}
		

	//--------------------------------------------------------------------------------------

	- Creating the Object in Java: 
	---------------------------------

	In simple words the object is variable of class type. or It is instance of class.


		class Demo	
		{
			...
		}

	  If i used the statement like

		Demo d;		// In C++ style

		d
		[ ]  (reference variable)

	  It is called as reference variable (It is same like pointer variable), means it able to hold
	  the reference(address) where the data is or will be stored.


	 Means we have to take some additional efforts to allocate the memory for object and for that we
	 need to use the new keyword as ...


		<class_nm> <Obj_nm>=new <cls_nm>();

		i.e.

		Demo d=new Demo();

		d
		 [ ]-----------> [     ]
				 [     ]  SPACE ALLOCATED TO
				 [     ]  STORE THE DATA
				 [     ]

	Note that the java object is dynamic in nature.

import java.util.Scanner;
class Employee
{
	private int empcode;
	private double sal;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee code: ");
		empcode=sc.nextInt();
		System.out.println("Enter the salary: ");
		sal=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("\n employee Code: "+empcode+"\t Salary: "+sal);
	}
}

class MainEmpClass
{
	public static void main(String []args)
	{
		Employee e1=new Employee();
		e1.in();
		e1.out();

		Employee e2=new Employee();
		e2.in();
		e2.out();	
	}
}

//---------------------------------------------------------------------------------

	// Creating Anonymous Object:

	Anonymous Object is an instance of class which can not be refered by any referance variable 
	when it is created. we are able to call the methods from same instance only once at the time
	of decl.

class DemoObj
{
	public void show()
	{
		System.out.println("\n In the DemoObj-show()");
	}
}

class MainDemoObj
{
	public static void main(String []args)
	{
		// Creating Anonymous Object
		new DemoObj().show();
	}
}

//------------------------------------------------------------------------------------------------

	// Defining main() method in same class

class DemoClass
{
	private int x;
	private double y;
	public static void main(String []args)
	{
		DemoClass ob=new DemoClass();
		ob.x=10;	// As a main() is a mehhod form same class, it will able to access
		ob.y=33.25;	// method, directly using the . operator.
		System.out.println("\n x="+ob.x+"\t y="+ob.y);
	}
}  
///-------------------------------------------------------------------------

	// Java allows you to init the fields(instance variables) directly.

class DemoClass
{
	int x=12;
	double y=45.23;
	public static void main(String []args)
	{
		DemoClass ob=new DemoClass();
		System.out.println("\n x="+ob.x+"\t y="+ob.y);
	}
}  

//--------------------------------------------------------------------------

	// Defining Another method with Main Class


class DemoClass
{
	pubic void showMessage()
	{
		System.out.println("Message: Work Hard..!! It's important");
	}
	public static void main(String []args)
	{
		System.out.println("Hello...!! Welcome to OOP's in Java");
	}
}  


	// Now i want to call method showMessage(), we have two options
		- decl it as a static
		- create an object of class and then call using object name.

Lets See

class DemoClass
{
	pubic static void showMessage()
	{
		System.out.println("Message: Work Hard..!! It's important");
	}
	public static void main(String []args)
	{
		System.out.println("Hello...!! Welcome to OOP's in Java");
		showMessage();
	}
}  

OR

class DemoClass
{
	public void showMessage()
	{
		System.out.println("Message: Work Hard..!! It's important");
	}
	public static void main(String []args)
	{
		System.out.println("Hello...!! Welcome to OOP's in Java");
		
		DemoClass ob=new DemoClass();
		ob.showMessage();
	}
}  


//---------------------------------------------------------------------------------------------------

	// WAP to input and display the data of two students

import java.util.Scanner;
class Student
{
	private int id;
	private double per;

	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student ID: ");
		id=sc.nextInt();

		System.out.println("Enter the Percentage: ");
		per=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("\n Student ID: "+id+"\n Percentage: "+per);
	}
}
class DemoStudent
{
	public static void main(String []args)
	{
		Student s1=new Student();
		s1.in();
		s1.out();

		Student s2=new Student();
		s2.in();
		s2.out();
	}
}	
//--------------------------------------------------------------

	// Or can be passed from the main()

import java.util.Scanner;
class Student
{
	private int id;
	private double per;

	public void in(int t1, double t2)
	{
		id=t1;
		per=t2;
	}
	public void out()
	{
		System.out.println("\n Student ID: "+id+"\n Percentage: "+per);
	}
}
class DemoStudent
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the student ID: ");
		int sid=sc.nextInt();
		System.out.println("Enter the Percentage: ");
		double sper=sc.nextDouble();

		Student s1=new Student();
		s1.in(sid,sper);
		s1.out();
		//-----------------------------------------------

		System.out.println("Enter the student ID: ");
		sid=sc.nextInt();
		System.out.println("Enter the Percentage: ");
		sper=sc.nextDouble();
		Student s2=new Student();
		s2.in(sid,sper);
		s2.out();
	}
}	


//----------------------------------------------------------------------------------------------------------------

	// Both can be combined together as

import java.util.Scanner;
class Student
{
	private int id;
	private double per;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student ID: ");
		id=sc.nextInt();

		System.out.println("Enter the Percentage: ");
		per=sc.nextDouble();
	}
	public void in(int t1, double t2)
	{
		id=t1;
		per=t2;
	}
	public void out()
	{
		System.out.println("\n Student ID: "+id+"\n Percentage: "+per);
	}
}
class DemoStudent
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		Student s1=new Student();
		s1.in();
		s1.out();
		//-----------------------------------------------

		System.out.println("Enter the student ID: ");
		sid=sc.nextInt();
		System.out.println("Enter the Percentage: ");
		sper=sc.nextDouble();
		Student s2=new Student();
		s2.in(sid,sper);
		s2.out();
	}
}	


	In above program, there are two different copies of in() method i.e.

		public void in()
		public void in(int t1, double t2)

	as a class contains two copies of function having same name and differ in terms of
	signature, it is known as "Method Overloading"



//--------------------------------------------------------------------------------------------------------------

/// Example of Method Overloading with TypePromotion:

	In the overloading, the exact match for the function will be searched, in absence the data types of
	arguments are promoted as shown..

	    	      byte
			|
			V		
		char-->int-->long ->float --> double
			|     |
			V     V
		      float/double

	after promotion the exact match will be searched and the method will be executed.

	
class Addition
{
/*	static int add(int x, int y)
	{
		System.out.println("1.int-int:");
		return (x+y);
	}
	static float add(float x, int y)
	{
		System.out.println("2.float-int:");
		return (x+y);
	}
*/	static double add(double x, int y)
	{
		System.out.println("3.double-int:");
		return (x+y);
	}
}
class MainClassTP
{
	public static void main(String []args)
	{
		System.out.println("1. int-int: "+Addition.add(2,3));	
		System.out.println("2. float-int: "+Addition.add(4.5F,7));
		System.out.println("1. double-int: "+Addition.add(56.34,9));
	}
}


//---------------------------------------------------------------------------------------------------

	// returning the data from methods
	-----------------------------------

	// Write a program to display the details of elder student (refer above program)

import java.util.Scanner;
class Student
{
	private int id;
	private int age;
	private double per;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student ID: ");
		id=sc.nextInt();

		System.out.println("Enter the student age: ");
		age=sc.nextInt();

		System.out.println("Enter the Percentage: ");
		per=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("\n Student ID: "+id+"\n Percentage: "+per);
	}
	public int getAge()
	{
		return age;
	}
}
class DemoStudent1
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		Student s1=new Student();
		s1.in(); 
		s1.out();
		//-----------------------------------------------

		Student s2=new Student();
		s2.in();
		s2.out();

		System.out.println("\n Details of Elder student: ");
		if(s1.getAge()>s2.getAge())
			s1.out();
		else
			s2.out();
	}
}	


//-----------------------------------------------------------------------------------------------

	// Defining setter and getter methods

	// Generally the classes contains the setter and getter methods, so same program can be 
	// written as 


import java.util.Scanner;
class Student
{
	private int id;
	private int age;
	private double per;
	
	//---------- getters ---------------------
	public int getId()
	{
		return id;
	}	
	public int getAge()
	{
		return age;
	}	
	public double getPer()
	{
		return per;
	}
	
	//---------- Setters ---------------------

	public void setId(int id)
	{
		this.id=id;
	}	
	public void setAge(int age)
	{
		this.age=age;
	}	
	public void setPer(double per)
	{
		this.per=per;
	}
}
class DemoStudent1
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		Student s1=new Student();
		s1.setId(11); 
		s1.setAge(23);
		s1.setPer(89.67);
		System.out.println("Student 1: ID: "+s1.getId()+"\t Age: "+s1.getAge()+"\t Percentage: "+s1.getPer());
		//-----------------------------------------------

		Student s2=new Student();
		s2.setId(12); 
		s2.setAge(21);
		s2.setPer(90.67);
		System.out.println("Student 2: ID: "+s2.getId()+"\t Age: "+s2.getAge()+"\t Percentage: "+s2.getPer());
		
		System.out.println("\n Details of Elder student: ");
		if(s1.getAge()>s2.getAge())
			System.out.println("Student 1: ID: "+s1.getId()+"\t Age: "+s1.getAge()+"\t Percentage: "+s1.getPer());
		else
			System.out.println("Student 2: ID: "+s2.getId()+"\t Age: "+s2.getAge()+"\t Percentage: "+s2.getPer());
	}
}	

//---------------------------------------------------------------------------------------------

	// Array of Objects

	Note carfully that, when we write a instruction as
				
		Student s;	s
				[ ]

	It will create a reference only, so to store the data we need to allocate memory for it.
						
		i.e. s=new Student();		s
						 [  ] -----> [         ]

	Array is actually collection of such locations, so when we write

		Student s=new Student[4];	s
						[  ] -------> [] [] [] [] (It is group of 4 reference variables)
	so we need to allocate memory for each.
		
	i.e.
		s[0]=new Student();
		s[1]=new Student();
		s[2]=new Student();
		s[3]=new Student();

	so the dynamically allocated memory map looks like a diagram as shown below.

		s
		[  ] -------> [    ] [    ] [    ] [    ]
				|      |       |      |
				V      V       V      V
				[][]   [][]    [][]   [][]


import java.util.Scanner; 
class Student
{
	private int id;
	private double per;

	public void in(int t1, double t2)
	{
		id=t1;
		per=t2;
	}
	public void out()
	{
		System.out.println("\n Student ID: "+id+"\n Percentage: "+per);
	}
}
class ArrayOfStudObj
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Student []s=new Student[3];

		for(int i=0;i<3;i++)
		{
			s[i]=new Student();
			System.out.println("Enter the student ID: ");
			int sid=sc.nextInt();
			System.out.println("Enter the Percentage: ");
			double sper=sc.nextDouble();
			s[i].in(sid,sper);
		}

		System.out.println("\n Student list");
		for(int i=0;i<3;i++)
		{
			s[i].out();
		}
	}
}	

//---------------------------------------
Another program
// Enter the id, percentage of N students and display the student list with topper details

		suppose, cnt=5

		s _______0_______________1_____________2_______________3_______________4________
		  |		|		|		|		|		|
		  | id   per	|		|		|		|		|
		  |		|		|		|		|		|
		  | in() out()	|		|		|		|		|
		  |_____________|_______________|_______________|_______________|_______________|

import java.util.Scanner;
class Student
{
	private int id;
	private double per;

	public void in(int id, double per)
	{
		this.id=id;
		this.per=per;
	}
	public void out()
	{
		System.out.print("\n Student ID: "+id+"\t Percentage: "+per);
	}
	double getPer()
	{
		return per;
	}
}
class ArrayOfStudObj
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student count: ");
		int cnt=sc.nextInt();

		Student []s=new Student[cnt];

		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			System.out.println("Enter the student ID: ");
			int sid=sc.nextInt();
			System.out.println("Enter the Percentage: ");
			double sper=sc.nextDouble();
			s[i].in(sid,sper);
		}

		System.out.println("\n Student list");
		for(int i=0;i<s.length;i++)
		{
			s[i].out();
		}

		
		double tper=0.0;
		int tpos=-1;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].getPer()>tper)
			{
				tper=s[i].getPer();
				tpos=i;
			}
		}
		System.out.println("\n Topper Detais");
		s[tpos].out();
	}
}

//------------------------------------------------------------------------------------------------------

	// WAP to create the array of Item objects and find the total bill.

import java.util.Scanner;
class Item
{
	private int icode;
	private double ipr;
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the item code: ");
		icode=sc.nextInt();
		System.out.println("\n Enter the item Price: ");
		ipr=sc.nextDouble();
	}
	public void showData()
	{
		System.out.println("\n item code: "+icode+"\t Price: "+ipr);
	}
	public double getPrice()
	{
		return ipr;
	}
}

class FindBill
{
	public static void main(String []args)
	{
		Item []ilist=new Item[3];

		System.out.println("Enter the information of 3 Items");
		for(int i=0;i<3;i++)
		{
			ilist[i]=new Item();
			ilist[i].setData();
		}

		System.out.println("\n List of  Items");
		for(int i=0;i<3;i++)
		{
			ilist[i].showData();
		}
		
		// find total bill
		double tot=0.0;
		for(int i=0;i<3;i++)
		{
			tot=tot+ilist[i].getPrice();
		}
		System.out.println("\n Total Bill: "+tot);
	}
}

//-------------------------------------------------------------------------------------------------

// Using static keyword:

	Note that the static memebers gains the memory space when class is loaded into memory
	for execution.
	
	There are 3 different uses of static keyword

		- To decl static variable (shared by every object of same class)
		- To decl static method (called using class name, Having access to static members only)
		- To create the static block (init static variables)

	// same program can be done by using static variable


			Memory allocated for all objects of Item class
		________________________________________________________________________
		|Common									|
		|									|
		|	void setData() {.....}			tot			|
		|						 [ 0.0 ]		|
		|	void showData() {.....}						|
		|									|
		|	void showTot() {.....}						|
		|_______________________________________________________________________|
		|individual								|
		|									|
		|    a1		      a2                a3                a4		|
		|  [     ] icode    [     ] icode     [     ] icode     [     ] icode	|
		|  [     ] ipr	    [     ] ipr	      [     ] ipr       [     ] ipr	|
		|									|
		|									|
		|									|
		|									|
		|_______________________________________________________________________|


	// Create class Item, and WAP to input and display the list of items together with total bill.

import java.util.Scanner;
class Item
{
	private int icode;
	private double ipr;
	private static double tot;
	
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the item code: ");
		icode=sc.nextInt();
		System.out.println("\n Enter the item Price: ");
		ipr=sc.nextDouble();
		
		tot=tot+ipr;		
	}
	public void showData()
	{
		System.out.println("\n item code: "+icode+"\t Price: "+ipr);
	}
	public void showTot()
	{
		System.out.println("\n Total Bill: "+tot);
	}
}

class FindBill
{
	public static void main(String []args)
	{
		Item []ilist=new Item[3];

		System.out.println("Enter the information of 3 Items");
		for(int i=0;i<3;i++)
		{
			ilist[i]=new Item();
			ilist[i].setData();
		}

		System.out.println("\n List of  Items");
		for(int i=0;i<3;i++)
		{
			ilist[i].showData();
		}
		
		// show total bill
		ilist[0].showTot();
	}
}

//-------------------------------------------------------------------------------------------------------

	// Using static method and static block


			Memory allocated for all objects of Item class
		________________________________________________________________________
		|Common									|
		|									|
		|	void setData() {.....}			tot			|
		|						 [ 100.0 ]		|
		|	void showData() {.....}						|
		|									|
		|	static void showTot() {.....}					|
		|_______________________________________________________________________|
		|individual								|
		|									|
		|    a1		      a2                a3                a4		|
		|  [     ] icode    [     ] icode     [     ] icode     [     ] icode	|
		|  [     ] ipr	    [     ] ipr	      [     ] ipr       [     ] ipr	|
		|									|
		|									|
		|									|
		|									|
		|_______________________________________________________________________|


	// Create class Item, and WAP to input and display the list of items together with total bill.

import java.util.Scanner;
class Item
{
	private int icode;
	private double ipr;
	private static double tot;
	static
	{
		tot=100.0;
	}
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the item code: ");
		icode=sc.nextInt();
		System.out.println("\n Enter the item Price: ");
		ipr=sc.nextDouble();
		
		tot=tot+ipr;		
	}
	public void showData()
	{
		System.out.println("\n item code: "+icode+"\t Price: "+ipr);
	}
	static public void showTot()
	{
		System.out.println("\n Total Bill: "+tot);
	}
}

class FindBill
{
	public static void main(String []args)
	{
		Item []ilist=new Item[3];

		System.out.println("Enter the information of 3 Items");
		for(int i=0;i<3;i++)
		{
			ilist[i]=new Item();
			ilist[i].setData();
		}

		System.out.println("\n List of  Items");
		for(int i=0;i<3;i++)
		{
			ilist[i].showData();
		}
		
		// show total bill
		Item.showTot();
	}
}

//-------------------------------------------------------------------------------------------------------


  // Lets define some class, which generally we use in our programs
/**
	Example 1
   ------------

Analyse the class templet given below
class MyNumber
{
	private int no;
	pubic void setNo(int a){}
	pubic int getNo(){}
	public String toOctal(){}
	public void toBinary(){}
	public void toHex(){}
	public boolean isBinary(int a){}
	public boolean isOctal(int a){}
	public boolean isHex(int a){}
	public static int max(int a, int b){}
}
Write a program to use every method defined within a class without changing it 
signature.


import java.util.Scanner;
class MyNumber
{
	private int no;
	public void setNo(int a)
	{
		no=a;
	}
	public int getNo()
	{
		return no;
	}
	public String toOctal()
	{
		int no=this.no;
		String octal="";
		while(no>0)
		{
			int rem= no%8;
			octal=rem+octal;
			no=no/8;
		}
		return octal;
	}
	public void toBinary()
	{
		int no=this.no;
		String binary="";
		while(no>0)
		{
			int rem= no%2;
			binary=rem+binary;
			no=no/2;
		}
		System.out.println(binary);

	}
	public void toHex()
	{
		int no=this.no;
		String hexa="";
		while(no>0)
		{
			int rem=no%16;
			if(rem<10)
			{
				hexa=rem+hexa;
			}
			else
			{
				hexa=(char)(rem+55)+hexa;
			}
			no=no/16;
		}
		System.out.println(hexa);

	}
	public boolean isBinary(int a)
	{
		String str=Integer.toString(a);
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!='0' && c!='1')
			{
				return false;
			}
		}
		return true;
	}
	public boolean isOctal(int a)
	{
		String str=Integer.toString(a);
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c<'0' || c>'7')
			{
				return false;
			}
		}
		return true;
	}
	public boolean isHex(int a)
	{
		String str=Integer.toString(a);
		for(int i=0;i<str.length();i++)
		{
			char c=Character.toUpperCase(str.charAt(i));
			if(!((c>='0' && c<='9') ||(c>='A' && c<='F') || (c>='a'&& c<='f')));
			{
				return false;
			}
		}
		return true;
	}
	public static int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}

class MainMyNumber
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int x=sc.nextInt();

		MyNumber ob = new MyNumber();
		ob.setNo(x);

		System.out.println("Entered value is: "+ob.getNo());

		System.out.println("Octal of "+ob.getNo()+" is: "+ob.toOctal());
		System.out.print("Binary of "+ob.getNo()+" is: "); 
		ob.toBinary();
		System.out.print("Hexadecimal of "+ob.getNo()+" is: "); 
		ob.toHex();

		boolean isBinary = ob.isBinary(1010);
		System.out.println("Is Binary ? "+ isBinary);

		boolean isOctal = ob.isOctal(12);
		System.out.println("Is Octal ? "+ isOctal);

		boolean isHex = ob.isHex(0GA);
		System.out.println("Is Hex ? "+ isHex);

		int maxnumber= MyNumber.max(5,10);
		System.out.println("Maximum Number is: "+maxnumber);
	}
}

//====================================================================================

	// ------- Example 2 ---------

Write a program to define the operations mentioned in a class given below.
class MyArray
{
	private int ar[];
	public void setArray(){}
	public void setArray(int []a){}
	public void ShowArray(){}
	public String getArray(){}
	public int getLength(){}
	public boolean isMatching(int []a){}
	public int search(int n){}
	public void showSorted(){}
}


import java.util.Scanner;
class MyArray
{
	private int ar[];
	public void setArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element count: ");
		int cnt=sc.nextInt();
		ar=new int[cnt];
		
		System.out.println("Enter the "+cnt+" elements: ");
		for(int i=0;i<cnt;i++)
		{
			ar[i]=sc.nextInt();
		}
	}
	public void setArray(int []a)
	{
		ar=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			ar[i]=a[i];
		}
	}
	public void showArray()
	{
		System.out.println("\n Entered elements: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("  "+ar[i]);
		}
	}
	public String getArray()
	{
		String str="";
		for(int i=0;i<ar.length;i++)
		{
			str=str+"  "+ar[i];
		}
		return str;
	}
	public int getLength()
	{
		int i;
		for(i=0;i<ar.length;i++);
		return i;
	}
	public boolean isMatching(int []a)
	{
		boolean b=true;
		if(ar.length!=a.length)
			b=false;
		else
		{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]!=a[i])
				{
					b=false;
					break;
				}
			}
		}
		return b;
	}
	public int search(int n)
	{
		int pos=-1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==n)
			{
				pos=i;
				break;
			}
		}
		return pos;
	}
	public void showSorted()
	{
		int []y=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			y[i]=ar[i];
		}
		for(int i=0;i<y.length-1;i++)
		{
			for(int j=i;j<y.length;j++)
			{
				if(y[i]>y[j])
				{
					int tmp=y[i];
					y[i]=y[j];
					y[j]=tmp;
				}
			}
		}
		System.out.println("\n Sorted elements: ");
		for(int i=0;i<y.length;i++)
		{
			System.out.print("  "+y[i]);
		}
	}
}
class MainMyArray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []p={11,23,34,56,67,90};
		
		MyArray a1=new MyArray();
		a1.setArray();

		MyArray a2=new MyArray();
		a2.setArray(p);

		a1.showArray();
		a2.showArray();

		System.out.println("\n Array Elements(string): "+a1.getArray());
		System.out.println("\n Array Elements(string): "+a2.getArray());
		System.out.println("\n Array a1 length: "+a1.getLength());
		System.out.println("\n Array a2 length: "+a2.getLength());
		
		System.out.println("\n Array a1 matching with p: "+a1.isMatching(p));
		System.out.println("\n Array a2 matching with p: "+a2.isMatching(p));

		System.out.println("Enter the no to be searched: ");
		int no=sc.nextInt();
		int t=a1.search(no);
		if(t!=-1)
		{
			System.out.println("\n Entered number is present at "+t);
		}
		else
		{
			System.out.println("\n Entered number is not present in an array");
		}

		System.out.println("\n Sorted Elements of a1: ");
		a1.showSorted();

		System.out.println("\n Sorted Elements of a2: ");
		a2.showSorted();
	}
}

//==========================================================================================

		-------------------- Example 3 ----------------------

Write a program to implement all the methods in a class given below.

class MyString
{
	private String str;
	public void setString(String s){}
	public String getString(){}
	public int getLength(){}
	public boolean isMatching(String a){}
}

*/
class MyString
{
	private String str;
	public void setString(String s)
	{
		str=s;
	}
	public String getString()
	{
		return str;
	}
	public int getLength()
	{
		char[]ch=str.toCharArray();
		return ch.length;
	}
	public boolean isMatching(String a)
	{
		char []ch1=str.toCharArray();
		char []ch2=a.toCharArray();
		boolean flg=true;
		if(ch1.length!=ch2.length)
		{
			flg=false;
		}
		else
		{
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					flg=false;
				}
			}
		}
		return flg;
	}
}
class MainMyString
{
	public static void main(String []args)
	{
		MyString s1=new MyString();
		s1.setString("Hello good day to all of you");
		System.out.println("String s1 is: "+s1.getString());

		System.out.println("Length of String s1 is: "+s1.getLength());

		boolean b=s1.isMatching("How Are You");
		if(b)
			System.out.println("\n Strings are matching");
		else
			System.out.println("\n Strings are not matching");
	}
}

//----------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------

	// WAP to find the reverse of entered no and check it palindrome.

import java.util.Scanner;
class MyNumber
{
	private int no;
	public void set(int no)
	{
		this.no=no;
	}
	public int get()
	{
		return no;
	}
	public int getReverse()
	{
		int t=no;
		int rev=0;
		while(t!=0)
		{
			rev=(rev*10)+(t%10);
			t=t/10;
		}
		return rev;
	}
	public boolean isPalindrome()
	{
		if(getReverse()==no)
			return true;
		else
			return false;
	}
}
class DemoMyNumber
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		MyNumber ob1=new MyNumber();
		System.out.println("Enter the no: ");
		int n=sc.nextInt();
		ob1.set(n);
		int t=ob1.getReverse();
		System.out.println("\n Entered number is: "+ob1.get());
		System.out.println("\n Reverse of entered number is: "+t);
		if(ob1.isPalindrome())
			System.out.println("\n Entered number is Palindrome");
		else
			System.out.println("\n Entered number is Not Palindrome");
	}
}

//-----------------------------------------------------------------------------------------------------------------------

		// Same program using static

mport java.util.Scanner;
class MyNumber
{
	public static int getReverse(int t)
	{
		int rev=0;
		while(t!=0)
		{
			rev=(rev*10)+(t%10);
			t=t/10;
		}
		return rev;
	}
	public static boolean isPalindrome(int no)
	{
		if(getReverse(no)==no)
			return true;
		else
			return false;
	}
}
class DemoMyNumberStatic
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n=sc.nextInt();
		
		int t=MyNumber.getReverse(n);
		System.out.println("\n Entered number is: "+n);
		System.out.println("\n Reverse of entered number is: "+t);
		if(MyNumber.isPalindrome(n))
			System.out.println("\n Entered number is Palindrome");
		else
			System.out.println("\n Entered number is Not Palindrome");
	}
}


//---------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------

	// Constructor in java:  The main aim of using constructor is to init. the object.
				 It is special public member function of class, having name same as that of class
				 in which it is decl., having no any returning type not even void and invoked 
				automatically when object of that class is created.

	Types of constructors:
		- Default constructor: Constructor without any argument
		- Parameterized constructor: Having one or more arguments
		- Copy Constructor: Having the reference of same class as a argument

// default constructor

class Demo
{
	private int x;
	private double y;
	public Demo() // default constructor
	{
		System.out.println("\n In Constructor");
		x=1;
		y=2.5;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class DemoConstructor
{
	public static void main(String []args)
	{
		Demo ob1=new Demo();
		ob1.showData();

		Demo ob2=new Demo();
		ob2.showData();

		Demo ob3=new Demo();
		ob3.showData();

		Demo ob4=new Demo();
		ob4.showData();
	}
}

//------------------------------------------------------------------------------------------------------

Instance initializer block: 

In Java, an instance initializer block is a block of code within a class that is executed each time an instance of the class is created. It is not preceded by any keyword like static or final. Instance initializer blocks are useful when you need to execute some code for each object initialization, regardless of which constructor is used.


public class InstanceInitializerBlock
{
    // Instance variable
    private int x;

    // Instance initializer block
    {
        System.out.println("Instance initializer block");
        x = 10; // Assigning a value to the instance variable
    }

    // Constructor
    public InstanceInitializerBlock() 
    {
        System.out.println("Constructor called");
    }

    // Method to display the value of x
    public void displayX() 
    {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) 
    {
        // Creating an object of MyClass
        InstanceInitializerBlock obj = new InstanceInitializerBlock();
        obj.displayX();
    }
}

//----------------------------------------------------------------------------------------------------

// parameterized constructor

class Demo
{
	private int x;
	private double y;
	
	{
		System.out.println("\n In init block");
	}	
	public Demo(int x,double y) // parameterized constructor
	{
		System.out.println("\n In Constructor");
		this.x=x;
		this.y=y;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class DemoParaConstructor
{
	public static void main(String []args)
	{
		Demo ob1=new Demo(11,1.11);
		ob1.showData();

		Demo ob2=new Demo(22,2.22);
		ob2.showData();
	}
}
//--------------------------------------------------------------------------------------------------------------


// Constructor Overloading

class Demo
{
	private int x;
	private double y;
	public Demo() // default constructor
	{
		System.out.println("\n In default Constructor");
		x=1;
		y=2.5;
	}
	public Demo(int x) // parameterized constructor-1
	{
		System.out.println("\n In para -1 Constructor");
		this.x=x;
		this.y=x;
	}
	public Demo(int x,double y) // parameterized constructor-2
	{
		System.out.println("\n In para -2 Constructor");
		this.x=x;
		this.y=y;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class DemoOverloadingConstructor
{
	public static void main(String []args)
	{
		Demo ob1=new Demo(); // will invoke default constructor
		ob1.showData();

		Demo ob2=new Demo(22); // will invoke para -1 constructor
		ob2.showData();

		Demo ob3=new Demo(132,11.244); // will invoke para -2 constructor
		ob3.showData();
	}
}

///----------------------------------------------------------------------------------


///----------------------------------------------------------------------------------

//  copy constructor

class Demo
{
	private int x;
	private double y;
	public Demo() // default constructor
	{
		System.out.println("\n In default Constructor");
		x=1;
		y=2.5;
	}
	public Demo(int x) // parameterized constructor-1
	{
		System.out.println("\n In para -1 Constructor");
		this.x=x;
		this.y=x;
	}
	public Demo(int x,double y) // parameterized constructor-2
	{
		System.out.println("\n In para -2 Constructor");
		this.x=x;
		this.y=y;
	}
	public Demo(Demo t) //  copy constructor
	{
		System.out.println("\n In copy Constructor");
		this.x=t.x;
		this.y=t.y;
	}
	public void showData()
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class DemoCopyConstructor
{
	public static void main(String []args)
	{
		Demo ob1=new Demo(); // will invoke default constructor
		ob1.showData();

		Demo ob2=new Demo(22); // will invoke para -1 constructor
		ob2.showData();

		Demo ob3=new Demo(132,11.244); // will invoke para -2 constructor
		ob3.showData();

		Demo ob4=new Demo(ob2); // will invoke copy constructor
		ob4.showData();

		Demo ob5=new Demo(ob3); // will invoke copy constructor
		ob5.showData();
	}
}
//----------------------------------------------------------------------------------------------




	// Garbage Collector:  Java dont have destructors, then the derefernced memory locations are relesed
				automatically by a Garbage Collector for that it will use mark and swep algorithm.


				[][][][][][][][][][]
				[][][][][][][][][][]		ob1              dereferenced location
				[][][][][][][x][][][]		[] ----X----> [][][][]
				[][][][][][][][][][]		ob1=ob2
				[][][][][][][][][][]		ob2
				[][][][][][][][][][]		[] --------> [][][][]
				[][][][][][][][][][]			     ^
				[][][][][][x][][][][]			     |
				[][][][][][][][][][]			     | ob1
								           [   ]
    



		void in()				protected void finalize()
		{					{
			int a;					// code that you want to execute
			......					// just before object release
		}					}

		System.gc()

	// You can write the program as shown below.

class GCDemo
{
	//---------
	protected void finalize()
	{
		System.out.println("From finalize() method");
	}
	//-----------
}

class GCDemoMain
{
	public static void main(String []args)
	{
		//-----------
		GCDemo ob1, ob2;
		{
			//-----------
			GCDemo ob3, ob4;
			//-----------
		}
		System.gc();
		//-----------
	}
}

//=============================================================================================
//=============================================================================================
//=============================================================================================

	// Forming the Class Relationship -  Inheritance and Association


			IS-A					      HAS-A	

			person				  Engine		Music Player		
			  |				    |			   |		 
		---------------------			    |______________________|	
		|	 |	    |			Strong bonding 	|  weak bonding
	    Trainer   Student    Driver			 Composion     Car  Agrigation

							  		 
				CPP Code just for example

	class person						class Engine
	{							{
	};							};
	class Trainer : public person				class MusicPlayer
	{							{
	};							};
	class Student : public person				class Car
	{							{
	};								Engine ob1;
	class Driver: public person					MusicPlayer ob2;
	{							};
	};

                     | |					  | |
		      V					     	   V
  		Inheritance				 	Association



// Inheritance in java: It is art of defining the new class using the per-defined class.
	

 	consider the example, in normal case,

    class employee              class student           class Teacher           class Driver
    {                           {                       {                       {
        char name[50];              char name[50];         char name[50];           char name[50];
        int age;                    int age;                int age;                int age;
        -----------;                -----------;            -----------;            -----------;
        -----------;                -----------;            -----------;            -----------;
        -----------;                -----------;            -----------;            -----------;
        -----------;                -----------;            -----------;            -----------;
    };                          };                      };                      };


	/// syntax of inheritance

    class <base/super/parent_class>
    {
        ........;
    };
    class <derived/sub/child_class>  extends <base/super/parent_class>
    {
        --------;
        --------;
    };


	There are two different ways of achiving the properties of exsisting class in the
	derived class

		- Using Object of one class as a member of another class. (HAS-A) - Association
		- Extending the properties of exsisting class.(IS-A) - Inheritance

	class Animal					class Animal
	{						{
	  ......					   .........
	}						}

	class Person					class Person extends Animal
	{						{
	   Animal a;					    .........
	   .......					    .........		
	}						}

	class Student					class Student extends Person
	{						{
	    Person p;					     .......
	    ......					     .......
	}						}

	HAS-A Relationship				IS-A Relationship


    some elements are there in each class, and every class having code related to IO of those
    member, which is code repetition and can be avoided using the class inheritance as

class Person
{
   -----------;
}


class employee extends Person   class student extends Person    class Teacher extends Person       class Driver extends Person
{                               {                               {                                  {
    -----------;                      -----------;                   -----------;                        -----------;
    -----------;                      -----------;                   -----------;                        -----------;
    -----------;                      -----------;                   -----------;                        -----------;
};                              };                              };                                };



 /// Types of Inheritance in C++


            single          Multi-level          hierarchical        Multiple         Hybrid
          Inheritance       Inheritance           Inheritance       Inheritance     Inheritance

             [   ] A            [     ]  A             [ ] A           A       B       [ ]A                  A
               |                   |                    |              [ ]     [ ]      |                   [ ]
               |                [     ]  B        --------------        |_______|      [ ] B                 |
               V                   |              |            |             |          |         D     -------------
             [   ]  B           [     ]  C       [ ]B         [ ]c          [ ]        [ ] C     [ ]    |           |
                                                  |            |             C          |         |    [ ] B       [ ] C
                                              ---------      ---------                 [ ] -------|     |___________|
                                              |        |     |   |    |                 Z                     |
                                             [ ]      [ ]   [ ] [ ]  [ ]                                     [ ]
                                              D        E     F   G    H                                       D

    - single Inheritance:   One to one relationship, two layers
    - Multi-level Inheritance: one to one relationship, more than two layers
    - hierarchical Inheritance: One to many relationship
    - Multiple Inheritance: many to one relationship
    - Hybrid Inheritance: combinations of any two or more inheritance


     To avoid the ambiguity error java eliminated the Multiple and Hybrid inheritance. to achive the plus
     points of these inheritances java introduced the "interface."

    So Java having only 3 inheritances

    - single Inheritance:   One to one relationship, two layers
    - Multi-level Inheritance: one to one relationship, more than two layers
    - hierarchical Inheritance: One to many relationship

   
- single Inheritance:

		[ ] Person			[ ] Person
		 |				 |
		 |		or		 |
	  	[ ] Student			[ ] Employee


		- if we include both in single program, it become hierarchical Inheritance.
		

import java.util.Scanner;
class Person
{
	private String nm="";
	private int age;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the name of person: ");
		nm=sc.nextLine();

		System.out.println("\n Enter the age of person: ");
		age=sc.nextInt();
	}
	public void out()
	{
		System.out.println("\n Name: "+nm+"\t age: "+age);
	}
}

class Student extends Person
{
	private int rno;
	private double per;
	public void input()
	{
		in();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the rno of Student: ");
		rno=sc.nextInt();

		System.out.println("\n Enter the percentage of Student: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		out();
		System.out.println("\n RNO: "+rno+"\t Percentage: "+per);
	}
}

class MainStudent
{
	public static void main(String []args)
	{
		Student s=new Student();
		s.input();
		s.output();	
	}
}

//--------------------------------------------------------------------------------

	Or can be called as


import java.util.Scanner;
class Person
{
	private String nm="";
	private int age;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the name of person: ");
		nm=sc.nextLine();

		System.out.println("\n Enter the age of person: ");
		age=sc.nextInt();
	}
	public void out()
	{
		System.out.println("\n Name: "+nm+"\t age: "+age);
	}
}

class Student extends Person
{
	private int rno;
	private double per;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the rno of Student: ");
		rno=sc.nextInt();

		System.out.println("\n Enter the percentage of Student: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		System.out.println("\n RNO: "+rno+"\t Percentage: "+per);
	}
}

class MainStudent
{
	public static void main(String []args)
	{
		Student s=new Student();
		
		s.in();
		s.input();

		s.out();
		s.output();	
	}
}


	As the in() and out() from Person class decl. as public, visibility remains as it is
	in derived class. so both can be called from main() or from methods of child class.



When we make the in() and out() from base class class Person as a private, both will not be
inherited in the derived class student. so it will leads to an error, just check..

import java.util.Scanner;
class Person
{
	private String nm="";
	private int age;
	private void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the name of person: ");
		nm=sc.nextLine();

		System.out.println("\n Enter the age of person: ");
		age=sc.nextInt();
	}
	private void out()
	{
		System.out.println("\n Name: "+nm+"\t age: "+age);
	}
}

class Student extends Person
{
	private int rno;
	private double per;
	public void input()
	{
		in();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the rno of Student: ");
		rno=sc.nextInt();

		System.out.println("\n Enter the percentage of Student: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		out();
		System.out.println("\n RNO: "+rno+"\t Percentage: "+per);
	}
}

class MainStudent
{
	public static void main(String []args)
	{
		Student s=new Student();

		s.input();

		s.output();	
	}
}

output(On Compile):

MainStudent.java:29: error: cannot find symbol
                in();
                ^
  symbol:   method in()
  location: class Student
MainStudent.java:39: error: cannot find symbol
                out();
                ^
  symbol:   method out()
  location: class Student
2 errors
Press any key to continue . . .


	To solve this problem we need to change the visibility to protected/default/public


import java.util.Scanner;
class Person
{
	private String nm="";
	private int age;
	protected void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the name of person: ");
		nm=sc.nextLine();

		System.out.println("\n Enter the age of person: ");
		age=sc.nextInt();
	}
	protected void out()
	{
		System.out.println("\n Name: "+nm+"\t age: "+age);
	}
}

class Student extends Person
{
	private int rno;
	private double per;
	public void input()
	{
		in();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the rno of Student: ");
		rno=sc.nextInt();

		System.out.println("\n Enter the percentage of Student: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		System.out.println("\n RNO: "+rno+"\t Percentage: "+per);
	}
}

class MainStudent
{
	public static void main(String []args)
	{
		Student s=new Student();

		s.input();

		s.out();
		s.output();	
	}
}

//-------------------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------------------

- Multilevel Inheritance:

		[ ] Person		in() and out()	
		 |				 
		 |				 
	  	[ ] Student		input() and output()
		 |
		 |
		[ ] Sport		set() and show()

import java.util.Scanner;
class Person
{
	private String nm="";
	private int age;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the name of person: ");
		nm=sc.nextLine();

		System.out.println("\n Enter the age of person: ");
		age=sc.nextInt();
	}
	public void out()
	{
		System.out.println("\n Name: "+nm+"\t age: "+age);
	}
}

class Student extends Person
{
	private int rno;
	private double per;
	public void input()
	{
		in();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the rno of Student: ");
		rno=sc.nextInt();

		System.out.println("\n Enter the percentage of Student: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		out();
		System.out.println("\n RNO: "+rno+"\t Percentage: "+per);
	}
}
class Sport extends Student
{
	private int points;
	public void set()
	{
		input();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the grade points of Student: ");
		points=sc.nextInt();
	}
	public void show()
	{
		output();
		System.out.println("\n Points: "+points);
	}
}
class MainStudentMultilevel
{
	public static void main(String []args)
	{
		Sport s=new Sport();
		s.set();
		s.show();	
	}
}

//--------------------------------------------------------------------------------

	/// Using the constructors in inheritance

class Base
{
	private int a;
	public Base()
	{
		System.out.println("\n In Base default");
		a=10;
	}
	public Base(int x)
	{
		System.out.println("\n In Base para");
		a=x;
	}
	public void showBase()
	{
		System.out.println("\n a="+a);
	}
}
class ImdBase extends Base
{
	private int b;
	public ImdBase()
	{
		System.out.println("\n In ImdBase default");
		b=20;
	}
	public ImdBase(int x, int y)
	{
		super(x);
		System.out.println("\n In ImdBase para");
		b=y;
	}
	public void showImdBase()
	{
		showBase();
		System.out.println("\n b="+b);
	}
}
class Derived extends ImdBase 
{
	private int c;
	public Derived()
	{
		System.out.println("\n In Derived default");
		c=30;
	}
	public Derived(int x, int y, int z)
	{
		super(x,y);
		System.out.println("\n In Derived para");
		c=z;
	}
	public void showDerived()
	{
		showImdBase();
		System.out.println("\n c="+c);
	}
}

class MainPassParamInh
{
	public static void main(String []args)
	{
		Derived ob1=new Derived();
		ob1.showDerived();

		Derived ob2=new Derived(100,200,300);
		ob2.showDerived();
	}
}

//---------------------------------------------------------------------------------------------------

	/// Using the constructors and initiliser blocks in inheritance

	When we use the constructor and init block within the class in any inheritance, the execution of 
	initblock-constructor starts from base and move towards child.

class A
{
	{
		System.out.println("Init block A");
	}
	A()
	{
		System.out.println("Constructor A");
	}
}
class B extends A
{
	{
		System.out.println("Init block B");
	}
	B()
	{
		System.out.println("Constructor B");
	}
}
class C extends B
{
	{
		System.out.println("Init block C");
	}
	C()
	{
		System.out.println("Constructor C");
	}
}

class MainConInitInh
{
	public static void main(String []args)
	{
		C ob=new C();
	}
}

 output on Run

Init block A
Constructor A
Init block B
Constructor B
Init block C
Constructor C
Press any key to continue . . .



//-----------------------------------------------------------------------------------------------

	//assigning values using init block and constructor

class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{	
		a2=11;
		System.out.println("Constructor A");
	}
	public void showA()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Init block B");
	}
	B()
	{
		b2=22;
		System.out.println("Constructor B");
	}
	public void showB()
	{
		showA();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Init block C");
	}
	C()
	{
		c2=33;
		System.out.println("Constructor C");
	}
	public void showC()
	{
		showB();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}

class MainConInitInhVal
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.showC();
	}
}

//-------- Output on Run ----------
Init block A
Constructor A
Init block B
Constructor B
Init block C
Constructor C
A: a1: 1         a2: 11
B: b1: 2         b2: 22
C: c1: 3         c2: 33
Press any key to continue . . .


//----------------------------------------------------------------------------------------------------------

	// Defining parameterized constructors in above program


class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{	
		a2=11;
		System.out.println("Default Constructor A");
	}
	A(int p1)
	{	
		a2=p1;
		System.out.println("para Constructor A");
	}
	public void showA()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Init block B");
	}
	B()
	{
		b2=22;
		System.out.println("Default Constructor B");
	}
	B(int p1, int p2)
	{
		super(p1);
		b2=p2;
		System.out.println("Para Constructor B");
	}
	public void showB()
	{
		showA();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Init block C");
	}
	C()
	{
		c2=33;
		System.out.println(" Default Constructor C");
	}
	C(int p1, int p2, int p3)
	{
		super(p1,p2);
		c2=p3;
		System.out.println(" Para Constructor C");
	}
	public void showC()
	{
		showB();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}

class MainParaConInitInhVal
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.showC();

		C ob1=new C(111,222,333);
		ob1.showC();
	}
}

//----------- Output on Run -------------------
Init block A
Default Constructor A
Init block B
Default Constructor B
Init block C
 Default Constructor C
A: a1: 1         a2: 11
B: b1: 2         b2: 22
C: c1: 3         c2: 33
Init block A
para Constructor A
Init block B
Para Constructor B
Init block C
 Para Constructor C
A: a1: 1         a2: 111
B: b1: 2         b2: 222
C: c1: 3         c2: 333
Press any key to continue . . .


//-----------------------------------------------------------------------------------------------------------------------

	// Note carefully that super keyword is used to refer the base class constructor, i.e. it is used to invoke the
	// parameterized constructor from base class.

	// The super keyword also used to access the overriden member of base class.

lets write the function show() in place of all showA(), showB() and showC(), not that as each class having show() function,
it is overriden in class B and C.

class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{	
		a2=11;
		System.out.println("Default Constructor A");
	}
	A(int p1)
	{	
		a2=p1;
		System.out.println("para Constructor A");
	}
	public void show()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Init block B");
	}
	B()
	{
		b2=22;
		System.out.println("Default Constructor B");
	}
	B(int p1, int p2)
	{
		super(p1);
		b2=p2;
		System.out.println("Para Constructor B");
	}
	public void show()
	{
		super.show();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Init block C");
	}
	C()
	{
		c2=33;
		System.out.println(" Default Constructor C");
	}
	C(int p1, int p2, int p3)
	{
		super(p1,p2);
		c2=p3;
		System.out.println(" Para Constructor C");
	}
	public void show()
	{
		super.show();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}

class MainParaConInitInhVal1
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.show();

		C ob1=new C(111,222,333);
		ob1.show();
	}
}

------------ output on Run ----------------
Init block A
Default Constructor A
Init block B
Default Constructor B
Init block C
 Default Constructor C
A: a1: 1         a2: 11
B: b1: 2         b2: 22
C: c1: 3         c2: 33
Init block A
para Constructor A
Init block B
Para Constructor B
Init block C
 Para Constructor C
A: a1: 1         a2: 111
B: b1: 2         b2: 222
C: c1: 3         c2: 333
Press any key to continue . . .

//------------------------------------------------------------------------------------------------------------------------

	// Using this: 

class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{	
		a2=11;
		System.out.println("Default Constructor A");
	}
	A(int a2)
	{	
		this.a2=a2;
		System.out.println("para Constructor A");
	}
	public void show()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Init block B");
	}
	B()
	{
		b2=22;
		System.out.println("Default Constructor B");
	}
	B(int a2, int b2)
	{
		super(a2);
		this.b2=b2;
		System.out.println("Para Constructor B");
	}
	public void show()
	{
		super.show();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Init block C");
	}
	C()
	{
		c2=33;
		System.out.println(" Default Constructor C");
	}
	C(int a2, int b2, int c2)
	{
		super(a2,b2);
		this.c2=c2;
		System.out.println(" Para Constructor C");
	}
	public void show()
	{
		super.show();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}

class MainParaConInitInhVal11
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.show();

		C ob1=new C(111,222,333);
		ob1.show();
	}
}

///=========================================================================================================================

	// Hierarchical Inheritnce

			[ ] Person
	 		 |
	 ________________|_______________________________
	 |			|			|
	[ ] student           [   ] Employee           [   ] Driver
	 |			|                        |
	 |			|                  ---------------   
	[ ] sport          -------------------     |             |
	 |                 |         |        |   [ ] Utility   [ ] Heavy 
	 |               [  ]       [  ]     [ ]
	[ ] Result      Worker    Director    CEO

class Person {}

  class Student extends Person {}
     class Sport extends Student{}
        class Result extends Sport{}

  class Employee extends Person {}
     class Worker extends Employee{}
     class Director extends Employee{}
     class Ceo extends Employee{}

  class Driver extends Person {}
     class Utility extends Driver{}
     class Heavy extends Driver{}

class MainHierarchicalExample
{
	public static void main(String []args)
	{
		Ceo ob1=new Ceo();
		boolean b= ob1 instanceof Ceo;
		System.out.println(b);
		b=ob1 instanceof Employee;
		System.out.println(b);
		b=ob1 instanceof Person;
		System.out.println(b);

		System.out.println("\n ---------------------- ");

		Result ob2=new Result();
		b=ob2 instanceof Result;
		System.out.println(b);
		b=ob2 instanceof Person;
		System.out.println(b);
	}
}
///=========================================================================================================================


	// Why multiple and hierarchical inheritances not present in Java?

	We have two more inheritances multiple and hierarchical, these inheritances are present in C++
	but as both create the Ambiguous condition, both are eliminated from Java.

	NOTE TAHT TO GAIN GOOD PART OF THESE INHERITANCES JAVA INTRODUCED THE INTERFACE.

	Lets see, how the ambiguous condition is cerated by the both
	
	// Multiple Inheritance:


		     student		     sport
	     get()    [  ]	   	     [  ]  in()
	     put()     |	               |   put()
                       |_______________________|
                               |
                               |
                              [ ]
                             Result

                        get()       in()
                        put()       put()	
			     input()
			     output()

	when we create the object of Result class and call put() method.
	
	Result rob;
	...
	roc.put(); // creates ambiguous condition


	// Hybrid Inheritance:

                    in()  Student
		    out()  [ ]               ---|
                            |                   |
                   _________|______________     | -----------> // Hierarchical Inheritnce
          in()    |	                  |out()|
	  out()   |           setdata()   |in() |
	 Set()   Exam        showdata() sport   |
	 Show()  [  ]	     	         [  ] ---
	           |	                   |    |
                   |_______________________|    | ----------> // Multiple Inheritance
                            |                   |
 			  [   ]             ----
	    in()   out()  Result  in()       out()
	   Set()   Show()         setdata()  showdata()


	Ambiguous condition is created when we make a call to in() and out() using object of Result class.

///=========================================================================================================================


	/// Method overloading: 

	Method overloading in Java allows a class to have multiple methods with the same name but with different parameters. 
	This means that you can define two or more methods within the same class that have the same name but accept different 
	types or numbers of parameters.
		When you call the method, Java determines which version of the method to execute based on the number 
	and type of arguments passed to it at compile time.

	Example:

	class Addition
	{
		public static int add(int a, int b)
		{
			return (a+b);
		}
		public static float add(int a, float b)
		{
			return (a+b);
		}		
		public static double add(int a, double b)
		{
			return (a+b);
		}
	}
	class MainAddition
	{
		public static void main(String []args)
		{
			int ans=Addition.add(12,34);
			System.out.println("Addition is: "+ans);

			float ans1=Addition.add(12,3.4F);
			System.out.println("Addition is: "+ans1);

			double ans2=Addition.add(12,34.4532);
			System.out.println("Addition is: "+ans2);
		}
	}

	Key points about method overloading:

	- Overloaded methods must differ in the type or number of their parameters and sequence in which they collected.
	- Return type alone is not sufficient to differentiate overloaded methods.
	- Overloaded methods can have different access modifiers.
	- Overloaded methods can throw different exceptions.
	- Overloaded methods can be defined within the same class.

//=========================================================================================================================

	 /// Method Overriding

	Method overriding in Java allows a subclass to provide a specific implementation of a method that is already 
	defined in its superclass. This means that a subclass can redefine an inherited method with its own implementation.

    When base class method is redefined in child class, and we called the same method using the object of child class. 
    then the native copy of child class will be executed and the inherited copy from base class is overruled by 
    the native copt of function. which is called as function overriding.


	class A [ ] show(){..}
	    	 |
		 |
	class B [ ] show(){...} --> Own copy of B
		    show(){..} --> Inhe. from A


  suppose we create an object of class B,

	i.e.	B ob=new B();
		ob.show(); --> the owned copy of B will be executed.
			       which overrides the inh. copy of show() 	

class A
{
	public void show()
	{
		System.out.println(" In Base show() ");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println(" In child show() ");
	}
}
class MainOverriding
{
	public Static void main(String []args)
	{
		B ob=new B();
		ob.show(); 
	}
}

 ------- output on Run ------------------
 In child show()


//-----------------------------------------------------------------------------------------------------------
	// Another example 

import java.util.Scanner;
class Person
{
	private String nm="";
	private int age;
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the name of person: ");
		nm=sc.nextLine();

		System.out.println("\n Enter the age of person: ");
		age=sc.nextInt();
	}
	public void out()
	{
		System.out.println("\n Name: "+nm+"\t age: "+age);
	}
}

//---------------------------------------------------------------------------------------
class Student extends Person
{
	private int rno;
	private double per;
	public void input()
	{
		in();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the rno of Student: ");
		rno=sc.nextInt();

		System.out.println("\n Enter the percentage of Student: ");
		per=sc.nextDouble();
	}
	@Override
	public void out()
	{
		// out(); // recursive call
		super.out();
		System.out.println("\n RNO: "+rno+"\t Percentage: "+per);
	}
}

class MainStudentOverriding
{
	public static void main(String []args)
	{
		Student s=new Student();
		s.input();
		s.out();	
	}
}


//------------------------------------------------------------------

	// Accessing the inherited instance variable using super keyword

class Base
{
	public int a;
	Base()
	{
		a=10;
	}
}
class Derived extends Base
{
	public int a;
	Derived()
	{
		a=100;
	}
	public void out()
	{
		System.out.println("\n In Derived Inh a="+super.a+" and a="+a);
	}
}
class DemoInitBlockAndSuper_InstanceVariable
{
	public static void main(String []args)
	{
		Derived ob=new Derived();
		ob.out();
	}
}

Key points about method overriding:

	- Method overriding is based on runtime polymorphism.
	- It allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
	- The subclass method must have the same name, return type, and parameters (if any) as the superclass method.
	- The @Override annotation is optional but recommended to ensure that you're overriding a method correctly.
	- Method overriding is a way to achieve method specialization and is commonly used in building class hierarchies 
	  to provide specific behavior in subclasses while maintaining a common interface defined by the superclass.

//---------------------------------------------------------------------------------------------------------------------------

	/// Using this keyword:
	///---------------------

	In Java, the this keyword refers to the current instance of the class. It can be used in various contexts 
	within a class:

	- To reference instance variables: If there's a local variable with the same name as an instance variable, 
	  this can be used to distinguish between the two.

		e.g.
		class Demo
		{
			private int x;
			public Demo(){ x=10}		
			public Demo(int x)
			{
				this.x=x;
			}
			public void in(int x)
			{
				this.x=x;
			}
		}
		


	- To invoke another constructor: It can be used to call another constructor in the same class.

		
		e.g.
		class Demo
		{
			private int x;
			public Demo(){ x=10;this(23);}		
			public Demo(int x)
			{
				
			}
			public void in(int x)
			{
				
			}
		}

	- To pass the current object as a parameter: It can be passed as an argument to another method.

	
		e.g.
		class Demo
		{
			private int x;
			public Demo(){ x=10}		
			public Demo(int x)
			{
				
			}
			public void in(int x)
			{
				this.x=x;
				output(this);
			}
			public void output(Demo obj)
			{
				System.out.println("val of x is: "+obj.x);
			}
		}

	- To return the current object: It can be returned from a method.

		e.g.
		class Person
		{
			//.......
			private int age;
			//.......
			public Person getElder(Person ob)
			{
				if(ob.age>age)
					return ob;
				else
					return this;
			}			
		}
		class ..
		{
			....

			Person p1=...
			Person p2=...

			Person p3=p1.getElder(p2);
		}


	- To reference the current class instance from within an instance method of the class: It's often used 
	  when there's a need to pass the current object as a parameter to a method or to access the current object's 
	  fields or methods.
		e.g.
		class Demo
		{
			private int x;
			public Demo(){ x=10}		
			public Demo(int x)
			{
				......
			}
			public void output(Demo obj)
			{
				System.out.println("val of x is: "+this.x);
			}
		}

	
//-----------------------------------------------------------------------------------------------------------------

	/// Using static keyword: 

	The static keyword is used to declare elements that belong to the class itself rather than to instances of the class. 
	It can be applied to variables, methods, nested classes, and initialization blocks

	- Static Variables (Class Variables): When a variable is declared as static, it means that there will be only one 
	   copy of this variable shared among all instances of the class. These variables are also known as class variables.

	- Static Methods: Similarly, when a method is declared as static, it means that the method belongs to the class itself, 
	   not to any particular instance of the class. Static methods can be called directly on the class without needing to 
	   create an instance of the class.

	- Static Blocks: These are used for static initialization of a class. They are executed only once when the class 
	   is loaded into memory.

	- Static Nested Classes: These are nested classes that are declared static. They can access only static members 
	  qof the outer class.

//----------------------------------------------------------------------------------------------------------------------

	// Using super keyword:

	In Java, the super keyword is quite versatile and serves several important purposes, especially in the 
	context of inheritance.

	- The super keyword can be used to invoke the parameterized constructor of base class
		
		class Parent 
		{
			Parent(String name) 
			{
        			System.out.println("Constructor of Parent: " + name);
    			}
		}

		class Child extends Parent 
		{
    			Child() 
			{
        			super("Parent's name");
        			System.out.println("Constructor of Child");
    			}
		}

	- The super keyword can be used to access the overriden data member of base class

		class Parent 
		{
    			String name = "Parent's name";
		}

		class Child extends Parent 
		{
    			String name = "Child's name";
    			void show() 
			{
        			System.out.println(name); // prints "Child's name"
        			System.out.println(super.name); // prints "Parent's name"
    			}
		}

	- The super keyword can be used to access the overriden method of base class

		class Parent 
		{
    			void show() 
			{
        			System.out.println("Parent's show()");
    			}
		}

		class Child extends Parent 
		{
    			void show() 
			{
        			super.show(); // calls Parent's show()
        			System.out.println("Child's show()");
    			}
		}

	Key Points:
	- The super keyword refers to the immediate parent class object.
	- It can be used to access the parent class’s fields, methods, and constructors.
	- The super() call must be the first statement in a constructor.
	- It cannot be used in static methods since they do not belong to any instance.

//------------------------------------------------------------------------------------------------------------------------

	/// Using final keyword

1. Final Variables:
	When a variable is declared as final, its value cannot be changed after initialization. 
	This is often used for constants Decl.


	public class FinalVariableExample 
	{
    		public static void main(String[] args) 
		{
        		final int MAX_VALUE = 100;
        		// MAX_VALUE = 200; // Compilation error, as MAX_VALUE is final
        		System.out.println("Maximum value: " + MAX_VALUE);
    		}
	}

	//----------------------------------------

		// Another example 

	
	class DemoFinal
	{
		final public int x;
		public DemoFinal()
		{
			x=10;
		}
		public void in(int x)
		{
			this.x=x; //error: cannot assign a value to final variable x
		}
		public void show()
		{	
			System.out.println("\n x="+x);
		}
	}
	class MainFinal
	{
		public static void main(String []args)
		{
			DemoFinal ob=new DemoFinal();
			ob.x=20; //error: cannot assign a value to final variable x
			ob.in(12);
			ob.show();
		}
	}

- Note that we have to assign the value to final variable either using
  = operator directly or using initilizer block or by using default
  constructor.

- when we not assign any value, in that case it will generate an error message as
"MainFinal.java:16: error: variable x might not have been initialized"

- If we try to assign any other value we will face error as
"MainFinal.java:27: error: cannot assign a value to final variable x"

//-----------------


2. Final Methods: When a method is declared as final, it cannot be overridden by subclasses.

	e.g.
	
	class Parent 
	{
    		final void display() 
		{
		        System.out.println("This is a final method.");
	    	}
	}
	class Child extends Parent 
	{
    		// Compilation error: Cannot override the final method from Parent
     		void display() 
		{
		}
	}
	class MainFinalMethodExample
	{
		public static void main(String []args)
		{
			Child ob=new Child();
			ob.display();
		}
	}

	Output: (Compile time error)

	MainFinalMethodExample.java:56: error: display() in Child cannot override display() in Parent
	     void display() { }
	          ^
	  overridden method is final
	1 error
	Press any key to continue . . .

	//--------------------

3.Final Classes:
 - When a class is declared as final, it cannot be extended by other classes.

	final class Person
	{
	}
	class Student extends Person
	{
	}
	class mainDemoFinalClass
	{
		public static void main(String []args)
		{
			Student ob=new Student();
		}
	}
	output: (Comile time error)
	MainFinalMethodExample.java:83: error: cannot inherit from final Person
	class Student extends Person
	                      ^
	1 error
	Press any key to continue . . .

//----------------------------------------


4. Final Parameters:
When a parameter is declared as final in a method, it means that 
the value of the parameter cannot be changed within the method.


class Demo
{
	private int x;
	public void in(final int t)
	{
		t=78; // error: final parameter t may not be assigned
		x=t;
	}
	public void show()
	{
		System.out.println("\n x="+x);
	}
}
class DemoFinalParameter
{
	public static void main(String []args)
	{
		Demo ob=new Demo();
		ob.in(100);
		ob.show();
	}
}

Output (Error on Compie)

DemoFinalParameter.java:114: error: final parameter t may not be assigned
                t=78;
                ^
1 error
Press any key to continue . . .

//========================================================================================================================


	// Polymorphism in Java: It refers one name many forms. there are two
				 different types as discussed below.
	
		the word polymorphism forms as shown

		- Poly: 	many or more
		- morphism: 	forms or copies



                Polymorphism
                      |
            -----------------------
            |                     |
         Runtime /               Compile-time/
     dynamic binding /          static binding/
     dynamic polymorphism /     static polymorphism /
     late binding              early binding
            |                       |
         Overriding             Overloading
                                   - Method Overloading

	We have seen, the method overloading and Constructor overloading these
	are the examples of static/compile time polymorphism.


 Lets implements Polymorphism Step by Step

	1. Suppose we want to calculate the area() of different shapes
	   i.e.
		 Rect			Triangle 		Circle
		 [   ] 			[   ]			[   ]
	   
	   we can define the methods as 

		findArea()	       showArea()		calcArea()

	   Now create an object of class that you want and call respective method.

		Rect ob1;		Triangle ob2;		Circle ob3;
		ob1.findArea();		ob2.showArea();		ob3.calcArea();


	2. Now, quite modification in the program, and that is, still we want to calculate 
	   the area() of any one shape, but which? --> It will be decided at Runtime.

		- We need one pointer, coz there is dynamic memory allocation. Here in java it is
		  solved by reference variable.

		- Important question is that, reference of which type?  Rect, Triangle or Circle.

		- reference of any one, able to refer only location of same type. we need a reference
		  variable which is able to refer any one of the above.

		- We know that, a reference variable of base class able to refer the object of its any child.

		- Lets create a common base class for all the three classes.

					     Shape
					     [   ]
					       |
					       |
			-------------------------------------------------
			|			|			|	
		      Rect		     Triangle 		     Circle
		      [   ] 		       [   ]		      [   ]

		  findArea()	           showArea()		   calcArea()

		Now, lets implement the above hierarchy,

class Shape
{
}
class Rect extends Shape
{
	public void findArea()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void showArea()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void calcArea()
	{
		System.out.println("In Circle area()");
	}
}

class DemoRuntimePoly1
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new ..... ; // which object? it is decided at runtime.
		ref.xxxxarea(); 

		// we are unable to call the method coz every class having a method with different name
		// to calculate the area. solution to this problem is there must be a method in all classes
		// having a same name to calculate the area.
	}
}

//-----------------------------------------------

	3. lets rewrite


					     Shape
					     [   ]  public void area(){}
					       |
					       |
			-------------------------------------------------
			|			|			|	
		      Rect		     Triangle 		     Circle
		      [   ] 		       [   ]		      [   ]

		      area()	              area()		       area()


	- As we have defined multiple methods in different classes, it comes under the polymorphism.
	  i.e. one name many forms

	- here which method will recive a call is dependent on the option selected by the user at runtime.

	- means from multiple copies method for execution will be selected at runtime, so therefore it is
	  called as runtime polymorphism / dynamic polymorphism.

		Now, lets implement the above hierarchy,

class Shape
{
}
class Rect extends Shape
{
	public void area()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}

class DemoRuntimePoly2
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new Rect(); 
		ref.area(); 

		// OR

		ref=new Circle(); 
		ref.area(); 

		// OR

		ref=new Triangle(); 
		ref.area(); 
	}
}

//--------- on Compile --------

DemoRuntimePoly2.java:36: error: cannot find symbol
                ref.area();
                   ^
  symbol:   method area()
  location: variable ref of type Shape
DemoRuntimePoly2.java:41: error: cannot find symbol
                ref.area();
                   ^
  symbol:   method area()
  location: variable ref of type Shape
DemoRuntimePoly2.java:46: error: cannot find symbol
                ref.area();
                   ^
  symbol:   method area()
  location: variable ref of type Shape
3 errors
Press any key to continue . . .

	
//-------------------------------------------------------

	4. Will face some errors, they are due to

		- Shape ref; means reference is of Shape type, so interpreter searching the method in Shape class.

		- lets provide the method area() in Shape.

class Shape
{
	public void area()
	{
		System.out.println("In Shape area()");
	}
}
class Rect extends Shape
{
	public void area()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}

class DemoRuntimePoly3
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new Rect(); 
		ref.area(); 

		// OR

		ref=new Circle(); 
		ref.area(); 

		// OR

		ref=new Triangle(); 
		ref.area(); 
	}
}

------------- Output on Run ---------------------

In Rect area()
In Circle area()
In Triangle area()
Press any key to continue . . .


//-----------------------------------------------------------------------------------------------------------------------

	5. Note Carefully,

	 - If we try same implementation in C++, then in above example we will get the output after execution of area()
	   from Shape class. and to execute the child class methods we need to decl. area() from Shape class as a virtual.

	- this change in the behaviour, known as "Dynamic Method Dispatch"

	Dynamic Dispatch: When a method is called on an object, Java determines at runtime which version of the method to execute. 	This is called dynamic dispatch. If the object is of the subclass type, the overridden method in the subclass will be invoked.

	- As the method selection is done correctly without using virtual keyword, java eliminates the virtual keyword.

//-------------------------------------------------------------------------------------------------------------------------

	6. Now we want to keep the above aritecture as it is and functional, To keep it functional every child of Shape class
	   must override the area() method.

	   Then how to make it compulsory? (In C++, it is done with defining pure virtual function using vitrual keyword)

	   Here, the abstract keyword is provided.



					     Shape
					     [   ]  public absrtact void area(){}
					       |
					       |
			-------------------------------------------------========================
			|			|			|			|
		      Rect		     Triangle 		     Circle		    Parabola
		      [   ] 		       [   ]		      [   ]		      [   ]	

		      area()	              area()		       area()		     area()		


class Shape
{
	public void area()
	{
		System.out.println("In Shape area()");
	}
}
class Rect extends Shape
{
	public void area()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}
class Parabola extends Shape
{
	public void findarea()
	{
		System.out.println("In Circle area()");
	}
}
class DemoRuntimePoly4
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new Rect(); 
		ref.area(); 

		// OR

		ref=new Circle(); 
		ref.area(); 

		// OR

		ref=new Triangle(); 
		ref.area(); 

		// OR

		ref=new Parabola (); 
		ref.area(); 
	}
}

---------- Output on Run --------------
In Rect area()
In Circle area()
In Triangle area()
In Shape area()
Press any key to continue . . .


	Means it is not compulsory to define the area() method within class Parabola. Now lets define the 
	base class(Shape) method as abstract.

class Shape
{
	public abstract void area();
}
class Rect extends Shape
{
	public void area()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}
class Parabola extends Shape
{
	public void findarea()
	{
		System.out.println("In Circle area()");
	}
}
class DemoRuntimePoly4
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new Rect(); 
		ref.area(); 

		// OR

		ref=new Circle(); 
		ref.area(); 

		// OR

		ref=new Triangle(); 
		ref.area(); 

		// OR

		ref=new Parabola (); 
		ref.area(); 
	}
}

---------------- Output on compile --------------------------

DemoRuntimePoly4.java:1: error: Shape is not abstract and does not override abstract method area() in Shape
class Shape
^
1 error
Press any key to continue . . .



//-------------------------------------------------------------------------------------------------------------------

	7. Note that when a class contains one or more abstract methods, the class must be declare ed as abstract.
	   and we are unable to create the object of abstract class. but it is possible to create its reference.
	   Abstract class can act as the base in class hierarchy.


abstract class Shape
{
	public abstract void area();
}
class Rect extends Shape
{
	public void area()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}
class Parabola extends Shape
{
	public void findarea()
	{
		System.out.println("In Circle area()");
	}
}
class DemoRuntimePoly4
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new Rect(); 
		ref.area(); 

		// OR

		ref=new Circle(); 
		ref.area(); 

		// OR

		ref=new Triangle(); 
		ref.area(); 

		// OR

		ref=new Parabola (); 
		ref.area(); 
	}
}

//------------------------ output on compile -----------------------------

DemoRuntimePoly4.java:26: error: Parabola is not abstract and does not override abstract method area() in Shape
class Parabola extends Shape
^
1 error
Press any key to continue . . .

	Now this error due to, as class Parabola does not have defination of area(), it contains inherited abstract
	copy of area() method.

 if we declare  class Parabola as abstract, the we will get an error as

DemoRuntimePoly4.java:57: error: Parabola is abstract; cannot be instantiated
                ref=new Parabola ();
                    ^
1 error
Press any key to continue . . .

//---------------------------------------------------------------------------------------------------------------------

 	8. MEANS FINALY WE NEED TO DEFINE(OVERRIDE) THE area() METHOD IN CLASS Parabola.
	   i.e. NOW IT BECOME COMPULSORY, IF YOU WANT TO CREATE AN OBJECT OF CLASS Parabola.


abstract class Shape
{
	public abstract void area();
}
class Rect extends Shape
{
	public void area()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}
class Parabola extends Shape
{
	public void area()
	{
		System.out.println("In Parabola area()");
	}
}
class DemoRuntimePoly5
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new Rect(); 
		ref.area(); 

		// OR

		ref=new Circle(); 
		ref.area(); 

		// OR

		ref=new Triangle(); 
		ref.area(); 

		// OR

		ref=new Parabola (); 
		ref.area(); 
	}
}

//--------------- output on compile -------------------
In Rect area()
In Circle area()
In Triangle area()
In Parabola area()
Press any key to continue . . .

//-----------------------------------------------------------------------------------------------------------------------

	9. Some facts about the abstract keyword

	/// Using abstract keyword

	 The Keyword abstract used to declare  Abstract Class and Abstract Methods

Abstract Class: 

In Java, an abstract class is a class that cannot be instantiated on its own and is meant to be subclassed by other classes. It serves as a blueprint for other classes, providing common functionality and structure. Abstract classes can have both abstract and concrete methods.

Here are key characteristics of abstract classes in Java:

  - It is decared as an abstract using abstract keyword.

	abstract class Demo
	{
		.......
	}

  - Abstract class have atleast one abstract method, and child class must override the all abstract methods of base otherwise we need to declare the child class as abstract, and remember that we are not allowed to create the object of an abstract class. 


	abstract class Demo
	{
		abstract void show();
		.......
	}


  - Abstract classes can also have regular (concrete) methods with a complete implementation

	abstract class Demo
	{
		abstract void show();
		public void display()
		{
		}
		.......
	}

  - Objects cannot be created from abstract classes using the new keyword. They are meant to be extended by subclasses.

  - Abstract classes can have constructors, and they are called when a subclass object is created.

  - Abstract classes can be used as a base class for other classes. Subclasses extend the abstract class and provide concrete implementations for the abstract methods.

  - Abstract classes can have instance variables just like regular classes.


abstract class Demo
{
	private int x=10;
	public Demo()
	{
		System.out.println("\n In the Demo Class Constructor");
	}
	public void out()
	{
		System.out.println("\n In out() method - x is "+x);
	}
	abstract void show();
}
class Test extends Demo
{
	int y;
	public Test()
	{
		y=100;
		System.out.println("\n In child Test class Constructor");
	}
	public void show()
	{
		System.out.println("\n Hi from show() Test and y="+y);
	}
}
class DemoAbstractExample 
{
	public static void main(String[] args) 
	{
		Test ob=new Test();
		ob.show();
		ob.out();
	}
}

  - The inner class can be declared abstract by declaring it local.
  - A static method and constructor can be part of an abstract class.
  - When the final keyword is used, the abstract keyword cannot be used.
  - Abstract methods cannot be declared private.
  - Abstract methods cannot be declared static.
  - An abstract keyword cannot be used with variables or constructors.
//---------------------------------------------

Abstract method:

In Java, an abstract method is a method that is declared without an implementation in an abstract class. An abstract class is a class that cannot be instantiated on its own and may contain abstract methods, which are meant to be implemented by concrete (non-abstract) subclasses. Abstract methods serve as a blueprint for concrete classes to provide their own implementation.

Here are the key points about abstract methods in Java:

  - The abstract method declare ed as abstract using abstract keyword and it dont have body.

		i.e. abstract void dispay();

  - When any method declare ed as abstract, the containing class must be declare ed as abstract.
	i.e.
		abstract class Test
		{
			abstract void display();
			....
		}
 - Subclasses that extend an abstract class must provide implementations for all the abstract methods declared in the superclass, otherwise you have to declare  that class as abstract.

		abstract class Test
		{
			abstract void display();
			....
		}

		class Demo extends Test
		{
			.....
			public void dispay()
			{
				.....
			}
			....
		}

  - Abstract methods provide a way to define a common interface for a group of related classes, ensuring that each concrete subclass provides its own implementation. This promotes code reusability and helps in creating a consistent interface for different classes.

 key points about abstract classes and abstract methods in Java:

Abstract Class:

 - An abstract class is a class that cannot be instantiated directly. It serves as a blueprint 
   for other classes to inherit from.
 - Abstract classes may contain both abstract and concrete methods.
 - Abstract classes are declared using the abstract keyword.
 - Abstract classes can have constructors, fields, and regular methods, just like normal classes.
 - Abstract classes can have access modifiers like public, protected, and private.

Abstract Method:

 - An abstract method is a method declared without an implementation (i.e., without a method body).
 - Abstract methods are declared using the abstract keyword and must be contained within an abstract class.
 - Abstract methods are meant to be implemented by subclasses. Subclasses must provide a concrete 
   implementation for all abstract methods unless they are also abstract classes.
 - Subclasses that extend an abstract class with abstract methods must either provide concrete implementations 
   for all abstract methods or be declared as abstract themselves.

//---------------------------------------------------------------------------------------------------

	// Actual implementation of above example

abstract class Shape 
{
    // Abstract method declaration
    public abstract double area();

    // Concrete method
    public void display() 
	{
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double area() 
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    public double area() 
    {
        return length * width;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}
//--------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------
Inner classes: 

Inner classes in Java are classes that are defined within another class. They have access to the members of the enclosing class (outer class), including private members. Inner classes are mainly used for logical grouping of classes and improving encapsulation.

There are mainly four types of inner classes:
	- Member Inner Class:
	- Local Inner Class:
	- Anonymous Inner Class:
	- Static Nested Class:

- Member Inner Class:
A member inner class, also known as a non-static nested class, is a class that is defined within another class, referred to as the outer class. Member inner classes have access to the members (fields and methods) of the outer class, even those marked as private. They are tightly bound to the outer class instance, meaning that an instance of the inner class cannot exist without an instance of the outer class.
Member inner classes are often used when the inner class is logically part of the outer class and should not be accessed by code outside the outer class. 

class Outer_Demo 
{
   int num=100;
   
   // inner class
	private class Inner_Demo 
	{
		public void print() 
		{
			System.out.println("This is an inner class no="+num);
		}
	}
   
   // Accessing he inner class from the method within
	void display_Inner() 
	{
		System.out.println("This is an Outer class no="+num);
		Inner_Demo inner = new Inner_Demo();
		inner.print();
	}
}
   
public class My_classInner 
{

	public static void main(String args[]) 
	{
		// Instantiating the outer class 
		Outer_Demo outer = new Outer_Demo();
      
		// Accessing the display_Inner() method.
		outer.display_Inner();
	}
}

//---------------------------------------------------------------------------------------------------------------------

	// - Local Inner Class:

A local inner class in Java is a class that is defined within a method or a block of code. Unlike member inner classes, local inner classes are not associated with an instance of the outer class. They have access to the members of the enclosing class as well as local variables and parameters of the enclosing method, but these variables must be effectively final (i.e., they cannot be modified after initialization).

class OuterClass 
{
	private int outerField = 10;
	public void localInnerClassMethod() 
	{
        	final int localVar = 20; // Local variable        
        	// Local Inner Class
        	class LocalInner 
			{
				void display() 
				{
                		// Inner class can access both outerField and localVar
                		System.out.println("Outer Field: " + outerField);
                		System.out.println("Local Variable: " + localVar);

						outerField=100;
						// localVar=200; 
						// error: local variables referenced from an inner class must be final or effectively final

                		System.out.println("Outer Field: " + outerField);
                		System.out.println("Local Variable: " + localVar);
            	}
        	}
        
        	// Creating an instance of the local inner class
        	LocalInner inner = new LocalInner();
        	inner.display(); // Calling the method of the inner class
    	}
}
public class My_LocalInner
{
	public static void main(String[] args) 
	{
		OuterClass outer = new OuterClass();
		outer.localInnerClassMethod(); // Invoking the method containing the local inner class
	}
}

//---------------------------------------------------------------------------------------------------------------

	// Anonymous inner class: 
	//--------------------------

Anonymous inner classes in Java are inner classes without a name, typically defined and instantiated in a single expression. They are useful when you need to create a class for a one-time use, often for implementing interfaces or extending classes without creating a separate named subclass.

abstract class AnonymousInner 
{
   public abstract void mymethod();
}

public class AnonymousInnerDemo 
{
	public static void main(String args[]) 
	{
		AnonymousInner inner = new AnonymousInner(){
		public void mymethod(){
			System.out.println("In the method of anonymous inner class");
		}};
    
	inner.mymethod();	
   }
}

//-----------------------------------------------------------------------------------------------------------------------

	// Static Nested Class:

A static inner class is a nested class which is a static member of the outer class. It can be accessed without instantiating the outer class, using other static members. Just like static members, a static nested class does not have access to the instance variables and methods of the outer class. 

class Outer 
{
	private static int val=100;
	static class Nested_Demo 
	{
		public void my_method() 
		{
			System.out.println("This is my nested class: "+val);
		}
	}
}
public class StaticClassDemo
{
	public static void main(String []args)
	{
		Outer.Nested_Demo ob= new Outer.Nested_Demo();	 
		ob.my_method();
	}
}

//-----------------------------------------------------------------------------------------------------------

	/// Covariant Return Type

The concept of Covariant Return Type refers to the ability in Java to override a superclass method in such a way that the subclass method has a return type that is a subtype of the return type declared in the superclass method. This feature was introduced in Java 5 to enhance the language’s support for common object-oriented programming patterns.

	class Vehicle 
	{
    		Vehicle copy() 
		{
        		return new Vehicle();
    		}
	}
	class Car extends Vehicle 
	{
    		@Override
    		Car copy() 
		{
        		return new Car();
    		}
	}

//----------------------------------------------------------------------------------------------------------------

	// Varargs in Methods 

In Java, varargs (variable arguments) is a feature that allows you to pass an arbitrary number of values to a method. 
You can use varargs when you don’t know how many arguments you will need to pass to a method. 
The syntax for varargs is simple: you just add three dots (...) after the data type of the last parameter.

	class VarargsExample 
	{
    		static void display(String... values) 
		{
        		System.out.println("Number of arguments: " + values.length);
        		for (String s : values) 
			{
				System.out.println(s);
        		}
    		}

    		public static void main(String args[]) 
		{
        		display(); // zero argument
        		display("Hello"); // one argument
        		display("This", "is", "varargs"); // three arguments
    		}
	}

//============================================================================================================
//============================================================================================================

	Interface in Java: 
	-------------------

	It is actually introduced to achive the advantages of multiple inheritance in java. In interfaces, all methods are implicitly abstract and public. They don't use the abstract keyword. interface variables in Java are constants, and they are implicitly public, static, and final.
	Decl. Syntax:
		interface  <interface_nm>
		{
			---------------;
			---------------;
		}
	   e.g.
		interface area
		{
			float pi=3.14F;
			void compute(float  x, float  y);
			void show();
		}


	Lets see, how the interface is implemented.

interface A
{
	int val=10;
	void out();
}
class B implements A
{
	public void out()
	{
		System.out.println(val);
	}
}
class MainClassInterface
{
	public static void main(String []args)
	{
		B ob=new B();
		ob.out();

		System.out.println(A.val); // A.val coz it is static
	}
}
//--------------------------

	// Lets try to run the program without defining the out() in the class B.

interface A
{
	int val=10;
	void out();
}
class B implements A
{
	
}
class MainClassInterface
{
	public static void main(String []args)
	{
		B ob=new B();
		ob.out(); // B is not abstract and does not override abstract method out() in A
	}
}

//-------------------------------------------------

	// Lets try to access the val in the B, and lets assign the any other value to it.

interface A
{
	int val=10;
	void out();
}
class B implements A
{
	public void out()
	{
		val=100; // error: cannot assign a value to static final variable val
		System.out.println(val);
	}
}
class MainClassInterface
{
	public static void main(String []args)
	{
		B ob=new B();
		ob.out();
	}
}


//-----------------------------------------------------------------------------------------------------------------------

	How Ambiguilty error is eliminated using the interface?

	Nite taht, A class can extend only one class  but it may implements one or more than one interfaces

		In C++					In Java
	
	class Exam	class Sport		class Exam	interface Sport
     show() [ ]        show()[ ]	      show()[ ]              [ ]show() -abstract
	     |                |			     |                |
	     |________________|	     		     |________________|
			|                              show()  |
               show()  [  ] show()                            [  ] show(){} - defined as base sport having abstract show()
         class Result:public Exam, Public Sport	     class Result extends Exam implements Sport   

		Result rob;				Result rob=new Result();
		rob.show(); // ambiguous error		rob.show();  // No Error, coz class Result having definition of show()

        
		 - if() result having his own copy of show() then there will not be a ambiguous error.

//------------------------------------------------------------------------------------------------------------------------------
	// Different types of interfaces in java

	- Normal Interface:

		- This is the most common type of interface in Java.
		- It can contain any number of abstract methods, but no concrete methods.
		- It can also contain constant variables (variables declared with public static final modifiers).

		Example:

		interface MyInterface {
   		 	void method1();
   		 	void method2();
		}

	- Functional Interface/Single Abstract Method (SAM) Interface:

		- A functional interface is an interface that contains exactly one abstract method.
		- It can have any number of default or static methods.
		- It can be annotated with @FunctionalInterface annotation for clarity, but it's not mandatory.
		- It's used to enable lambda expressions and functional programming constructs.
		- Example: Runnable, Comparable , Callable, ActionListener etc.

		Example:

		@FunctionalInterface
		interface MyFunctionalInterface {
		    void myMethod();
		}

	- Marker Interface:

		- A marker interface is an interface with no methods or fields (i.e., it acts as a tag).
		- Its sole purpose is to mark or tag a class that implements it.
		- It's used to provide metadata about the class to the runtime environment.

	Example:

		interface Serializable {
		    // No methods
		}

//------------------------------------------------------------------------------------------------------------------------------

In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields, constructors, or non-static initializer blocks. They provide a way to specify a set of methods that a class must implement.

Here's a breakdown of the key elements of Java interfaces:

	- Method Signatures: Interfaces can declare method signatures without providing implementations. 
			   These methods act as a contract that any class implementing the interface must fulfill.

		interface MyInterface 
		{
    			void method1();
    			int method2(String str);
		}

	- Constants: Interfaces can contain constants, which are implicitly public, static, and final.

		interface Constants 
		{
    			int MAX_SIZE = 100;
    			String NAME = "Java Interface";
		}
	
	- Default Methods: Java 8 introduced the concept of default methods in interfaces. 
			   These are methods that have a default implementation. 
			   They allow interfaces to be extended without breaking existing implementations.

		interface MyInterface 
		{
    			default void defaultMethod() 
			{
        			System.out.println("Default method implementation");
    			}
		}

	- Static Methods: Java 8 also introduced static methods in interfaces. These methods are associated 
			  with the interface itself and can be called using the interface name.

		interface MyInterface 
		{
    			static void staticMethod() 
			{
        			System.out.println("Static method in interface");
    			}
		}

	- Inheritance: Interfaces can extend other interfaces, creating a hierarchy of contracts.

		interface SubInterface extends MyInterface 
		{
    			void additionalMethod();
		}

	- Implementation: A class implements an interface by providing concrete implementations for all the 
			  methods declared in the interface.

		class MyClass implements MyInterface 
		{
    			@Override
    			public void method1() 
			{
        			// Method implementation
    			}
    
    			@Override
    			public int method2(String str) 
			{
       				 // Method implementation
        			return 0;
    			}
		}

	- Multiple Interface Implementation: Java allows a class to implement multiple interfaces. In this case, 
		the class must provide implementations for all methods declared in all the interfaces it implements.

		class MyClass implements Interface1, Interface2 
		{
    			// Implement methods from both interfaces
		}


//------------------------------------------------------------------------------------------------------------------------------

	// class implements interface

import java.util.Scanner;
interface Sample
{
	void in();
	void out();
}
class Test implements Sample
{
	private int x;
	private double y;
	public Test()
	{
		x=23;
		y=45.21;
	}
	public void in() // visibility must be public
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the values of x and y: ");
		x=sc.nextInt();
		y=sc.nextDouble();
	}
	public void out() // visibility must be public
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class MainDemoInterfaceExample
{
	public static void main(String []args)
	{
		Test ob=new Test();
		ob.in();
		ob.out();
	}
}

///-----------------------------------------------------------------------------------------------

	// class extends class and implements interface

import java.util.Scanner;
interface Sample
{
	void in();
	void out();
}
class Demo
{	private int a;
	public Demo()
	{
		a=100;
	}
	public void show()
	{	
		System.out.println("\n a="+a);
	}
}
class Test extends Demo implements Sample
{
	private int x;
	private double y;
	public Test()
	{
		x=23;
		y=45.21;
	}
	public void in() // visibility must be public
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the values of x and y: ");
		x=sc.nextInt();
		y=sc.nextDouble();
	}
	public void out() // visibility must be public
	{
		show();
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class MainDemoInterfaceExample
{
	public static void main(String []args)
	{
		Test ob=new Test();
		ob.in();
		ob.out();
	}
}


//------------------------------------------------------------------------------------------

	// A class extends class and implements multiple interfaces.

import java.util.Scanner;
interface SampleIn
{
	void in();
}
interface SampleOut
{
	void out();
}
class Demo
{	private int a;
	public Demo()
	{
		a=100;
	}
	public void show()
	{	
		System.out.println("\n a="+a);
	}
}
class Test extends Demo implements SampleIn, SampleOut
{
	private int x;
	private double y;
	public Test()
	{
		x=23;
		y=45.21;
	}
	public void in() // visibility must be public
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the values of x and y: ");
		x=sc.nextInt();
		y=sc.nextDouble();
	}
	public void out() // visibility must be public
	{
		show();
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class MainDemoInterfaceExample
{
	public static void main(String []args)
	{
		Test ob=new Test();
		ob.in();
		ob.out();
	}
}


//-------------------------------------------

	// An inteface extends another interface

import java.util.Scanner;
interface SampleIn
{
	void in();
}
interface SampleOut extends SampleIn
{
	void out();
}
class Demo
{	private int a;
	public Demo()
	{
		a=100;
	}
	public void show()
	{	
		System.out.println("\n a="+a);
	}
}
class Test extends Demo implements SampleOut
{
	private int x;
	private double y;
	public Test()
	{
		x=23;
		y=45.21;
	}
	public void in() // visibility must be public
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the values of x and y: ");
		x=sc.nextInt();
		y=sc.nextDouble();
	}
	public void out() // visibility must be public
	{
		show();
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class MainDemoInterfaceExample
{
	public static void main(String []args)
	{
		Test ob=new Test();
		ob.in();
		ob.out();
	}
}

//-------------------------------------------------------------------------------

	// refering the base class object using interface reference

import java.util.Scanner;

interface SampleOut
{
	void out();
}
class Test extends Demo implements SampleOut
{
	private int x;
	private double y;
	public Test()
	{
		x=23;
		y=45.21;
	}
	public void in() // visibility must be public
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the values of x and y: ");
		x=sc.nextInt();
		y=sc.nextDouble();
	}
	public void out() // visibility must be public
	{
		System.out.println("\n x="+x+"\t y="+y);
	}
}
class MainDemoInterfaceExample
{
	public static void main(String []args)
	{
		SampleOut ob=new Test();
		ob.in();
		ob.out();
	}
}

output on compile:
MainDemoInterfaceExample.java:33: error: cannot find symbol
                ob.in();
                  ^
  symbol:   method in()
  location: variable ob of type SampleOut
1 error
Press any key to continue . . .

	Note that an interface reference able to refer an object of its every child but
	using it we can access only those methods which are declare ed with in that interface.


//-------------------------------------------------

	// The program of shape and area using interface

interface Shape 
{
    // Abstract method bydefault
   double area();
}

class Circle implements Shape
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double area() 
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    public double area() 
    {
        return length * width;
    }
}

public class MainInterfaceRef
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}

//----------------------------------------------------------------------------------------------------------------------

	// Defining default method in interface

Default methods in interfaces provide a way to add new methods to interfaces without breaking existing implementations. They are particularly useful when you want to add new functionalities to interfaces in Java, especially in libraries and frameworks where backward compatibility is crucial.

// Define the Animal interface
interface Animal 
{
	// Abstract method signature
	void eat();
	
	// Default method to provide a deafult sound
	default void makeSound() 
	{
		System.out.println("The animal makes a sound");
	}
}

// Implementing class Dog that implements Animal interface
class Dog implements Animal 
{
	@Override
	public void eat() 
	{
		System.out.println("Dog eats bones");
	}
}

// Implementing class Cat that implements Animal interface
class Cat implements Animal 
{
	@Override
	public void eat() 
	{
		System.out.println("Cat eats fish");
	}
	
	// Overriding the default method makeSound
	@Override
	public void makeSound() 
	{
		System.out.println("Meow!"); // Custom sound for Cat
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		// Create objects of Dog and Cat
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// Call the eat method for Dog and Cat
		dog.eat(); // Output: Dog eats bones
		cat.eat(); // Output: Cat eats fish
		
		// Call the makeSound method for Dog and Cat
		dog.makeSound(); // Output: The animal makes a sound
		cat.makeSound(); // Output: Meow!
	}
}
///-----------------------------------------------------------------------------------------

	// defining static methods in interfaces

In Java, static methods in interfaces were introduced in Java 8 as part of the language's evolution to support functional programming paradigms. They allow interfaces to provide utility methods, which are associated with the interface itself rather than instances of classes that implement the interface. Here's a detailed explanation of static methods in Java interfaces:

// Define the Shape interface
interface Shape
{
    // Abstract method signature for calculating area
    double calculateArea();
    
    // Static method to calculate area of a rectangle
    static double calculateRectangleArea(double length, double width) 
    {
        return length * width;
    }
}

// Implementing class Rectangle that implements Shape interface
class Rectangle implements Shape 
{
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    // Implement the calculateArea method
    @Override
    public double calculateArea() 
    {
        // Delegate the calculation to the static method in the interface
        return Shape.calculateRectangleArea(length, width);
    }
}

public class MainStaticMethod
{
	public static void main(String[] args) 
	{
       		// Create a rectangle object
        	Rectangle rectangle = new Rectangle(5.0, 4.0);
        
        	// Calculate and print the area of the rectangle
        	double area = rectangle.calculateArea();
        	System.out.println("Area of the rectangle: " + area); // Output: Area of the rectangle: 20.0

		System.out.println("Area of Rectangle is: "+Shape.calculateRectangleArea(5.0,4.0));
    	}
}

//======================================================================================================================
//======================================================================================================================


	Packages in Java: It is Collection of classes and interfaces.

	There are two types of packages ----> Built-in packages --> provided with JDK
					  |
					  |-> User defined packages -> Defined by programmer

	Java provides the standred library known as JSL or API, which is divided into
	different packages as shown (It is same as that of file folder system)

				java
				  |
		--------------------------------------------------
		|	|	|	|	|	|	 |
	      lang    util      io      awt     net     applet  sql
		       |
                     Scanner 

		     It contains some other subpackages
		     classes and interfaces together with
  		     Scanner class    	
					
	So it can be refered as java.util.Scanner

	as this is provided class, we import it from the JSL using import statement as

		import java.util.Scanner

	You know the concept of path
	
	we used the command >>set path=c:\program files\......\bin

	which will gives the location of java compiler.
	in same manner classpath command is there, which will gives the location from
	where we have to load the class when that class not present at current location or
	not present at default path(i.e.in the JSL)


	Defining our own package:
	---------------------------
	
	Java source file can any (or all) of the following four internal parts:

		- A single package statement (optional)
		- Any number of import statements (optional)
		- A single public class declaration (required)
		- Any number of classes private 
	

	// Importing predefined class


// Importing predefined class

// main class: E:\fsdpack\jpack -> MainPackageDemoExample1.java

import java.util.Scanner;
public class MainPackageDemoExample1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int no=sc.nextInt();
		System.out.println("no: "+no);
	}
}

//----------------------------------------------------------------------------------------------------------------------

	/// Using userdefined classes to create an object


// userdefined class from same file

// main class: E:\fsdpack\jpack -> MainPackageDemoExample2.java

class Test
{
	private int a;
	public Test()
	{
		a=12;
	}
	public void show()
	{
		System.out.println("a= "+a);
	}
}
public class MainPackageDemoExample2
{
	public static void main(String[] args) 
	{
		Test ob=new Test();
		ob.show();
	}
}

//--------------------------------------------------------------------------------------------------------------


// userdefined class from same file and another class from same folder(package)

// E:\fsdpack\jpack -> Demo.java
class Demo
{
	private int b;
	public Demo()
	{
		b=122;
	}
	public void display()
	{
		System.out.println("b= "+b);
	}
}


// main class: E:\fsdpack\jpack -> MainPackageDemoExample3.java
class Test
{
	private int a;
	public Test()
	{
		a=12;
	}
	public void show()
	{
		System.out.println("a= "+a);
	}
}
public class MainPackageDemoExample3
{
	public static void main(String[] args) 
	{
		Test ob=new Test();
		ob.show();

		Demo ob1=new Demo();
		ob1.display();
	}
}

//--------------------------------------------------------------------------------------------------------------------


// userdefined class from same file and another class from same folder(package)
// another class from different folder

// E:\support\jspack --->Sample.java
class Sample
{
	private int c;
	public Sample()
	{
		c=1222;
	}
	public void output()
	{
		System.out.println("c= "+c);
	}
}

// E:\fsdpack\jpack -> Demo.java
class Demo
{
	private int b;
	public Demo()
	{
		b=122;
	}
	public void display()
	{
		System.out.println("b= "+b);
	}
}
// main class: E:\fsdpack\jpack -> MainPackageDemoExample4.java
class Test
{
	private int a;
	public Test()
	{
		a=12;
	}
	public void show()
	{
		System.out.println("a= "+a);
	}
}
public class MainPackageDemoExample4
{
	public static void main(String[] args) 
	{
		Test ob=new Test();
		ob.show();

		Demo ob1=new Demo();
		ob1.display();

		Sample ob2=new Sample();
		ob2.output();
	}
}

 ------- Error on Compile ------- 
E:\fsdpack\jpack>javac MainPackageDemoExample4.java
MainPackageDemoExample4.java:29: error: cannot find symbol
                Sample ob2=new Sample();
                ^
  symbol:   class Sample
  location: class MainPackageDemoExample4
MainPackageDemoExample4.java:29: error: cannot find symbol
                Sample ob2=new Sample();
                               ^
  symbol:   class Sample
  location: class MainPackageDemoExample4
2 errors


	It will gives an error for the Sample class. coz it is not in same file or not in the same folder.

//---------------------------------------------------------------------------------------------------

	Now we want to eiminate that error and for that,

	- we need to use package statement in the source file of Sample
	- we need to import Sample class in MainClass file(MainPackageDemoExamplex.java)
	- we need to mention the classpath which will give the idea to interpreter, from where
	  he has to import that sample class.

// userdefined class from same file and another class from same folder(package)
// another class from different folder

// E:\support\jspack --->Sample.java

package jspack;
class Sample
{
	private int c;
	public Sample()
	{
		c=1222;
	}
	public void output()
	{
		System.out.println("c= "+c);
	}
}

// E:\fsdpack\jpack -> Demo.java
class Demo
{
	private int b;
	public Demo()
	{
		b=122;
	}
	public void display()
	{
		System.out.println("b= "+b);
	}
}
// main class: E:\fsdpack\jpack -> MainPackageDemoExample5.java

import jspack.Sample;
class Test
{
	private int a;
	public Test()
	{
		a=12;
	}
	public void show()
	{
		System.out.println("a= "+a);
	}
}
public class MainPackageDemoExample5
{
	public static void main(String[] args) 
	{
		Test ob=new Test();
		ob.show();

		Demo ob1=new Demo();
		ob1.display();

		Sample ob2=new Sample();
		ob2.output();
	}
}

//--------- WE compiled the program after setting the path as ------

E:\fsdpack\jpack>set classpath=.*;E:\support;

E:\fsdpack\jpack>javac MainPackageDemoExample5.java
MainPackageDemoExample5.java:7: error: Sample is not public in jspack; cannot be accessed from outside package
import jspack.Sample;
             ^
MainPackageDemoExample5.java:30: error: Sample is not public in jspack; cannot be accessed from outside package
                Sample ob2=new Sample();
                ^
MainPackageDemoExample5.java:30: error: Sample is not public in jspack; cannot be accessed from outside package
                Sample ob2=new Sample();
                               ^
3 errors


	This error is due to Sample class having default visibility, and default is visible within
	package(same folder). so we need to make it public.

Now make the class Sample as public and the reexecute,

E:\fsdpack\jpack>set classpath=.*;E:\support;

E:\fsdpack\jpack>javac MainPackageDemoExample5.java

E:\fsdpack\jpack>java MainPackageDemoExample5
a= 12
b= 122
c= 1222

	Then we have seen the expected output, This will shows how actually the package is written
	and how it is utilized after importing.


///--------------------------------------------------------------------------------------------------------------------

		/// lets the the access protection chart: Actually it will gives the clear idea of visibility of the
		//  class members in same or different package when used individually or subclassed.


	lets start with,

					private		default		protected	public

  			same class	Yes		Yes		Yes		Yes

// E:\fsdpack\jpack  --> MainClassAP.java

class SameFile
{
	private int a;
	protected int b;
	int c;
	public int d;

	{
		a=10;
		b=20;
		c=30;
		d=40;
	}
	public void out()
	{	// All members are accessed with in same class
		System.out.println("a="+a+"\t b="+b+"\t c="+c+"\t d="+d);
	}
}
class MainClassAP
{
	public static void main(String []args)
	{
		SameFile ob1=new SameFile();
		ob1.out();
	}
}


//---------------------------------------------------------------------------------------------------------

					private		default		protected	public

  same package non-subclass		No		Yes		Yes		Yes


// E:\fsdpack\jpack  --> SamePackage.java
class SamePackage
{
	private int a;
	protected int b;
	int c;
	public int d;

	{
		a=10;
		b=20;
		c=30;
		d=40;
	}
	public void out()
	{	// All members are accessed with in same class
		System.out.println("a="+a+"\t b="+b+"\t c="+c+"\t d="+d);
	}
	protected int geta()
	{
		return a;
	}
	int getb()
	{
		return b;
	}
	private int getc()
	{
		return c;
	}
}

// E:\fsdpack\jpack  --> MainClassAP.java	==> Non-subclass from same package
class MainClassAP
{
	public static void main(String []args)
	{
		SamePackage ob1=new SamePackage();

		ob1.out();// public member of non-subclass from same package

		System.out.println("a is "+ob1.geta()); // protected

		System.out.println("b is "+ob1.getb()); // default

		System.out.println("c is "+ob1.getc()); // private 
		//error: getc() has private access in SamePackage
	}
}

//---------------------------------------------------------------------------------------------------------


					private		default		protected	public

                same package subclass	No		Yes		Yes		Yes

// E:\fsdpack\jpack  --> SamePackage.java
class SamePackage
{
	private int a;
	protected int b;
	int c;
	public int d;

	{
		a=10;
		b=20;
		c=30;
		d=40;
	}
	public void out()
	{	// All members are accessed with in same class
		System.out.println("a="+a+"\t b="+b+"\t c="+c+"\t d="+d);
	}
	protected int geta()
	{
		return a;
	}
	int getb()
	{
		return b;
	}
	private int getc()
	{
		return c;
	}
}

// E:\fsdpack\jpack  --> MainClassAP.java
class SameFile extends SamePackage	// ==> Subclass from same package
{
	public void getdata()
	{
		out();// public member of subclass from same package
		System.out.println("a is "+geta()); // protected
		System.out.println("b is "+getb()); // default

		System.out.println("c is "+getc()); // private 
		/*
		MainClassAP.java:8: error: cannot find symbol
                System.out.println("c is "+getc()); // private
		*/
	}
}
class MainClassAP
{
	public static void main(String []args)
	{
		SameFile ob1=new SameFile();
		ob1.getdata();
	}
}

//--------------------------------------------------------------------------------------------------------------


					private		default		protected	public

  Different package non-subclass	No		No		No		Yes


// E:\support\jspack --> DifferentPackage.java
package jspack;
public class DifferentPackage
{
	private int a;
	protected int b;
	int c;
	public int d;

	{
		a=10;
		b=20;
		c=30;
		d=40;
	}
	public void out()
	{	// All members are accessed with in same class
		System.out.println("a="+a+"\t b="+b+"\t c="+c+"\t d="+d);
	}
	protected int geta()
	{
		return a;
	}
	int getb()
	{
		return b;
	}
	private int getc()
	{
		return c;
	}
}

// E:\fsdpack\jpack  --> MainClassAP.java
import jspack.DifferentPackage;
class MainClassAP // different package non-subclass
{
	public static void main(String []args)
	{
		DifferentPackage ob1=new DifferentPackage();

		ob1.out();// public member of non-subclass from different package

		System.out.println("a is "+ob1.geta()); // protected

		System.out.println("b is "+ob1.getb()); // default

		System.out.println("c is "+ob1.getc()); // private 
	}
}

//---------- On Compile ------------

C:\Users\Archer_Pune>e:

E:\>cd fsdpack\jpack

E:\fsdpack\jpack>javac MainClassAP.java
MainClassAP.java:14: error: package jspack does not exist
import jspack.DifferentPackage;
             ^
MainClassAP.java:19: error: cannot find symbol
                DifferentPackage ob1=new DifferentPackage();
                ^
  symbol:   class DifferentPackage
  location: class MainClassAP
MainClassAP.java:19: error: cannot find symbol
                DifferentPackage ob1=new DifferentPackage();
                                         ^
  symbol:   class DifferentPackage
  location: class MainClassAP
3 errors

E:\fsdpack\jpack>set classpath=.*;e:\support;

E:\fsdpack\jpack>javac MainClassAP.java
MainClassAP.java:23: error: geta() has protected access in DifferentPackage
                System.out.println("a is "+ob1.geta()); // protected
                                              ^
MainClassAP.java:25: error: getb() is not public in DifferentPackage; cannot be accessed from outside package
                System.out.println("b is "+ob1.getb()); // default
                                              ^
MainClassAP.java:27: error: getc() has private access in DifferentPackage
                System.out.println("c is "+ob1.getc()); // private
                                              ^
3 errors

E:\fsdpack\jpack>

//------------------------------------------------------------------------------------------------------------------------


					private		default		protected	public

  Different package subclass		No		No		Yes		Yes


// E:\support\jspack --> DifferentPackage.java
package jspack;
public class DifferentPackage
{
	private int a;
	protected int b;
	int c;
	public int d;

	{
		a=10;
		b=20;
		c=30;
		d=40;
	}
	public void out()
	{	// All members are accessed with in same class
		System.out.println("a="+a+"\t b="+b+"\t c="+c+"\t d="+d);
	}
	protected int geta()
	{
		return a;
	}
	int getb()
	{
		return b;
	}
	private int getc()
	{
		return c;
	}
}


// E:\fsdpack\jpack  --> MainClassAP.java
import jspack.DifferentPackage;
class SameFile extends DifferentPackage	// ==> Subclass from Different Package
{
	public void getdata()
	{
		out();// public member of subclass from Different Package
		System.out.println("a is "+geta()); // protected
		System.out.println("b is "+getb()); // default

		System.out.println("c is "+getc()); // private 
	}
}

class MainClassAP 
{
	public static void main(String []args)
	{
		SameFile ob1=new SameFile();
		ob1.getdata();
	}
}
-------------- Ob compile ----------
C:\Users\Archer_Pune>e:

E:\>cd fsdpack\jpack

E:\fsdpack\jpack>set classpath=.*;e:\support;

E:\fsdpack\jpack>javac MainClassAP.java
MainClassAP.java:8: error: cannot find symbol
                System.out.println("b is "+getb()); // default
                                           ^
  symbol:   method getb()
  location: class SameFile
MainClassAP.java:10: error: cannot find symbol
                System.out.println("c is "+getc()); // private
                                           ^
  symbol:   method getc()
  location: class SameFile
2 errors

E:\fsdpack\jpack>

	// In All above programs the error are the indication or confirmation of access restriction.
	// Take it as a output.

	Access Protection Chart
	------------------------

//======================================================================================================
					private		default		protected	public
//======================================================================================================
  same class				Yes		Yes		Yes		Yes

  same package subclass			No		Yes		Yes		Yes

  same package non-subclass		No		Yes		Yes		Yes

  Different package subclass		No		No		Yes		Yes

  Different package non-subclass	No		No		No		Yes
					

//======================================================================================================
//=======================================================================================================
//=======================================================================================================

	/// Exception Handing
	///---------------------

	We Know the execution flow of java program


					     *.java
						|
						|
					     Compile
					     (javac)			=====> Errors, Checked Exception
						|
						|
					    Bytecode	
					    (*.class)
						|			
       						|			Compile	--> Error (Nornally syntax errors)	
				---------------------------------	============================================
				|		|		|	Interpretation --> Exceptions (Runtime Error)
			       JVM	       JVM	       JVM     	
  				|		|		|			 
			      Windows	      Linux	       Mac
				|		|		|
			 Native Code       Native Code    Native Code	=====> Exceptions (Unchecked Exception)
				|		|		|
			       Run	       Run             Run
				|		|		|
			     Output	     Output          Output



	In Java, there are two different places where the Errors may occured,

	Errors:  An error is the mistake in developing  program causes a unexpected output or 
		 we are unable to execute the program. 

		The error may of two types 
		 - Compile time errors:
 		 - Run time errors:

	Compile time errors: these are the syntax errors which are displayed by java compiler and therefore these are 
			     known as Compile time errors
	  e.g.	use of undeclared  variable
		bad reference to object
		missing semi comma
		misspelling of identifier and keyword
		missing/mismatching brackets in classes and methods

	Run time errors: some time the program may compile but gives error at the time of execution due to some mistakes 
			 at run time such errors are known as Run time errors
		e.g.	divide an integer by zero
			access an element that is out of bounds of an array
			attempting to use a negative size for an array


	These error are represented in form of class in java

	- The compile time errors are generally known as errors and are represented using the class Error 
	  or any of its subclass.

	- The runtime errors are generally termed as exceptions and represented with the help of class Exception
	  or any one of its subclass.

	Both Error and Exception classes are the childs of Throwable and all are present in java.lang package.
	it hierarchy is as shown
	(https://stackify.com/types-of-exceptions-java/)
	

				java.lang.Object
					|
					|
				java.lang.Throwable
					|
			------------------------------------------
			|					|
		java.lang.Error				java.lang.Exception
			├── AssertionError			├── IOException
			├── ExceptionInInitializerError		├── RuntimeException
			├── ExceptionInInitializerError		│   │    
			├── StackOverflowError			│   ├── NullPointerException
			├── OutOfMemoryError			│   ├── ArrayIndexOutOfBoundsException
			├── NoClassDefFoundError		│   ├── ClassCastException
			└── ...					│   └── ...
								├── SQLException
								├── ParseException
								├── ClassNotFoundException
								├── InterruptedException
								├── FileNotFoundException
								├── ArithmeticException
								└── ...


	What is effect of error or Exception on a program execution.

	 - If Error is in the program, we are unable to execute the code.
	 - If Exception is there in the program, the execution will be terminated abnormally. which may	
	   introduce the unexpected or random output or result. 


 Exceptions
	Exceptions can be caught and handled by the program. When an exception occurs within a method, 
	it creates an object. This object is called the exception object. It contains information about the
	exception such as the name and description of the exception and state of the program when the 
	exception occurred.

now focus on different types of exceptions in Java.

Java Exception Types
The exception hierarchy also has two branches: RuntimeException and IOException.

1. RuntimeException
A runtime exception happens due to a programming error. They are also known as unchecked exceptions.
These exceptions are not checked at compile-time but run-time. 

Some of the common runtime exceptions are:

	- Improper use of an API - IllegalArgumentException
	- Null pointer access (missing the initialization of a variable) - NullPointerException
	- Out-of-bounds array access - ArrayIndexOutOfBoundsException
	- Dividing a number by 0 - ArithmeticException

You can think about it in this way. “If it is a runtime exception, it is your fault”.
The NullPointerException would not have occurred if you had checked whether the variable was initialized or not before using it.
An ArrayIndexOutOfBoundsException would not have occurred if you tested the array index against the array bounds.

2. IOException
An IOException is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is prompted to handle these exceptions.

Some of the examples of checked exceptions are:

	- Trying to open a file that doesn’t exist results in FileNotFoundException
	- Trying to read past the end of a file


Java Exception Handling - Note that handling the exception means not eliminating it.
We know that exceptions abnormally terminate the execution of a program, to avoid it, it is important to handle exceptions. And it will allows us to take some corrective efforts.

There are 5 different keywords provided to handle the exceptions. and these are 
try, catch, finally, throw, and throws.



try			try				try
{			{				{
  .........		  ..........			}	
}			}				catch(Exception e)
catch(Exception e)	catch(XException e)		{
{			{				}
  ---------		}				finally
}			catch(YException e)		{
			{				}
			}
			catch(Exception e)
			{
			}
		


try 					try
{					{
     
}					}
catch (ExceptionType1 Ob) 		finally
{					{
  					}
}
catch (ExceptionType2 Ob) 
{
    
}
finally
{
}

 Note:
	- Try can not be used alone. It must be used with catch block or finally block or both.
	- finally is optional
	- you are allowed to use multiple catch blocks but only one finally.

//-------------------------------------------------------------------------------------

	Lets see some programs, which are generation some errors and exceptions.


class ErrorDemo1 
{
	public static void main(String[] args) 
	{
		x=10;
		System.out.println("Value of x is: "+x);
	}
}

Output on Compile

ErrorDemo1.java:5: error: cannot find symbol
                x=10;
                ^
  symbol:   variable x
  location: class ErrorDemo1
ErrorDemo1.java:6: error: cannot find symbol
                System.out.println("Value of x is: "+x);
                                                     ^
  symbol:   variable x
  location: class ErrorDemo1
2 errors
Press any key to continue . . .

//------------------------------------------------------------------------------------

class DemoErrorException
{
	public static void main(String []args)
	{
		int x;
		double y;

		x=args[0];
		y=args[1];

		System.out.println("x="+x+"\t y="+y);
	}
}

output on compile

DemoErrorException.java:8: error: incompatible types: String cannot be converted to int
                x=args[0];
                      ^
DemoErrorException.java:9: error: incompatible types: String cannot be converted to double
                y=args[1];
                      ^
2 errors
Press any key to continue . . .

//------------------------------------------------------------------------------------------------------

class DemoErrorException2
{
	public static void main(String []args)
	{
		String s1;
		String s2;

		s1=args[0];
		s2=args[1];

		System.out.println("s1="+s1+"\t s2="+s2);
	}
}

Output on Run

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at DemoErrorException2.main(DemoErrorException2.java:10)
Press any key to continue . . .


//-------------------------------------------------------------------------------------------------------------------------
	
	// Using try..catch() block to handle the exception

class DemoErrorException
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;

		try
		{
			x=Integer.parseInt(args[0]);
			y=Double.parseDouble(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Problem due to improper location access");
			System.out.println("Execution with default values");
			x=1;
			y=1.0;
		}

		System.out.println("x="+x+"\t y="+y);
	}
}

output on Run
Problem due to improper location access
Execution with default values
x=1      y=1.0
Press any key to continue . . .


//------------------------------------------------------------------------------

  // Using the multiple catch blocks:

	// When we collect perticular type of exception then there may be chance of
	// abnormal condition due to another type of exception may be generated at runtime
	// lets execute the above program and enter char rather than int or double value.

E:\javapfsdn23>java DemoErrorException
Problem due to improper location access
Execution with default values
x=1      y=1.0

E:\javapfsdn23>java DemoErrorException 11 22
x=11     y=22.0

E:\javapfsdn23>java DemoErrorException 11 r
Exception in thread "main" java.lang.NumberFormatException: For input string: "r"
        at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
        at java.base/java.lang.Double.parseDouble(Double.java:792)
        at DemoErrorException.main(DemoErrorException.java:11)



 // so we need to collect java.lang.NumberFormatException also by using another catch or use Exception reference to 
 // collect exception object in a last catch block.

class DemoErrorException
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;

		try
		{
			x=Integer.parseInt(args[0]);
			y=Double.parseDouble(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Problem due to improper location access");
			System.out.println("Execution with default values");
			x=1;
			y=1.0;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Problem due to improper Numeric values entered");
			System.out.println("Execution with default values");
			x=2;
			y=2.2;
		}
		System.out.println("x="+x+"\t y="+y);
	}
}

//---------------------
	This is more preferable

class DemoErrorException
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;

		try
		{
			x=Integer.parseInt(args[0]);
			y=Double.parseDouble(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Problem due to improper location access");
			System.out.println("Execution with default values");
			x=1;
			y=1.0;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Problem due to improper Numeric values entered");
			System.out.println("Execution with default values");
			x=2;
			y=2.2;
		}
		catch(Exception e)
		{
			System.out.println("Problem due to improper runtime");
			System.out.println("Execution with default values");
			x=3;
			y=3.2;
		}
		System.out.println("x="+x+"\t y="+y);
	}
}

 

//------------------------------------------------------------------------------

	// If you dont know, which type of exception object will be generated,
	// just use the reference of Exception class, coz it is base of all exceptions.
	// so the program become..

class DemoErrorException
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;

		try
		{
			x=Integer.parseInt(args[0]);
			y=Double.parseDouble(args[1]);
		}
		catch(Exception e)
		{
			System.out.println("Problem due to improper location access");
			System.out.println("Execution with default values");
			x=1;
			y=1.0;
		}

		System.out.println("x="+x+"\t y="+y);
	}
}


//-------------------------------------------------------------------------------------------------

	// If catch unable to collect the generated exception object, then it will be passed to JVM,
	// so to avoid it  multiple catch are implemented with last catch containing exception reference.

class DemoErrorException
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;

		try
		{
			x=Integer.parseInt(args[0]);
			y=Double.parseDouble(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Problem due to improper location access");
			System.out.println("Execution with default values");
			x=1;
			y=1.0;
		}
		catch(Exception e)
		{
			// ......
		}

		System.out.println("x="+x+"\t y="+y);
	}
}

//----------------------------------------------------------------------------------------------------------------------

	/// Extracting the information about the exception from exception object

	There are following different ways
	- user defined message.
	- using getMessage() method
	- By printing exception object directly using println() method. ( Internally e.toString())
	- using printStackTrace() method


class DemoErrorException3
{
	public static void main(String []args)
	{
		String s1="";
		String s2="";
		
		try
		{
			s1=args[0];
			s2=args[1];
		}
		catch(Exception e)
		{
			System.out.println("---------------------------------");
			System.out.println("One: "+e.getMessage());
			System.out.println("---------------------------------");
			System.out.println("Two: "+e);
			System.out.println("---------------------------------");
			System.out.println("Three:");
			e.printStackTrace();
			System.out.println("---------------------------------");
			System.out.println("Four: Index Issue");
			System.out.println("---------------------------------");
		}

		System.out.println("s1="+s1+"\t s2="+s2);
	}
}

Output on Run

---------------------------------
One: Index 0 out of bounds for length 0
---------------------------------
Two: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
---------------------------------
Three:
java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at DemoErrorException3.main(DemoErrorException3.java:10)
---------------------------------
Four: Index Issue
---------------------------------
s1=      s2=
Press any key to continue . . .

//--------------------------------------------------------------------------------------------------------------------------------

	// Lets consider another program which may generate an following exceptions.

	 - NegativeArraySizeException : When we input negative element count
	 - ArrayIndexOutOfBoundsException: when we access the improper location
	 - InputMismatchException: When we input non-numeric value as a element count

import java.util.*;
class ExampleUsingMultipleCatch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter any count: ");
		
		try
		{	int cnt=sc.nextInt();
			int []x=new int[cnt];
			for(int i=0;i<5;i++)
			{
				x[i]=sc.nextInt();
			}
			
			System.out.println("\n Enter any position: ");
			int pos=sc.nextInt();
			System.out.println("\n Value at position: "+x[pos]);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("\n Immproper input: "+ime);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("\n Index Issue: "+ae);			
		}
		catch(Exception e)
		{
			System.out.println("\n Execution problem: "+e);	
		}
		System.out.println("\n End of program");
	}
}

	// Here in this program we handled only two exceptions (InputMismatchException and ArrayIndexOutOfBoundsException)
	// the NegativeArraySizeException is collected in last catch block.

//----------------------------------------------------------------------------------------------


Java finally block: 
-------------------

In Java, the finally block is always executed no matter whether there is an exception or not.
The finally block is optional. And, for each try block, there can be only one finally block.
The finally block is typically used to perform cleanup operations or release resources that need to be executed regardless of whether an exception occurred.

import java.util.Scanner;
class DemoFinally
{
	public static void main(String []args)
	{
		int x,y;
		double z=0.0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any two nos: ");
		x=sc.nextInt();
		y=sc.nextInt();

		try
		{
			z=x/y;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("In Finally block");
		}

		System.out.println(" value of z is: "+z);
	}
}

--------------- Output on Run --------------------

	-- First input set (No Exception) --
	Enter any two nos:
8
3
In Finally block
 value of z is: 2.0

	-- Second input set (With Exception) --
	Enter any two nos:
5
0
java.lang.ArithmeticException: / by zero
        at DemoFinally.main(DemoFinally.java:17)
In Finally block
 value of z is: 0.0
Press any key to continue . . .

//----------------------------------------------------------------------------------------------------------------

import java.util.Random;
public class RandomLocationAccessFromArray 
{
    public static void main(String[] args) 
	{
		int []x={11,23,45,67,78,23,5,67,98,23,45,89,34,23,45,67};
		System.out.println("Array Size: "+x.length);
        Random random = new Random();
        
		for(int i=0 ; i<10 ; i++)
		{
			int r = random.nextInt(30);
			try
			{
				System.out.print(x[r]);
			}
			catch(Exception e)
			{
				System.out.print("-");
			}
			finally
			{
				System.out.println("  :Random Location: "+r);
			}
		}
		System.out.println("End of Program");
    }
}


//----------------------------------------------------------------------------------------------------------------

	// Using try finally 

	- You are allowed to use try-finally pair, but note that the finally will not collect exception object, the 
	  program will terminate once exception will be there, but before that it will execute the finally block.


import java.util.Random;

public class RandomLocationAccessFromArray 
{
	public static void main(String[] args) 
	{
		int []x={11,23,45,67,78,23,5,67,98,23,45,89,34,23,45,67};
		System.out.println("Array Size: "+x.length);
        	Random random = new Random();
        
		for(int i=0 ; i<10 ; i++)
		{
			int r = random.nextInt(30);
			try
			{
				System.out.print(x[r]);
			}
			finally
			{
				System.out.println("  :Random Location: "+r);
			}
		}
		System.out.println("End of Program");
    }
}

//------------------------------------------------------------------------------------------------------------------------

	// Manually generated exceptions: 

	// WE have to write a program to accept the student data for a job application, but condition is that the 
	// age must be in the defined age window. and that is 21 to 29.


	Using throw Keyword: In Java, the throw statement is used to explicitly throw an manually generated  exception. 
			     This allows you to create and throw your own exceptions exceptions that may or may not be 
			     caught in your code. 

			     if it is not within the try block, then that exception object thrown towards JVM, which will
			     terminates the execution after displaying the message.

			     if you want to avoid the abnormal termination, just use the try-catch block as used in the 
			     above programs


import java.util.Scanner;
class FillForm
{
	private int id;
	private int age;
	private String name;
	private double sp;
	private double hp;
	private double gp;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name: ");
		name=sc.nextLine();
		System.out.println("Enter the student ID: ");
		id=sc.nextInt();
		System.out.println("Enter the student age: ");
		age=sc.nextInt();
		if(age<21 || age>29)
		{
			throw new NumberFormatException();
		}
		System.out.println("Enter the ssc percentage : ");
		sp=sc.nextDouble();
		System.out.println("Enter the hsc percentage : ");
		hp=sc.nextDouble();
		System.out.println("Enter the final year percentage : ");
		gp=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("Percentage SSC: "+sp+"\t HSC: "+hp+"\t Final: "+gp);
	}
}

class JobApplication
{
	public static void main(String []args)
	{
		FillForm ob=new FillForm();
		ob.input();
		ob.display();
	}
}


	----------- output on Run (when age is not within mentioned age window)  -----------

	Enter the student name:
milind
Enter the student ID:
12
Enter the student age:
45
Exception in thread "main" java.lang.NumberFormatException
        at FillForm.input(JobApplication.java:22)
        at JobApplication.main(JobApplication.java:45)
Press any key to continue . . .


//--------------------------------------------------------------------------------------------------------------------------

	// We have achived the things, which we have decided. but we cant get the exact message or a proper message.
	// for that we need to set the message at the time of object creation. and that is as shown

		if(age<21 || age>29)
		{
			throw new NumberFormatException("Age is not within age window");
		}

	then we will get the message as

Enter the student name:
arun
Enter the student ID:
11
Enter the student age:
67
Exception in thread "main" java.lang.NumberFormatException: Age is not within age window
        at FillForm.input(JobApplication.java:22)
        at JobApplication.main(JobApplication.java:45)
Press any key to continue . . .

///----------------------------------------------------

	// We can write the code as shown also


		if(age<21)
		{
			throw new NumberFormatException("Age is less to apply for the Job");
		}
		else if(age>29)
		{
			throw new NumberFormatException("Age is more than expected to apply for the Job");
		}

	than we will get the message as..

	---- Run 1: when age is less than 21 -----

Enter the student name:
kiran
Enter the student ID:
45
Enter the student age:
12
Exception in thread "main" java.lang.NumberFormatException: Age is less to apply for the Job
        at FillForm.input(JobApplication.java:22)
        at JobApplication.main(JobApplication.java:49)
Press any key to continue . . .


	---- Run 2: when age is greater than 29 -----

Enter the student name:
kunal
Enter the student ID:
23
Enter the student age:
45
Exception in thread "main" java.lang.NumberFormatException: Age is more than expected to apply for the Job
        at FillForm.input(JobApplication.java:26)
        at JobApplication.main(JobApplication.java:49)
Press any key to continue . . .


//--------------------------------------------------------------------------------------------------------------------

	// Handling the manualy generated exception

import java.util.Scanner;
class FillForm
{
	private int id;
	private int age;
	private String name;
	private double sp;
	private double hp;
	private double gp;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name: ");
		name=sc.nextLine();
		System.out.println("Enter the student ID: ");
		id=sc.nextInt();
		System.out.println("Enter the student age: ");
		age=sc.nextInt();
		if(age<21)
		{
			throw new NumberFormatException("Age is less to apply for the Job");
		}
		else if(age>29)
		{
			throw new NumberFormatException("Age is more than expected to apply for the Job");
		}
		System.out.println("Enter the ssc percentage : ");
		sp=sc.nextDouble();
		System.out.println("Enter the hsc percentage : ");
		hp=sc.nextDouble();
		System.out.println("Enter the final year percentage : ");
		gp=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("Percentage SSC: "+sp+"\t HSC: "+hp+"\t Final: "+gp);
	}
}

class JobApplicationwithTryCatch
{
	public static void main(String []args)
	{
		FillForm ob=new FillForm();
		try
		{
			ob.input();
		}
		catch (Exception e)
		{
			System.out.println("Problem Due to: "+e.getMessage());
		}
		ob.display();
		System.out.println("End of Program");
	}
}

//---------------------------------------------------------------------------------------------------------------------------

	// Using throws keyword:

In Java, the throws clause is used in a method signature to declare that the method may throw certain types of exceptions. This provides information to the caller of the method about the potential exceptions that need to be handled. The throws clause is used to delegate the responsibility of exception handling to the calling code.

	- You can declare multiple exceptions in the throws clause, separating them with commas.
	- Checked exceptions (those that extend Exception but not RuntimeException) must be declared
 	  in the throws clause. Unchecked exceptions (those that extend RuntimeException) do not need
 	  to be declared.
	- If a method declares that it throws an exception, means it is not handing it. It is just to
	  inform to the caller about the his responsibility.
	- Methods are not required to declare unchecked (runtime) exceptions in the throws clause. 

class Number
{
	private int x;
	private int y;
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int getDiv()
	{
		return (x/y);
	}
}
class MainNumberExample
{
	public static void main(String []args)
	{
		Number ob=new Number();
		
		ob.setx(10);
		//ob.sety(0); // will generate an exception (java.lang.ArithmeticException: / by zero)
		ob.sety(4);
		System.out.println("Division is: "+ob.getDiv());		
	}
}



	Note that as the ArithmeticException is child of RuntimeException(Unchecked Exception) it is not expected
	to declare ed as thrown using throws keyword. but if it throwing an checked exception(IOException) then


import java.io.IOException;
class Number
{
	private int x;
	private int y;
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int getDiv() throws ArithmeticException, IOException
	{
		return (x/y);
	}
}
class MainNumberExample
{
	public static void main(String []args)
	{
		Number ob=new Number();
		
		ob.setx(10);
		//ob.sety(0); // will generate an exception (java.lang.ArithmeticException: / by zero)
		ob.sety(4);
		System.out.println("Division is: "+ob.getDiv());		
	}
}

----- Output on Compile --------
MainNumberExample.java:28: error: unreported exception IOException; must be caught or declared to be thrown
                System.out.println("Division is: "+ob.getDiv());
                                                            ^
1 error
Press any key to continue . . .


So we have suggested that, either use try-catch or use throws clause for the caller, then lets rewrite the program.

	1. implementing the try-catch
	----------------------------

import java.io.IOException;
class Number
{
	private int x;
	private int y;
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int getDiv() throws ArithmeticException, IOException
	{
		return (x/y);
	}
}
class MainNumberExample
{
	public static void main(String []args)
	{
		Number ob=new Number();
		
		ob.setx(10);
		//ob.sety(0); // will generate an exception (java.lang.ArithmeticException: / by zero)
		ob.sety(4);
		
		try
		{
			System.out.println("Division is: "+ob.getDiv());
		}
		catch (Exception e){}
	}
}


//------------------------------------------------------

	2.  declaring as thrown using throws keyword


import java.io.IOException;
class Number
{
	private int x;
	private int y;
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int getDiv() throws ArithmeticException, IOException
	{
		return (x/y);
	}
}
class MainNumberExample
{
	public static void main(String []args) throws IOException
	{
		Number ob=new Number();
		
		ob.setx(10);
		//ob.sety(0); // will generate an exception (java.lang.ArithmeticException: / by zero)
		ob.sety(4);
		System.out.println("Division is: "+ob.getDiv());	
		
		System.out.println("End of Program");
	}
}

//------------------------------------------------------------------------------------------------------------------------------

	// Nesting of try-catch block

		Nesting refers to using try-catch within try or catch or in both.

		
import java.util.Scanner;
class MyArray
{
	private int []x;
	private int cnt;
	public void input()
	{
		Scanner sc=new Scanner(System.in);

		try
		{
			System.out.println("Enter the element count: ");
			cnt=sc.nextInt();
			x=new int[cnt];

			try
			{
				System.out.println("Enter the "+cnt+" Numbers: ");
				for(int i=0;i<5;i++)
				{
					x[i]=sc.nextInt();
				}
			}
			catch(NegativeArraySizeException e)
			{
				System.out.println("One");
				e.printStackTrace();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Two");
			e.printStackTrace();
		}
	}
	public void display()
	{
		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
	}
}

class NestedTryCatchExample
{
	public static void main(String []args)
	{
		MyArray ob=new MyArray();

		try
		{
			ob.input();
		}
		catch(Exception e)
		{
			System.out.println("Three");
			e.printStackTrace();
		}
		ob.display();
		System.out.println("End of Program");
	}
}

///---------------------------------------------------------------------------------------------------------------------------------

	/// User-defined Exception: 

	Java allows you to define your own exception class, to get the basic features of exception, user-defined exception class
	must extends the java.lang.Exception class.

import java.util.Scanner;
class AgeException extends Exception
{
	private String msg;
	public AgeException()
	{
		super("Age Issue");
	}
	public AgeException(String message)
	{
		super(message);
		msg=message;
	}
	public String toString()
	{
		return "As Per the Application Demand the problem due to: "+msg;
	}
}

class FillForm
{
	private int id;
	private int age;
	private String name;
	private double sp;
	private double hp;
	private double gp;
	
	public void input() throws AgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name: ");
		name=sc.nextLine();
		System.out.println("Enter the student ID: ");
		id=sc.nextInt();
		System.out.println("Enter the student age: ");
		age=sc.nextInt();
		if(age<21)
		{
			throw new AgeException("Age is less to apply for the Job");
		}
		else if(age>29)
		{
			throw new AgeException("Age is more than expected to apply for the Job");
		}
		System.out.println("Enter the ssc percentage : ");
		sp=sc.nextDouble();
		System.out.println("Enter the hsc percentage : ");
		hp=sc.nextDouble();
		System.out.println("Enter the final year percentage : ");
		gp=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("Percentage SSC: "+sp+"\t HSC: "+hp+"\t Final: "+gp);
	}
}

class JobApplicationWithUDE
{
	public static void main(String []args)
	{
		FillForm ob=new FillForm();
		try
		{
			ob.input();
		}
		catch (Exception e)
		{
			System.out.println("------------------------------------------------------------");
			System.out.println("1. Problem Due to: "+e.getMessage());
			System.out.println("------------------------------------------------------------");
			System.out.println("2. Exception info - "+e);
			System.out.println("------------------------------------------------------------");
			System.out.println("3. Exception info - ");
			e.printStackTrace();
			System.out.println("------------------------------------------------------------");
		}
		ob.display();
		System.out.println("End of Program");
	}
}


///----------------------------------------------------------------------------------------------------------------------------------

	// Some practic exampes of userdefined exceptions

Example 1: In this example, we have created a custom exception class NegativeBalanceException, which extends Exception, as well as a class BankAccount, which includes a withdrawal method. If the balance is less than the amount withdrawn, an instance of NegativeBalanceException with an error message is thrown. The exception is then caught and the error message is printed in the main method.

class NegativeBalanceException extends Exception 
{
    	public NegativeBalanceException(String message) 
	{
        	super(message);
    	}
}
class BankAccount 
{
	private double balance;
    	public BankAccount(double balance) 
	{
        	this.balance = balance;
    	}
    	public double getBalance()
	{
        	return balance;
    	}
	public void withdraw(double amount) throws NegativeBalanceException 
	{
        	if (balance - amount < 0) 
		{
            		throw new NegativeBalanceException("Insufficient funds to withdraw " + amount + " rs.");
        	} 
		else 
		{
            		balance -= amount;
        	}
    	}
}
class Main 
{
	public static void main(String[] args) 
	{
        	BankAccount ba = new BankAccount(100);
        	try 
		{
            		ba.withdraw(200);
        	} 
		catch (NegativeBalanceException ex) 
		{
            		System.out.println(ex.getMessage());
        	}

        	System.out.println("Remaining balance: " + ba.getBalance());
    	}
}

//----------------------------------------------------------------------------------------------------------------

// Example 2: User Defined exception in java for Validating Login Credentials

class InvalidCredentialsException extends Exception 
{
    	public InvalidCredentialsException(String message) 
	{
        	super(message);
    	}
}

class Login 
{
    	private String username;
    	private String password;

   	public Login(String username, String password) throws InvalidCredentialsException 
	{
        	if (username == null || username.isEmpty()) 
		{
            		throw new InvalidCredentialsException("Username cannot be null or empty.");
        	}

        	if (password == null || password.isEmpty()) 
		{
            		throw new InvalidCredentialsException("Password cannot be null or empty.");
        	}

        	this.username = username;
        	this.password = password;
    	}

    	public boolean validate()
	{
        	// Check the username and password against a database or other sources
        	return true;
    	}
}

class MainLoginApplication 
{
    	public static void main(String[] args) 
	{
        	try 
		{
            		Login login = new Login("", "password");
       	 	} 
		catch (InvalidCredentialsException ex) 
		{
            		System.out.println(ex.getMessage());
       		}

		//-----------------

       		try 
		{
        		Login login = new Login("username", "");
        	} 
		catch (InvalidCredentialsException ex) 
		{
            		System.out.println(ex.getMessage());
        	}
		
		//-----------------

        	try 
		{
            		Login login = new Login("username", "password");
           		if (login.validate()) 
			{
                		System.out.println("Login successful.");
           		} 
			else 
			{
                		System.out.println("Login failed.");
            		}
        	} 
		catch (InvalidCredentialsException ex) 
		{
            		System.out.println(ex.getMessage());
        	}
    	}
}

//------------------------------------------------------------------------------------------------

	// Example 3: User Defined exception in java for Validity of an Entity

class InvalidEntityException extends Exception 
{
	public InvalidEntityException(String message) 
	{
        	super(message);
    	}
}

class Entity 
{
	private String name;
    	private int age;

    	public Entity(String name, int age) throws InvalidEntityException 
	{
        	if (name == null || name.isEmpty()) 
		{
            		throw new InvalidEntityException("Name cannot be null or empty.");
        	}

        	if (age < 0) 
		{
            		throw new InvalidEntityException("Age cannot be negative.");
        	}

        	this.name = name;
        	this.age = age;
    	}

    	public String getName() 
	{
        	return name;
    	}

    	public int getAge() 
	{
        	return age;
    	}
}

class MainEntityCheck
{
    	public static void main(String[] args) 
	{
        	try 
		{
            		Entity e = new Entity("John", -30);
        	} 
		catch (InvalidEntityException ex) 
		{
            		System.out.println(ex.getMessage());
        	}

        	try 
		{
            		Entity e = new Entity("", 25);
        	} 
		catch (InvalidEntityException ex) 
		{
            		System.out.println(ex.getMessage());
        	}

       	 	try 
		{
            		Entity e = new Entity("Jane", 30);
            		System.out.println("Name: " + e.getName());
            		System.out.println("Age: " + e.getAge());
        	} 
		catch (InvalidEntityException ex) 
		{
            		System.out.println(ex.getMessage());
        	}
   	}
}	

//--------------------------------------------------------------------------------------

	// Example 4: User Defined exception in java for Validating the age of user

class InvalidAgeException extends Exception 
{
    	public InvalidAgeException(String message) 
	{
        	super(message);
    	}
}

class User 
{
    	private int age;
    	public User(int age) throws InvalidAgeException 
	{
       		if (age < 0) 
		{
            		throw new InvalidAgeException("Age cannot be negative.");
        	}

        	if (age > 150) 
		{
            		throw new InvalidAgeException("Age is too high.");
        	}
	        this.age = age;
   	}
}

class Main 
{
    	public static void main(String[] args) 
	{
        	try 
		{
            		User user = new User(-1);
        	} 
		catch (InvalidAgeException ex) 
		{
            		System.out.println(ex.getMessage());
        	}

        	try 
		{
            		User user = new User(151);
        	} 
		catch (InvalidAgeException ex) 
		{
            		System.out.println(ex.getMessage());
        	}

        	try 
		{
            		User user = new User(30);
            		System.out.println("Age is valid.");
        	} 
		catch (InvalidAgeException ex) 
		{
            		System.out.println(ex.getMessage());
        	}
    	}
}


///==============================================================================================================================
///==============================================================================================================================

	// Concurrent Programming in Java ( // remaining: Java Shutdown Hook and Runtime class)

		- Concurrent means operating or occurring at the same time.

Why to go for the concurrent programming? 
-------------------------------------------
	- Improved Performance: Utilizes available computational resources efficiently, leading to faster 
	  execution times.

	- Enhanced Responsiveness: Allows systems to remain responsive even during time-consuming operations, 
	  crucial for user-facing applications.

	- Better Resource Utilization: Maximizes CPU and I/O resources by overlapping computation with I/O 
	  operations or executing tasks concurrently.

	- Scalability: Enables systems to handle increasing workloads by distributing tasks across multiple 
	  threads or processes.

	- Parallelism: Provides multi-core processors to execute multiple tasks simultaneously, speeding 
	  up processing for computationally intensive tasks.

	- Fault Isolation: Contains errors within separate threads or processes, preventing them from affecting 
	  the entire system and enhancing reliability.

	- Modularity and Maintainability: Encourages modular software design, making systems easier to understand,
	  maintain, and modify.


what is thread and what is process.
------------------------------------
A process and a thread are both independent sequences of execution, but they differ in a few key ways:

Process: A process is an instance of a program that is being executed. It includes the program itself, data,
resources such as files, and execution info such as process relation information kept by the OS. Each process 
exists within its own address or memory space and does not share it with other processes. 

Thread: A thread is a segment of a process or a part of process, which means a process can have multiple threads. These threads 
are managed independently by the scheduler. Unlike processes, threads within the same process run in a shared memory space. 

Here are some key differences between a process and a thread:

- A process takes more time to terminate and create, while a thread takes less time, as the process is heavyweight 
  and thread is lightweigth.
- Processes having different memory area, where as the threads shares the same memory space.
- Processes do not share data with each other, while threads share data with each other.
- You can say that Procsess is Heavyweigth Thread and Thread is ligthweight Process.
- Interthread communication is quite easy coz threades are within same memory area.
- InterProcess communication is complex as they are processes exists within different memory space.


//-----------------------------------------------

What is Single Thread?
A single thread in Java is basically a lightweight and the smallest unit of processing, which will execute all its 
instructions in sequence. 

Advantages of single thread:
	- Reduces overhead in the application as single thread execute in the system
	- Also, it reduces the maintenance cost of the application.

What is Multithreading in Java?
Multithreading in Java is a process of executing two or more threads simultaneously to maximum utilization of CPU.
where java allows user to split the code into two or more parts and provides the ability to execute them in parallel
with each other.

Advantages of multithread:
	- The users are not blocked because threads are independent, and we can perform multiple operations at times
	- As such the threads are independent, the other threads won’t get affected if one thread meets an exception.

so in simple terms, Multithreading is a programming concept in which the application can create a small unit of tasks to execute in parallel. If you are working on a computer, it runs multiple applications and allocates processing power to them. A simple program runs in sequence and the code statements execute one by one. This is a single-threaded application. But, if the programming language supports creating multiple threads and passes them to the operating system to run in parallel, it’s called multithreading.

Multithreading vs Multiprocessing:

Multiprocessing refers to the use of multiple processors or processor cores within a single computer system to execute multiple tasks concurrently. It is a technique used to improve the performance and scalability of software systems by distributing computational workload across multiple processing units.
When we talk about multithreading, we don’t care if the machine has a 2-core processor or a 16-core processor. Our work is to create a multithreaded application and let the OS handle the allocation and execution part. In short, multithreading has nothing to do with multiprocessing.

//-------------------------------------------------

How does Java Support Multithreading?
Java has great support for multithreaded applications. Java supports multithreading through Thread, then How to 
create the threads?
	
In Java, There are two different ways of Thread creation.
	 - By extending Thread class.
	 - By implementing Runnable Interface

What are the different types of threads?
There are two types of threads in an application - user thread and daemon thread. When we start an application, the main is the first user thread created. We can create multiple user threads as well as daemon threads. When all the user threads are executed, JVM terminates the program.
//-----------------------------------------------

Thread Lifecycle:
 
	New Born
	    |
	    | start()
	    V
      Ready to Run <-------------
	(Runnable)		|
	    |			| - resume()
   run()    |			|
 |--------->|		  Waiting/Blocked
 |	    V			^
 |<-----Running ------>---------|
	    |      sleep(), join() - will enters into Runnable state automatically
      stop()|	   - suspend()
   destroy()|
 interrupt()|
	    V
	  Dead
	    

 - New: In this phase, the thread is created using class “Thread class”.It remains in this state till the program starts the thread. It is also known as born thread.

 - Runnable: In this page, the instance of the thread is invoked with a start method. The thread control is given to scheduler to finish the execution. It depends on the scheduler, whether to run the thread.

 - Running: When the thread starts executing, then the state is changed to “running” state. The scheduler selects one thread from the thread pool, and it starts executing in the application.

 - Waiting/Blocked: This is the state when a thread has to wait. As there multiple threads are running in the application, there is a need for synchronization between threads. Hence, one thread has to wait, till the other thread gets executed. Therefore, this state is referred as waiting state.

 - Dead: This is the state when the thread is terminated. The thread is in running state and as soon as it completed processing it is in “dead state”.

//-------------------------------------------------------------------------------------------------------------------------

	// Creating Threads Using java.lang.Thread class.

	// Thread class Constants: 
	
	
	In Java, the java.lang.Thread class provides several constants. Here's a list of some of the important constants 
	in the Thread class:

	- MIN_PRIORITY: The minimum priority that a thread can have. Its value is 1.
	- NORM_PRIORITY: The default priority of a thread. Its value is 5.
	- MAX_PRIORITY: The maximum priority that a thread can have. Its value is 10.

	These constants are typically used when setting or getting the priority of a thread using the setPriority() 
	and getPriority() methods. default priority is 5. i.e. NORM_PRIORITY


	// Thread class Constructors: 


	In the java.lang.Thread class, there are several constructors available for creating a new thread instance. 
	Here's a list of constructors:

	$- Thread(): Constructs a new thread instance.
	$- Thread(Runnable target): Constructs a new thread with the specified Runnable target.
	$- Thread(ThreadGroup group, Runnable target): Constructs a new thread with the specified ThreadGroup and Runnable target.
	$- Thread(String name): Constructs a new thread with the specified name.
	$- Thread(ThreadGroup group, String name): Constructs a new thread with the specified ThreadGroup and name.
	$- Thread(Runnable target, String name): Constructs a new thread with the specified Runnable target and name.
	$- Thread(ThreadGroup group, Runnable target, String name): Constructs a new thread with the specified ThreadGroup, 
		Runnable target, and name.
	- Thread(ThreadGroup group, Runnable target, String name, long stackSize): Constructs a new thread with the specified
		ThreadGroup, Runnable target, name, and stack size.



	// Thread class methods: 
	
	The java.lang.Thread class in Java provides a variety of methods for managing threads. Here's a list of some of the 
	commonly used methods in the Thread class:

	$- start(): Causes this thread to begin execution. The Java Virtual Machine calls the run method of this thread.
	$- run(): If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is 		 
		called; otherwise, this method does nothing and returns.
	$- sleep(long millis): Causes the currently executing thread to sleep (temporarily cease execution) for the specified 
		number of milliseconds.
	- interrupt(): Interrupts this thread.
	- isInterrupted(): Tests whether this thread has been interrupted.
	- join(): Waits for this thread to die.
	$- setName(String name): Changes the name of this thread to the specified name.
	$- getName(): Returns the name of this thread.
	$- getPriority(): Returns the priority of this thread.
	$- setPriority(int priority): Changes the priority of this thread.
	$- getId(): return int id of thread.
	- isAlive(): Tests whether this thread is alive.
	- yield(): Causes the currently executing thread object to temporarily pause and allow other threads to execute.
	- currentThread(): Returns a reference to the currently executing thread object.
	- isDaemon(): Tests if this thread is a daemon thread.
	- setDaemon(boolean on): Marks this thread as either a daemon thread or a user thread.


	// Creating mutiple threads of same thread class

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i);
			try{Thread.sleep(600);}catch(Exception e){}
		}
	}
}

class MainConProgClass
{
	public static void main(String []args)
	{
		DemoThread ob1=new DemoThread();
		ob1.start();

		DemoThread ob2=new DemoThread();
		ob2.start();
	}
}


//----------------------------------------------------------------------------

// Creating threads of mutiple thread classes

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i);
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hi: "+i);
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}
class MainConProgClass1
{
	public static void main(String []args)
	{
		DemoThread ob1=new DemoThread();
		ob1.start();

		SampleThread ob2=new SampleThread();
		ob2.start();
	}
}

//------------------------------------------

	// getting default name of threads

class DemoThread extends Thread
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i+" - "+getName());
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hi: "+i+" - "+getName());
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}
class MainConProgClass1
{
	public static void main(String []args)
	{
		DemoThread ob1=new DemoThread();
		ob1.start();

		SampleThread ob2=new SampleThread();
		ob2.start();

		SampleThread ob3=new SampleThread();
		ob3.start();
	}
}

Note that, In absence any name assigned to thread the default names are given like Thread-0, Thread-1, Thread-2 ...

//-----------------------------------------------------
	
	// Using setName(), getName(), setPririty(), getPriotity(), getId() and Thread(String)


class DemoThread extends Thread
{
	public DemoThread(String name)
	{
		super(name);
		setPriority(6);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(getId()+" - Hello: "+i+" - "+getName()+" - with Priority: "+getPriority());
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(getId()+" - Hi: "+i+" - "+getName()+" - with Priority: "+getPriority());
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}
class MainConProgClass1
{
	public static void main(String []args)
	{
		DemoThread ob1=new DemoThread("HelloThread");
		ob1.start();

		SampleThread ob2=new SampleThread();
		ob2.setName("HiThread");
		ob2.setPriority(Thread.MAX_PRIORITY);
		ob2.start();
	}
}

//----------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------

	// Using Runnable Interface to create the Threads

class Demo implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i);
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}

class MainConProgClass
{
	public static void main(String []args)
	{
		Thread ob1=new Thread(new Demo());
		ob1.start();

		Thread ob2=new Thread(new Demo());
		ob2.start();
	}
}

//--------------------------------------------------------------------------------------------

class DemoThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i);
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class SampleThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello: "+i);
			try{Thread.sleep(70);}catch(Exception e){}
		}
	}
}

class MainConProgClass
{
	public static void main(String []args)
	{
		Thread ob1=new Thread(new DemoThread());
		ob1.start();

		Thread ob2=new Thread(new SampleThread());
		ob2.start();
	}
}

//--------------------------------------------------------------------------------------------

	// Using currentThread() method:


class DemoThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Thread t=Thread.currentThread();
			System.out.println(t.getId()+" - Hello: "+i+" - "+t.getName()+" - with Priority: "+t.getPriority());
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class MainConProgClass2
{
	public static void main(String []args)
	{
		DemoThread ob1=new DemoThread();
		Thread t1=new Thread(ob1);
		t1.setName("HelloThread");
		t1.start();
		
		Thread t2=new Thread(new DemoThread());
		t2.setName("HiThread");
		t2.setPriority(7);
		t2.start();

		Thread t3=new Thread(new DemoThread());
		t3.setName("ByeThread");
		t3.setPriority(3);
		t3.start();
	}
}

//----------------------------------------------------------------------------------------------------------------------

	// Another ways of creating thread using the Runnable interface

class MyRunnable implements Runnable
{
	private Thread t;
	public MyRunnable(){}
	public MyRunnable(String name, int priority)
	{
		t=new Thread(this,name);
		t.setPriority(priority);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(t.getName()+" - "+t.getPriority()+" - "+t.getThreadGroup());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}
class YourRunnable implements Runnable
{
	private Thread t;
	public YourRunnable(){}
	public YourRunnable(String name, int priority)
	{
		t=new Thread(this,name);
		t.setPriority(priority);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(t);
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}
class MainRunnableExample
{
	public static void main(String []args)
	{
		MyRunnable ob1=new MyRunnable("One",7);
		YourRunnable ob2=new YourRunnable("Two",4);
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority()+" - "+Thread.currentThread().getThreadGroup());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------

	// Creating Thread using anonymous class

class ThreadUsingAnonymousClass 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread());
					try{Thread.sleep(400);}catch(Exception e){}
				}
			}
		});
		t1.setName("one");
		t1.start();

		Thread t2=new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread());
					try{Thread.sleep(300);}catch(Exception e){}
				}
			}
		});
		t2.setName("two");
		t2.start();
	}
}

//---------------------------------------------------------------------------------------------------------------------------

	// Creating The Thread Group: 

A thread group represents a set of threads. In addition, a thread group can also include other thread groups. The thread groups form a tree in which every thread group except the initial thread group has a parent.
A thread is allowed to access information about its own thread group, but not to access information about its thread group's parent thread group or any other thread groups.

class FirstThread extends Thread
{
	public FirstThread(ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}

class SecondThread extends Thread
{
	public SecondThread(ThreadGroup tg, String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}
class ThreadGroupDemo
{
	public static void main(String []args)
	{
		ThreadGroup tg=new ThreadGroup("MyThreadGroup");

		FirstThread t1=new FirstThread(tg,"One");
		t1.start();

		SecondThread t2=new SecondThread(tg,"Two");
		t2.start();

		for(int i=0;i<40;i++)
		{
			System.out.println("Active Thread Count: "+tg.activeCount());
			System.out.println(Thread.currentThread());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}

//-----------------------------------------------------------------------------------------------------------------

	// Another example of Thread Group using runnable interface

class FirstThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}

class SecondThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}
class ThreadGroupDemo1
{
	public static void main(String []args)
	{
		ThreadGroup tg=new ThreadGroup("MyThreadGroup");

		Thread t1=new Thread(tg, new FirstThread());
		t1.setName("One");
		t1.start();

		
		Thread t2=new Thread(tg, new SecondThread(),"Two");
		t2.start();

		for(int i=0;i<40;i++)
		{
			System.out.println("Active Thread Count: "+tg.activeCount());
			System.out.println(Thread.currentThread());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}

//-----------------------------------------------------------------------------------------------------------------------

	// Using isAlive() and join() method from Thread class.


	- isAlive(): This method is used to check whether a thread is still active or has terminated. It returns true if 
		     the thread upon which it is called is still running, and false otherwise. A thread is considered alive 
		     from the moment it's started using the start() method until it completes its execution or is terminated 
		     using the stop().

	- join(): This method allows one thread to wait for the completion of another thread. When you call join() on a thread, 
		  the current thread (the one calling join()) will wait until the thread it's called on completes its execution. 
		  If the thread is already completed, join() returns immediately. If not, it blocks the current thread until the
		  thread being joined completes.


class FirstThread extends Thread
{
	public FirstThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}

class SecondThread extends Thread
{
	public SecondThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}
class IsAliveAndJoinDemo
{
	public static void main(String []args)
	{

		FirstThread t1=new FirstThread("One");
		t1.start();

		SecondThread t2=new SecondThread("Two");
		t2.start();

		System.out.println("T1 is alive: "+t1.isAlive());
		System.out.println("T2 is alive: "+t2.isAlive());
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try{Thread.sleep(400);}catch(Exception e){}
			if(i==10)
			{
				try{t1.join();}catch(Exception e){}
			}
		}
		
		System.out.println("T1 is alive: "+t1.isAlive());
		System.out.println("T2 is alive: "+t2.isAlive());
	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	Review - Different ways of creating a Threads

/*

	// Using Thread class

class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hello");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}
class  MyThreadExample
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}

//---------------------------------------------------------------------


	// Using Thread class (anonymous)

class MyThreadExample
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread()
		{
			public void run()
			{
				try
				{
					for(int i=0;i<20;i++)
					{
						System.out.println("Hello");
						Thread.sleep(300);
					}
				}
				catch (Exception e)
				{
				}
			}
		};
		t1.start();
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}

//------------------------------------------------------------------------------------

	// Using Runnable Interface

class MyThread implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hello");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}
class MyThreadExample
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new MyThread());
		t1.start();
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}

//----------------------------------------------------------------------------------------


	// Using Runnable Interface (anonymous)

class MyThreadExample
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Runnable(){
			public void run()
			{
				try
				{
					for(int i=0;i<20;i++)
					{
						System.out.println("Hello");
						Thread.sleep(300);
					}
				}
				catch (Exception e)
				{
				}
			}
		});
		t1.start();
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}

//-----------------------------------------------------------------------------------------

	
	// Using Runnable Interface (Different manner)

class MyThread implements Runnable
{
	Thread t;
	public MyThread()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hello");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}
class MyThreadExample
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//------------------------------------------------------------------------------------------------------------------------
	// Suspend and resume() methods:

	- Suspend() method puts thread from running to waiting state. And thread can go from waiting to runnable state only 
		    when resume() method is called on thread. Suspend method is deprecated method.
	- Resume() method is only used with suspend() method that’s why it’s also deprecated method.

	Suspend() and remove() are deprecated methods and marked for removal because if not used properly they might lead to deadlock.

//-------------------------------------------------------------------------------------------------------------------------

	// Using interrupt() method: 

		- used to interrupt an executing Thread and for that it will set interrupt status true.
		- interrupt() method will work when thread is in sleeping or waiting state.
		- when thread is not in sleeping or waiting state then caling the interrupt() method wil perform normal behavior.
		- when we use an interrupt() method, it throws an InterruptedException, and then thread execution is terminated.



class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(i + " - "+this);
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class InterruptExample 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		try{Thread.sleep(7000);}catch(Exception e){}
		t1.interrupt();
	}
}

------------- output on Run ------------------

0 - Thread[#20,Thread-0,5,main]
1 - Thread[#20,Thread-0,5,main]
2 - Thread[#20,Thread-0,5,main]
3 - Thread[#20,Thread-0,5,main]
4 - Thread[#20,Thread-0,5,main]
5 - Thread[#20,Thread-0,5,main]
6 - Thread[#20,Thread-0,5,main]
java.lang.InterruptedException: sleep interrupted
        at java.base/java.lang.Thread.sleep0(Native Method)
        at java.base/java.lang.Thread.sleep(Thread.java:509)
        at MyThread.run(InterruptExample.java:10)
Press any key to continue . . .

//-------------------


	// interrupted() and isInterrupted():

		- Both returns true when thread is interrupted, otherwise both will return false.
		- Note that the call to interrupt() method will generates the InterruptedException only when the interrupt status
		  is ture.
		- Difference is that interrupted() method chages the interrupted status from true to false but isInterrupted()
		  does not affact the interrupted status.
		- interrupted() will change the result, but isInterrupted() wil not change the result if called twice.
		- method signature: 
			- public static boolean interrupted()
			- public boolean isInterrupted()
			



	// When isInterrupted() used

class MyThread extends Thread
{
	public void run()
	{
		System.out.println(" Is Interrupted: "+this.isInterrupted());
		// as the interrupted status true and isInterrupted() will not modify it
		// the InterrupedException is generated and the Thread will be terminated
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(i + " - "+this);
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class InterruptExample1
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		t1.interrupt();
	}
}

// ----------------- Output on Run -------------------
 Is Interrupted: true
0 - Thread[#20,Thread-0,5,main]
java.lang.InterruptedException: sleep interrupted
        at java.base/java.lang.Thread.sleep0(Native Method)
        at java.base/java.lang.Thread.sleep(Thread.java:509)
        at MyThread.run(InterruptExample1.java:14)
Press any key to continue . . .

//--------------------------------------------------------------------------------------------------------------------------------

	// When interrupted() used

class MyThread extends Thread
{
	public void run()
	{
		System.out.println(" Interrupted: "+Thread.interrupted());
		// The interrupted status true initialy and when interrupted() is called it
		// will modify interrupted status and will set to false so the InterrupedException 
		//is not generated and the Thread will be not terminated
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(i + " - "+this);
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class InterruptExample1
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		t1.interrupt();
	}
}

// ----------------- Output on Run -------------------
 Interrupted: true
0 - Thread[#20,Thread-0,5,main]
1 - Thread[#20,Thread-0,5,main]
2 - Thread[#20,Thread-0,5,main]
3 - Thread[#20,Thread-0,5,main]
4 - Thread[#20,Thread-0,5,main]
5 - Thread[#20,Thread-0,5,main]
6 - Thread[#20,Thread-0,5,main]
7 - Thread[#20,Thread-0,5,main]
8 - Thread[#20,Thread-0,5,main]
9 - Thread[#20,Thread-0,5,main]
10 - Thread[#20,Thread-0,5,main]
11 - Thread[#20,Thread-0,5,main]
12 - Thread[#20,Thread-0,5,main]
13 - Thread[#20,Thread-0,5,main]
14 - Thread[#20,Thread-0,5,main]
Press any key to continue . . .


//----------------------------------------------------------------------------------------------------------------

	// Note carefully that, interrupt() will only set the interrupted status from true to false

class MyThread extends Thread
{
	public void run()
	{
		System.out.println(" Interrupted: "+Thread.interrupted()); // ture --> false
		//System.out.println(" Is Interrupted: "+this.isInterrupted());
		// The interrupted status true initialy and when interrupted() is called it
		// will modify interrupted status and will set to false so the InterrupedException 
		//is not generated and the Thread will be not terminated
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(i + " - "+this);
				Thread.sleep(1000);
				System.out.println(" Interrupted: "+Thread.interrupted());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class InterruptExample1
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		t1.interrupt();
	}
}

// ----------------- Output on Run -------------------

 Interrupted: true
0 - Thread[#20,Thread-0,5,main]
 Interrupted: false
1 - Thread[#20,Thread-0,5,main]
 Interrupted: false
2 - Thread[#20,Thread-0,5,main]
 Interrupted: false
3 - Thread[#20,Thread-0,5,main]
 Interrupted: false
4 - Thread[#20,Thread-0,5,main]
 Interrupted: false
5 - Thread[#20,Thread-0,5,main]
 Interrupted: false
6 - Thread[#20,Thread-0,5,main]
 Interrupted: false
7 - Thread[#20,Thread-0,5,main]
 Interrupted: false
8 - Thread[#20,Thread-0,5,main]
 Interrupted: false
9 - Thread[#20,Thread-0,5,main]
 Interrupted: false
10 - Thread[#20,Thread-0,5,main]
 Interrupted: false
11 - Thread[#20,Thread-0,5,main]
 Interrupted: false
12 - Thread[#20,Thread-0,5,main]
 Interrupted: false
13 - Thread[#20,Thread-0,5,main]
 Interrupted: false
14 - Thread[#20,Thread-0,5,main]
 Interrupted: false
Press any key to continue . . .


///-------------------------------------------------------------------------------------------------------------------------------

	// Using the yield() methods:

		- will stops current executing thread and gives chance to other thread.
		- Till Java 5, internally the sleep() was used but from Java 6 Onwords it will informs to scheduler 
		  about the his opinion, but it is decided by scheduler
class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println(i+" - "+this.getName());
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}
class  ThreadYieldExample
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread("One");
		MyThread t2=new MyThread("Two");
		MyThread t3=new MyThread("Three");
		MyThread t4=new MyThread("Four");
		MyThread t5=new MyThread("Five");
		try
		{
			t3.yield();
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch (Exception e)
		{
		}
	}
}

///-------------------------------------------------------------------------------------------------------------------------

Thread Synchronization
------------------------

Synchronization is a process of handling resource accessibility by multiple thread requests. The main purpose of synchronization is to avoid thread interference. 
At times when more than one thread try to access a shared resource, we need to ensure that resource will be used by only one thread at a time. The process by which this is achieved is called synchronization. 

in simple terms, When two or more threads need access to a shared resource, they need some way to ensure that the resource will be used by only one thread at a time. The process by which this is achieved is called synchronization. Java implements synchronization through use of the synchronized keyword.

Why we need Syncronization?
If we do not use syncronization, and let two or more threads access a shared resource at the same time, it will lead to distorted results.

class Message
{
	public void showMessage()
	{
		System.out.println("Hello");
		System.out.println("how");
		System.out.println("are");
		System.out.println("you?");
		try{Thread.sleep(400);}catch(Exception e){}
		System.out.println("all");
		System.out.println("the");
		System.out.println("best");
		System.out.println("-----------");
	}
}
class Friends extends Thread
{
	Message msg;
	public Friends(Message msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			msg.showMessage();
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class Relatives extends Thread
{
	Message msg;
	public Relatives(Message msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			msg.showMessage();
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
class SyncMessage
{
	public static void main(String[] args) 
	{
		Message ob=new Message();

		Friends ob1=new Friends(ob);
		ob1.start();
		Relatives ob2=new Relatives(ob);
		ob2.start();
	}
}

--------- output on run ---------
Hello
how
are
you?
Hello
how
are
you?
all
the
best
all
the
best
-----------
-----------
Hello
how
are
you?
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
all
the
best
-----------
Hello
how
are
you?
Hello
how
are
you?
all
the
best
-----------
all
the
best
-----------
Hello
how
are
you?
Hello
how
are
you?
all
the
best
-----------
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Press any key to continue . . .

//-----------------------------------------------------------------------------------------------------------------------------

In java, the synchronization is achieved using the following concepts.

	- Mutual Exclusion
	- Inter thread communication

Mutual Exclusion(Mutex) [Exclusion-The act of not allowing someone or something to take part in an activity or to enter a place]
Using the mutual exclusion process, we keep threads from interfering with one another while they accessing the shared resource. In java, mutual exclusion is achieved using the following concepts.

	- Synchronized method
	- Synchronized block
	- Static synchronization.

  - some important Terms: 

	- Lock: In the context of Java threading, a lock is a mechanism that controls access to a shared resource by multiple threads. It ensures that only one thread can access the resource at a time. In Java, locks can be implemented using synchronized blocks, synchronized methods, or explicit lock objects like ReentrantLock.

	- Monitor: A monitor is a logical construct which is used to synchronize access to the object's critical sections. When a thread enters a synchronized block or method, it acquires the monitor associated with the object on which the synchronization is performed. Entered thread gains the control over the lock ny using which he will restrict Other threads attempting to enter in to synchronized blocks or methods on the same object. These threads have to wait outside means blocked, until the monitor is released by entered thread.

//---------------------------------------------------------------

 - Using Synchronized method

When a method defined using a synchronized keyword, it allows only one object to access it at a time. When an object calls a synchronized method, it put a lock on that method so that other objects or thread that are trying to call the same method must wait, until the lock is released. Once the lock is released on the shared resource, one of the threads among the waiting threads will be start using the shared resource again.

lets see the above exampe with the synchronized keyword...!!

class Message
{
	synchronized public void showMessage()
	{
		System.out.println("Hello");
		System.out.println("how");
		System.out.println("are");
		System.out.println("you?");
		try{Thread.sleep(400);}catch(Exception e){}
		System.out.println("all");
		System.out.println("the");
		System.out.println("best");
		System.out.println("-----------");
	}
}
class Friends extends Thread
{
	Message msg;
	public Friends(Message msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			msg.showMessage();
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class Relatives extends Thread
{
	Message msg;
	public Relatives(Message msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			msg.showMessage();
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
class SyncMessage
{
	public static void main(String[] args) 
	{
		Message ob=new Message();

		Friends ob1=new Friends(ob);
		ob1.start();
		Relatives ob2=new Relatives(ob);
		ob2.start();
	}
}
---------- Output on run -----------

Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Hello
how
are
you?
all
the
best
-----------
Press any key to continue . . .

//----------------------------------------------------------

	// what is thread-safe and non thread-safe in java  multithreading?

In Java multithreading, "thread-safe" refers to code or data structures that can be safely accessed and manipulated by multiple threads concurrently without causing any issues such as data corruption, race conditions, or unexpected behavior. On the other hand, "non-thread-safe" refers to code or data structures that are not designed to handle concurrent access from multiple threads and may lead to problems if accessed concurrently.

  Thread-Safe:
	- Thread-safe code ensures that shared data structures or resources are accessed in a synchronized manner 
	  to prevent concurrent modification issues.
	- Thread-safe classes often use synchronization mechanisms such as locks, mutexes, or atomic operations to 
	  ensure mutual exclusion.
	- Examples of thread-safe classes in Java include StringBuffer.

  Non-Thread-Safe:
	- Non-thread-safe code or data structures do not provide mechanisms to handle concurrent access safely.
	- Accessing non-thread-safe code concurrently may lead to race conditions, data corruption, or inconsistent behavior.
	- Examples of non-thread-safe classes in Java include ArrayList and HashMap. These classes are not synchronized, 
	  so concurrent access without external synchronization can lead to issues.


//-----------------------------------------------------------------------------------------------------------------------------------

	// Using Synchronized block

Synchronized block in Java is another way of managing the execution of threads. It is mainly used to perform synchronization on a certain block of code or statements inside the method.

Synchronizing a block of code is more powerful than synchronized method. For example, suppose there are 30 lines of code in a method, but we want to synchronize only 5 lines of code. In this case, we should use a synchronized block.

If we place all the codes of the method in the synchronized block, it will work the same as the synchronized method.

lets see the example below, in which there are two different instruction groups(blocks) enclosed witin scope with the help of 
synchronized keyword. It requres an object of any type, which is considered as a lock. and all such synchronized blocks will be
restricted to paralled execution, having a same lock.

class MyStack 
{
    private int maxSize;
    private int[] stackArray;
    private int top;
	Object lock;
    public MyStack(int size) 
	{
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
		lock=new Object();
    }
    public void push(int value) 
	{
		// t1->, t2-O
		synchronized(lock)
		{
			try{Thread.sleep(600);}catch(Exception e){}
			if (isFull()) 
			{
				System.out.println("Stack is full. Cannot push element " + value);
				return;
			}
			stackArray[++top] = value;
		}
    }
    public int pop() 
	{
		synchronized(lock)
		{
			try{Thread.sleep(300);}catch(Exception e){}
			if (isEmpty()) 
			{
				System.out.println("Stack is empty. Cannot pop element.");
				return -1; 
			}
			return stackArray[top--];
		}
    }
    public boolean isEmpty() 
	{
        return (top == -1);
    }
    public boolean isFull() 
	{
        return (top == maxSize - 1);
    }
}
class PushAccessThread extends Thread
{
	MyStack stack;
	public PushAccessThread(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.push(i);
			System.out.println("Push: "+i);
		}
	}
}
class PopAccessThread extends Thread
{
	MyStack stack;
	public PopAccessThread(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
			System.out.println("Pop: "+stack.pop());
	}
}
class MyStackExample
{
	public static void main(String[] args) 
	{
		MyStack stack=new MyStack(14);

		PushAccessThread a1=new PushAccessThread(stack);
		PopAccessThread a2=new PopAccessThread(stack);
	}
}

----------------- output on run ----------------------
Push: 21
Pop: 21
Push: 22
Pop: 22
Push: 23
Pop: 23
Push: 24
Pop: 24
Push: 25
Pop: 25
Push: 26
Pop: 26
Push: 27
Pop: 27
Push: 28
Pop: 28
Push: 29
Pop: 29
Push: 30
Pop: 30
Push: 31
Pop: 31
Push: 32
Pop: 32
Push: 33
Pop: 33
Push: 34
Pop: 34
Press any key to continue . . .

//-------------------------------------------------------------------------------------------------------------------------

	// when two different objects are there used as a lock, the we will see the parallel execution.(like unsynchronized)

class MyStack 
{
    private int maxSize;
    private int[] stackArray;
    private int top;
	Object lock1;
	Object lock2;
    public MyStack(int size) 
	{
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
		lock1=new Object();
		lock2=new Object();
    }
    public void push(int value) 
	{
		// t1->, t2-O
		synchronized(lock1)
		{
			try{Thread.sleep(600);}catch(Exception e){}
			if (isFull()) 
			{
				System.out.println("Stack is full. Cannot push element " + value);
				return;
			}
			stackArray[++top] = value;
		}
    }
    public int pop() 
	{
		synchronized(lock2)
		{
			try{Thread.sleep(300);}catch(Exception e){}
			if (isEmpty()) 
			{
				System.out.println("Stack is empty. Cannot pop element.");
				return -1; 
			}
			return stackArray[top--];
		}
    }
    public boolean isEmpty() 
	{
        return (top == -1);
    }
    public boolean isFull() 
	{
        return (top == maxSize - 1);
    }
}
class PushAccessThread extends Thread
{
	MyStack stack;
	public PushAccessThread(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.push(i);
			System.out.println("Push: "+i);
		}
	}
}
class PopAccessThread extends Thread
{
	MyStack stack;
	public PopAccessThread(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
			System.out.println("Pop: "+stack.pop());
	}
}
class MyStackExample
{
	public static void main(String[] args) 
	{
		MyStack stack=new MyStack(14);

		PushAccessThread a1=new PushAccessThread(stack);
		PopAccessThread a2=new PopAccessThread(stack);
	}
}

---------------- Output on run ------------------------

Stack is empty. Cannot pop element.
Pop: -1
Push: 21
Pop: 21
Stack is empty. Cannot pop element.
Pop: -1
Push: 22
Pop: 22
Stack is empty. Cannot pop element.
Pop: -1
Push: 23
Pop: 23
Stack is empty. Cannot pop element.
Pop: -1
Push: 24
Pop: 24
Stack is empty. Cannot pop element.
Pop: -1
Push: 25
Pop: 25
Stack is empty. Cannot pop element.
Pop: -1
Push: 26
Pop: 26
Stack is empty. Cannot pop element.
Pop: -1
Push: 27
Pop: 27
Push: 28
Push: 29
Push: 30
Push: 31
Push: 32
Push: 33
Push: 34
Press any key to continue . . .


//-----------------------------------------------------------------------------------------------------------------------------

	// You can use any object as a lock, it can be same for which these methods are called, we we can pass this.
		- if we use "new string()" as a lock in both blocks, then we will get the distorted output coz the having
		  same type but two differet instances are there.
		- But if we replace it with "this" at both location we will achive the synchronization. coz this refers to 
		  same object for which both methods are called.(reference to shared resource)
		- here in the example below, all instructions from both push() and pop() methods are in the synchronized block
		  and there for it is same as that of synchronized method.
		- internally, synchronized method uses synchronized block with this as lock.


class MyStack 
{
    private int maxSize;
    private int[] stackArray;
    private int top;
	Object lock1;
	Object lock2;
    public MyStack(int size) 
	{
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
		lock1=new Object();
		lock2=new Object();
    }
    public void push(int value) 
	{
		// t1->, t2-O
		synchronized(this)
		{
			try{Thread.sleep(600);}catch(Exception e){}
			if (isFull()) 
			{
				System.out.println("Stack is full. Cannot push element " + value);
				return;
			}
			stackArray[++top] = value;
		}
    }
    public int pop() 
	{
		synchronized(this)
		{
			try{Thread.sleep(300);}catch(Exception e){}
			if (isEmpty()) 
			{
				System.out.println("Stack is empty. Cannot pop element.");
				return -1; 
			}
			return stackArray[top--];
		}
    }
    public boolean isEmpty() 
	{
        return (top == -1);
    }
    public boolean isFull() 
	{
        return (top == maxSize - 1);
    }
}
class PushAccessThread extends Thread
{
	MyStack stack;
	public PushAccessThread(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.push(i);
			System.out.println("Push: "+i);
		}
	}
}
class PopAccessThread extends Thread
{
	MyStack stack;
	public PopAccessThread(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
			System.out.println("Pop: "+stack.pop());
	}
}
class MyStackExample1
{
	public static void main(String[] args) 
	{
		MyStack stack=new MyStack(14);

		PushAccessThread a1=new PushAccessThread(stack);
		PopAccessThread a2=new PopAccessThread(stack);
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------

	
	- Static synchronization.
	----------------------------

	Static synchronization in Java involves synchronizing access to a shared resource using a static keyword. When a method 
	is declared as static synchronized, only one thread can execute that method at a time for the entire class, not just 
	for the object instance.

			    ob1				    ob2	
		t1 -------> [ print() ]		t11 -------> [ print()  ]
			      ^				       ^
			      |				       |
			     t2                               t22

	In the example below, there are two different objects of type ShowArray, and each will be accessed using a pair
	of threads in synchronized manner. But as the synchronization is at instance(object) level, a single thread from
	each pair will execute at a time.


class ShowArray
{
	private int []x={1,11,22,33,44,55,66,77,88,99};
	synchronized public void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("  "+x[i]);
			try{Thread.sleep(600);}catch(Exception e){}
		}
	}
}
class StaticSyncDemo
{
	
	public static void main(String[] args) 
	{
		ShowArray ob1=new ShowArray();
		Thread t1=new Thread(){
			public void run()
			{
				ob1.print();
			}
		};
		t1.start();
		Thread t2=new Thread(){
			public void run()
			{
				ob1.print();
			}
		};
		t2.start();
		//------------------------------------
		ShowArray ob2=new ShowArray();
		Thread t12=new Thread(){
			public void run()
			{
				ob2.print();
			}
		};
		t12.start();
		Thread t22=new Thread(){
			public void run()
			{
				ob2.print();
			}
		};
		t22.start();
	}
}

------------ output on run ---------------
  1
  1
  11
  11
  22
  22
  33
  33
  44
  44
  55
  55
  66
  66
  77
  77
  88
  88
  99
  99
  1
  1
  11
  11
  22
  22
  33
  33
  44
  44
  55
  55
  66
  66
  77
  77
  88
  88
  99
  99
Press any key to continue . . .

//---------------------------------------------------------------------------------------------------------------

	we know that when we declare  any method as a static the a single of that method will be common to all the
	object of same class.

			    ob1				    ob2	
		t1 -------> [      ] ====== print()====== [   ] <------- t11
			      ^	    (common to all objects)    ^
			      |				       |
			     t2                               t22

	when such method declare ed as a ssynchronized, then all threads want to access that methods using any instance
	are synchronized. Means rather than instance/object level synchronization, the class level synchronization is
	achived.

	lets see the example,

class ShowArray
{
	private static int []x={1,11,22,33,44,55,66,77,88,99};
	synchronized static public void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("  "+x[i]);
			try{Thread.sleep(600);}catch(Exception e){}
		}
	}
}
class StaticSyncDemo
{
	
	public static void main(String[] args) 
	{
		ShowArray ob1=new ShowArray();
		Thread t1=new Thread(){
			public void run()
			{
				ob1.print();
			}
		};
		t1.start();
		Thread t2=new Thread(){
			public void run()
			{
				ob1.print();
			}
		};
		t2.start();
		//------------------------------------
		ShowArray ob2=new ShowArray();
		Thread t12=new Thread(){
			public void run()
			{
				ob2.print();
			}
		};
		t12.start();
		Thread t22=new Thread(){
			public void run()
			{
				ob2.print();
			}
		};
		t22.start();
	}
}

//--------------------------------------------------------------------------------------------------------------------------------

	// Inter-Thread Communication: 
	---------------------------------
You might have noticed Object class has three final method called wait(), notify() and notifyAll(). 
These methods are used for inter thread communication. Java 5 has introduced executor framework which takes care of inter thread 
communication for you and internally uses wait, notify and notifyAll but you still require basic understanding of these methods and 
how inter thread communication works in java using wait , notify and notifyAll.

 - What are wait , notify and notifyAll methods?
 ----------------------------------------------
wait , notify and notifyAll method are used to allow threads to communicate to each other via accessing common object or in other 
terms, Object can be considered a medium for inter thread communication via these methods. 
These methods need to be called from synchronized context, otherwise it will throw java.lang.IllegalMonitorStateException.

 - Some background on synchronized block :
 -------------------------------------------
	- Only one thread can enter at a time in synchronized block
	- A thread required lock on the object to enter in synchronized block.
	- If Thread A want to enter in synchronized block then Thread A has to wait for Thread B to release it.

Lets see wait(), notify() and notifyAll() methods:

	- wait(): When you call wait method on the object then it tell threads to give up the lock and go to sleep state 
		  unless and until some other thread enters in same monitor and calls notify or notifyAll methods on it.

	- notify(): When you call notify method on the object, it wakes one of thread waiting for that object. 
	            So if multiple threads are waiting for an object, it will wake of one of them. Now you must be 
		    wondering which one it will wake up. It actually depends on OS implementation.

	- notifyAll(): notifyAll will wake up all threads waiting on that object unlike notify which wakes up only one of them.
		       Which one will wake up first depends on thread priority and OS implementation.

// first analyze the flow 

import java.util.Random;
class Cart extends Thread
{
	double bill=0.0;
	public double getBill(){return bill;}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{Thread.sleep(400);}catch(Exception e){}
				System.out.println("Waiting....."+i);
		}
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
			
				try{Thread.sleep(400);}catch(Exception e){}
				int price=new Random().nextInt(200);
				System.out.println("Item "+(i+1)+" Price: "+price);
				bill=bill+price;
			}
			this.notify();
		}
	}
}
class ShoppingMain 
{
	public static void main(String[] args) 
	{
		Cart c1=new Cart();
		c1.start();
		
		synchronized(c1)
		{
			for(int i=0;i<20;i++)
			{
				try{Thread.sleep(400);}catch(Exception e){}
					System.out.println("Main()....."+i);
				if(i==10)
				{
					try{c1.wait();}catch(Exception e){}
				}
			}
		}

		System.out.println("Total Bill: "+c1.getBill());
	}
}

---------- Output on Run -------------
Waiting.....0
Main().....0
Main().....1
Waiting.....1
Main().....2
Waiting.....2
Main().....3
Waiting.....3
Main().....4
Waiting.....4
Main().....5
Main().....6
Main().....7
Main().....8
Main().....9
Main().....10
Item 1 Price: 7
Item 2 Price: 9
Item 3 Price: 101
Item 4 Price: 28
Item 5 Price: 159
Main().....11
Main().....12
Main().....13
Main().....14
Main().....15
Main().....16
Main().....17
Main().....18
Main().....19
Total Bill: 304.0
Press any key to continue . . .

//--------------------------------------------------------------------------------------------------------------------

	// Same example in precise manner
 
import java.util.Random;
class Cart extends Thread
{
	double bill=0.0;
	public double getBill(){return bill;}
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
			
				try{Thread.sleep(400);}catch(Exception e){}
				int price=new Random().nextInt(200);
				System.out.println("Item "+(i+1)+" Price: "+price);
				bill=bill+price;
			}
			this.notify();
		}
	}
}
class ShoppingMain 
{
	public static void main(String[] args) 
	{
		Cart c1=new Cart();
		c1.start();
		
		synchronized(c1)
		{
			try{c1.wait();}catch(Exception e){}
		}

		System.out.println("Total Bill: "+c1.getBill());
	}
}

//--------------------------------------------------------------------------------------------------------------------------

	/// // Producer-Consumer Problem (Using wait() notify() )  - block synchronization implementation

	The Producer-Consumer Problem (sometimes called the Bounded-Buffer Problem) is a classic example of a 
	multi-threaded synchronization problem.

	The problem describes two threads, the Producer and the Consumer, and they are sharing a common, fixed-size 
	resource.

	The Producer produces an item, puts that item into the resource(increases value by 1), and keeps repeating this process.
	On the other hand, the Consumer is consuming the item from the shared resource(decreases value by 1), one item at a time.

class Resource
{
	private int value;
	{value=0;}
	public int getValue(){return value;}
	public void incr()
	{
		value=value+1;
		System.out.println("After Produce Value is: "+value);
	}
	public void decr()
	{
		value=value-1;
		System.out.println("After consume Value is: "+value);
	}
}
class Producer extends Thread
{
	Resource res;
	public Producer(Resource res)
	{
		this.res=res;
		start();
	}
	public void run()
	{
		synchronized(res)
		{
			while(true)
			{
				if(res.getValue()==1)
				{
					try{res.wait();}catch(Exception e){}
				}
				res.incr();
				res.notify();
				try{Thread.sleep(200);}catch(Exception e){}
			}
		}
	}
}
class Consumer extends Thread
{
	Resource res;
	public Consumer(Resource res)
	{
		this.res=res;
		start();
	}
	public void run()
	{
		synchronized(res)
		{
			while(true)
			{
				if(res.getValue()==0)
				{
					try{res.wait();}catch(Exception e){}
				}
				res.decr();
				res.notify();
				try{Thread.sleep(800);}catch(Exception e){}
			}
		}
	}
}
class MainPC
{
	public static void main(String[] args) 
	{
		Resource ob=new Resource();

		Producer p=new Producer(ob);
		Consumer c=new Consumer(ob);
	}
}


//---------------------------------------------------------------------------------------------------------

	// Another ways - method synchronization implementation

class Producer implements Runnable
{
	Thread pthread;
	UpdateItems pitems;
	public Producer(UpdateItems pitems)
	{
		this.pitems=pitems;
		pthread=new Thread(this,"Producer");
		pthread.start();
	}
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			try{Thread.sleep(1200);}catch(Exception e){}
			pitems.update(1);
		}
	}
}
class Consumer implements Runnable
{
	Thread cthread;
	UpdateItems citems;
	public Consumer(UpdateItems citems)
	{
		this.citems=citems;
		cthread=new Thread(this,"Consumer");
		cthread.start();
	}
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			try{Thread.sleep(1200);}catch(Exception e){}
			citems.update(2);
		}
	}
}
class UpdateItems
{
	int n=0;
	synchronized public void update(int chk)
	{
		if(chk==1)
		{
			n+=1;
			notify();
			System.out.println("Producing: "+n);
			try{wait();}catch(Exception e){e.printStackTrace();}
		}
		if(chk==2)
		{
			if(n==0)
			{
				try{wait();}catch(Exception e){e.printStackTrace();}
			}
			n-=1;
			notify();
			System.out.println("Consuming: "+n);
		}
	}
}
class MainProducerConsumerExample
{
	public static void main(String[] args) 
	{
		UpdateItems items=new UpdateItems();

		new Producer(items);
		new Consumer(items);
	}
}


//--------------------------------------------------------------------------------------------------------------------------

	// The Deadlock in synchronization -  Reader-Writer Problem.
	
	A special type of error that you need to avoid that relates specifically to multitasking is deadlock,
	which occurs when two threads have a circular dependency on a pair of synchronized objects.

	Lets see the the famous problems in multi-threading and is referred to as the Reader-Writer Problem.

	There are two threads Reader and Writer both share a common object “message”.

	- Reader reads the message when it is not empty otherwise, it will wait for the Writer to write the message.

	- On the other hand, Writer writes the message when it is empty else it waits for Reader to read the message 
	  and mark the message empty.

	Now let’s create two threads Writer and Reader and one shared object for both the thread that is Message object.


import java.util.Random;
class Message 
{
	String message;
    	boolean empty = true;

    	//Method used by reader
    	public synchronized String read() 
	{
        	while(empty) 		// if message is empty then keep looping.
		{
			System.out.println("Waiting for data write..!! so able to read");			
			try {Thread.sleep(2000);} catch (InterruptedException e) {}
		}
        	empty = true; 		// Reader reads the message and marks empty as true.
        	return message; 	//Reader reads the message.
    	}

    	//Method used by writer
    	public synchronized void write(String message) 
	{
        	while(!empty) 			//if message is not empty then keep looping.
		{
			System.out.println("Waiting for data read..!! so able to write");
			try {Thread.sleep(2000);} catch (InterruptedException e) {}
		}
        	this.message = message;		//Writer writes the message.
        	empty = false;			//Now make empty as false.
   	 }
}
class Writer implements Runnable 
{
	private Message message;
    	public Writer(Message message) 
	{
        	this.message = message;
    	}
    	public void run() 
	{
        	String messages[] = {
                "Johnny, Johnny, Yes Papa",
                "Eating sugar? No, Papa!",
                "Telling lies? No, Papa!",
                "Open your mouth, Ha! Ha! Ha!"
        	};

        	Random random = new Random();
        	for (int i = 0; i < messages.length; i++) 
		{
            		message.write(messages[i]);
            		try {Thread.sleep(random.nextInt(2000));} catch (InterruptedException e) {}
        	}
        	message.write("Finished!");
    	}
}

class Reader implements Runnable 
{
    	private Message message;
    	public Reader(Message message)
	{
        	this.message = message;
    	}
    	public void run() 
	{
        	Random random = new Random();
        	for (String latestMessage = message.read(); !"Finished!".equals(latestMessage); latestMessage = message.read()) 
		{
            		System.out.println(latestMessage);            
            		try {Thread.sleep(random.nextInt(2000));} catch (InterruptedException e) {}
        	}
   	}
}
public class MainReaderWriter 
{
	public static void main(String[] args) 
	{
        	//Shared message object between Reader and Writer threads.
        	Message message = new Message();

        	Thread writerThread = new Thread(new Writer(message));
        	Thread readerThread = new Thread(new Reader(message));

        	writerThread.start();
        	readerThread.start();
    }
}
-------------- Output on Run --------------
Johnny, Johnny, Yes Papa
Eating sugar? No, Papa!
Waiting for data read..!! so able to write
Waiting for data read..!! so able to write
Waiting for data read..!! so able to write
Waiting for data read..!! so able to write
Waiting for data read..!! so able to write

or any other ... or may be expected ... each time different output

Basically, by looking at the output above, you might wonder why aren’t the rest of the messages printed.
Now, the Simple Answer Is “DEADLOCK”.

Let me take the first output and explain to you why this deadlock occurred.

	- When we started the threads through the main() method from the Main class, both the threads 
	  called the run() method.
	- Note that both threads are sharing a common message object. Now the Reader thread called the 
	  synchronized read() method and hence acquired the lock of the message object.
	- As initially the boolean empty flag was set to true, the Reader thread keeps executing while looping infinitely.
	- Also, the Writer thread won’t be able to execute the write() method as the lock of the message object is 
	  already acquired by the Reader thread.

	Hence we don’t see any output on the console in the first output. Similarly, you can also try to trace 
	the second output.

	If you have noticed, none of the threads can do their required tasks, and they are waiting infinitely. 
	This scenario is called DEADLOCK.

	The solution to overcome the deadlock is very simple. We just have to introduce an acquire and release mechanism
	for monitor/intrinsic lock in the read() and write()synchronized methods which are causing deadlock.This problem
	is solved by using wait() and notify() and notifyAll().

	Let's see the example

class Message 
{
    String message;
    boolean empty = true;

    //Method used by reader
    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted.");
            }
        }
        empty = true;//Reader reads the message and marks empty as true.
        notifyAll();
        return message;//Reader reads the message.
    }

    //Method used by writer
    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Interrupted.");
            }
        }
        this.message = message;//Writer writes the message.
        empty = false;//Now make empty as false.
        notifyAll();
    }
}
class Writer implements Runnable 
{
    private Message message;

    public Writer(Message message) 
	{
        this.message = message;
    }

    public void run() 
	{
        String messages[] = {
                "Johnny, Johnny, Yes Papa",
                "Eating sugar? No, Papa!",
                "Telling lies? No, Papa!",
                "Open your mouth, Ha! Ha! Ha!"
        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) 
		{
            message.write(messages[i]);
            try 
			{
                Thread.sleep(random.nextInt(2000));
            } 
			catch (InterruptedException e) 
			{
                System.out.println("Writer Thread Interrupted!!!");
            }
        }
        message.write("Finished!");
    }
}

class Reader implements Runnable 
{
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }
    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); !"Finished!".equals(latestMessage); latestMessage = message.read()) 
	{
            System.out.println(latestMessage);
            try {Thread.sleep(random.nextInt(2000));} catch (InterruptedException e) 
	    {
                System.out.println("Reader Thread Interrupted!!!");
            }
        }
    }
}
public class MainReaderWriter 
{
    public static void main(String[] args) 
	{
        //Shared message object between Reader and Writer threads.
        Message message = new Message();

        Thread writerThread = new Thread(new Writer(message));
        Thread readerThread = new Thread(new Reader(message));

        writerThread.start();
        readerThread.start();
    }
}

---------- Output On Run ------------
Johnny, Johnny, Yes Papa
Eating sugar? No, Papa!
Telling lies? No, Papa!
Open your mouth, Ha! Ha! Ha!
Press any key to continue . . .

//--------------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------------

Even though this approach solves our problem, there are a few drawbacks of this approach:

	- All the threads that are in a blocked state can’t be interrupted.
	- If multiple threads are waiting for a lock and when the lock is available, the order in which the threads will 
	  get the lock is not guaranteed. Let’s say that the first thread which went into the wait state might be the 
	  last to get the lock to execute its synchronized block.
	- synchronized doesn't support thread scheduling. This can be solved using ReentrantLock. ReentrantLock has support 
	  for a configurable fairness policy, allowing more flexible thread scheduling.
	- We cannot hold the lock across the methods. This means we cannot hold the single monitor lock in one synchronized 
	  method and release it in another synchronized method. This can be done using ReentrantLock .

	i.e.

		private ReentrantLock lock;

		public void method1() {
 		...
  		lock.lock();
  		...
		}
		public void method2() {
  		...
  		lock.unlock();
  		...
		}

Java Locks:
------------

Most of the times, synchronized keyword is the way to go but it has some shortcomings that lead the way to inclusion of Lock API in 
Java Concurrency package. Java 5 Concurrency API came up with java.util.concurrent.locks package with Lock interface and 
some implementation classes to improve the Object locking mechanism. 
Some important interfaces and classes in Java Lock API are:

Lock: This is the base interface for Lock API. It provides all the features of synchronized keyword with additional ways to create 
different Conditions for locking, providing timeout for thread to wait for lock. Some of the important methods are lock() to acquire 
the lock, unlock() to release the lock, tryLock() to wait for lock for a certain period of time, newCondition() to create the 
Condition etc.

Condition: Condition objects are similar to Object wait-notify model with additional feature to create different sets of wait. A Condition object is always created by Lock object. Some of the important methods are await() that is similar to wait() and signal(), signalAll() that is similar to notify() and notifyAll() methods.

ReadWriteLock: It contains a pair of associated locks, one for read-only operations and another one for writing. The read lock may be held simultaneously by multiple reader threads as long as there are no writer threads. The write lock is exclusive.

ReentrantLock: This is the most widely used implementation class of Lock interface. This class implements the Lock interface in similar way as synchronized keyword. Apart from Lock interface implementation, ReentrantLock contains some utility methods to get the thread holding the lock, threads waiting to acquire the lock etc. synchronized block are reentrant in nature i.e if a thread has lock on the monitor object and if another synchronized block requires to have the lock on the same monitor object then thread can enter that code block. I think this is the reason for the class name to be ReentrantLock. 

Here are some of the commonly used methods of the ReentrantLock class:

 - lock(): Acquires the lock. If the lock is not available, the current thread will wait until the lock becomes available.
 - unlock(): Releases the lock. It's important to ensure that unlock() is always called in a finally block to ensure the lock
	     is released even if an exception occurs.
 - tryLock(): Attempts to acquire the lock without waiting. Returns true if the lock was acquired successfully, false otherwise.
 - tryLock(long time, TimeUnit unit): Attempts to acquire the lock within the specified time period. Returns true if the lock was 
	     acquired successfully within the specified time, false otherwise.
 - isHeldByCurrentThread(): Returns true if the lock is held by the current thread, false otherwise.
 - getHoldCount(): Returns the number of times the current thread has acquired the lock. If the lock is not held by the 
		   current thread, it returns 0.
 - getQueueLength(): Returns an estimate of the number of threads waiting to acquire the lock.
 - hasQueuedThreads(): Returns true if there are any threads waiting to acquire the lock.
 - isLocked(): Returns true if the lock is held by any thread, false otherwise.

Let’s understand this feature with a simple example.

public class Test{

public synchronized work(){
    //do something
    show();
  }

  public synchronized show(){
    //do some more
  }
}

If a thread enters work(), it has the lock on Test object, so when it tries to execute show() method, the thread is allowed to execute show() method since it’s already holding the lock on the Test object i.e same as synchronized(this).

Java Lock Example - ReentrantLock in Java

Now let’s see a simple example where we will replace synchronized keyword with Java Lock API. Let’s say we have a Resource class 
with some operation where we want it to be thread-safe and some methods where thread safety is not required.


public class Resource {

	public void doSomething(){
		//do some operation, DB read, write etc
	}
	
	public void doLogging(){
		//logging, no need for thread safety
	}
}

Now let’s say we have a Runnable class where we will use Resource methods.


public class SynchronizedLockExample implements Runnable{

	private Resource resource;
	
	public SynchronizedLockExample(Resource r){
		this.resource = r;
	}
	
	public void run() {
		synchronized (resource) {
			resource.doSomething();
		}
		resource.doLogging();
	}
}
Notice that I am using synchronized block to acquire the lock on Resource object. We could have created a dummy object in the class and used that for locking purpose. Now let’s see how we can use java Lock API and rewrite above program without using synchronized keyword. We will use ReentrantLock in java.

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample implements Runnable{

	private Resource resource;
	private Lock lock;
	
	public ConcurrencyLockExample(Resource r){
		this.resource = r;
		this.lock = new ReentrantLock();
	}
	
	@Override
	public void run() {
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)){
			resource.doSomething();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			//release lock
			lock.unlock();
		}
		resource.doLogging();
	}

}
As you can see that, I am using tryLock() method to make sure my thread waits only for definite time and if it’s not getting the lock on object, it’s just logging and exiting. Another important point to note is the use of try-finally block to make sure lock is released even if doSomething() method call throws any exception.

	// Lets see the another program

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

class Message {
    private String message;
    private boolean empty = true;
    private Lock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    // Method used by reader
    public String read() throws InterruptedException {
        lock.lock();
        try {
            while (empty) {
                notEmpty.await(); // Wait until a message is available
            }
            empty = true; // Reader reads the message and marks empty as true
            notFull.signalAll(); // Signal that space is available for writing
            return message; //Reader reads the message
        } finally {
            lock.unlock();
        }
    }

    // Method used by writer
    public void write(String message) throws InterruptedException {
        lock.lock();
        try {
            while (!empty) {
                notFull.await(); // Wait until the message has been read
            }
            this.message = message; // Writer writes the message
            empty = false; // Now make empty as false
            notEmpty.signalAll(); // Signal that a new message is available for reading
        } finally {
            lock.unlock();
        }
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
            "Johnny, Johnny, Yes Papa",
            "Eating sugar? No, Papa!",
            "Telling lies? No, Papa!",
            "Open your mouth, Ha! Ha! Ha!"
        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            try {
                message.write(messages[i]);
                Thread.sleep(random.nextInt(2000)); // Simulate some time taken to write a message
            } catch (InterruptedException e) {
                System.out.println("Writer Thread Interrupted!!!");
            }
        }

        try {
            message.write("Finished!");
        } catch (InterruptedException e) {
            System.out.println("Writer Thread Interrupted!!!");
        }
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        try {
            for (String latestMessage = message.read(); !"Finished!".equals(latestMessage); latestMessage = message.read()) {
                System.out.println(latestMessage); // Print the message
                Thread.sleep(random.nextInt(2000)); // Simulate some time taken to read a message
            }
        } catch (InterruptedException e) {
            System.out.println("Reader Thread Interrupted!!!");
        }
    }
}

public class MainReaderWriter1 {
    public static void main(String[] args) {
        // Shared message object between Reader and Writer threads
        Message message = new Message();

        // Create and start writer and reader threads
        Thread writerThread1 = new Thread(new Writer(message));
        Thread readerThread1 = new Thread(new Reader(message));

        Thread writerThread2 = new Thread(new Writer(message));
        Thread readerThread2 = new Thread(new Reader(message));

        writerThread1.start();
        readerThread1.start();

        writerThread2.start();
        readerThread2.start();
    }
}

Java Lock vs synchronized
	Based on above details and program, we can easily conclude following differences between Java Lock and synchronization.

	- Java Lock API provides more visibility and options for locking, unlike synchronized where a thread might end up waiting 	  	
  indefinitely for the lock, we can use tryLock() to make sure thread waits for specific time only.
	- Synchronization code is much cleaner and easy to maintain whereas with Lock we are forced to have try-finally block to 
	  make sure Lock is released even if some exception is thrown between lock() and unlock() method calls.
	- synchronization blocks or methods can cover only one method whereas we can acquire the lock in one method and release 
	  it in another method with Lock API.
	- synchronized keyword doesn’t provide fairness whereas we can set fairness to true while creating ReentrantLock object so 	  	 
 that longest waiting thread gets the lock first.
	- We can create different conditions for Lock and different thread can await() for different conditions.

//-----------------------------------------------------------------------------------------------------------------------------------

	Additional Programs

	- Accessing a same method from shared resource using different threads

	suppose one resource(Runner) is there, having one counter with initial value zero,
	and one increament() method which will increases the the counter by 1.

	There are two different threads, shares the resource object(Runner object)
	and both make a call to same method increament().

	- without lock: Both thread will access the resource at same time so we will
	  get the mixed output.
	- with lock: When ever we use the lock, we achived the synchronization, 
	  so both will be executed one after another.

	lets see the output..!!

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int counter=0;
	Lock lock=new ReentrantLock();
	void increament()
	{
		//lock.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				counter++;
				System.out.println(Thread.currentThread().getName()+" - "+counter);
				try{Thread.sleep(700);}catch(Exception e){}
			}
		}
		catch(Exception e){}
		finally
		{
			//lock.unlock();
		}
	}
}
class DemoRenterentock
{
	public static void main(String[] args) 
	{
		Runner ob=new Runner();

		Thread t1=new Thread(){
			public void run()
			{
				ob.increament();
			}
		};
		t1.start();

		Thread t2=new Thread(){
			public void run()
			{
				ob.increament();
			}
		};
		t2.start();
	}
}


	//  Output after commenting lock.lock() and lock.unlock()

Thread-1 - 2
Thread-0 - 2
Thread-1 - 3
Thread-0 - 4
Thread-1 - 5
Thread-0 - 5
Thread-0 - 6
Thread-1 - 7
Thread-0 - 8
Thread-1 - 8
Thread-0 - 10
Thread-1 - 10
Thread-1 - 12
Thread-0 - 11
Thread-1 - 13
Thread-0 - 13
Thread-0 - 14
Thread-1 - 15
Thread-0 - 17
Thread-1 - 16
Press any key to continue . . .

//------------------------------------------------------------------

	// Output after Uncommenting lock.lock() and lock.unlock()

Thread-0 - 1
Thread-0 - 2
Thread-0 - 3
Thread-0 - 4
Thread-0 - 5
Thread-0 - 6
Thread-0 - 7
Thread-0 - 8
Thread-0 - 9
Thread-0 - 10
Thread-1 - 11
Thread-1 - 12
Thread-1 - 13
Thread-1 - 14
Thread-1 - 15
Thread-1 - 16
Thread-1 - 17
Thread-1 - 18
Thread-1 - 19
Thread-1 - 20
Press any key to continue . . .

//--------------------------------------------------------------------------------------------

	// Using lock() in caller, rather than resource:

	It is allowed to use a lock() within caller, rather than resource, only 
	condition is that,

		- Every call must be within the lock()-unlock().

		- Same lock object must be used for locking and unlocking, if different
		  lock object is used then we will get the parallel execution of threads.

	// Using same lock object in caller

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int counter=0;
	void increament()
	{
		for(int i=0;i<10;i++)
		{
			counter++;
			System.out.println(Thread.currentThread().getName()+" - "+counter);
			try{Thread.sleep(700);}catch(Exception e){}
		}
	}
}
class DemoRenterentock
{
	public static void main(String[] args) 
	{
		Runner ob=new Runner();
		Lock lock=new ReentrantLock();

		Thread t1=new Thread(){
			public void run()
			{
				lock.lock();
				try
				{
					ob.increament();
				}
				catch (Exception e){}
				finally
				{
					lock.unlock();
				}
			}
		};
		t1.start();

		Thread t2=new Thread(){
			public void run()
			{
				lock.lock();
				try
				{
					ob.increament();
				}
				catch (Exception e){}
				finally
				{
					lock.unlock();
				}
			}
		};
		t2.start();
	}
}
-------- Output on Run -----------
Thread-0 - 1
Thread-0 - 2
Thread-0 - 3
Thread-0 - 4
Thread-0 - 5
Thread-0 - 6
Thread-0 - 7
Thread-0 - 8
Thread-0 - 9
Thread-0 - 10
Thread-1 - 11
Thread-1 - 12
Thread-1 - 13
Thread-1 - 14
Thread-1 - 15
Thread-1 - 16
Thread-1 - 17
Thread-1 - 18
Thread-1 - 19
Thread-1 - 20
Press any key to continue . . .

//--------------------------------------------------------------------------------------------

	// Using different lock object in the caller

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int counter=0;
	void increament()
	{
		for(int i=0;i<10;i++)
		{
			counter++;
			System.out.println(Thread.currentThread().getName()+" - "+counter);
			try{Thread.sleep(700);}catch(Exception e){}
		}
	}
}
class DemoRenterentock
{
	public static void main(String[] args) 
	{
		Runner ob=new Runner();
		Lock lock=new ReentrantLock();
		Lock lock1=new ReentrantLock();

		Thread t1=new Thread(){
			public void run()
			{
				lock.lock();
				try
				{
					ob.increament();
				}
				catch (Exception e)	{}
				finally
				{
					lock.unlock();
				}
			}
		};
		t1.start();

		Thread t2=new Thread(){
			public void run()
			{
				lock1.lock();
				try
				{
					ob.increament();
				}
				catch (Exception e)	{}
				finally
				{
					lock1.unlock();
				}
			}
		};
		t2.start();
	}
}
--------------- Output on Run ---------------------

Thread-1 - 2
Thread-0 - 2
Thread-1 - 3
Thread-0 - 4
Thread-1 - 5
Thread-0 - 5
Thread-0 - 6
Thread-1 - 7
Thread-0 - 8
Thread-1 - 9
Thread-0 - 10
Thread-1 - 10
Thread-0 - 12
Thread-1 - 11
Thread-0 - 13
Thread-1 - 13
Thread-0 - 14
Thread-1 - 15
Thread-1 - 16
Thread-0 - 17
Press any key to continue . . .
//------------------------------------------------------------------------------------------------------------------


	- Accessing a different method from shared resource using different threads

	When a resource contains the two methods and both will be accessed by
	different threads, then without using the lock it will executes in the parallel 
	manner but using same lock, it will attend synchronization.


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int counter=0;
	Lock lock=new ReentrantLock();
	void increament()
	{
		lock.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				counter++;
				System.out.println("INC - "+Thread.currentThread().getName()+" - "+counter);
				try{Thread.sleep(700);}catch(Exception e){}
			}
		}
		catch(Exception e){}
		finally
		{
			lock.unlock();
		}
	}
	void decreament()
	{
		lock.lock();
		try
		{
			for(int i=0;i<10;i++)
			{
				counter--;
				System.out.println("DEC - "+Thread.currentThread().getName()+" - "+counter);
				try{Thread.sleep(700);}catch(Exception e){}
			}
		}
		catch(Exception e){}
		finally
		{
			lock.unlock();
		}
	}
}
class DemoRenterentock1
{
	public static void main(String[] args) 
	{
		Runner ob=new Runner();

		Thread t1=new Thread(){
			public void run()
			{
				ob.increament();
			}
		};
		t1.start();

		Thread t2=new Thread(){
			public void run()
			{
				ob.decreament();
			}
		};
		t2.start();
	}
}

//---------------------------------------------------------------------------------------------------------

	/// producer-consumer using lock again

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {
    private int value;
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public Resource() {
        value = 0;
    }

    public int getValue() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }

    public void incr() {
        lock.lock();
        try {
            while (value == 1) {
                try {
                    notFull.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value++;
            System.out.println("After Produce Value is: " + value);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public void decr() {
        lock.lock();
        try {
            while (value == 0) {
                try {
                    notEmpty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value--;
            System.out.println("After consume Value is: " + value);
            notFull.signal();
        } finally {
            lock.unlock();
        }
    }
}

class Producer extends Thread {
    Resource res;

    public Producer(Resource res) {
        this.res = res;
        start();
    }

    public void run() {
        while (true) {
            res.incr();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Resource res;

    public Consumer(Resource res) {
        this.res = res;
        start();
    }

    public void run() {
        while (true) {
            res.decr();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MainPCUsingLock2 {
    public static void main(String[] args) {
        Resource ob = new Resource();

        Producer p = new Producer(ob);
        Consumer c = new Consumer(ob);
    }
}

//------------------------------------------------------------------------------------------------------------------------

Executors in java: 
------------------

/*
	// In the threading also you are defining the procedures, which are executed
	// and will gives you the desired output, as gives by the programs that we
	// have seen before the multithreading. Only difference is that al the code
	// groups will execute in the parallel manner.

	There are different ways of defining the task
		- define it with the run method of class exrending the Thread it inplementing
		  the runnable interface. Both are made to execute in a parallel manner.
		- define a task as a part of normal class and call it from the run method.
		

 // Suppose we have have find the total of number from 1 to 10, we can write it 
 // as a method in a simple class, and call using its object. but if you want to call
 // it multiple time and want to execute in the parallel manner the thread is a 
 // correct option coz in calse of normal method there may be a multipe calls but
 // it will be executed in a sequence.

 Lets try with a single thread which will gives you a clear idea of how to define
 a task, within a thread.

class MyExecutor extends Thread
{
	public void run()
	{
		int tot=0;
		for(int i=0;i<=10;i++)
		{
			tot=tot+i;
		}
		System.out.println("\n Total is: "+tot);
	}
}
class StartingTheTask
{
	public static void main(String[] args) 
	{
		MyExecutor me1=new MyExecutor();
		me1.start();
	}
}

//-----------------------------------------------------------------------------

	// now we want to add the numbers from different range, the the above program 
	// can be mofified as shown below.

	// note that unlike norma program, all instances execution in parallel manner
	// analyze the output to confirm.


class MyExecutor extends Thread
{
	int start,end;
	public MyExecutor(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		int tot=0;
		for(int i=start;i<=end;i++)
		{
			tot=tot+i;
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println("Processing..."+Thread.currentThread().getName());
		}
		System.out.println("\n Total is: "+tot);
	}
}
class StartingTheTask
{
	public static void main(String[] args) 
	{
		MyExecutor me1=new MyExecutor(2,7);
		me1.start();

		MyExecutor me2=new MyExecutor(1,5);
		me2.start();

		MyExecutor me3=new MyExecutor(5,10);
		me3.start();
	}
}

//-----------------------------------------------------------------------------

	// Now i want to represent the task as an object, then it can be written as

class MyTask
{
	int start,end;
	public MyTask(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
	void findTotal()
	{
		int tot=0;
		for(int i=start;i<=end;i++)
		{
			tot=tot+i;
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println("Processing..."+Thread.currentThread().getName());
		}
		System.out.println("\n Total is: "+tot);;

	}
}
class MyExecutor extends Thread
{
	MyTask task;
	public MyExecutor(MyTask task)
	{
		this.task=task;
		start();
	}
	public void run()
	{
		task.findTotal();
	}
}
class StartingTheTask
{
	public static void main(String[] args) 
	{
		MyTask task1=new MyTask(2,7);
		MyExecutor me1=new MyExecutor(task1);

		MyTask task2=new MyTask(1,5);
		MyExecutor me2=new MyExecutor(task2);

		MyTask task3=new MyTask(5,10);
		MyExecutor me3=new MyExecutor(task3);;
	}
}

//---------------------------------------------------------------------------------

	// Note carefully that if we want to execute all theads in asynchroonized
	// manner then we have to go for either synchronized keyword or lock.

	// but we are facing the difficulty while using it for the thread management
	// (i.e. resource allocation, thread pooling, thread Control etc...)

	so we need one standard aritecture to handle it and that is provide in java 5,
	called executor.

	In the java mutithreading, we can divide the entire work in two different steps, first is defining a 
      task and second
	the thread management which includes thread creation, pooling, and lifecycle management etc.

	The task being done by a new thread, as defined by its Runnable object, and the thread itself, 
        as defined by a 
	Thread object. This works well for small applications, but in large-scale applications, it makes sense 
        to separate 
	thread management and creation from the rest of the application. Objects that encapsulate these 
     facilities are 
	known as executors.

	This high-level concurrency attended by using concurrency API in the java.util.concurrent package that provides 
	utility classes commonly useful in concurrent programming such as executors, threads pool management, scheduled 
	tasks execution, the Fork/Join framework(new in JDK 7) , concurrent collections, etc.

	In Java, an Executor is an interface in the java.util.concurrent package that provides a way to decouple task submission 
	from the mechanics of how each task will be run, including details like thread use, scheduling, etc. It's essentially 
	a framework for executing tasks asynchronously.

	Here's a detailed breakdown of how Executor works:

	- Decoupling Task Submission: Instead of directly creating threads to execute tasks, you submit tasks to an executor. 
	  This decouples the task submission from the execution mechanism. This decoupling is beneficial because it allows 
	  the executor framework to manage the execution details, such as thread creation, pooling, and lifecycle management.

	- Executor Interface: The Executor interface declares a single method void execute(Runnable command). This method 
	  accepts a Runnable object, which represents a task that can be executed asynchronously.(asynchronously.- not synchronous; 
	  not occurring or existing at the same time or having the same period or phase.)

	- ExecutorService: The ExecutorService interface extends Executor and provides additional methods to manage the 
	  lifecycle of the executor, such as shutting it down, waiting for tasks to complete, etc. It also defines methods 
	  for submitting tasks that can return a Future object representing the result of the computation.

	- ThreadPoolExecutor: This is one of the most commonly used implementations of the ExecutorService interface. 
	  It manages a pool of worker threads and a queue of tasks waiting to be executed. When a task is submitted to a
	  ThreadPoolExecutor, it is executed either by an existing thread in the pool or by creating a new one, depending 
	  on the current state of the pool.

	- Executor Execution Policies: Executors can have different policies for executing tasks, such as fixed-size thread 
	  pools, cached thread pools, single-threaded executors, etc. These policies determine how tasks are executed based 
	  on factors like thread availability, task priority, and queueing strategy.

	- Task Execution: When a task is submitted to an executor, it is typically added to a queue. The executor then picks 
	  up tasks from the queue and executes them using one or more threads from its thread pool. The exact mechanism of 
	  task execution depends on the type of executor and its configuration.

	- Exception Handling: Executors provide mechanisms for handling exceptions that occur during task execution. 
	  For example, Future objects returned by some executor methods can be used to retrieve the result of a task and 
	  handle any exceptions that occurred during its execution.


	Understanding Thread Pool in Java
	-----------------------------------

	In terms of performance, creating a new thread is an expensive operation because it requires the operating system 
	allocates resources needed for the thread. Therefore, in practice thread pool is used for large-scale applications 
	that launch a lot of short-lived threads in order to utilize resources efficiently and increase performance.

	Instead of creating new threads when new tasks arrive, a thread pool keeps a number of idle threads that are 
	ready for executing tasks as needed. After a thread completes execution of a task, it does not die. Instead 
	it remains idle in the pool waiting to be chosen for executing new tasks.

	You can limit a definite number of concurrent threads in the pool, which is useful to prevent overload. If all 
	threads are busily executing tasks, new tasks are placed in a queue, waiting for a thread becomes available.

	The Java Concurrency API supports the following types of thread pools:

		- Cached thread pool: keeps a number of alive threads and creates new ones as needed.

		- Fixed thread pool: limits the maximum number of concurrent threads. Additional tasks are waiting 
				     in a queue.

		- Single-threaded pool: keeps only one thread executing one task at a time.

		- Fork/Join pool: a special thread pool that uses the Fork/Join framework to take advantages of 
			     	  multiple processors to perform heavy work faster by breaking the work into smaller 
				  pieces recursively.

	That’s basically how thread pool works. In practice, thread pool is used widely in web servers where a thread pool is 
	used to serve client’s requests. Thread pool is also used in database applications where a pool of threads maintaining 
	open connections with the database.

	Implementing a thread pool is a complex task, but you don’t have to do it yourself. As the Java Concurrency API allows 
	you to easily create and use thread pools without worrying about the details


	Understanding Executors in Java
	An Executoris an object that is responsible for threads management and execution of Runnable tasks submitted 
	from the client code. It decouples the details of thread creation, scheduling, etc from the task submission 
	so you can focus on developing the task’s business logic without caring about the thread management details.


	The Java Concurrency API defines the following 3 base interfaces for executors:

		- Executor: is the super type of all executors. It defines only one method execute(Runnable).

		- ExecutorService: is an Executor that allows tracking progress of value-returning tasks (Callable) via 
		  Future object, and manages the termination of threads. Its key methods include submit() and shutdown().

		- ScheduledExecutorService: is an ExecutorService that can schedule tasks to execute after a given delay, 
		  or to execute periodically. Its key methods are schedule(), scheduleAtFixedRate() and scheduleWithFixedDelay().
		  
	You can create an executor by using one of several factory methods provided by the Executors utility class.

	Knowing the Executors class:

	In Java, the Executors class is a part of the java.util.concurrent package and serves as a factory and utility class 
	for creating and managing instances of ExecutorService, which provides a way to manage asynchronous tasks.

	This class supports the following kinds of methods:
	- Methods that create and return an ExecutorService set up with commonly useful configuration settings.
	- Methods that create and return a ScheduledExecutorService set up with commonly useful configuration settings.
	- Methods that create and return a "wrapped" ExecutorService, that disables reconfiguration by making 
	  implementation-specific methods inaccessible.
	- Methods that create and return a ThreadFactory that sets newly created threads to a known state.
	- Methods that create and return a Callable out of other closure-like forms, so they can be used in 
	  execution methods requiring Callable.

	 Here are some commonly used methods provided by the java.util.concurrent.Executors class:

	- newFixedThreadPool(int nThreads):Creates a thread pool that reuses a fixed number of threads.

	- newCachedThreadPool():Creates a thread pool that creates new threads as needed but reuses existing ones 
		when they are available.

	- newSingleThreadExecutor(): Creates a single-threaded executor that uses a single worker thread operating 
		off an unbounded queue.

	- newScheduledThreadPool(int corePoolSize): Creates a thread pool that can schedule commands to run after a given 
		delay or to execute periodically.

	- newSingleThreadScheduledExecutor():Creates a single-threaded executor that can schedule commands to run after 
		a given delay or to execute periodically.

	- newWorkStealingPool():Creates a thread pool that maintains enough threads to support the given parallelism level 
		and may use multiple queues to reduce contention.

	- newFixedThreadPool(int nThreads, ThreadFactory threadFactory):Creates a thread pool that reuses a fixed number of 
		threads, using a provided ThreadFactory to create new threads.

	- newSingleThreadExecutor(ThreadFactory threadFactory): Creates a single-threaded executor that uses a single 
		worker thread operating off an unbounded queue, using a provided ThreadFactory to create new threads.

	- newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory):Creates a thread pool that can schedule 
		commands to run after a given delay or to execute periodically, using a provided ThreadFactory to create 
		new threads.

	- newSingleThreadScheduledExecutor(ThreadFactory threadFactory):Creates a single-threaded executor that can schedule 
		commands to run after a given delay or to execute periodically, using a provided ThreadFactory to create new threads.

	Simple Executor and ExecutorService Examples:
	----------------------------------------------
 
/**
 * This program demonstrates how to create a single-threaded executor
 * to execute a Runnable task.
 */
 /*

// single task 
import java.util.concurrent.*;
public class SimpleExecutorExample {
 
    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
 
        Runnable task = new Runnable() {
            public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					try{Thread.sleep(800);}catch(Exception e){}
				}
            }
        }; 
        pool.execute(task);
 
        pool.shutdown();
    }
}

//----------------------------------------------------------------------------------------------------------------------

/// Multiple tasks

import java.util.concurrent.*;
public class SimpleExecutorExample {
 
    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
 
        Runnable task = new Runnable() {
            public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					try{Thread.sleep(800);}catch(Exception e){}
				}
            }
        }; 
        pool.execute(task);
 
        Runnable task1 = new Runnable() {
            public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					try{Thread.sleep(800);}catch(Exception e){}
				}
            }
        }; 
        pool.execute(task1);
 
        pool.shutdown();
    }
}	

//----------------------------------------------------------------------------------------------------------------------

	Java Callable and Future
	--------------------------

	Java Callable and Future are used a lot in multithreaded programming. we learned a lot about java threads but 
	sometimes we wish that a thread could return some value that we can use. Java 5 introduced java.util.concurrent.
	Callable interface in concurrency package that is similar to Runnable interface but it can return any Object 
	and able to throw Exception.

	The ExecutorServiceinterface defines a method that allows us to execute such kind of value-returning tasks:
	Future is an interface introduced in Java 5 that represents the result of an asynchronous computation. It allows 
	you to start a task, continue with other work, and later retrieve the result when it's ready.

     	<T> Future<T> submit(Callable<T> task)

	Here, the type parameter T is the return type of the task. You submit a task that implements the Callable

import java.util.concurrent.*;
 
/**
 * This program demonstrates how to create a single-threaded executor
 * to execute a Callable task.
 */
public class SimpleExecutorServiceExample {
 
    public static void main(String[] args) {

        ExecutorService pool = Executors.newSingleThreadExecutor();	
	
        Callable<Integer> task = new Callable<Integer>() {
            public Integer call() {
				int i=0, tot=0;
                try {
                    //task
					for(i=0;i<=10;i++)
					{
						tot=tot+i;
						Thread.sleep(1000);
						System.out.println("result = " + tot);
					}
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
 
                return tot;
            }
        };
 
        Future<Integer> result = pool.submit(task);
 
        try {
 
            Integer returnValue = result.get();
 
            System.out.println("Final result = " + returnValue);
 
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }
 
        pool.shutdown();
    }
}

//-------------------------------
CompletableFuture is an enhancement to the Future concept, introduced in Java 8. 
It allows you to create more complex asynchronous workflows, making it easier to chain multiple asynchronous tasks.


//------------------------------------------------------------------------------------------------------------------------

	// Java Cached Thread Pool Executor Example
	
	The following example shows you how to create a cached thread pool to execute some tasks concurrently. 
	Given the following class:

/**
 * This class represents a coutdown clock.
 */
import java.util.concurrent.*;
class CountDownClock extends Thread {
    private String clockName;
 
    public CountDownClock(String clockName) {
        this.clockName = clockName;
    }
 
    public void run() {
        String threadName = Thread.currentThread().getName();
 
        for (int i = 5; i >= 0; i--) {
 
            System.out.printf("%s -> %s: %d\n", threadName, clockName, i);
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
} 
/**
 * This program demonstrates how to execute multiple tasks
 * with different kinds of executors.
 */
public class MultipleTasksExecutorExample {
 
    public static void main(String[] args) {
 
        ExecutorService pool = Executors.newCachedThreadPool();
 
        pool.execute(new CountDownClock("A"));
        pool.execute(new CountDownClock("B"));
        pool.execute(new CountDownClock("C"));
        pool.execute(new CountDownClock("D"));
 
        pool.shutdown();
 
    }
}

//-------------------------------------------------------------------------------------------------------------

Fixed Thread Pool Executor Example
----------------------------------

/**
 * This class represents a coutdown clock.
 */
import java.util.concurrent.*;
class CountDownClock extends Thread {
    private String clockName;
 
    public CountDownClock(String clockName) {
        this.clockName = clockName;
    }
 
    public void run() {
        String threadName = Thread.currentThread().getName();
 
        for (int i = 5; i >= 0; i--) {
 
            System.out.printf("%s -> %s: %d\n", threadName, clockName, i);
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
} 
/**
 * This program demonstrates how to execute multiple tasks
 * with different kinds of executors.
 */
public class FixedeTasksExecutorExample {
 
    public static void main(String[] args) {
 
        ExecutorService pool = Executors.newFixedThreadPool(2);
 
        pool.execute(new CountDownClock("A"));
        pool.execute(new CountDownClock("B"));
        pool.execute(new CountDownClock("C"));
        pool.execute(new CountDownClock("D"));
        pool.execute(new CountDownClock("E"));
 
        pool.shutdown();
 
    }
}

//----------------------------------------------------------------------------------------------------------------------

Single-threaded Pool Executor Example
--------------------------------------

/**
 * This class represents a coutdown clock.
 */
import java.util.concurrent.*;
class CountDownClock extends Thread {
    private String clockName;
 
    public CountDownClock(String clockName) {
        this.clockName = clockName;
    }
 
    public void run() {
        String threadName = Thread.currentThread().getName();
 
        for (int i = 5; i >= 0; i--) {
 
            System.out.printf("%s -> %s: %d\n", threadName, clockName, i);
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
} 
/**
 * This program demonstrates how to execute multiple tasks
 * with different kinds of executors.
 */
public class SingleTasksExecutorExample {
 
    public static void main(String[] args) {
 
        ExecutorService pool = Executors.newSingleThreadExecutor();
 
        pool.execute(new CountDownClock("A"));
        pool.execute(new CountDownClock("B"));
        pool.execute(new CountDownClock("C"));
        pool.execute(new CountDownClock("D"));
 
        pool.shutdown();
 
    }
}

//--------------------------------------------------------------------------------------------------------------------------

Custom Thread Pool Executor
-----------------------------
	In case you want to have more control over the behaviors of a thread pool, you can create a thread pool executor 
	directly from the ThreadPoolExecutorclass instead of the factory methods of the Executors utility class.

	For example, the ThreadPoolExecutor has a general purpose constructor as follows:

	public ThreadPoolExecutor(int corePoolSize,
                  int maximumPoolSize,
                  long keepAliveTime,
                  TimeUnit unit,
                  BlockingQueue<Runnable> workQueue)

	You can tweak the parameters to suit your need, as long as you really understand what they mean:

	- corePoolSize: the number of threads to keep in the pool.
	- maximumPoolSize: the maximum number of threads to allow in the pool.
	- keepAliveTime: if the pool currently has more than corePoolSize threads, excess threads will be terminated 
			if they have been idle for more than keepAliveTime.
	- unit: the time unit for the keepAliveTime argument. Can be NANOSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS and DAYS.
	- workQueue: the queue used for holding tasks before they are executed. Default choices are SynchronousQueue 
		     for multi-threaded pools and LinkedBlockingQueue for single-threaded pools.

	Let’s see an example. The following code creates a cached thread pool that keeps minimum of 10 threads and allow 
	maximum of 1,000 threads, and idle threads are kept in the pool for 120 seconds:

	int corePoolSize = 10;
	int maxPoolSize = 1000;
	int keepAliveTime = 120;
	BlockingQueue<Runnable> workQueue = new SynchronousQueue<Runnable>();
 
	ThreadPoolExecutor pool = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.SECONDS, workQueue);
	pool.execute(new RunnableTask());

//------------------------------------------------------------

	Fork/Join is a framework (new in JDK 7) for taking advantage of multiple processors.
	---------------------------------------------------------------------------------------
	
	The Fork/Join framework was indeed introduced in Java 7 as part of the java.util.concurrent package. It's designed to
 	make it easier to write parallelizable algorithms by decomposing them into smaller tasks that can be executed 
	concurrently, taking advantage of multiple processors or cores.

	Here's a brief overview of the Fork/Join framework:

	o- Divide and Conquer: The Fork/Join framework follows the divide-and-conquer paradigm. It breaks down a large task into 
	smaller subtasks, which are executed independently in parallel. Once the subtasks are completed, their results are 
	combined to produce the final result of the original task.

	o- Work-Stealing Algorithm: Fork/Join employs a work-stealing algorithm to achieve load balancing among worker threads. 
	Each worker thread maintains its own deque (double-ended queue) of tasks. When a thread finishes executing its tasks, 
	it can "steal" tasks from the deque of another thread that is busy or has more tasks queued.

	o- Main Components:
	 - ForkJoinPool: The central component of the Fork/Join framework. It manages a pool of worker threads and distributes 
	   tasks among them.
	 - ForkJoinTask: Represents a task that can be executed asynchronously in the Fork/Join pool. It's an abstract class 
	   that can be subclassed to define specific tasks.
	 - RecursiveAction and RecursiveTask: Subclasses of ForkJoinTask. RecursiveAction is used for tasks that don't return 
	   a result, while RecursiveTask is used for tasks that produce a result.

	o- Parallelism and Concurrency: The Fork/Join framework allows developers to write parallel algorithms easily, taking 
	advantage of the parallelism offered by modern multi-core processors. By decomposing tasks into smaller units of 
	work and executing them concurrently, it can significantly improve the performance of certain types of computations.


import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ArraySumExample extends RecursiveTask<Long> {
    private static final int THRESHOLD = 1000;
    private int[] array;
    private int start;
    private int end;

    public ArraySumExample(int[] array, int start, int end) {
        this.array = array;
        this.start = start;qq
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            // Compute sum sequentially for small arrays
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            // Divide the array into smaller subarrays
            int mid = (start + end) / 2;
            ArraySumExample leftTask = new ArraySumExample(array, start, mid);
            ArraySumExample rightTask = new ArraySumExample(array, mid, end);

            // Fork the left and right subtasks
            leftTask.fork();
            long rightResult = rightTask.compute();

            // Join the results of the left and right subtasks
            long leftResult = leftTask.join();

            // Combine the results
            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        // Initialize array with random values
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        // Create a ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        // Create a task to compute the sum of the array
        ArraySumExample task = new ArraySumExample(array, 0, array.length);

        // Execute the task in the pool
        long result = pool.invoke(task);

        // Print the result
        System.out.println("Sum of the array: " + result);
    }
}

//---------------------------------------------------------------------

	Semaphore in java   (Semaphore: Dictionary meaning - an apparatus for conveying information by means of visual signals)
	-----------------
	A semaphore is an integer variable, shared among multiple processes. The main aim of using a semaphore is process 
	synchronization and access control for a common resource in a concurrent environment.

	In Java, the Semaphore class is part of the java.util.concurrent package and provides a mechanism for controlling 
	access to a shared resource. It maintains a set of permits, which are used to control the number of threads that 
	can access the resource concurrently.

	- Initialization: When creating a Semaphore, you specify the number of permits it should initially have. This represents 
	  the number of concurrent threads allowed to access the shared resource.

	- Acquiring and Releasing Permits: The acquire() method is used by a thread to acquire a permit from the Semaphore. 
	  If no permits are available, the calling thread will block until a permit becomes available.
	  The release() method is used by a thread to release a permit back to the Semaphore, making it available for other 
	  threads to acquire.

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    static Semaphore semaphore = new Semaphore(3); // Allow up to 3 concurrent accesses

    static class Worker extends Thread {
        private int id;

        public Worker(int id) {
            this.id = id;
        }

        public void run() {
            try {
                System.out.println("Worker " + id + " is waiting for permit...");
                semaphore.acquire();
                System.out.println("Worker " + id + " has acquired permit.");

                // Simulate some work
                for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName()+" - "+i);
					Thread.sleep(2000);
				}

                System.out.println("Worker " + id + " is releasing permit...");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Worker(i).start();
        }
    }
}


//-------------------------------------------------------------------------------------------------------------------------


	- Daemon Thread
       ------------------

What is Daemon Thread in Java?
Daemon thread in Java is a low-priority thread that performs background operations such as garbage collection, finalizer, Action Listeners, Signal dispatches, etc.

Daemon thread in Java is also a service provider thread that helps the user thread. Its life is at the mercy of user threads; when all user threads expire, JVM immediately terminates this thread.

In simple words, we can say that it provides services to user threads for background-supporting tasks. Daemon thread in Java has no role in life other than to serve user threads.

 Properties of Daemon Thread in Java
	- It's a thread with the possible lowest priority
	- They won't be able to stop the JVM from quitting once all of the user threads have completed their tasks.
	- When all user threads have completed their execution, the JVM terminates Daemon Thread.
	- If JVM finds a running daemon thread, it terminates the thread and, after that, shutdown it.
	- The JVM is unconcerned about whether the Daemon thread is active or not.
	- The nature of a demon is passed down from parent to child. That is, if the parent is a Daemon, the child will 
	  be a Daemon as well, and if the parent is a non-daemon, the child will be a non-daemon as well.

Methods for Daemon Thread in Java by Thread Class

 - public void setDaemon(boolean status)	
	This method marks whether the current thread as a daemon thread or a user thread.

 - public final boolean isDaemon()	
	This method is used to determine whether or not the current thread is a daemon. If the thread is Daemon, it returns true. 
	Otherwise, false is returned.

import java.util.Random;
class WorkerThread extends Thread
{
	public WorkerThread()
	{
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" - "+Thread.currentThread().getName());
			try{Thread.sleep(new Random().nextInt(1000));}catch(Exception e){}
		}
		System.out.println(Thread.currentThread().getName()+" - Ended");
	}
}
class Runner extends Thread
{
	public void run()
	{
		while(true)
		{
			
			try{Thread.sleep(new Random().nextInt(2000));}catch(Exception e){}
			System.out.println("Ob is Running: "+this.isAlive());
		}			
	}
}
class DaemonThreadExample
{
	public static void main(String[] args) 
	{
		Runner ob=new Runner();
		ob.setDaemon(true);
		ob.start();
		System.out.println("Ob is Running: "+ob.isAlive());

		Thread []tar=new Thread[4];
		for(int i=0;i<tar.length;i++)
		{
			tar[i]=new WorkerThread();
		}

		System.out.println("Ob is Running: "+ob.isAlive());
		System.out.println("Main Ended");
	}
}

//-------------------------------------------------------

	// child daemon Threads
	-------------------------

import java.util.Random;
class WorkerThread extends Thread
{
	public WorkerThread()
	{
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" - "+Thread.currentThread().getName());
			try{Thread.sleep(new Random().nextInt(1000));}catch(Exception e){}
		}
		System.out.println(Thread.currentThread().getName()+" - Ended");
	}
}
class Runner extends Thread
{
	public void run()
	{
		Thread []tar=new Thread[4];
		for(int i=0;i<tar.length;i++)
		{
			tar[i]=new WorkerThread();
		}
		while(true)
		{
			
			try{Thread.sleep(new Random().nextInt(2000));}catch(Exception e){}
			System.out.println("Ob is Running: "+this.isAlive());
		}			
	}
}
class DaemonThreadExample1
{
	public static void main(String[] args) 
	{
		Runner ob=new Runner();
		ob.setDaemon(true);
		ob.start();
		System.out.println("Ob is Running: "+ob.isAlive());

		for(int i=0;i<5;i++)
		{
			System.out.println(i+" - "+Thread.currentThread().getName());
			try{Thread.sleep(new Random().nextInt(1000));}catch(Exception e){}
		}
		System.out.println("Main Ended");
	}
}

Daemon Thread vs User Thread

learn more about the distinctions between Daemon and User threads:

	Daemon Threads					User Threads (Non-daemon)

	- Low Priority threads				- High priority threads
	- The JVM does not wait for its execution 	- The JVM waits till the execution is finished.
	  to complete.
	- Life is dependent on user threads		- Life is independent
	- Daemon threads are created by JVM		- An application creates its own user threads.
	- provides service to the user thread 		- Used for foreground tasks.
	  which runs in the background

///===============================================================================================================================
///===============================================================================================================================
///===============================================================================================================================

	/// Uding Java Library Classes: 


	/// java.lang.Object:
	------------------

In Java, java.lang.Object is the root class of all classes. Every class in Java is a direct or indirect subclass of Object. It's located in the java.lang package, which is automatically imported into every Java program, so you don't need to explicitly import it.

	constructor: 
	 - Object() : Default Constructor.

The Object class defines several important methods that are available to all Java objects. Some of the most commonly used methods defined in Object are:

	- toString(): Returns a string representation of the object. By default, this method returns the class name followed by the "@" symbol and the hash code of the object.

equals(Object obj): Indicates whether some other object is "equal to" this one. The default implementation in Object compares object references.

hashCode(): Returns a hash code value for the object. The default implementation returns the internal memory address of the object in hexadecimal form.

getClass(): Returns the runtime class of this object. This method returns an instance of the Class class that provides information about the object's class.

notify(), notifyAll(), and wait(): These methods are used for inter-thread communication and synchronization.


	// creating an object of Object class.

class Demo
{
	public static void main(String []aegs)
	{
		Object ob=new Object();
		......
	}
}

class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Object ob=new Object();
		System.out.println(" Ob Prints: "+ob);
	}
}

/*
will gives the output
 Ob Prints: java.lang.Object@372f7a8d

 	372f7a8d - Hashcode, What is means...??

	A hash code is an integer value that is associated with each object in Java. 
	Its main purpose is to facilitate hashing in hash tables, which are used by 
	data structures like HashMap.
*/

	// generally it is the string representation of an object, bydefault its starts with class namethen @ and then 
	// hashcode of object, but it is expected that, override that method in child class to represent the object in 
	// its equivalent object as as you want or as needed.

	// When you print object directly the bydefault toString method is invoked.

class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Object ob=new Object();
		System.out.println(" Ob Prints: "+ob);
		System.out.println(" Ob Prints: "+ob.toString());
	}
}

// which will gives same output.

//---------------------------------------------------------

	// Overriding the toString method: AS any class having the java.lang.Object as parent. we are allowed to 
	   override the toString method.

class MyClass
{
	String info;
}
class ObjectDemoExample
{
	public static void main(String[] args) 
	{
		MyClass ob=new MyClass();
		System.out.println("Object Information: "+ob);
	}
}
	
-------output on run ---------
 Ob Prints: java.lang.Object@372f7a8d
Press any key to continue . . .


class MyClass
{
	String info;
	public String toString()
	{
		return "Printing object inforamtion";
	}
}
class ObjectDemoExample
{
	public static void main(String[] args) 
	{
		MyClass ob=new MyClass();
		System.out.println("Object Information: "+ob);
	}
}
-------output on run ---------
Object Information: Printing object inforamtion
Press any key to continue . . .

//----------------------------------------------------------------------------	

class MyClass extends Thread
{
	Thread t;
	public MyClass()
	{
		super("Thread - 0");
		t=this;
	}
	String info;
	public String toString()
	{
		t=Thread.currentThread();
		info= "["+t.getName()+", "+t.getPriority()+", "+t.getThreadGroup()+"]";
		return info;
	}
}
class ObjectDemoExample
{
	public static void main(String[] args) 
	{
		MyClass ob=new MyClass();
		System.out.println("Object Information: "+ob);
	}
}

//--------------------------------------------------
class MyException extends Exception
{
	String exp_info;
	public MyException(String t)
	{
		exp_info=t;
	}
	public String toString()
	{
		return exp_info;
	}
}

class ObjectDemoExample
{
	public static void main(String[] args) 
	{
		MyException ob=new MyException("Exception inforamtion");
		System.out.println("Object Information: "+ob);
	}
}

//----------------------------------------------------------------------------------------------------------

	// Using clone() and equals():

	clone(): It is protected method and returns called from a class implements Cloneable interface, which gives
		 copy of invoking(this) object, and may genetate CloneNotSupportedException exception.

	equals(): This method returns true when both objects(invoking and argument) refering towards same location.
		  It will return false even when two different object having same value. 

class A implements Cloneable
{
	int data;
	A()
	{
		data=100;
	}
	public void setA(int data)
	{
		this.data=data;
	}
	public int getA()
	{
		return data;
	}
	public Object getClone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class DemoClone
{
	public static void main(String []args)
	{
		try
		{
			A ob = new A();
			A ob1 = (A) ob.getClone();

			System.out.println(" val of Ob: "+ob.getA());
			System.out.println(" val of Ob1: "+ob1.getA());
			System.out.println(" Ob equals(ob1) is: "+ob.equals(ob1)); // false - coz both having different Hashcode
			// As the both location are different(eventhough having same value),
			// it will gives false.

			A ob2 = ob;
			System.out.println(" Ob equals(ob2) is: "+ob.equals(ob2)); // ture - coz both having same Hashcode
			// gives ture as the reference is copied, means both refering towards
			// same location

			ob2.setA(1500);
			System.out.println(" val of Ob: "+ob.getA());
			System.out.println(" val of Ob2: "+ob2.getA());

			System.out.println(" Hashcode of Ob: "+ob);
			System.out.println(" Hashcode of ob1: "+ob1);
			System.out.println(" Hashcode of Ob2: "+ob2);
		}
		catch (Exception e)
		{
		}
	}
}

--------- Output on run ----------
 val of Ob: 100
 val of Ob1: 100
 Ob equals(ob1) is: false
 Ob equals(ob2) is: true
 val of Ob: 1500
 val of Ob2: 1500
Press any key to continue . . .


	*** What is difference between = and equals()

//-------------------------------------------------------------------------------------------------------------------------------

finalize(): Called by the garbage collector when the object is about to destroy. (just before deletion)

clas MyClass
{
	....
	protected void finalize()
	{
		con.close();  // close the connect with resource hold by the connect object con.
	}
}

//-------------------------------------------------------------------------------------------------------------------------------

	// Using getClass() and hashCode(): 

		- Class<?> getClass(): Returns the runtime class of this Object.
		- int hashCode(): Returns a hash code value for the object.

class Demo
{
	private int a;
	{a=100;}
	public void print()
	{
		System.out.println("a="+a);
	}
}
class MainObjectClass
{
	public static void main(String []args)
	{
		Demo d=new Demo();
		System.out.println("class Name: "+d.getClass());
		System.out.println("Hashcode: "+d.hashCode());
	}
}


//=========================================================================================================

	// Wrapper Classes in Java: 

	- It is actually group of classes, used to represent the data type in its equivalent object form.
	- They are known as wrapper classes, coz individual class represents, i.e. wraps up, one data
	  type within it.
	
		e.g.: just like the classes that we have defined..!!

		class MyIntArray		class MyInt		class MyString
		{				{			{
			int x[];			int no;			char []data;	
			....				.....		 	.....
		} 				}			}

	- Here in java we are unable to pass the the values of builtin type by reference. coz we dont 
	  have ampersand operator or here in java creating alise using &, is not allowed. But as the 
	  object gains the dynamic memory space, it is possible to values of builtin by reference, when
	  they are represented in its equivalent object from.

	- List of data type and provided classes

		----------------------------------------------
		data type			Wrapper class
		----------------------------------------------
		char				Character
		byte				Byte
		short				Short
		int				Integer
		long				Long
		float				Float
		double				Double
		boolean				Boolean
		----------------------------------------------
	 Note that,
			byte b;	   // is a variable
			Byte b;    // is a object

	- Hierarchical diagram of Wrapper classes

	Object
	│
	├─── Number
	│    ├─── Byte
	│    ├─── Short
	│    ├─── Integer
	│    ├─── Long
	│    ├─── Float
	│    └─── Double
	├─── Boolean
	└─── Character


	- Wrapper classes provide useful methods and properties that are not available with primitive data types. 

	- Using Wrapper classes Autoboxing and Unboxing become very easy.

	- They facilitate converting primitive data types into objects and vice versa. 

	- Wrapper classes allow for null values. Primitive data types cannot be null, but their corresponding wrapper classes can. 	   	  This is beneficial when you need to represent the absence of a value.

	- They simplify casting between different types. 

	- They enable the use of primitive data types in collections and other classes that only work with objects.

	- wrapper classes in Java, provides instances which are immutable. Once created, the value stored 
	  cannot be changed.

//----------------------------------------------------------------

- java.lang.Number Class:
--------------------------
	class Declaration: 
		- public abstract class Number extends Object implements Serializable

	(Serialization in Java refers to the process of converting an object into a byte stream, 
	 which can be easily stored in a file or sent over the network. This byte stream can then be 
	 reconstructed back into an object whenever needed.)

	Constructor: 
		- Number(): 

	methods: 	
	- byte byteValue(): method returning the value of the specified number as a byte.
	- double doubleValue(): Abstract method returning the value of the specified number as a double.
	- float floatValue(): Abstract method returning the value of the specified number as a float.
	- int intValue(): Abstract method returning the value of the specified number as an integer.
	- long longValue(): Abstract method returning the value of the specified number as a long.
	- short shortValue(): method returning the value of the specified number as a short.

	*Note: All these methods are present in all classes used to represent Numeric values.

- java.lang.Byte class:
-------------------------
	The java.lang.Byte class is a wrapper class for the primitive data type byte. It provides methods 
	to parse, convert, and manipulate byte values. 

	Fields:
	- public static final byte MIN_VALUE: The minimum value that a byte can have: -128.
	- public static final byte MAX_VALUE: The maximum value that a byte can have: 127.
	- public static final Class<Byte> TYPE: The Class object representing the primitive type byte.
	- public static int BYTES: The number of bytes used to represent a byte value in two's complement binary form.
	- public static int SIZE: The number of bits used to represent a byte value in two's complement binary form.

	Constructors:
	- public Byte(byte value): Constructs a newly allocated Byte object that represents the specified byte value.
	- public Byte(String s) throws NumberFormatException: Constructs a newly allocated Byte object that represents 
		the byte value indicated by the String parameter. The string is converted to a byte value as if by the 
		byte.parseByte method.

	Methods:
	- public byte byteValue(): Returns the value of this Byte object as a byte primitive.
	- public int compareTo(Byte anotherByte): Compares two Byte objects numerically.
	- public double doubleValue(): Returns the value of this Byte object as a double primitive.
	- public boolean equals(Object obj): Compares this object to the specified object. The result is true if and 
		only if the argument is not null and is a Byte object that contains the same byte value as this object.
	- public float floatValue(): Returns the value of this Byte object as a float primitive.
	- public int hashCode(): Returns a hash code for this Byte object.
	- public int intValue(): Returns the value of this Byte object as an int primitive.
	- public long longValue(): Returns the value of this Byte object as a long primitive.
	- public static byte parseByte(String s) throws NumberFormatException: Parses the string argument as a 
		signed decimal byte.
	- public short shortValue(): Returns the value of this Byte object as a short primitive.
	- public String toString(): Returns a string representation of this Byte object in base 10.
	- static String	toString(byte b): Returns a new String object representing the specified byte.
	- public static Byte valueOf(byte b): Returns a Byte instance representing the specified byte value.
	- public static Byte valueOf(String s) throws NumberFormatException: Returns a Byte object holding the 
		value of the specified String.
	- public static Byte valueOf(String s, int radix) throws NumberFormatException: Returns a Byte object holding the 
		value extracted from the specified String when parsed with the radix given by the second argument.


class ByteWrapperDemo 
{
	public static void main(String[] args) 
	{
		// Byte class fields
		System.out.println("Min Value: "+Byte.MIN_VALUE);
		System.out.println("Min Value: "+Byte.MAX_VALUE);
		System.out.println("Representing primitive type: "+Byte.TYPE);		
		System.out.println("Space Needed in bytes: "+Byte.BYTES);		
		System.out.println("Space Needed in bits: "+Byte.SIZE);

		// Using Byte class constructors
		Byte ob1=new Byte((byte)10);  		
		byte b=10;
		Byte ob2=new Byte(b);      
		Byte ob3=new Byte("123");     
		
		// Converting the value to different primitive type
		System.out.println("byte value: "+ob1.byteValue());
		System.out.println("short value: "+ob1.shortValue());
		System.out.println("int value: "+ob1.intValue());
		System.out.println("long value: "+ob1.longValue());
		float ft=ob1.floatValue();
		System.out.println("float value: "+ft);
		double db=ob1.doubleValue();
		System.out.println("double value: "+db);

		// using public int compareTo(Byte anotherByte)
		// this method returns numeric ans of ob1-ob2/ob3, it is non-zero when
		// objects having different value and zero when objects having same value.
		int t=ob1.compareTo(ob3);
		System.out.println("return value t: "+t);
		t=ob1.compareTo(ob2);
		System.out.println("return value t: "+t);

		// using public boolean equals(Object obj):
		boolean ans=ob1.equals(ob2);
		System.out.println("return value ans: "+ans);
		// equals give true when both reference refering towards samelocation
		// here in this case ans is true coz as the ob1 and ob2 having same value
		// while creating object, in same vaue is there in memory the that location
		// is refered by new reference.
		// if we change the value of ob1 or ob2, then it will gives false.

		// Note: compareTo() compares the numeric values of object and equals()
		//	     compares the references of both objects, means both objects are
		//		 refering towards same ocation or not.

		ans=ob1.equals(ob3);
		System.out.println("return value ans: "+ans);


		// Using Parsing
		String num="120";
		byte n=Byte.parseByte(num);
		System.out.println("byte n: "+n);

		// using toString()
		byte val1=56;
		String s=Byte.toString(val1);		
		System.out.println("String s: "+s);

		String s1=ob3.toString();
		System.out.println("String s1: "+s1);

		// using valueOf()

		byte val2=15;
		Byte ob4=Byte.valueOf(val2);
		System.out.println("ob4 is: "+ob4); // ob4.toString() called internally

		String s2="45";
		Byte ob5=Byte.valueOf(s2);
		System.out.println("ob5 is: "+ob5);
	}
}

//----------------------------------------------------------------------------------------------
 
- java.lang.Short class:
-------------------------
	The java.lang.Short class is a wrapper class for the primitive data type short. It provides methods to parse, convert, 
	and manipulate short values. 

	Fields:
	- public static final short MIN_VALUE: The minimum value that a short can have: -32768.
	- public static final short MAX_VALUE: The maximum value that a short can have: 32767.
	- public static final Class<Short> TYPE: The Class object representing the primitive type short.
	- static int BYTES: The number of bytes used to represent a short value in two's complement binary form.
	- static int SIZE: The number of bits used to represent a short value in two's complement binary form.

	Constructors:
	- public Short(short value): Constructs a newly allocated Short object that represents the specified short value.
	- public Short(String s) throws NumberFormatException: Constructs a newly allocated Short object that represents 
		the short value indicated by the String parameter. The string is converted to a short value as if by the 
		short.parseShort method.

	Methods:
	- public byte byteValue()
	- public int compareTo(Short anotherShort)
	- public double doubleValue()
	- public boolean equals(Object obj)
	- public float floatValue()
	- public int hashCode()
	- public int intValue()
	- public long longValue()
	- public static short parseShort(String s) throws NumberFormatException
	- public static short parseShort(String s, int radix) throws NumberFormatException
	- public short shortValue()
	- public String toString()
	- public static Short valueOf(short s)
	- public static Short valueOf(String s) throws NumberFormatException
	- public static Short valueOf(String s, int radix) throws NumberFormatException


class ShortDemo 
{
	public static void main(String[] args) 
	{
		String nms="1111";
		short no=Short.parseShort(nms,2);
		System.out.println("No: "+no);
	}
}

//----------------------------------------------

java.lang.Integer class:
-------------------------

	Fields:
	- public static final int MIN_VALUE
	- public static final int MAX_VALUE
	- public static final Class<Integer> TYPE
	- static int BYTES
	- static int SIZE

	Constructors:
	- public Integer(int value)
	- public Integer(String s) throws NumberFormatException

	Methods:
	- public byte byteValue()
	- public int compareTo(Integer anotherInteger)
	- public double doubleValue()
	- public boolean equals(Object obj)
	- public float floatValue()
	- public int hashCode()
	- public int intValue()
	- public long longValue()
	- public static int parseInt(String s) throws NumberFormatException
	- public static int parseInt(String s, int radix) throws NumberFormatException
	- public short shortValue()
	- public String toString()
	- public static Integer valueOf(int i)
	- public static Integer valueOf(String s) throws NumberFormatException
	- public static Integer valueOf(String s, int radix) throws NumberFormatException

	// ets check how the object is passed by reference

class MyNumber1
{
	int x;
	int y;
	public void setVal(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void show()
	{
		System.out.println("x="+x+"\t y="+y);
	}
	void swap(MyNumber1 tmp)
	{
		int t=tmp.x;
		tmp.x=tmp.y;
		tmp.y=t;
	}
}
class SwapDemo
{
	public static void main(String[] args) 
	{
		MyNumber1 ob=new MyNumber1();		
		MyNumber1 ob1=new MyNumber1();
		ob.setVal(12,23);

		ob.show();
		ob1.swap(ob);
		ob.show();		
	}
}

//----------------------------------------------------------------------------------------------

java.lang.Long class:
----------------------

	Fields:
	- public static final long MIN_VALUE
	- public static final long MAX_VALUE
	- public static final Class<Long> TYPE

	Constructors:
	- public Long(long value)
	- public Long(String s) throws NumberFormatException

	Methods:
	- public byte byteValue()
	- public int compareTo(Long anotherLong)
	- public double doubleValue()
	- public boolean equals(Object obj)
	- public float floatValue()
	- public int hashCode()
	- public int intValue()
	- public long longValue()
	- public static long parseLong(String s) throws NumberFormatException
	- public static long parseLong(String s, int radix) throws NumberFormatException
	- public short shortValue()
	- public String toString()
	- public static Long valueOf(long l)
	- public static Long valueOf(String s) throws NumberFormatException
	- public static Long valueOf(String s, int radix) throws NumberFormatException


//----------------------------------------------------------------------------------------------


java.lang.Float class:
----------------------

	Fields:
	- public static final float POSITIVE_INFINITY: Represents positive infinity.
	- public static final float NEGATIVE_INFINITY: Represents negative infinity.
	- public static final float NaN: Represents "not a number" (NaN).
	- public static final float MAX_VALUE: The maximum positive finite value of type float.
	- public static final float MIN_NORMAL: The smallest positive nonzero value of type float.
	- public static final float MIN_VALUE: The smallest positive value of type float.
	- public static final int MAX_EXPONENT: The maximum exponent a finite float variable may have.
	- public static final int MIN_EXPONENT: The minimum exponent a normalized float variable may have.
	- public static final int SIZE: The number of bits used to represent a float value.
	- public static final int BYTES: The number of bytes used to represent a float value.
	- public static final Class<Float> TYPE: The Class object that represents the primitive type float

	Constructors:
	- public Float(double value)
	- public Float(float value)
	- public Float(String s) throws NumberFormatException

	Methods:
	- public byte byteValue()
	- public int compareTo(Float anotherFloat)
	- public double doubleValue()
	- public boolean equals(Object obj)
	- public int hashCode()
	- public int intValue()
	- public boolean isInfinite()
	- public boolean isNaN()
	- public long longValue()
	- public static float parseFloat(String s) throws NumberFormatException
	- public short shortValue()
	- public String toString()
	- boolean isInfinite()
	- static boolean isInfinite(float v)
	- boolean isNaN()
	- static boolean isNaN(float v)
	- static float	max(float a, float b)
	- static float	min(float a, float b)
	- static float	sum(float a, float b)
	- static String	toHexString(float f)
	- public static String toString(float f)
	- public static Float valueOf(float f)
	- public static Float valueOf(String s) throws NumberFormatException

class FractionaWrapperExampe 
{
	public static void main(String[] args) 
	{
		int x=10, y=0;
		//System.out.println("x/y: "+(x/y)); 
		//Exception in thread "main" java.lang.ArithmeticException: / by zero

		float a=12.4f,b=0.0f;
		System.out.println("a/b: "+(a/b)); // a/b: Infinity

		float p=-132.4f,q=0.0f;
		System.out.println("p/q: "+(p/q)); // p/q: -Infinity

		System.out.println(0.0 / 0.0);	  //zero divided by zero //NaN
        	System.out.println(Math.sqrt(-1)); //take sqrt of negative number //NaN
        	System.out.println(10.0 % 0);      //taking mod by zero //NaN

		float v1=56.34f, v2=67.23f,vmax=0.0f,vmin=0.0f;
		vmax=Float.max(v1,v2);
		vmin=Float.min(v1,v2);
		System.out.println("Min Value: "+vmin+"\t Max Value: "+vmax);
		System.out.println("v1+v2= "+Float.sum(v1,v2));

		v1=15F;
		System.out.println("Hex of v1: "+Float.toHexString(v1));		
	}
}

//--------------------------------------------------------------------------

java.lang.Double class:
------------------------

	Fields:
	- public static final double POSITIVE_INFINITY
	- public static final double NEGATIVE_INFINITY
	- public static final double NaN
	- public static final double MAX_VALUE
	- public static final double MIN_NORMAL
	- public static final double MIN_VALUE
	- public static final int MAX_EXPONENT
	- public static final int MIN_EXPONENT
	- public static final int SIZE
	- public static final int BYTES
	- public static final Class<Double> TYPE

	Constructors:
	- public Double(double value)
	- public Double(String s) throws NumberFormatException

	Methods:
	- public byte byteValue()
	- public int compareTo(Double anotherDouble)
	- public double doubleValue()
	- public boolean equals(Object obj)
	- public float floatValue()
	- public int hashCode()
	- public int intValue()
	- public boolean isInfinite()
	- public boolean isNaN()
	- public long longValue()
	- public static double parseDouble(String s) throws NumberFormatException
	- public short shortValue()
	- public String toString()	
	- static float	max(float a, float b)
	- static float	min(float a, float b)
	- static float	sum(float a, float b)
	- static String	toHexString(float f)
	- public static String toString(double d)
	- public static Double valueOf(double d)
	- public static Double valueOf(String s) throws NumberFormatException


 - boxing, autoboxing and unboxing in java
----------------------------------------------

	In Java, boxing, autoboxing, and unboxing are concepts related to the conversion between primitive data types and
	their corresponding wrapper classes.

	- Boxing: Boxing is the process of converting a primitive data type into its equivalent wrapper class object manually. 
		This conversion is done explicitly by calling the constructor of the wrapper class or by using static 
		factory methods.

	- Autoboxing: Autoboxing is the automatic conversion of primitive data types into their corresponding wrapper 
		class objects. It occurs when a primitive data type is used in a context where an object of its wrapper 
		class is expected. it will automatically converting primitive types to their wrapper classes when needed.

	- Unboxing: Unboxing is the process of converting a wrapper class object back to its corresponding primitive data 
		type manually. This conversion is done explicitly by calling methods provided by the wrapper class, such as 
		intValue() for Integer or it will happen automatically when an object directy assigned to primitive type variable.

class TestExample 
{
	public static void main(String[] args) 
	{
		double d=45.34;
		Double obj=new Double(d); // Boxing
		double val=obj.doubleValue(); // Unboxing
		System.out.println("Double value: "+val);
		//-------------------------------------------
		Integer ob=10;	// Autoboxing
		System.out.println(ob); // Unboxing

		int x=ob;	// Unboxing
		System.out.println(x);
	}
}

//--------------------------------------------------------------------------

java.lang.Boolean class:
-------------------------

	Fields:
	- public static final Boolean TRUE: Represents the true value of the boolean type.
	- public static final Boolean FALSE: Represents the false value of the boolean type.

	Constructors:
	- public Boolean(boolean value): Constructs a newly allocated Boolean object that represents the specified 
		boolean value. This constructor creates a Boolean object initialized with the specified boolean value.

	- public Boolean(String s) throws IllegalArgumentException: Constructs a newly allocated Boolean object that represents 
		the value true if the string argument is not null and is equal, ignoring case, to the string "true". Otherwise, 
		it represents the value false.

	- static Class<Boolean>	TYPE: The Class object representing the primitive type boolean.

	Methods:
	- public boolean booleanValue()
	- public int compareTo(Boolean b)
	- public boolean equals(Object obj)
	- public int hashCode()
	- public static Boolean valueOf(boolean b)
	- public static Boolean valueOf(String s)
	- public String toString()
	- static int hashCode(boolean value)
	- static boolean logicalAnd(boolean a, boolean b)
	- static boolean logicalOr(boolean a, boolean b)
	- static boolean logicalXor(boolean a, boolean b)
	- static boolean getBoolean(String name)

class BooleanWrapperExample 
{
	public static void main(String[] args) 
	{
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("false");        
		System.out.println("b1: "+b1+"\t b2: "+b2);

		// logical AND
		System.out.println(Boolean.logicalAnd(b1,b2));
		System.out.println(Boolean.logicalAnd(false,true));
		System.out.println(Boolean.logicalAnd(b1,true));
		System.out.println(Boolean.logicalAnd(false,b2));
		System.out.println("--------------------------------------");

		// logical OR
		System.out.println(Boolean.logicalOr(b1,b2));
		System.out.println(Boolean.logicalOr(false,true));
		System.out.println(Boolean.logicalOr(b1,true));
		System.out.println(Boolean.logicalOr(false,b2));
		System.out.println("--------------------------------------");

		// logical XOR
		System.out.println(Boolean.logicalXor(b1,b2));
		System.out.println(Boolean.logicalXor(false,true));
		System.out.println(Boolean.logicalXor(b1,true));
		System.out.println(Boolean.logicalXor(false,b2));
		System.out.println("--------------------------------------");
	}
}

//-------------------------------------------------------------------------------------------------------------------------

java.lang.Character class:
----------------------------

	Fields:
	- public static final char MIN_VALUE
	- public static final char MAX_VALUE
	- public static final int MIN_RADIX
	- public static final int MAX_RADIX
	- public static final Class<Character> TYPE

	Constructors:
	- public Character(char value)

	Methods:
	- static int charCount(int codePoint)
	- public char charValue()
	- static int compare(char x, char y)
	- public int compareTo(Character anotherCharacter)
	- public boolean equals(Object obj)
	- public int hashCode()
	- static boolean isAlphabetic(int codePoint)
	- public static boolean isDigit(char ch)
	- public static boolean isLetter(char ch)
	- public static boolean isLetterOrDigit(char ch)
	- public static boolean isLowerCase(char ch)
	- public static boolean isUpperCase(char ch)
	- public static char toLowerCase(char ch)
	- public static char toUpperCase(char ch)
	- public static String toString(char c)
	- public static Character valueOf(char c)
	- public static Character valueOf(String s)

public class CharacterMethodsDemo 
{
    public static void main(String[] args) 
    {
        // Character methods demonstration
        char ch = 'A';

        // isLetter
        System.out.println("isLetter('A'): " + Character.isLetter(ch));

        // isDigit
        System.out.println("isDigit('5'): " + Character.isDigit(ch));

        // isWhitespace
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(' '));

        // isUpperCase
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(ch));

        // isLowerCase
        System.out.println("isLowerCase('a'): " + Character.isLowerCase(ch));

        // toUpperCase
        System.out.println("toUpperCase('a'): " + Character.toUpperCase('a'));

        // toLowerCase
        System.out.println("toLowerCase('A'): " + Character.toLowerCase('A'));

        // getNumericValue
        System.out.println("getNumericValue('5'): " + Character.getNumericValue('5'));

        // compare
        System.out.println("compare('A', 'B'): " + Character.compare('A', 'B'));

        // toString
        System.out.println("toString('C'): " + Character.toString('C'));
    }
}


//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------

java.util.Arrays Class:
------------------------

	The Arrays class in Java provides various utility methods for working with arrays. It is part of the java.util package. 
	This class contains various methods for manipulating arrays (such as sorting and searching). This class also contains a 
	static factory that allows arrays to be viewed as lists.
	
	Some of the commonly used methods are:

	- Sorting Arrays:
		- public static void sort(int[] array): Sorts the specified array of integers into ascending numerical order.
		- public static void sort(Object[] array): Sorts the specified array of objects into ascending order, according 
			to the natural ordering of its elements. The range to be sorted extends from the index fromIndex(inclusive) 
			to the index toIndex(exclusive).
		- static void	parallelSort(int[] a): Sorts the specified array into ascending numerical order.

	- Searching Arrays:
		- public static int binarySearch(int[] array, int key): Searches the specified array of integers for the 
			specified value using the binary search algorithm. Returns index of the search key, if it is contained 
			in the array; otherwise returns, (-(insertion point) - 1).
		- public static int binarySearch(Object[] array, Object key): Searches the specified array of objects for 
			the specified object using the binary search algorithm.

	- Converting Arrays to Strings:
		- public static String toString(int[] array): Returns a string representation of the contents of the 
		  specified array.

	- Filling Arrays:
		- public static void fill(int[] array, int value): Assigns the specified int value to each element of the 
			specified array of integers.
		- static void	fill(int[] a, int fromIndex, int toIndex, int val): Assigns the specified int value to each 
			element of the specified range of the specified array of ints.

	- Copying Arrays:
		- public static int[] copyOf(int[] original, int newLength): Copies the specified array, truncating or padding 
			with zeros (if necessary) so the copy has the specified length.
		- static int[]	copyOfRange(int[] original, int from, int to): Copies the specified range of the specified array 
			into a new array.

	- Comparing Arrays:
		- public static boolean equals(int[] a, int[] b): Returns true if the two specified arrays of integers are 
			equal to one another.

import java.util.Arrays;
class ArraysExample
{
	public static void main(String[] args) 
	{
		int []x={34,5,67,9,23,45,12};

		// Using toString() to display the array
		System.out.println("Entered x array is: "+Arrays.toString(x));

		// using sort
		Arrays.sort(x);		
		System.out.println("Sorted x array is: "+Arrays.toString(x));

		//using sort a specific range
		int []y={34,5,67,9,23,45,12,40,69,233,10};
		System.out.println("Entered y array is: "+Arrays.toString(y));
		Arrays.sort(y,2,7);
		System.out.println("Sorted y array is: "+Arrays.toString(y));

		// searching
		int key=47;
		int pos=Arrays.binarySearch(x,key);
		System.out.println("Position is: "+pos);

		//fill
		Arrays.fill(x,1);
		Arrays.fill(y,2,7,111);		
		System.out.println("After fill x array is: "+Arrays.toString(x));
		System.out.println("After fill range y array is: "+Arrays.toString(y));

		// copy
		int []z=Arrays.copyOf(x,12);		
		System.out.println("After copyOf(), z array is: "+Arrays.toString(z));

		int []t=Arrays.copyOf(y,5);		
		System.out.println("After copyOf(), t array is: "+Arrays.toString(t));

		int []t1=Arrays.copyOf(y,y.length);		
		System.out.println("After copyOf(), t1 array is: "+Arrays.toString(t1));

		int []t2=Arrays.copyOfRange(y,4,8);		
		System.out.println("After copyOf(), t1 array is: "+Arrays.toString(t2));

		// Using equals
		boolean b=Arrays.equals(x,y);
		System.out.println("x equals y: "+b);

		boolean b1=Arrays.equals(t1,y);
		System.out.println("t1 equals y: "+b1);

		int []k={1,1,1,1,1,1,1};
		boolean b2=Arrays.equals(x,k);
		System.out.println("x equals k: "+b2);
	}
}

//--------------------------------------------------------------------------------------------------------------

// Shallow Copy, Deep Copy in Java:
-------------------------------------

 // While using equals() we get confused, to clear all in depth, you must the the concept of shallow copy and Deep copy.

 - Shallow Copy :
	When we do a copy of some entity to create two or more than two entities such that changes in one entity are reflected in 
	the other entities as well, then we can say we have done a shallow copy. In shallow copy, new memory allocation never 
	happens for the other entities, and the only reference is copied to the other entities.
	We will get the same result, when we assign one reference variable to other of same type.

	Sample ob1=new Sample(100); ------|
					  |--- In both cases the reference variables ob1 and ob2 pointing towards same location.
	Sample ob2=ob1; ------------------|    and changing value of one will be reflected in other, so it is Shallow copy.


 - Deep Copy:
	When we do a copy of some entity to create two or more than two entities such that changes in one entity are not reflected 
	in the other entities, then we can say we have done a deep copy. In the deep copy, a new memory allocation happens for the
	other entities, and reference is not copied to the other entities. Each entity has its own independent reference.

	e.g.
	Test t=new Test(10);  --|
			        |---- In both cases the reference variables t and ob are not pointing towards same location.
	Test ob= new Test(10) --|     and changing value of one will not be reflected in other, so it is deep copy.

 - Lazy Copy: 
	A lazy copy can be defined as a combination of both shallow copy and deep copy. At start it is a shallow copy but when
	needed individual exesistence is created.
	
	e.g. when we declare 1st array. and if we declare another array with same values and same size the initially, shallow copy 
	     is created(both references refering towards same location), and when you modify the value of any 1 location from any
	     array they will gains individual exsistence in the memory.(deep copy) and therefore it is known as Lazy copies.

	Lets see simple example...

import java.util.Arrays;
class Sample 
{
	private int num;
	public Sample()
	{
		num=1;
	}
	public Sample(int num)
	{
		this.num=num;
	}
	public void set(int num)
	{
		this.num=num;
	}
	public void show()
	{
		System.out.println("value of num: "+num);
	}
}
class ShallowExample
{
	public static void main(String []args)
	{
		// shallow copies
		Sample ob1=new Sample();
		Sample ob2=ob1;
		ob1.set(1000);
		ob2.show();		
		System.out.println("ob1 equals ob2: "+ob1.equals(ob2));
		System.out.println("------------------------------------------");
		// As the change in ob1 is reflected in ob2 these are shallow copies.		
		//---------------------------

		// deep copies
		Sample s1=new Sample(100);	
		Sample s2=new Sample(100);
		System.out.println("s1 equals s2: "+s1.equals(s2));
		s1.set(45);
		s1.show();
		s2.show();
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("------------------------------------------");
	
		// In this case both s1 and s2 are deep copies, coz change in s1 will
		// not be reflected in s2.
		//---------------------------

		// Lazy copies
		int []x={11,22,33,44};
		int []y={11,22,33,44};
		
		System.out.println("After value insert x array is: "+Arrays.toString(x));
		System.out.println("x equals y: "+Arrays.equals(x,y));

		y[2]=100;
		System.out.println("x equals y: "+Arrays.equals(x,y));
		// in the initial state both are refering towards same location (as equals()
		// gives true) so it is shallow copy initially. but when we modify one array
		// i.e. the change in y is not reflected in x these are not shallow copy, 
		// and after change equals gives false, means afterwards it will changed to
		// deep copy. and therefore it is known as Lazy copies.
	}
}


//---------------------------------------------------------------------------------------------------------------------------

java.lang.String
-------------------

	The String is a class from java.lang package, used to repesent the character array in its equivalent object form.
	By default every string represented within "<>" considered as a string object. Once the String is created we are 
	unable to modify the contents. means the string object is immutable.	

	Constructors:
	- public String(): Constructs a new empty String.
	- public String(byte[] bytes): Constructs a new String by decoding the specified array of bytes using the 
		platform's default charset.
	- public String(byte[] bytes, Charset charset): Constructs a new String by decoding the specified array 
		of bytes using the specified charset.
	- public String(byte[] bytes, int offset, int length): Constructs a new String by decoding the specified subarray 
		of bytes using the platform's default charset.
	- public String(byte[] bytes, int offset, int length, Charset charset): Constructs a new String by decoding the 
		specified subarray of bytes using the specified charset.
	- public String(char[] value): Allocates a new String so that it represents the sequence of characters currently 
		contained in the character array argument.
	- public String(char[] value, int offset, int count): Allocates a new String that contains characters from a subarray 
		of the character array argument.
	- String(String original): Initializes a newly created String object so that it represents the same sequence of 
		characters as the argument; in other words, the newly created string is a copy of the argument string.
	- String(StringBuffer buffer): Allocates a new string that contains the sequence of characters currently contained 
		in the string buffer argument.
	- String(StringBuilder builder): Allocates a new string that contains the sequence of characters currently contained 
		in the string builder argument.

	Methods:

	Length and Character Access:
	- int length(): Returns the length of this string.
	- char charAt(int index): Returns the char value at the specified index.
	- boolean isEmpty(): Returns true if, and only if, length() is 0.

	Substring Extraction:
	- String substring(int beginIndex): Returns a new string that is a substring of this string.
	- String substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string.

	Concatenation:
	- String concat(String str): Concatenates the specified string to the end of this string.
	- String join(CharSequence delimiter, CharSequence... elements): Returns a new string composed of the elements 
		joined together with the specified delimiter.

	Search and Replace:
	- boolean contains(CharSequence s): Returns true if and only if this string contains the specified sequence of 
		char values.
	- boolean startsWith(String prefix): Tests if this string starts with the specified prefix.
	- boolean endsWith(String suffix): Tests if this string ends with the specified suffix.
	- int indexOf(int ch): Returns the index within this string of the first occurrence of the specified character.
	- int indexOf(String str): Returns the index within this string of the first occurrence of the specified substring.
	- int lastIndexOf(int ch): Returns the index within this string of the last occurrence of the specified character.
	- int lastIndexOf(String str): Returns the index within this string of the last occurrence of the specified substring.
	- String replace(char oldChar, char newChar): Returns a new string resulting from replacing all occurrences of oldChar
		in this  string with newChar.
	- String replace(CharSequence target, CharSequence replacement): Replaces each substring of this string that matches 
		the literal target sequence with the specified literal replacement sequence.

	Modification Operations:
	- String toLowerCase(): Converts all of the characters in this String to lowercase.
	- String toUpperCase(): Converts all of the characters in this String to uppercase.
	- String trim(): Returns a copy of the string, with leading and trailing whitespace omitted.

	Comparison Operations:
	- boolean equals(Object anObject): Compares this string to the specified object.
	- boolean equalsIgnoreCase(String anotherString): Compares this String to another String, ignoring case considerations.
	- int compareTo(String anotherString): Compares two strings lexicographically.

	Regular Expression Matching:
	- boolean matches(String regex): Tells whether or not this string matches the given regular expression.
	- String[] split(String regex): Splits this string around matches of the given regular expression.

	String Conversion:
	- byte[] getBytes(): Encodes this String into a sequence of bytes using the platform's default charset.
	- byte[] getBytes(Charset charset): Encodes this String into a sequence of bytes using the given charset.
	- char[] toCharArray(): Converts this string to a new character array.



	// Creating the strings

class StringExample
{
	pubilc static void main(String []args)
	{
		String s1="hello", s2="hello", s3="good day";

		// Note that eventhough java doesnot allow operator overloading, the + operator internally overloaded
		// to join two or more strings.

		String s="i said: "+s2+" to you,"+s3+" was the second statement";
		System.out.println("The s is: "+s);
	}
}

//----------------------------------------

class StringExample
{
	public static void main(String []args)
	{
		// creating the using direct assignment
		String s1="hello", s2="hello", s3="good day";

		// Note that eventhough java doesnot allow operator overloading, the + operator internally overloaded
		// to join two or more strings.
		String s="i said: "+s2+" to you,"+s3+" was the second statement";
		System.out.println("The s is: "+s);
		//------------------------
		boolean b=s1.equals(s2);
		System.out.println("s1 equals s2 is: "+b);
		b=s1.equals(s3);
		System.out.println("s1 equals s3 is: "+b);
		// when two same string literals are used to create the string objects
		// then it wil creates the shallow copies.
		//-----------------------------
		int len="good day".length();
		System.out.println("length is: "+len);
		// which will proves the string literal are objects.

		String str1=new String();
		System.out.println("str1 is: "+str1);
		//------------------------------------------------
		byte []bvals={65,66,67,68,69,70,71,72};
		String str2=new String(bvals);
		System.out.println("str2 is: "+str2);

		String str3=new String(bvals,2,5);
		System.out.println("str2 is: "+str3);
		//----------------------------------------------
		char []ch={'h','o','w',' ','a','r','e',' ','y','o','u'};
		String str4=new String(ch);
		System.out.println("str4 is: "+str4);

		String str5=new String(s3);
		System.out.println("str5 is: "+str5);
	}
}

//-----------------------------------------------------------------------------------------------

	// Using charAt() and length()

class StringExample1 
{
	public static void main(String[] args) 
	{
		String s1="hello good day";
		int len=s1.length();
		System.out.println("length of s1: "+len);

		String s2="";
		System.out.println("length of s2: "+s2.length());

	//	String s3; // error: variable s3 might not have been initialized
	//	System.out.println("length of s3: "+s3.length());

		// using charAt()
		System.out.print("String s1 is: ");
		for(int i=0 ; i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		System.out.println();
	}
}

//---------------------------------------------------------------------

	// using some other methods

import java.util.Arrays;
class StringExample2 
{
	public static void main(String[] args) 
	{
		String s1="hello good day to all";

		String s2=s1.substring(2);
		System.out.println("s2: "+s2);

		String s3=s1.substring(6, 13);
		System.out.println("s3: "+s3);

		String s4=s1.concat(" All the best");
		System.out.println("s4: "+s4);

		
		System.out.println("All the best".contains("e"));
		System.out.println(s1.contains("ll"));

		
		System.out.println("----------------------------------------------");
		System.out.println("All the best".startsWith("e"));
		System.out.println("All the best".startsWith("A"));
		System.out.println("All the best".startsWith("All"));

		System.out.println(s1.endsWith("l"));
		System.out.println(s1.endsWith("all"));
		System.out.println(s1.endsWith("to"));

		
		System.out.println("----------------------------------------------");
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.indexOf("ll"));
		System.out.println(s1.lastIndexOf("ll"));

		System.out.println("----------------------------------------------");
		String s5=s1.replace('o','#');
		System.out.println("s5: "+s5);
		s5=s1.replace("ll","LL");
		System.out.println("s5: "+s5);
		
		System.out.println("----------------------------------------------");
		String s6=s1.toUpperCase();
		System.out.println("s6: "+s6);
		System.out.println("How ARE yoU".toLowerCase());
		String s7="      java programming      ";
		System.out.println("Length of String: "+s7.length());
		s7=s7.trim();		
		System.out.println("Length of String: "+s7.length());

		System.out.println("----------------------------------------------");
		String s8="good";
		String s9="good";
		String s10="day";
		System.out.println("s8 equals s9: "+s8.equals(s9));
		System.out.println("s8 equals s10: "+s8.equals(s10));
		System.out.println("s8 Compare to s9: "+s8.compareTo(s9));
		System.out.println("s8 Compare to s10: "+s8.compareTo(s10));

		System.out.println("----------------------------------------------");
		byte []b=s1.getBytes();
		System.out.println("bytes of s1: "+Arrays.toString(b));

	}
}


//------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------


java.lang.StringBuffer
-----------------------
	A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified. At any point in 
	time it contains some particular sequence of characters, but the length and content of the sequence can be changed 
	through certain method calls.

	The principal operations on a StringBuffer are the append and insert methods, which are overloaded so as to accept 
	data of any type.

	Constructors:
	- public StringBuffer(): Constructs an empty StringBuffer with the initial capacity of 16 characters.
	- public StringBuffer(int capacity): Constructs an empty StringBuffer with the specified initial capacity.
	- public StringBuffer(String str): Constructs a StringBuffer with the specified initial value.

	Methods:

	Append Operations:
	- StringBuffer append(Object obj): Appends the string representation of the specified object to this StringBuffer.
	- StringBuffer append(String str): Appends the specified string to this StringBuffer.
	- StringBuffer append(StringBuffer sb): Appends the specified StringBuffer to this StringBuffer.
	- StringBuffer append(CharSequence s): Appends the specified character sequence to this StringBuffer.
	- StringBuffer append(CharSequence s, int start, int end): Appends a subsequence of the specified character sequence 
		to this StringBuffer.
	- StringBuffer append(char[] str): Appends the string representation of the specified character array to this StringBuffer.
	- StringBuffer append(char[] str, int offset, int len): Appends a subarray of the specified character array to 
		this StringBuffer.
	- StringBuffer append(boolean b): Appends the string representation of the specified boolean value to this StringBuffer.
	- StringBuffer append(char c): Appends the specified character to this StringBuffer.
	- StringBuffer append(int i): Appends the string representation of the specified integer to this StringBuffer.
	- StringBuffer append(long lng): Appends the string representation of the specified long to this StringBuffer.
	- StringBuffer append(float f): Appends the string representation of the specified float to this StringBuffer.
	- StringBuffer append(double d): Appends the string representation of the specified double to this StringBuffer.

	Insert Operations:
	- StringBuffer insert(int offset, Object obj): Inserts the string representation of the specified object into 
		this StringBuffer.
	- StringBuffer insert(int offset, String str): Inserts the specified string into this StringBuffer.
	- StringBuffer insert(int offset, char[] str): Inserts the string representation of the specified character array 
		into this StringBuffer.
	- StringBuffer insert(int offset, CharSequence s): Inserts the specified character sequence into this StringBuffer.
	- StringBuffer insert(int offset, CharSequence s, int start, int end): Inserts a subsequence of the specified 
		character sequence into this StringBuffer.
	- StringBuffer insert(int offset, boolean b): Inserts the string representation of the specified boolean value 
		into this StringBuffer.
	- StringBuffer insert(int offset, char c): Inserts the specified character into this StringBuffer.
	- StringBuffer insert(int offset, int i): Inserts the string representation of the specified integer into this StringBuffer.
	- StringBuffer insert(int offset, long l): Inserts the string representation of the specified long into this StringBuffer.
	- StringBuffer insert(int offset, float f): Inserts the string representation of the specified float into this StringBuffer.
	- StringBuffer insert(int offset, double d): Inserts the string representation of the specified double into this StringBuffer.

	Other Operations:
	- void setLength(int newLength): Sets the length of this StringBuffer.
	- int capacity(): Returns the current capacity of this StringBuffer.
	- void ensureCapacity(int minimumCapacity): Ensures that the capacity of the buffer is at least equal to the 
		specified minimum capacity.
	- void trimToSize(): Attempts to reduce storage used for the character sequence.

	String Conversion:
	- char charAt(int index): Returns the character at the specified index.
	- int length(): Returns the length (character count) of this StringBuffer.
	- String substring(int start): Returns a new String that contains a subsequence of characters currently contained 
		in this StringBuffer.
	- String substring(int start, int end): Returns a new String that contains a subsequence of characters currently 
		contained in this StringBuffer.

	Modification Operations:
	- void setCharAt(int index, char ch): Sets the character at the specified index to the specified character.
	- StringBuffer	deleteCharAt(int index): Removes the char at the specified position in this sequence.
	- StringBuffer	delete(int start, int end): Removes the characters in a substring of this sequence.
	- StringBuffer replace(int start, int end, String str): Replaces the characters in a substring of this sequence 
		with characters in the specified String.
	- StringBuffer reverse(): Causes this character sequence to be replaced by the reverse of the sequence.	
	- void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin): Copies characters from this sequence into the 
		destination character array.

//-------------------------------------------------------------------------------------------------------------------------------

	// Using StringBuffer constructors and capacity() 

class StringBufferExample1 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer();
		System.out.println("Capacity of s1: "+s1.capacity());

		StringBuffer s2=new StringBuffer(5);
		System.out.println("Capacity of s2: "+s2.capacity());

		s1.append("hello all, how are you");
		System.out.println("Capacity of s1: "+s1.capacity());

		StringBuffer s3=new StringBuffer("hello");
		System.out.println("Data of S3: "+s3);
		System.out.println("Capacity of s3: "+s3.capacity());
	}
}


class StringBufferExample1 
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("hello");
		System.out.println("Data of S: "+s);

		s.append(" How are you");
		System.out.println("Data of S: "+s);

		String str=" all";
		s.append(str);
		System.out.println("Data of S: "+s);

		StringBuffer sb=new StringBuffer(" of you ");
		s.append(sb);
		System.out.println("Data of S: "+s);

		char []ch={'a','l','l',' ','t','h','e',' ','b','e','s','t'};
		s.append(ch);
		System.out.println("Data of S: "+s);
		s.append(ch,7,5);
		System.out.println("Data of S: "+s);
		s.append('A');
		System.out.println("Data of S: "+s);
		s.append(123);
		System.out.println("Data of S: "+s);

		//-------------------------------------------------

		s.insert(37,"All the ");
		System.out.println("Data of S: "+s);
		s.setCharAt(0,'H');
		s.setCharAt(10,'A');
		System.out.println("Data of S: "+s);
		System.out.println("default Capacity of s: "+s.capacity());
		s.trimToSize();
		System.out.println("After trim - Capacity of s: "+s.capacity());
		System.out.println("Data of S: "+s);

		s.setLength(40);
		System.out.println("Data of S: "+s);
		s.setLength(75);
		System.out.println("Data of S: "+s);
		System.out.println("Now Capacity of s: "+s.capacity());
		s.trimToSize();
		System.out.println("Now After trim - Capacity of s: "+s.capacity());

		StringBuffer s1=s.delete(6,18);
		System.out.println("Data of S1: "+s1);

		char []c=new char[100];
		s.getChars(2,10,c,0);
		String t=new String(c);
		System.out.println("gained characters: "+t);

		StringBuffer src=new StringBuffer("How are you");
		StringBuffer s2=src.replace(9,11,"All of you?");
		System.out.println("String src: "+src);
		System.out.println("String s2: "+s2);
		
		StringBuffer s3=src.reverse();
		System.out.println("String s3: "+s3);

	}
}
//----------------------------------------------------------
class StringBufferExample
{
  public static void main(String[] args)
  {
    // create a string buffer
    StringBuffer str = new StringBuffer();

    // add string to string buffer
    str.append("Java");
    str.append(" is");
    str.append(" popular.");
    System.out.println("StringBuffer: " + str);

    // clear the string
    // using delete()
    str.delete(0, str.length());
    System.out.println("Updated StringBuffer: " + str);
  }
}

//-----------------------------------------------------------------------------------------------


public class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer sBuffer1=new StringBuffer("Welcome");
		System.out.println("Original String is ::: " + sBuffer1 + ":: having length " + sBuffer1.length());
		//using append method
		sBuffer1.append(" To Edubca");
		System.out.println("Modified String after append is :: " + sBuffer1 + " :: having length " + sBuffer1.length());
		//using reverse method
		sBuffer1.reverse();
		System.out.println("Modified String after Reverse is :: " + sBuffer1);
	}
}
//-----------------------------------------------------------------
public class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer sBuffer=new StringBuffer ("WelcomeToJava");
		System.out.println("Original String is ::: " + sBuffer + ":: having length " + sBuffer.length());
		//using replace method
		sBuffer.replace(0,9,"This is ");
		System.out.println("Modified String after replace is :: " + sBuffer + " :: having length " + sBuffer.length());
		//using delete method
		sBuffer.delete(0,7);
		System.out.println("Modified String after delete is :: " + sBuffer);
	}
}
//---------------------------------------------------------------------------------------------------------------------------

java.lang.StringBuilder 
-------------------------
	A mutable sequence of characters. This class provides an API compatible with StringBuffer, but with no guarantee of
	synchronization. This class is designed for use as a drop-in replacement for StringBuffer in places where the string 
	buffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class 
	be used in preference to StringBuffer as it will be faster under most implementations.

	The principal operations on a StringBuilder are the append and insert methods, which are overloaded so as to accept 
	data of any type. Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is 
	required then it is recommended that StringBuffer be used.

	Constructors:
	- public StringBuilder(): Constructs an empty StringBuilder with a default initial capacity.
	- public StringBuilder(int capacity): Constructs a StringBuilder with the specified initial capacity.
	- public StringBuilder(CharSequence seq): Constructs a StringBuilder that contains the same characters as the 
		specified CharSequence.
	- public StringBuilder(String str): Constructs a StringBuilder initialized to the contents of the specified string.

	Methods:
	Append Operations:
	- StringBuilder append(boolean b): Appends the string representation of the specified boolean value.
	- StringBuilder append(char c): Appends the specified character.
	- StringBuilder append(char[] str): Appends the string representation of the specified character array.
	- StringBuilder append(char[] str, int offset, int len): Appends a subarray of the specified character array.
	- StringBuilder append(CharSequence s): Appends the specified character sequence.
	- StringBuilder append(CharSequence s, int start, int end): Appends a subsequence of the specified character sequence.
	- StringBuilder append(double d): Appends the string representation of the specified double value.
	- StringBuilder append(float f): Appends the string representation of the specified float value.
	- StringBuilder append(int i): Appends the string representation of the specified integer value.
	- StringBuilder append(long l): Appends the string representation of the specified long value.
	- StringBuilder append(Object obj): Appends the string representation of the specified object.

	Insert Operations:
	- StringBuilder insert(int offset, boolean b): Inserts the string representation of the specified boolean value.
	- StringBuilder insert(int offset, char c): Inserts the specified character.
	- StringBuilder insert(int offset, char[] str): Inserts the string representation of the specified character array.
	- StringBuilder insert(int offset, char[] str, int offset, int len): Inserts a subarray of the specified character array.
	- StringBuilder insert(int offset, CharSequence s): Inserts the specified character sequence.
	- StringBuilder insert(int offset, CharSequence s, int start, int end): Inserts a subsequence of the specified 
		character sequence.
	- StringBuilder insert(int offset, double d): Inserts the string representation of the specified double value.
	- StringBuilder insert(int offset, float f): Inserts the string representation of the specified float value.
	- StringBuilder insert(int offset, int i): Inserts the string representation of the specified integer value.
	- StringBuilder insert(int offset, long l): Inserts the string representation of the specified long value.
	- StringBuilder insert(int offset, Object obj): Inserts the string representation of the specified object.

	String Conversion:
	- int length(): Returns the length (character count) of the sequence of characters currently in the StringBuilder.
	- StringBuilder setLength(int newLength): Sets the length of the character sequence.
	- String toString(): Returns a string representing the data in this StringBuilder.

	Modification Operations:
	- void setCharAt(int index, char ch): Sets the character at the specified index to the specified character.

	Other Operations:
	- void ensureCapacity(int minimumCapacity): Ensures that the capacity is at least equal to the specified minimum.
	- int capacity(): Returns the current capacity of the StringBuilder.


public class StringBuilderDemo 
{
    public static void main(String[] args) 
    {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After appending: " + sb);

        // Insert text at a specific position
        sb.insert(5, ", ");
        System.out.println("After inserting: " + sb);

        // Delete characters
        sb.delete(5, 8);
        System.out.println("After deleting: " + sb);

        // Reverse the StringBuilder
        sb.reverse();
        System.out.println("After reversing: " + sb);

        // Get the length of the StringBuilder
        System.out.println("Length of StringBuilder: " + sb.length());

        // Get capacity of the StringBuilder
        System.out.println("Capacity of StringBuilder: " + sb.capacity());

        // Replace text
        sb.replace(0, 5, "Hey");
        System.out.println("After replacing: " + sb);

        // Set length of the StringBuilder
        sb.setLength(3);
        System.out.println("After setting length: " + sb);

        // Convert StringBuilder to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}


//================================================================================================================================
//================================================================================================================================

	Java Collection Framework: 
	==============================

	Getting started with Collection Framework:Basically, if you want to represent the bunch of elements as a single unit then 
	the collection is used. 
	
	If we want to store the data in the memory, we have different options. Let’s see
	- If we want to store the single data element then we declare the simple variables, Such as 

		int a=10;	double b=45.3486;
	
	These variables allow you to store the single data element.

	- If we want to store the more elements the array is the perfect choice.

		i.e.  	int []ar=new int[10];

	Array will allow us to store fix number of elements having same type, the elements may of any built-in type or may be of 
	any object type also. Suppose if class Student is defined in the program, the we can use array to store the group of 
	students as 

	Student s=new Student [10];
 
	Where S1, S2, .........S10 are the objects of student class.


	- The problem with is that, array collect the elements having same type together. But what is the option if you want to
	  collect the elements of different type. The option is java is using Object class from Java.  

		i.e.	Object []arr=new Object[5];

	- The problem with array of elements having type Object is
		- It having fix in size, means it is not a growable in nature
		- It will create the data structure which is not with readymade methods.
		- Not Array using Object class but other arrays are homogeneous in nature.

	The solution to all these problems is the collection of classes and interfaces which will provides the internal data 
	structure which will grow and shrink according to need and are with some predefined or readymade methods, 
	known as Java Collection Framework. 

	The Java Collections Framework is a powerful built-in library that provides a unified approach to storing and manipulating
	groups of objects. 

	It offers a variety of benefits for Java programmers:

	- Reduced effort:  The framework provides pre-built implementations of common data structures like ArrayLists, LinkedLists, 
	and HashSets, saving you time and effort compared to writing your own from scratch.

	- Improved performance: The implementations in the Collections Framework are well-optimized for efficiency, ensuring your 
	code runs smoothly.

	- Consistent behavior:  Collections that implement the same interface (like List or Set) share a common set of methods, 
	making it easier to learn and use.

	- Reusability: The framework promotes code reuse by allowing you to work with different collections in a similar way.

java.lang.Object(C)
│
java.lang.Iteriable(I)
│
└─── java.util.Collection(I)
     │
     ├─── java.util.List(I)
     │    ├── java.util.ArrayList(C)
     │    ├── java.util.LinkedList(C)
     │    └── java.util.Vector(C)
     │         └── java.util.Stack(C)
     │
     ├─── java.util.Queue(I)
     │    ├── java.util.Deque(I)
     │    │    ├── java.util.ArrayDeque(C)
     │    │    └── java.util.LinkedList(C)
     │    └── java.util.PriorityQueue(C)
     │
     └─── java.util.Set(I)
          ├── java.util.HashSet(C)
          │    └── java.util.LinkedHashSet(C)
          └── java.util.TreeSet(C)
     
 java.util.Map
          ├── java.util.HashMap(C)
          │    └── java.util.LinkedHashMap(C)  
	  ├── java.util.SortedMap(I)
          │    └── java.util.TreeMap(C)
          ├── java.util.WeakHashMap(C)
          ├── java.util.HashTable(C)
          └── java.util.IdentityHashMap(C)

	Description of each class and interface in the Java Collections Framework hierarchy:
	-----------------------------------------------------------------------------------------

	- java.lang.Object (C): The root class for all Java classes. All other classes in Java inherit directly or indirectly 
		from this class.

	- java.util.Collection (I): The root interface in the collection hierarchy. It represents a group of objects known 
		as elements.

	- java.util.List (I): An ordered collection that allows duplicate elements.

	- java.util.ArrayList (C): Resizable-array implementation of the List interface. It's a dynamic array that can grow or 
		shrink as needed.

	- java.util.LinkedList (C): Doubly-linked list implementation of the List interface. It provides sequential access and 
		efficient insertion/deletion operations.

	- java.util.Vector (C): A legacy class similar to ArrayList but synchronized. It's rarely used in modern Java development.

	- java.util.Stack (C): A subclass of Vector that represents a last-in, first-out (LIFO) stack of objects.
	
	- java.util.Queue (I): A collection designed for holding elements prior to processing. Queues typically order elements in 
		a FIFO (first-in-first-out) manner.

	- java.util.Deque (I): A linear collection that supports element insertion and removal at both ends. Stands for 
		"Double Ended Queue".

	- java.util.ArrayDeque (C): Resizable-array implementation of the Deque interface. It provides more efficient insertion 
		and removal operations than LinkedList in most cases.

	- java.util.PriorityQueue (C): An unbounded priority queue based on a priority heap. The elements are ordered according 
		to their natural ordering or by a specified comparator.

	- java.util.Set (I): A collection that contains no duplicate elements.

	- java.util.HashSet (C): Implementation of the Set interface based on a hash table. It does not guarantee the order of 
		its elements.

	- java.util.LinkedHashSet (C): A hash table and linked list implementation of the Set interface, with predictable 
		iteration order.

	- java.util.TreeSet (C): A NavigableSet implementation based on a TreeMap. It orders its elements using their natural 
		ordering or a comparator.

	- java.util.Map (I): An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most 
		one value.

	- java.util.HashMap (C): Hash table-based implementation of the Map interface. It provides constant-time performance for 
		basic operations (add, remove, get) on average.

	- java.util.LinkedHashMap (C): Hash table and linked list implementation of the Map interface. It maintains the insertion
		order of elements.

	- java.util.SortedMap (I): A map that maintains its mappings in ascending order, sorted according to the keys' natural 
		ordering or a custom comparator.

	- java.util.TreeMap (C): Red-black tree-based implementation of the SortedMap interface. It maintains the keys in 
		sorted order.

	- java.util.WeakHashMap (C): An implementation of the Map interface with weak keys. Entries in the WeakHashMap will be 
		automatically removed when they are no longer reachable from the program.

	- java.util.HashTable (C): A legacy class similar to HashMap but synchronized. It's not commonly used in modern Java 
		development due to its synchronization overhead.

	- java.util.IdentityHashMap (C): An implementation of the Map interface based on reference-equality in place of 
		object-equality. It's useful when object-equality semantics are not desired.

//----------------------------------------------------------------------------------------------------------------

Iterable interface
====================

In Java, the Iterable interface is a fundamental part of the Java Collections Framework. It provides a way to iterate over the elements of a collection, such as ArrayList, LinkedList, HashSet, etc., in a uniform and consistent manner. By implementing the Iterable interface, a class indicates that it can be iterated over using the enhanced for loop (for-each loop) or by explicitly obtaining an iterator.

import java.util.Iterator;
// Define a custom iterable class
class MyIterable implements Iterable<String> 
{
    private String[] data;
    public MyIterable(String[] data) 
    {
        this.data = data;
    }
    // Implement the iterator() method required by Iterable interface
    @Override
    public Iterator<String> iterator() 
    {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return data[index++];
            }
        };
    }
}

public class MyIterableExample 
{
    public static void main(String[] args) 
    {
        // Create an instance of the iterable class
        MyIterable myIterable = new MyIterable(new String[]{"Hello", "World", "Iterable"});

        // Iterate over the elements using a for-each loop
        for (String item : myIterable) 
	{
            System.out.println(item);
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------

Using java.util.Vector: 
-----------------------

	The Vector class implements a growable array of objects. Like an array, it contains components that can be accessed using 
	an integer index. However, the size of a Vector can grow or shrink as needed to accommodate adding and removing items after
	the Vector has been created.


	// As we know it is collection of object, which may collects objects of same or different type.

		- if it collect objects of different types, it is known as Raw-Verctor
			e.g.
		  		Vector v1 = new Vector();

		- if it collect objects of same type then it is known as generic vector.
		  The generic Vector can be created as
		  	e.g.
				Vector <String> v1 = new Vector<>();
				- In this the v1 able to collect the objects of String class or any 
				  of its subclass.

	Constructors: 

	- Vector(): Constructs an empty vector so that its internal data array has size 10 and its standard capacity 
		increment is zero.

	- Vector(int initialCapacity): Constructs an empty vector with the specified initial capacity and with its capacity 
		increment equal to zero.

	- Vector(int initialCapacity, int capacityIncrement): Constructs an empty vector with the specified initial capacity 
		and capacity increment.



	// Using add(), size(), capacity() and capacityIncreament

	- boolean add(E e): Appends the specified element to the end of this Vector.
	- void add(int index, E element): Inserts the specified element at the specified position in this Vector.

import java.util.Vector;
class VectorExample 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		v1.add(10); // Autoboxing of primitive int value 10 to Integer type
		v1.add(23.45);
		v1.add(1,"Hello");
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());

		System.out.println("-----------------------------------------------");

		Vector v2=new Vector(3);
		System.out.println("Size of v2: "+v2.size()+" Capacity of v2: "+v2.capacity());
		v2.add(10);
		v2.add(23.45);
		v2.add("Hello");
		Short s=new Short((short)12);
		v2.add(s);
		System.out.println("Size of v2: "+v2.size()+" Capacity of v2: "+v2.capacity());		
		v2.add(150);
		v2.add(2343.425);
		v2.add("Hi");
		System.out.println("Size of v2: "+v2.size()+" Capacity of v2: "+v2.capacity());

		System.out.println("-----------------------------------------------");

		Vector v3=new Vector(3,2);
		System.out.println("Size of v3: "+v3.size()+" Capacity of v3: "+v3.capacity());
		v3.add(10);
		v3.add(23.45);
		v3.add("Hello");
		v3.add(s);
		System.out.println("Size of v3: "+v3.size()+" Capacity of v3: "+v3.capacity());		
		v3.add(150);
		v3.add(2343.425);
		v3.add("Hi");
		v3.add("All");
		System.out.println("Size of v3: "+v3.size()+" Capacity of v3: "+v3.capacity());
	}
}


//--------------------------------------------------------------------------------------------

	// Using addElement(), clear() and isEmpty():

	- void clear(): Removes all of the elements from this Vector.
	- void addElement(E obj): Adds the specified component to the end of this vector, increasing its size by one.
	- boolean isEmpty(): Tests if this vector has no components.

class VectorExample 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		v1.addElement(10);
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		System.out.println("v1 is empty: "+v1.isEmpty());
		v1.clear();
		System.out.println("v1 is empty: "+v1.isEmpty());
	}
}


//--------------------------------------------------------------------------------------------------

	// Using contains(), elementAt() and elements()

	- boolean contains(Object o): Returns true if this vector contains the specified element.
	- E elementAt(int index): Returns the component at the specified index.
	- Enumeration<E> elements(): Returns an enumeration of the components of this vector.


import java.util.Enumeration;
class VectorExample 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		v1.add(10);
		v1.add(23.45);
		v1.add("Hello");
		v1.add(140);
		v1.add(243.15);
		v1.add("good");
		Short s=new Short((short)12);
		v1.add(s);	
		v1.add(1520);
		v1.add(2343.425);
		v1.add("Hi");
		v1.add("Java");
		System.out.println("Size of v1: "+v1.size()+" Capacity of v1: "+v1.capacity());
		System.out.println("v1 contains Java: "+v1.contains("Java"));
		System.out.println("4th element in v1: "+v1.elementAt(4));

		// Displaying all elements from v1
		System.out.println("All Elements in v1: ");
		for(int i=0 ; i<v1.size() ; i++)
		{
			System.out.println(v1.elementAt(i));
		}

		// another way
		System.out.println("\n All Elements in v1(using Enum): ");
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		// Another way
		System.out.println("All Elements in v1(using for each): ");
		for(Object ob : v1)
		{
			System.out.println(ob);
		}
	}
}

//--------------------------------------------------------------------------------------------------
	
	// Using same additional methods: 

	- void	insertElementAt(E obj, int index): Inserts the specified object as a component in this vector at the specified index.
	- E firstElement(): Returns the first component (the item at index 0) of this vector.	
	- E lastElement(): Returns the last component of the vector.
	- E set(int index, E element): Replaces the element at the specified position in this Vector with the specified element.
	- E get(int index): Returns the element at the specified position in this Vector.
	- E remove(int index): Removes the element at the specified position in this Vector.
	- Iterator<E> iterator(): Returns an iterator over the elements in this list in proper sequence.

import java.util.Arrays;
import java.util.Iterator;
class VectorExample
{
	public static void main(String []args)
	{
		Vector<String> v1 = new Vector<>();
		v1.add("Hello");
		v1.insertElementAt("Hi",0);
		Object []s=v1.toArray();
		System.out.println("\n Elements are: ");
		System.out.println(Arrays.toString(s));

		v1.addElement("Java");	
		v1.add(1,"C++");
		Object []ar=v1.toArray();
		System.out.println("\n Elements are: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(v1.get(i));
		}

		v1.set(1,"Android");
		v1.remove(2);
		System.out.println("\n Elements are: ");
		System.out.println(Arrays.toString(v1.toArray()));
		System.out.println("First Element: "+v1.firstElement());
		System.out.println("Last Element: "+v1.lastElement());

		System.out.println("\n Elements are: ");
		Iterator<String> itr = v1.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------

 - java.util.Stack: 
-------------------

	The Stack class represents a last-in-first-out (LIFO) stack of objects. It extends class Vector with five operations 
	that allow a vector to be treated as a stack. The usual push and pop operations are provided, as well as a method to 
	peek at the top item on the stack, a method to test for whether the stack is empty, and a method to search the stack 
	for an item and discover how far it is from the top.

	- boolean empty(): Tests if this stack is empty.
	- E peek(): Looks at the object at the top of this stack without removing it from the stack.
	- E pop(): Removes the object at the top of this stack and returns that object as the value of this function.
	- E push(E item): Pushes an item onto the top of this stack.
	- int search(Object o): Returns the 1-based position where an object is on this stack.

import java.util.Stack;
import java.util.Scanner;
class StackExample 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack=new Stack<>();
		System.out.println("Size of stack: "+stack.size()+" Capacity of stack: "+stack.capacity());
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n -------- Menu ---------");
			System.out.println(" 1.push \n 2.pop \n 3.stop");
			System.out.println(" Enter your option: ");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1:
					try
					{
						System.out.println(" Enter int value: ");
						stack.push(sc.nextInt());
					}
					catch (Exception e)
					{
						System.out.println(" Input only int value ");
					}
					break;
				case 2:
					if(!stack.empty())
					{
						System.out.println("pop() value: "+stack.pop());
					}
					else
					{
						System.out.println("Stack is Empty");
					}
					break;
				case 3:
					System.exit(0);
			}
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------

- java.util.ArrayList class:
-------------------------------

	Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, 
	including null. In addition to implementing the List interface, this class provides methods to manipulate the size of 
	the array that is used internally to store the list. 
	(This class is roughly equivalent to Vector, except that it is unsynchronized.)

	Constructor and Description
	----------------------------

	- ArrayList(): Constructs an empty list with an initial capacity of ten.
	
	- ArrayList(Collection<? extends E> c): Constructs a list containing the elements of the specified collection, in the 
		order they are returned by the collection's iterator.

	- ArrayList(int initialCapacity): Constructs an empty list with the specified initial capacity.



import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList arraylist=new ArrayList(); // raw type - allows collection of any type
		arraylist.add("hello");
		arraylist.add(10);
		arraylist.add(45.67);
		System.out.println(arraylist); // displays , separated the elements within [ ]
	}
}

//-------------------------------------
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("hello");
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add("C");
		arraylist.add("C++");
		arraylist.add("Java");
		System.out.println(arraylist); // displays , separated the elements within [ ]

		ArrayList<String> al=new ArrayList<>(arraylist); 
		System.out.println(al); // displays , separated the elements within [ ]
		
	}
}

//-------------------------------------------------------------------------------------------------------------

	// Adding/inserting the elements in ArrayList

	- boolean add(E e): Appends the specified element to the end of this list.

	- void add(int index, E element): Inserts the specified element at the specified position in this list.

	- boolean addAll(Collection<? extends E> c): Appends all of the elements in the specified collection to the end of this 
		list, in the order that they are returned by the specified collection's Iterator.

	- boolean addAll(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection into 
		this list, starting at the specified position.

	- E set(int index, E element): Replaces the element at the specified position in this list with the specified element.


import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("C++");
		arraylist.add("Java");
		arraylist.add(0,"C");
		System.out.println(arraylist); 

		ArrayList<String> al=new ArrayList<>(); 
		al.add("Android");
		al.addAll(arraylist);
		System.out.println(al); 
		
		ArrayList<String> a2=new ArrayList<>(); 
		a2.add("SQL");
		a2.add("NoSQL");
		a2.addAll(1,al);
		System.out.println(a2); 
		
		a2.set(5, "Oracle");
		System.out.println(a2);
	}
}
--------- Output on Run --------------
[C, C++, Java]
[Android, C, C++, Java]
[SQL, Android, C, C++, Java, NoSQL]
[SQL, Android, C, C++, Java, Oracle]

//-------------------------------------------------------------------------------------------------------------------------

	// Search and remove operations

	- boolean contains(Object o): Returns true if this list contains the specified element.

	- boolean addAll(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection into 
		this list, starting at the specified position.

	- E get(int index): Returns the element at the specified position in this list.

	- int indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 
		if this list does not contain the element.
	- boolean isEmpty(): Returns true if this list contains no elements.

	- int lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in this list, or -1 
		if this list does not contain the element.

	- E remove(int index): Removes the element at the specified position in this list.
	
	- boolean remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.

	- boolean removeAll(Collection<?> c): Removes from this list all of its elements that are contained in the 
		specified collection.

	- List<E> subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified 
		fromIndex, inclusive, and toIndex, exclusive.


import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("C++");
		arraylist.add("Java");
		arraylist.add(0,"C");
		System.out.println("Arraylist contains Java: "+arraylist.contains("Java")); 

		ArrayList<String> al=new ArrayList<>(); 
		al.add("Android");
		al.addAll(arraylist);
		System.out.println(al); 
		System.out.println("2nd element in al: "+al.get(2)); 
		
		ArrayList<String> a2=new ArrayList<>(); 
		a2.add("SQL");
		a2.add("NoSQL");
		a2.addAll(1,al);
		System.out.println("a2 contains arraylist: "+a2.containsAll(arraylist)); 		
		a2.set(5, "Oracle");
		System.out.println(a2);
		
		List<String> sl=a2.subList(2, 5);
		System.out.println("Sublist: "+sl);
		
		if(a2.indexOf("Java")!=-1)
		{
			System.out.println("Java present at "+a2.indexOf("Java")+" position");
		}
		else
		{
			System.out.println("Java is not present in the List");
		}
		
		a2.add("C");
		System.out.println(a2);
		System.out.println("Last index of C in a2: "+a2.lastIndexOf("C"));
		
		a2.remove("C"); // removes first ocr
		System.out.println(a2);
		
		a2.removeAll(arraylist); // remove all ocr of elm in arraylist from a2
		System.out.println(a2);
	}
}

------ Output on Run ---------
[SQL, Android, C, C++, Java, Oracle]
Sublist: [C, C++, Java]
Java present at 4 position
[SQL, Android, C, C++, Java, Oracle, C]
Last index of C in a2: 6
[SQL, Android, C++, Java, Oracle, C]
[SQL, Android, Oracle]

//-------------------------------------------------------------------------------------

	// List iterating 
		
	- Iterator<E> iterator(): This method returns a basic Iterator object that allows you to iterate through the elements of 
		the ArrayList in forward order only. It provides methods like hasNext() to check if there's a next element and 
		next() to retrieve the next element.

	- ListIterator<E> listIterator(): This method returns a more versatile ListIterator object. It allows you to iterate 
		forward and backward through the ArrayList. Similar to iterator(), it has hasNext(), next(), but also offers 
		methods like hasPrevious() to check for a previous element and previous() to retrieve the previous element.

	- ListIterator<E> listIterator(int index): This method provides even more control. It returns a ListIterator that starts 
		iterating from the specified index position in the ArrayList. The initial call to next() will return the element 
		at the provided index, and subsequent calls will iterate forward. An initial call to previous() will return the
		element at index - 1 (if it exists).

 // Creating our own iterable class

import java.util.Iterator;

// Define a custom iterable class
class Demo implements Iterable<String> 
{
    private String[] data;
    public Demo(String[] data) 
	{
        this.data = data;
    }
    // Implement the iterator() method required by Iterable interface
    @Override
    public Iterator<String> iterator() 
	{
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return data[index++];
            }
        };
    }
}

public class MyIterableExample 
{
    public static void main(String[] args) 
	{
        // Create an instance of the iterable class
        Demo demo = new Demo(new String[]{"Hello", "World", "Iterable"});

        // Iterate over the elements using a for-each loop
        for (String item : demo) 
		{
            System.out.println(item);
        }

		System.out.println("Using iterator: ");
		Iterator<String> ob=demo.iterator();
		while(ob.hasNext())
		{
			System.out.println(ob.next());
		}
    }
}

//----------------------------------------------------------------------------------

package collectionexamples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        // Create an ArrayList of fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        // Use iterator() for forward traversal
        System.out.println("\nUsing iterator() for forward traversal:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit + " ");
        }

        // Use listIterator() for both forward and backward traversal
        System.out.println("\n\nUsing listIterator() for forward and backward traversal:");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.print(fruit + " ");
        }

        System.out.println("\nBackward traversal:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.print(fruit + " ");
        }

        // Use listIterator(int index) to start traversal from a specific position
        System.out.println("\n\nUsing listIterator(int index) to start at index 2:");
        listIterator = fruits.listIterator(2);
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.print(fruit + " ");
        }
    }
}

//----------------------------------------------------

	- void	forEach(Consumer<? super E> action): Performs the given action for each element of the Iterable until all elements 
		have been processed or the action throws an exception.

	// Before proceeding further we must know the concept of Functional Interface

	Functional Interface: A functional interface in Java is an interface that contains exactly one abstract method. It may 
	contain one or more default or static methods, but it must have only one abstract method. Functional interfaces are also 
	known as SAM interfaces, which stands for Single Abstract Method interfaces.

	e.g.
		@FunctionalInterface
		interface Message
		{
			void printMessage(); // must be only one - monitored by annotation @FunctionalInterface
		}

		- A functional interface can contain only one abstract method and it can contain any number of static and default 
		  (non-abstract) methods.

		- Abstract methods are methods that do not require implementation during their declaration and must be overridden 
		  by the class implementing the interface.

		- Default methods can be directly used in a class implementing the interface as well as can be overridden and 
		  redefined. Static methods are required to be called using the name of the interface preceding the method name. 
		  These cannot be overridden by the classes implementing the interface.

		- @FunctionalInterface Annotation is written above the interface declaration.It is optional, but when mentioned 
		  java compiler ensures that the interface has only one abstract method.

		- We can have any number of methods of object classes in our Functional Interface.

	// Example of using functional interface

@FunctionalInterface
interface Message {
	void printMessage(); // must be only one - monitored by annotation @FunctionalInterface
}

class MyMessage implements Message
{
	@Override
	public void printMessage() {
		System.out.println("Hello Functional Interface");
	}

}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		MyMessage ob=new MyMessage();
		ob.printMessage();
	}
}

//------ Same program using anonymous class

@FunctionalInterface
interface Message {
	void printMessage(); 
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Message ob=new Message(){
			public void printMessage() {
				System.out.println("Hello Functional Interface");
			}
		};
		ob.printMessage();
	}
}

//---------------------------------------------------------------------------

	// Using lambda Expression:

@FunctionalInterface
interface Message {
	void printMessage(); 
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Message ob=() -> {
				System.out.println("Hello Functional Interface");
			}
		;
		ob.printMessage();
	}
}
//---------------------------------------------------------------------------

	// Also can be written as 


@FunctionalInterface
interface Message {
	void printMessage(); 
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Message ob=() -> System.out.println("Hello Functional Interface");		
		ob.printMessage();
	}
}
//-----------------------------------------------------------------

	// Passing single value 


@FunctionalInterface
interface Message {
	void printValue(int x); 
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Message ob = (int x) -> System.out.println(" Value of x: "+x);
			
		ob.printValue(10);
	}
}
//-------------------------------------------------------------------

	// No need of mentioning type and () also, so program can be written as


@FunctionalInterface
interface Message {
	void printValue(int x); 
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Message ob = x -> System.out.println(" Value of x: "+x);
			
		ob.printValue(10);
	}
}
//-----------------------------------------------------------------

	// Passing multiple values

@FunctionalInterface
interface Message {
	void printAddition(int x, int y); 
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Message ob = (int x, int y) -> System.out.println(" Addition of x: "+(x+y));
			
		ob.printAddition(10,20);
	}
}
//-----------------------------------------------------------------

	// returning value:

	// Functional interface with default and static methods

package collectionexamples;
interface MathOperation {
    // Abstract method
    double operate(double a, double b);

    // Default method
    default void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    // Static method
    static void displayMessage() {
        System.out.println("Performing math operation...");
    }
}
class Calculations implements MathOperation
{
	@Override
	public double operate(double a, double b) {
		double sum=a+b;
		return sum;
	}	
}
public class FunctionalInterfaceExample1 {

    public static void main(String[] args) {

        // Implementing MathOperation interface with addition operation
    	Calculations addition = new Calculations();

        // Performing addition operation
        double result = addition.operate(10, 20);

        // Using default method to display result
        addition.displayResult(result);

        // Using static method to display message
        MathOperation.displayMessage();
    }
}


//----------------------------------------------------------

	// Implementing the functional interface using Anonymous class


interface MathOperation {
    // Abstract method
    double operate(double a, double b);
}

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        // Implementing MathOperation interface with addition operation
        MathOperation addition = new MathOperation() {
            @Override
            public double operate(double a, double b) {
                return a + b;
            }
        };

        // Performing addition operation
        double result = addition.operate(10, 20);
        System.out.println("Result is: "+result);
    }
}

//-----------------------------------------------------------------

	// Using lambda expression

interface MathOperation {
    // Abstract method
    double operate(double a, double b);
}

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        // Implementing MathOperation interface with addition operation
        MathOperation addition = (double a, double b) -> {
                return a + b;
            }
        ;

        // Performing addition operation
        double result = addition.operate(10, 20);
        System.out.println("Result is: "+result);
    }
}
//----------------------------------------------------------
	// Can finally written as

interface MathOperation {
    double operate(double a, double b);
}

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
    	
        MathOperation addition = (a, b) ->  a + b;

        double result = addition.operate(10, 20);
        System.out.println("Result is: "+result);
    }
}
//----------------------------------------------------------

Types of Functional interfaces
--------------------------------

	Functional interfaces in Java are mainly of four types:

	- Consumer
	- Predicate
	- Function
	- Supplier


	Lets discuss in detail:

	- Function: The Function<T, R> interface in Java represents a function that accepts an argument of type T and produces 
		a result of type R. It's commonly used when you need to apply a transformation or mapping operation on an input 
		object and produce an output object of a different type.

import java.util.function.Function;
public class FunctionExample {
    public static void main(String[] args) {

        // Creating a Function to get the length of a String
        Function<String, Integer> stringLength = (str) -> str.length();

        // Applying the Function to get the length of a String
        int length = stringLength.apply("Hello");

        // Printing the result
        System.out.println("Length of the string: " + length);
    }
}

 - We have created a Function<String, Integer> named stringLength, which takes a String as input and returns an Integer.
 - We use a lambda expression to define the logic of the apply method, which calculates the length of the input string.

// another example 

import java.util.function.Function;
public class FunctionExample {

    public static void main(String[] args) {
        // Function to square a number (input: Integer, output: Integer)
        Function<Integer, Integer> square = x -> x * x;

        // Apply the function to calculate the square of 5
        int result = square.apply(5);
        System.out.println("Square of 5: " + result); // Output: 25

        // Function to convert a string to uppercase (input: String, output: String)
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        // Apply the function to convert "hello" to uppercase
        String uppercased = toUpperCase.apply("hello");
        System.out.println("Uppercase of 'hello': " + uppercased); // Output: HELLO
    }
}

 - Bi-function: This is just like a function except it takes two arguments(must be of same type).

	- UnaryOperator and BinaryOperator Interfaces: Unary and Binary are two functional interfaces. Unary extends Function 
	  and Binary extends Bi-function functional interface.

		@FunctionalInterface
		public interface UnaryOperator<T> extends Function<T, T>{
   			// add methods here
		}

		@FunctionalInterface
		public interface BinaryOperator<T> extends BiFunction<T, T, T>{
    			// add methods here
		}



	// Using UnaryOperator Interface: 

import java.util.function.Function;
import java.util.function.UnaryOperator;
  
public class Main{
    public static void main(String args[]){
        UnaryOperator<Integer> not = a -> a ^ 1;
        System.out.println(not.apply(0));
    }
}

	// Using BinaryOperator Interface

import java.util.function.Function;
import java.util.function.BinaryOperator;
  
public class Main{
    public static void main(String args[]){
        BinaryOperator<Integer> and = (a,b) -> a & b;
        System.out.println(and.apply(12, 4));
    }
}

//-----------------------------------------------------------
  - Supplier:

	The supplier functional interface in Java is much like a functional interface, the only difference is it doesn't take any 
	arguments. On calling the supplier it simply returns a value. Supplier is a generic interface thus, it takes the type of 
	value in <> (Angular brackets) while implementing to be returned by the get() method.

	@FunctionalInterface
	public interface Supplier<T>{
   		 T get();
	}


import java.util.function.Supplier;
public class Test {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Hello There!";
        System.out.println(message.get());
    }
}

//-----------------------------------------------------------
  - Consumer:

	The Consumer functional interface in Java accepts a single gentrified argument and doesn't return any value.

	@FunctionalInterface
	public interface Consumer<T>{
	    void accept(T t);
	}


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Creating a Consumer to print the elements of the list
        Consumer<Integer> printNumber = new PrintNumber();

        // Applying the Consumer to each element of the list
        numbers.forEach(printNumber);
    }
}

class PrintNumber implements Consumer<Integer> {
    public void accept(Integer number) {
        System.out.println(number);
    }
}

//using lambda expression 

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Creating a Consumer to print the elements of the list
        Consumer<Integer> printNumber = (number) -> System.out.println(number);

        // Applying the Consumer to each element of the list
        numbers.forEach(printNumber);

	// numbers.forEach((number) -> System.out.println(number));

    }
}

//-----------------------------------------------------------

  - Predicate<T>:
	The Predicate<T> interface in Java represents a predicate(a statement, action), which is a boolean-valued function of 
	one argument. It's commonly used when you need to test a condition or filter elements based on some criteria.

	public interface Predicate<T>{
    		boolean test(T t);
	}

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Creating a Predicate to check if a number is even
        Predicate<Integer> isEven = new IsEvenPredicate();

        // Testing the Predicate with some numbers
        System.out.println("Is 4 even? " + isEven.test(4));   // true
        System.out.println("Is 7 even? " + isEven.test(7));   // false
    }
}

class IsEvenPredicate implements Predicate<Integer> {
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}

// using lambda expression

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Creating a Predicate to check if a number is even
        Predicate<Integer> isEven = (number) -> number % 2 == 0;

        // Testing the Predicate with some numbers
        System.out.println("Is 4 even? " + isEven.test(4));   // true
        System.out.println("Is 7 even? " + isEven.test(7));   // false
    }
}

	// using with arrayList

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Remove all even numbers using removeIf and Predicate
        numbers.removeIf(isEven);

        System.out.println("Numbers after removing even numbers: " + numbers);

        // Another Predicate to check if a number is greater than 30
        Predicate<Integer> greaterThan30 = number -> number > 30;
	numbers.removeIf(greaterThan30);

    }
}

//-----------------------------------------------------------


boolean	removeIf(Predicate<? super E> filter): The removeIf method is used to efficiently remove elements from an ArrayList that 
	satisfy a specific condition. 

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIfExample {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(21);
        numbers.add(30);
        numbers.add(43);
        numbers.add(50);

        System.out.println("Numbers before removal: " + numbers);

        // Remove even numbers using a Predicate
        boolean removed = numbers.removeIf(number -> number % 2 == 0);

        System.out.println("Numbers after removal: " + numbers);
        System.out.println("Elements removed: " + removed);
    }
}

//------------------------------------------------------------------------

	- void replaceAll(UnaryOperator<E> operator): Replaces each element of this list with the result of applying the operator 
		to that element.

public class ArrayListExample1 {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        List<Integer> numbers = new ArrayList<>();
        
        // Adding elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // Printing the original ArrayList
        System.out.println("Original ArrayList: " + numbers);
        
        // Replacing each element with its square
        numbers.replaceAll(n -> n * n);
        
        // Printing the modified ArrayList
        System.out.println("Modified ArrayList: " + numbers);
    }
}

//---------------------------------------------------
public class ReplaceAllExample {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");

        System.out.println("Fruits before replacement: " + fruits);

        // Replace all fruits to uppercase using a UnaryOperator
        fruits.replaceAll(fruit -> fruit.toUpperCase()); // Lambda expression for UnaryOperator

        System.out.println("Fruits after replacement: " + fruits);
    }
}


//------------------------------------------------------------------------

	- boolean retainAll(Collection<?> c): Retains only the elements in this list that are contained in the specified 
		collection. In other words, it removes all elements from the current collection that are not contained in 
		the specified collection.

package collectionexamples;
import java.util.ArrayList;
import java.util.Collection;

public class RetainAllExample {
    public static void main(String[] args) {
        // Creating two ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        // Adding elements to the first ArrayList
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");
        list1.add("grapes");
        
        // Adding elements to the second ArrayList
        list2.add("banana");
        list2.add("orange");
        list2.add("kiwi");
        
        // Printing the original lists
        System.out.println("Original list1: " + list1);
        System.out.println("Original list2: " + list2);
        
        // Retaining only the elements that are common in both lists
        boolean changed = list1.retainAll(list2);
        
        // Printing the modified list1
        System.out.println("Modified list1: " + list1);
        
        // Checking if the list1 has been modified
        System.out.println("List1 has been modified: " + changed);
    }
}

//------------------------------------------------------------------------
	- void sort(Comparator<? super E> c): Sorts this list according to the order induced by the specified Comparator. This 
		method is used for sorting elements in a list based on a custom comparison logic. 

		- void: This indicates that the method doesn't return any value after execution.
		- sort: This signifies that the method sorts the elements within a list.
		- <E>: This represents the generic type of the elements in the list.
		- Comparator<? super E> c: This parameter is of type Comparator. It defines a custom comparison logic that determines
		  the sorting order of the elements. The ? super E part allows the comparator to work with elements that are subtypes
		  of E. This provides flexibility in sorting elements of different but related types.
		- c: This is a reference to a Comparator object. A comparator defines how to compare two elements of the list.
	
import java.util.*;
/*
 class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
		this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" - "+name + ":Rs." + price+" "+super.toString();
    }
}

public class SortProductsExample {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(12,"Laptop", 90999.99));
        products.add(new Product(89,"Smartphone", 64599.99));
        products.add(new Product(2,"Headphones", 1249.99));
        products.add(new Product(34,"Tablet", 8399.99));

        // Output the list before sorting
        System.out.println("Before sorting: " + products);

        // Sort the list based on product price
        products.sort(new ProductPriceComparator());

        // Output the list after sorting
        System.out.println("After price sorting: " + products);

    }
}

// Comparator implementation to sort products based on their prices
class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

//-------------------------------------------------------------------------------

import java.util.*;

 class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
		this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" - "+name + ":Rs." + price + "  ";
    }
}

public class SortProductsExample {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(12,"Laptop", 90999.99));
        products.add(new Product(89,"Smartphone", 64599.99));
        products.add(new Product(2,"Headphones", 1249.99));
        products.add(new Product(34,"Tablet", 8399.99));

        // Output the list before sorting
        System.out.println("Before sorting: " + products);

        // Sort the list based on product price
        products.sort(new ProductPriceComparator(){
			@Override
			public int compare(Product p1, Product p2) {
				return Double.compare(p1.getPrice(), p2.getPrice());
			}

        });

        // Output the list after sorting
        System.out.println("After price sorting: " + products);

    }
}

//-------------------------------------------------------------------------------

import java.util.*;

 class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
		this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" - "+name + ":Rs." + price + "  ";
    }
}

public class SortProductsExample {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(12,"Laptop", 90999.99));
        products.add(new Product(89,"Smartphone", 64599.99));
        products.add(new Product(2,"Headphones", 1249.99));
        products.add(new Product(34,"Tablet", 8399.99));

        // Output the list before sorting
        System.out.println("Before sorting: " + products);

        // Sort the list based on product price
        products.sort(new Comparator<Product>(){
			@Override
			public int compare(Product p1, Product p2) {
				return Double.compare(p1.getPrice(), p2.getPrice());
			}

        });

        // Output the list after sorting
        System.out.println("After price sorting: " + products);

    }
}


//-------------------------------------------------------------------------------

import java.util.*;

 class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
		this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" - "+name + ":Rs." + price + "  ";
    }
}

public class SortProductsExample {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(12,"Laptop", 90999.99));
        products.add(new Product(89,"Smartphone", 64599.99));
        products.add(new Product(2,"Headphones", 1249.99));
        products.add(new Product(34,"Tablet", 8399.99));

        // Output the list before sorting
        System.out.println("Before sorting: " + products);

        // Sort the list based on product price
        products.sort((Product p1, Product p2) -> {
				return Double.compare(p1.getPrice(), p2.getPrice());
			}
		);

        // Output the list after sorting
        System.out.println("After price sorting: " + products);

    }
}

//-------------------------------------------------------------------------------

import java.util.*;

 class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
		this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" - "+name + ":Rs." + price + "  ";
    }
}

public class SortProductsExample {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(12,"Laptop", 90999.99));
        products.add(new Product(89,"Smartphone", 64599.99));
        products.add(new Product(2,"Headphones", 1249.99));
        products.add(new Product(34,"Tablet", 8399.99));

        // Output the list before sorting
        System.out.println("Before sorting: " + products);

        // Sort the list based on product price
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
	
        // Output the list after sorting
        System.out.println("After price sorting: " + products);

    }
}

//-------------------------------------------------------------------------------

import java.util.*;

 class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
		this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" - "+name + ":Rs." + price + "  ";
    }
}

public class SortProductsExample {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(12,"Laptop", 90999.99));
        products.add(new Product(89,"Smartphone", 64599.99));
        products.add(new Product(2,"Headphones", 1249.99));
        products.add(new Product(34,"Tablet", 8399.99));

        // Output the list before sorting
        System.out.println("Before sorting: " + products);

        // Sort the list based on product price
        // products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		Collections.sort(products, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        // Output the list after sorting
        System.out.println("After price sorting: " + products);

    }
}

*/
//---------------------------------------------------------------------------------------

class CollectiosDemo {
	public static void main(String []args)
	{
		ArrayList<Integer> arlst=new ArrayList<Integer>();
		arlst.add(12);
		arlst.add(32);
		arlst.add(142);
		arlst.add(127);
		arlst.add(42);
		arlst.add(16);
		arlst.add(112);
		System.out.println("Entered Arraylist is: "+arlst);

		arlst.sort( (x,y)-> Integer.compare((int)x,(int)y) );
		System.out.println("Entered(ascending) Arraylist is: "+arlst);

		arlst.sort( (y,x)-> Integer.compare((int)x,(int)y) );
		System.out.println("Entered(descending) Arraylist is: "+arlst);

		// Using Collections
		
		Collections.sort(arlst);
		System.out.println("Entered(ascending) Arraylist is: "+arlst);

		Collections.sort(arlst,	Collections.reverseOrder());
		System.out.println("Entered(descending) Arraylist is: "+arlst);
	}
}
//-----------------------------------------------------------

- Spliterator<E> spliterator(): Creates a late-binding and fail-fast Spliterator over the elements in this list.

	In Java, a Spliterator is an interface introduced in Java 8 as part of the Stream API(Application Programming Interface). 
	It provides a way to perform parallel traversal over the elements of a source, such as an array, a generator function, etc.
		
	The ArrayList class in Java also implements the Spliterator interface using the .spliterator() method. This method returns a
	Spliterator over the elements in ArrayList. It is considered a better way to iterate over elements as it gives more 
	control over them.

	The .spliterator() method can be combined with a number of other methods:

	- tryAdvance(): This method is used to iterate elements separately in several threads to enable parallel processing.
	- forEachRemaining(): This method is used to iterate elements consecutively in a single thread.
	- trySplit(): This method splits the obtained Spliterator into separate parts to facilitate parallel processing.


package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class UsingsplIterator {

	public static void main(String []args) {
		
		ArrayList<Integer> arlst=new ArrayList<Integer>();
		arlst.add(12);
		arlst.add(32);
		arlst.add(142);
		arlst.add(127);
		arlst.add(42);
		arlst.add(16);
		arlst.add(112);
		System.out.println("Entered Arraylist is: "+arlst);
		
		Iterator<Integer> ob=arlst.iterator();
		System.out.println("Entered Arraylist(using iterator) is: ");
		while(ob.hasNext())
		{
			System.out.print("  "+ob.next());
		}
		
		 ob=arlst.iterator();
		System.out.println("\n Entered Arraylist(using foreach) is: ");
		ob.forEachRemaining(element -> System.out.print(" "+element));
		
		//----------------
		
		Spliterator<Integer> sob = arlst.spliterator();
		System.out.println("\n using spiterator tryadvance()-I: ");
		while(sob.tryAdvance(element -> System.out.print(" "+element)));
		
		sob = arlst.spliterator();
		System.out.println("\n using spiterator tryadvance()-II: ");
		while(sob.tryAdvance(System.out::println)); // shorter way of above
		
		//---------------
		
		sob = arlst.spliterator();
		Spliterator<Integer> sob1 = sob.trySplit(); // a part of sob is separated 
		System.out.println("\n Entered Arraylist(split part) is: ");
		if(sob1!=null)
			sob1.forEachRemaining(element -> System.out.print(" "+element)); // separated part display
		
		System.out.println("\n Entered Arraylist(split part) is: ");
		sob.forEachRemaining(element -> System.out.print(" "+element)); // remaining part display
		
	}

}

//---------------------------------------------------------------------------------------------

package collectionexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ArrayListSpliteratorExample2 {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grapes");
        myList.add("Watermelon");

        // Get the Spliterator from the ArrayList
        Spliterator<String> spliterator = myList.spliterator();

        // Sequential traversal using tryAdvance()
        System.out.println("Sequential traversal using tryAdvance():");
        while (spliterator.tryAdvance(System.out::println)) ;

        // Reset the spliterator
        spliterator = myList.spliterator();

        // Parallel traversal using trySplit()
        System.out.println("\nParallel traversal using trySplit():");
        Spliterator<String> splitSpliterator = spliterator.trySplit();

        if (splitSpliterator != null) {
            // Process the first half of the list in parallel
            splitSpliterator.forEachRemaining(System.out::println);
        }

        // Process the second half of the list sequentially
        System.out.println("\nProcessing remaining elements sequentially:");
        spliterator.forEachRemaining(System.out::println);
        // or spliterator.forEachRemaining(element -> System.out.println(element));
    }
}

//------------------------------------------------------------------------
The important points about Java ArrayList class are:

	- Java ArrayList class can contain duplicate elements.
	- Java ArrayList class maintains insertion order.
	- Java ArrayList class is non-synchronized.
	- Java ArrayList allows random access because array works at the index basis.
	- In Java ArrayList class, manipulation is slow because a lot of shifting needs to have occurred if any element is removed 
	  from the array list.
	- You cannot create an ArrayList of primitive types like int, char, etc. You need to use boxed types like Integer, 
	  Character, Boolean, etc.

//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------

interface Queue<E>
--------------------

A collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional 
insertion, extraction, and inspection operations. Each of these methods exists in two forms: one throws an exception if the 
operation fails, the other returns a special value (either null or false, depending on the operation). The latter form of the 
insert operation is designed specifically for use with capacity-restricted Queue implementations; in most implementations, insert 
operations cannot fail.

Summary of Queue methods

 - Insert: add(e) and offer(e): The offer method inserts an element if possible, otherwise returning false. This differs from the
 	   Collection.add method, which can fail to add an element only by throwing an unchecked exception. The offer method is 
	   designed for use when failure is a normal, rather than exceptional occurrence, for example, in fixed-capacity (or 
	   "bounded") queues.

 - Remove: remove() and poll(): The remove() and poll() methods remove and return the head of the queue. The remove() and poll() 
	methods differ only in their behavior when the queue is empty: the remove() method throws an exception, while the poll() 
	method returns null.
		
 - Examine: element() and peek(): The element() and peek() methods return, but do not remove, the head of the queue.

 - Methods in Queue Interface

  public abstract boolean add(E);
  public abstract boolean offer(E);
  public abstract E remove();
  public abstract E poll();
  public abstract E element();
  public abstract E peek();

//-----------------------------------------------------------------

interface Deque<E>
--------------------
 - A linear collection that supports element insertion and removal at both ends. The name deque is short 
   for "double ended queue" 

- Methods in Deque Interface

  public abstract void addFirst(E);
  public abstract void addLast(E);
  public abstract boolean offerFirst(E);
  public abstract boolean offerLast(E);
  public abstract E removeFirst();
  public abstract E removeLast();
  public abstract E pollFirst();
  public abstract E pollLast();
  public abstract E getFirst();
  public abstract E getLast();
  public abstract E peekFirst();
  public abstract E peekLast();
  public abstract boolean removeFirstOccurrence(java.lang.Object);
  public abstract boolean removeLastOccurrence(java.lang.Object);
  public abstract boolean add(E);
  public abstract boolean offer(E);
  public abstract E remove();
  public abstract E poll();
  public abstract E element();
  public abstract E peek();
  public abstract boolean addAll(java.util.Collection<? extends E>);
  public abstract void push(E);
  public abstract E pop();
  public abstract boolean remove(java.lang.Object);
  public abstract boolean contains(java.lang.Object);
  public abstract int size();
  public abstract java.util.Iterator<E> iterator();
  public abstract java.util.Iterator<E> descendingIterator();
  public default java.util.Deque<E> reversed();
  public default java.util.SequencedCollection reversed();
}

//-------------------------------------
	
 Using Java.util.LinkedList:
 ---------------------------
 - Decl: public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable

 - Doubly-linked list implementation of the List and Deque interfaces. Implements all optional list operations, and permits all 
	elements (including null).


-Constructors: 

 - LinkedList(): Constructs an empty list.
 - LinkedList(Collection<? extends E> c): Constructs a list containing the elements of the specified collection, in the order they 
	are returned by the collection's iterator.

- LinkedList Methods:

First we will discuss some of the useful and frequently used Java LinkedList methods. 
The following methods are inherited from List or Collection interface:

int size(): to get the number of elements in the list.
boolean isEmpty(): to check if list is empty or not.
boolean contains(Object o): Returns true if this list contains the specified element.
Iterator iterator(): Returns an iterator over the elements in this list in proper sequence.
Object[] toArray(): Returns an array containing all of the elements in this list in proper sequence.
boolean add(E e): Appends the specified element to the end of this list.
boolean remove(Object o): Removes the first occurrence of the specified element from this list.
boolean retainAll(Collection c): Retains only the elements in this list that are contained in the specified collection.
void clear(): Removes all the elements from the list.
E get(int index): Returns the element at the specified position in the list.
E set(int index, E element): Replaces the element at the specified position in the list with the specified element.
ListIterator listIterator(): Returns a list iterator over the elements in the list.
List subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. The returned list is backed by this list, so non-structural changes in the returned list are reflected in this list, and vice-versa.

Java LinkedList Deque Methods
The following methods are specific to LinkedList class which are inherited from Deque interface:

void addFirst(E e): Inserts the specified element at the beginning of this list.
void addLast(E e): Inserts the specified element at the end of this list.
E getFirst(): Retrieves, but does not remove, the first element of this list. This method differs from peekFirst only in that it throws an exception if this list is empty.
E getLast(): Retrieves, but does not remove, the last element of this list. This method differs from peekLast only in that it throws an exception if this list is empty.
E remvoeFirst(): Removes and returns the first element from this list.
E removeLast(): Removes and returns the last element from this list.
boolean offerFirst(E e): Inserts the specified element at the front of this list.
boolean offerLast(E e): Inserts the specified element at the end of this list.
E pollFirst(): Retrieves and removes the first element of this list, or returns null if this list is empty.
E pollLast(): Retrieves and removes the last element of this list, or returns null if this list is empty.
E peekFirst(): Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
E peekLast(): Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

Java LinkedList Queue Methods
The following methods are specific to LinkedList class which are inherited from Queue interface:
boolean	add(E e): Inserts the specified element into this queue if it is possible to do so immediately without violating capacity 
	restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
E element(): Retrieves, but does not remove, the head of this queue.
boolean	offer(E e): Inserts the specified element into this queue if it is possible to do so immediately without violating 
	capacity restrictions.
E peek(): Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
E poll(): Retrieves and removes the head of this queue, or returns null if this queue is empty.
E remove(): Retrieves and removes the head of this queue.

package collectionexamples;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
//		LinkedList<Integer> l1=new LinkedList<>(); // Empty list
//		System.out.println(l1.remove()); // generates an Exception 
//		System.out.println(l1.poll()); // gives null as output
		
		ArrayList<Integer> al=new ArrayList();
		al.add(12);
		al.add(23);
		al.add(90);
		al.add(32);
		al.add(100);
		LinkedList<Integer> l2=new LinkedList<>(al);

		System.out.println("Element at start: "+l2.element());
		System.out.println("Element at start: "+l2.getFirst());
		System.out.println("Element at start: "+l2.peek());
		System.out.println("Element at start: "+l2.peekFirst());
		System.out.println("Element at start: "+l2.poll());
		System.out.println("Element at start: "+l2.pollFirst());
		System.out.println("Element at start: "+l2.pop());
		System.out.println("Element at start: "+l2.remove());
	}

}

//-----------------------------------------------------

	// iterating in LinkedList using iterator(), listIterator() and spliterator()

package collectionexamples;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class UsingIteratorInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        // Using iterator() to print all elements
        System.out.println("Using iterator:");
        var iterator = linkedList.iterator();
        // The var keyword in Java is a feature introduced in Java 10 as part of the local 
        // variable type inference. It allows the compiler to infer the type of a local variable 
        // based on the type of the initializer. 
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using listIterator() to traverse forward and backward, modifying elements
        System.out.println("\nUsing listIterator (forward and backward):");
        ListIterator<String> listIterator = linkedList.listIterator();
        System.out.println("Traversing forward and modifying:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry");
            }
            System.out.println(fruit);
        }

        System.out.println("Traversing backward:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Using spliterator() to split and process the list
        System.out.println("\n Using spliterator:");
        Spliterator<String> spliterator1 = linkedList.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        // Consumer to process elements
        Consumer<String> consumer = fruit -> System.out.println("Processing: " + fruit);

        // Process first half of the list
        System.out.println("First spliterator:");
        spliterator1.forEachRemaining(consumer);

        // Process second half of the list
        System.out.println("Second spliterator:");
        if (spliterator2 != null) {
            spliterator2.forEachRemaining(consumer);
        } else {
            System.out.println("Spliterator could not split further.");
        }
    }
}

//-----------------------------------------------------

	// use forEach() and toArray()

package collectionexamples;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // 1. Print elements using forEach()
        System.out.println("Printing fruits using forEach():");
        fruits.forEach(fruit -> System.out.println(fruit));

        // 2. Modify elements using forEach()
        System.out.println("\nModifying fruits (uppercase) using forEach():");
        fruits.forEach(fruit -> fruits.set(fruits.indexOf(fruit), fruit.toUpperCase()));
        fruits.forEach(fruit -> System.out.println(fruit));

        // 3. Convert LinkedList to Object array using toArray()
        System.out.println("\nConverting fruits to Object array using toArray():");
        Object[] fruitsArray = fruits.toArray();
        for (Object fruit : fruitsArray) {
            System.out.println(fruit);
        }

        // 4. Convert LinkedList to String array using toArray(String[])
        System.out.println("\nConverting fruits to String array using toArray(String[]):");
        String[] fruitsStringArray = fruits.toArray(new String[fruits.size()]);
        for (String fruit : fruitsStringArray) {
            System.out.println(fruit);
        }
    }
}


//-----------------------------------------------------

	// implement Queue operations using LinkedList

package collectionexamples;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n Queue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Display Queue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    String element = scanner.nextLine();
                    queue.add(element);
                    System.out.println("Enqueued: " + element);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        String removedElement = queue.remove();
                        System.out.println("Dequeued: " + removedElement);
                    } else {
                        System.out.println("Queue is empty. Nothing to dequeue.");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        String frontElement = queue.peek();
                        System.out.println("Front element: " + frontElement);
                    } else {
                        System.out.println("Queue is empty. Nothing to peek.");
                    }
                    break;
                case 4:
                    System.out.println("Is the queue empty? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue: " + queue);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

//-----------------------------------------------------
	// implement stack operations using LinkedList

package collectionexamples;
import java.util.LinkedList;
import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    String element = scanner.nextLine();
                    stack.push(element); // Push element onto the stack
                    System.out.println("Pushed: " + element);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        String poppedElement = stack.pop(); // Pop element from the stack
                        System.out.println("Popped: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty. Nothing to pop.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        String topElement = stack.peek(); // Peek at the top element of the stack
                        System.out.println("Top element: " + topElement);
                    } else {
                        System.out.println("Stack is empty. Nothing to peek.");
                    }
                    break;
                case 4:
                    System.out.println("Is the stack empty? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack: " + stack);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }        
        scanner.close();
    }
}

//-----------------------------------------------------

	// implement All linked list operations using LinkedList

package collectionexamples;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Scanner;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLinkedList Operations Menu:");
            System.out.println("1. Add to the front");
            System.out.println("2. Add to the end");
            System.out.println("3. Add at a specific position");
            System.out.println("4. Remove from the front");
            System.out.println("5. Remove from the end");
            System.out.println("6. Remove by value");
            System.out.println("7. Get first element");
            System.out.println("8. Get last element");
            System.out.println("9. Get element at a specific position");
            System.out.println("10. Update element at a specific position");
            System.out.println("11. Traverse the list forward");
            System.out.println("12. Search by value");
            System.out.println("13. Size of the list");
            System.out.println("14. Check if the list is empty");
            System.out.println("15. Clear the list");
            System.out.println("16. Convert to array");
            System.out.println("17. Sort the list");
            System.out.println("18. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add to the front: ");
                    int element1 = scanner.nextInt();
                    linkedList.addFirst(element1);
                    System.out.println("List: " + linkedList);
                    break;
                case 2:
                    System.out.print("Enter element to add to the end: ");
                    int element2 = scanner.nextInt();
                    linkedList.addLast(element2);
                    System.out.println("List: " + linkedList);
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    int position = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    System.out.print("Enter element to add: ");
                    int element3 = scanner.nextInt();
                    linkedList.add(position, element3);
                    System.out.println("List: " + linkedList);
                    break;
                case 4:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeFirst();
                        System.out.println("List: " + linkedList);
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 5:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeLast();
                        System.out.println("List: " + linkedList);
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 6:
                    System.out.print("Enter element to remove: ");
                    int element4 = scanner.nextInt();
                    if (linkedList.remove(Integer.valueOf(element4))) {
                        System.out.println("Element removed. List: " + linkedList);
                    } else {
                        System.out.println("Element not found in the list.");
                    }
                    break;
                case 7:
                    if (!linkedList.isEmpty()) {
                        System.out.println("First element: " + linkedList.getFirst());
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 8:
                    if (!linkedList.isEmpty()) {
                        System.out.println("Last element: " + linkedList.getLast());
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 9:
                    System.out.print("Enter position: ");
                    int position2 = scanner.nextInt();
                    if (position2 >= 0 && position2 < linkedList.size()) {
                        System.out.println("Element at position " + position2 + ": " + linkedList.get(position2));
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 10:
                    System.out.print("Enter position: ");
                    int position3 = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    if (position3 >= 0 && position3 < linkedList.size()) {
                        System.out.print("Enter new element: ");
                        int newElement = scanner.nextInt();
                        linkedList.set(position3, newElement);
                        System.out.println("List: " + linkedList);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 11:
                    System.out.println("Forward traversal:");
                    ListIterator<Integer> iterator = linkedList.listIterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case 12:
                    System.out.print("Enter element to search: ");
                    int element5 = scanner.nextInt();
                    boolean contains = linkedList.contains(element5);
                    System.out.println("Contains " + element5 + "? " + contains);
                    break;
                case 13:
                    System.out.println("Size of the list: " + linkedList.size());
                    break;
                case 14:
                    boolean isEmpty = linkedList.isEmpty();
                    System.out.println("Is the list empty? " + isEmpty);
                    break;
                case 15:
                    linkedList.clear();
                    System.out.println("List cleared. Current list: " + linkedList);
                    break;
                case 16:
                    Object[] array = linkedList.toArray();
                    System.out.println("List converted to array: " + java.util.Arrays.toString(array));
                    break;
                case 17:
                    Collections.sort(linkedList);
                    System.out.println("Sorted list: " + linkedList);
                    break;
                case 18:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

//-----------------------------------------------------

	// Attending Thread safety using Collections.synchronizedList() 


	Collections.synchronizedList() in Java is used to create a synchronized wrapper around an existing list, making it 
	thread-safe for modifications.

package collectionexamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample  {

    public static void main(String[] args) throws InterruptedException {
        // Create an ArrayList
        List<Integer> numbers = new LinkedList<>();

        // Wrap it in a synchronized list
        List<Integer> synchronizedNumbers = Collections.synchronizedList(numbers);

        // Thread 1 keeps adding numbers
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                synchronizedNumbers.add(i);
                try {
                    Thread.sleep(200); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2 keeps printing the list size
        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println("List Size: " + synchronizedNumbers.size());
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish (unlikely due to the infinite loop in thread2)
        thread1.join();
        thread2.join();
    }
}


//-----------------------------------------------------

	// Attaending immutability in Collections

	An object is considered immutable if its state cannot change after it is constructed. In Java, you can create immutable 
	lists using various approaches. Immutable lists are lists whose elements cannot be changed, added, or removed after the 
	list is created. 

	1. Using Collections.unmodifiableList():

	This method takes an existing mutable list and returns a wrapper that prevents modifications to the list structure 
	(adding, removing, or replacing elements). However, the elements themselves can still be mutable if they are 
	mutable objects.

package collectionexamples;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UnmodifiableListDemo {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original List (LinkedList): ");
        printList(fruits);

        // Create an unmodifiable view using Collections.unmodifiableList()
        List<String> unmodifiableList = Collections.unmodifiableList(fruits);

        System.out.println("\nUnmodifiable List: ");
        printList(unmodifiableList);

        // Trying to modify the unmodifiable list throws an exception
        try {
            unmodifiableList.add("Mango");
            System.out.println("Successfully added Mango (should not happen!)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Adding element to unmodifiable list: " + e);
        }

        // Modifications to the original list are still reflected
        fruits.addFirst("Grape");
        System.out.println("\nAfter modifying original list (LinkedList): ");
        printList(fruits);

        System.out.println("\nUnmodifiable List (after modification): ");
        printList(unmodifiableList);
    }

    private static void printList(List<String> list) {
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

//---------

	2. Using Java 9+ List.of() Factory Method:

	Java 9 introduced a factory method List.of() that can be used to create immutable lists. This method is convenient 
	for creating small, fixed-size lists.
		e.g.
			List<String> colors = List.of("Red", "Green", "Blue");

package collectionexamples;
import java.util.LinkedList;
import java.util.List;

public class ListOfDemo {

    public static void main(String[] args) {
        // LinkedList cannot be used directly with List.of()
        // System.out.println(List.of(new LinkedList<>())); // Compilation error

        // Option 1: Convert LinkedList to an array and use List.of()
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        String[] fruitsArray = fruits.toArray(new String[fruits.size()]);
        List<String> immutableList = List.of(fruitsArray);

        System.out.println("Original List (LinkedList): ");
        printList(fruits);

        System.out.println("\nImmutable List (using List.of() with array): ");
        printList(immutableList);

        // Trying to modify the immutable list throws an exception
        try {
            immutableList.add("Mango");
            System.out.println("Successfully added Mango (should not happen!)");
        } catch (UnsupportedOperationException e) {
            System.out.println("Adding element to unmodifiable list: " + e);
        }

        // Modifications to the original list (LinkedList) are not reflected
        fruits.addFirst("Grape");
        System.out.println("\nAfter modifying original list (LinkedList): ");
        printList(fruits);

        System.out.println("\nImmutable List (after modification - not reflected): ");
        printList(immutableList);
    }

    private static void printList(List<String> list) {
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

//----------------------------------------------------------------------------------------------------------------------------------

The java.util.PriorityQueue class:
----------------------------------

The java.util.PriorityQueue class in Java is part of the Java Collections Framework and provides the functionality of a priority queue. A priority queue is a data structure that allows elements to be processed based on their priority. It is typically implemented using a heap data structure, which allows efficient retrieval of the highest (or lowest) priority element.

By default, a PriorityQueue is a min-heap, meaning the smallest element (according to natural ordering or a 
specified comparator) is always at the head of the queue.It dynamically resizes as elements are added or 
removed. It is not thread-safe. For concurrent access, consider using PriorityBlockingQueue from the 
java.util.concurrent package.

constructors: 

- PriorityQueue(): Creates a priority queue with default initial capacity (11) and natural ordering.

- PriorityQueue(int initialCapacity): Creates a priority queue with the specified initial capacity and 
	natural ordering.

- PriorityQueue(Comparator<? super E> comparator): Creates a PriorityQueue with the default initial capacity and whose elements are 	ordered according to the specified comparator.

- PriorityQueue(int initialCapacity, Comparator<? super E> comparator): Creates a priority queue with the 
	specified initial capacity and custom comparator ordering.

- PriorityQueue(Collection<? extends E> c): Creates a priority queue containing elements from the specified 
	collection with natural ordering.

- PriorityQueue(PriorityQueue<? extends E> c): Creates a priority queue containing elements from the specified 
	priority queue with the same ordering.

- PriorityQueue(SortedSet<? extends E> c): Creates a priority queue containing elements from the specified sorted set 
	with the same ordering.


	// Using default constructor and add(E):

package collectionexamples;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {

	public static void main(String []args)
	{
		Queue<Integer> prq = new PriorityQueue<>();
		// prq uses the min heap as an internal data structure by default.
		prq.add(4);
		prq.add(3);
		prq.add(12);
		prq.add(45);
		prq.add(24);
		prq.add(11);
		prq.add(2);
		prq.add(18);
		prq.add(1);
		System.out.println("Original prq is: "+prq);
		prq.remove(4);
		System.out.println("After prq is: "+prq);
	}
}

---------- After Run ------------
Original prq is: [1, 2, 3, 4, 24, 12, 11, 45, 18]
After prq is: [1, 2, 3, 18, 24, 12, 11, 45]

  Note that the Min Heap (Tree based) used as a internal data structure so at the add and remove 
  the heapfy operation plays an important role.

//-----------------------------------------------------------------------------------------------------------------

	// Using max heap as an internal data structure


	- Min-Heap: (bydefault) PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	- max-Heap:  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());


package collectionexamples;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {

	public static void main(String []args)
	{
		Queue<Integer> prq = new PriorityQueue<>(Comparator.reverseOrder()); 
		// Comparator.reverseOrder() prq uses the max heap as an internal data structure
		prq.add(4);
		prq.add(3);
		prq.add(12);
		prq.add(45);
		prq.add(24);
		prq.add(11);
		prq.add(2);
		prq.add(18);
		prq.add(1);
		System.out.println("Original prq is: "+prq);
		prq.remove(4);
		System.out.println("After prq is: "+prq);
	}
}

//--------------------------------------------------------------------------------

	// Creating PriorityQueue using ArrayList

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {

	public static void main(String []args)
	{
		List<Integer> lst=new ArrayList<>();
		lst.add(4);
		lst.add(3);
		lst.add(12);
		lst.add(45);
		lst.add(24);
		lst.add(11);
		lst.add(2);
		lst.add(18);
		lst.add(1);
		Queue<Integer> prq = new PriorityQueue<>(lst); 
		System.out.println("Original prq is: "+prq);
	}
}

//------------------------------------------------------------------------------

	// Creating PriorityQueue from another PriorityQueue 


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {

	public static void main(String []args)
	{
		List<Integer> lst=new ArrayList<>();
		lst.add(4);
		lst.add(3);
		lst.add(12);
		lst.add(45);
		lst.add(24);
		lst.add(11);
		lst.add(2);
		lst.add(18);
		lst.add(1);
		Queue<Integer> prq = new PriorityQueue<>(lst); 
		System.out.println("Original prq is: "+prq);
		
		Queue<Integer> p1 = new PriorityQueue<>(prq); 
		System.out.println("Now prq is: "+prq);
		System.out.println(" p1 is: "+p1);		

		prq.remove(4);
		
		System.out.println("Now again prq is: "+prq);
		System.out.println("again p1 is: "+p1);		
	}
}


//------------------------------------------------------------------------------------------

	// Using custom comparator to create the priority queue

 We can use the Compariable to decide the ordering oe elements in the Priority queue as

package collectionexamples;
import java.util.PriorityQueue;
import java.util.Comparator;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomObjectPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue with custom objects (min-heap based on age)
        PriorityQueue<Person> personQueue = new PriorityQueue<>();

        personQueue.add(new Person("Alice", 30));
        personQueue.add(new Person("Bob", 25));
        personQueue.add(new Person("Charlie", 35));

        System.out.println("Polling elements from Person Queue:");
        while (!personQueue.isEmpty()) {
            System.out.println(personQueue.poll());
        }
    }
}


//------------------------------------------------------------------------------------------

	// the custom comparator can be defined to perform same operation as shown


import java.util.PriorityQueue;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomObjectPriorityQueue {
    public static void main(String[] args) {
        // Comparator to compare Person objects by age
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        };

        // PriorityQueue with custom comparator (min-heap based on age)
        PriorityQueue<Person> personQueue = new PriorityQueue<>(ageComparator);

        personQueue.add(new Person("Alice", 30));
        personQueue.add(new Person("Bob", 25));
        personQueue.add(new Person("Charlie", 35));

        System.out.println("Polling elements from Person Queue:");
        while (!personQueue.isEmpty()) {
            System.out.println(personQueue.poll());
        }
    }
}

//-----------------------------------------------

	// Using lambda expression 

import java.util.PriorityQueue;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomObjectPriorityQueue {
    public static void main(String[] args) {
        // Comparator to compare Person objects by age
        Comparator<Person> ageComparator = ( p1,  p2) -> Integer.compare(p1.age, p2.age);
            
    

        // PriorityQueue with custom comparator (min-heap based on age)
        PriorityQueue<Person> personQueue = new PriorityQueue<>(ageComparator);

        personQueue.add(new Person("Alice", 30));
        personQueue.add(new Person("Bob", 25));
        personQueue.add(new Person("Charlie", 35));

        System.out.println("Polling elements from Person Queue:");
        while (!personQueue.isEmpty()) {
            System.out.println(personQueue.poll());
        }
    }
}

//-----------------------------------------------------------------------------------------------------------

	// using java.util.ArrayDeque<E>

	Resizable-array implementation of the Deque interface. Array deques have no capacity restrictions; 
	they grow as necessary to support usage. They are not thread-safe. Null elements are prohibited. 
	
	This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when 
	used as a queue.
	
	Here is a list of constructors and methods of java.util.ArrayDeque along with a brief description for each:

	Constructors
	- ArrayDeque(): Creates an empty deque with an initial capacity sufficient to hold 16 elements.
	- ArrayDeque(int numElements): Creates an empty deque with an initial capacity sufficient to hold the specified number 
		of elements.
	- ArrayDeque(Collection<? extends E> c): Creates a deque containing the elements of the specified collection, in the 
		order they are returned by the collection's iterator.

	Methods
	- void add(E e): Inserts the specified element at the end of this deque.
	- void addFirst(E e): Inserts the specified element at the front of this deque.
	- void addLast(E e): Inserts the specified element at the end of this deque.
	- void clear(): Removes all of the elements from this deque.
	- ArrayDeque<E> clone(): Returns a shallow copy of this deque.
	- boolean contains(Object o): Returns true if this deque contains the specified element.
	- Iterator<E> descendingIterator(): Returns an iterator over the elements in this deque in reverse sequential order.
	- E element(): Retrieves, but does not remove, the head of this deque.
	- E getFirst(): Retrieves, but does not remove, the first element of this deque.
	- E getLast(): Retrieves, but does not remove, the last element of this deque.
	- boolean isEmpty(): Returns true if this deque contains no elements.
	- Iterator<E> iterator(): Returns an iterator over the elements in this deque in proper sequence.
	- boolean offer(E e): Inserts the specified element at the end of this deque (equivalent to add).
	- boolean offerFirst(E e): Inserts the specified element at the front of this deque.
	- boolean offerLast(E e): Inserts the specified element at the end of this deque.
	- E peek(): Retrieves, but does not remove, the head of this deque, or returns null if this deque is empty.
	- E peekFirst(): Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
	- E peekLast(): Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
	- E poll(): Retrieves and removes the head of this deque, or returns null if this deque is empty.
	- E pollFirst(): Retrieves and removes the first element of this deque, or returns null if this deque is empty.
	- E pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.
	- E pop(): Pops an element from the stack represented by this deque (equivalent to removeFirst).
	- void push(E e): Pushes an element onto the stack represented by this deque (equivalent to addFirst).
	- void remove(): Retrieves and removes the head of this deque.
	- boolean remove(Object o): Removes the first occurrence of the specified element from this deque.
	- E removeFirst(): Retrieves and removes the first element of this deque.
	- boolean removeFirstOccurrence(Object o): Removes the first occurrence of the specified element from this deque.
	- E removeLast(): Retrieves and removes the last element of this deque.
	- boolean removeLastOccurrence(Object o): Removes the last occurrence of the specified element from this deque.
	- int size(): Returns the number of elements in this deque.
	- Spliterator<E> spliterator(): Creates a late-binding and fail-fast Spliterator over the elements in this deque.

package collectionexamples;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Initialize an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements at the end
        deque.add("One");
        deque.add("Two");
        deque.add("Three");
        System.out.println("After add: " + deque);

        // Add elements at the beginning
        deque.addFirst("Zero");
        System.out.println("After addFirst: " + deque);

        // Add elements at the end
        deque.addLast("Four");
        System.out.println("After addLast: " + deque);

        // Offer elements (equivalent to add but returns false if it fails)
        deque.offer("Five");
        System.out.println("After offer: " + deque);

        deque.offerFirst("Minus One");
        System.out.println("After offerFirst: " + deque);

        deque.offerLast("Six");
        System.out.println("After offerLast: " + deque);

        // Access elements without removal
        System.out.println("peek: " + deque.peek());
        System.out.println("peekFirst: " + deque.peekFirst());
        System.out.println("peekLast: " + deque.peekLast());

        // Remove elements
        System.out.println("poll: " + deque.poll());
        System.out.println("After poll: " + deque);

        System.out.println("pollFirst: " + deque.pollFirst());
        System.out.println("After pollFirst: " + deque);

        System.out.println("pollLast: " + deque.pollLast());
        System.out.println("After pollLast: " + deque);

        // Remove specific elements
        deque.remove("Two");
        System.out.println("After remove 'Two': " + deque);

        // Stack operations
        deque.push("First");
        System.out.println("After push: " + deque);

        System.out.println("pop: " + deque.pop());
        System.out.println("After pop: " + deque);

        // Remaining methods
        deque.add("Seven");
        deque.add("Eight");
        deque.add("Nine");
        System.out.println("After adding more elements: " + deque);

        System.out.println("removeFirst: " + deque.removeFirst());
        System.out.println("After removeFirst: " + deque);

        System.out.println("removeLast: " + deque.removeLast());
        System.out.println("After removeLast: " + deque);

        System.out.println("getFirst: " + deque.getFirst());
        System.out.println("getLast: " + deque.getLast());

        // Clear the deque
        deque.clear();
        System.out.println("After clear: " + deque);

        // Handling exceptions
        try {
            deque.removeFirst();
        } catch (Exception e) {
            System.out.println("Exception on removeFirst: " + e);
        }

        try {
            deque.removeLast();
        } catch (Exception e) {
            System.out.println("Exception on removeLast: " + e);
        }

        try {
            deque.getFirst();
        } catch (Exception e) {
            System.out.println("Exception on getFirst: " + e);
        }

        try {
            deque.getLast();
        } catch (Exception e) {
            System.out.println("Exception on getLast: " + e);
        }
    }
}

//-----------------------------------------------------------------------------------------------------------------

	// Write a program to implement the stack using ArrayDeque

package collectionexamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackUsingArrayDequeWithSwitch {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Check if empty");
            System.out.println("5: Get size");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push: ");
                    int numberToPush = scanner.nextInt();
                    stack.push(numberToPush);
                    System.out.println("Pushed " + numberToPush + " onto the stack.");
                    System.out.println("Current stack: " + stack);
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        int poppedNumber = stack.pop();
                        System.out.println("Popped " + poppedNumber + " from the stack.");
                        System.out.println("Current stack: " + stack);
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot peek.");
                    } else {
                        int topNumber = stack.peek();
                        System.out.println("Top element is " + topNumber);
                    }
                    break;

                case 4:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;

                case 5:
                    System.out.println("Size of the stack: " + stack.size());
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

//----------------------------------------------------------------------------------------------------------

	// Write a program to implement the Queue using ArrayDeque

package collectionexamples;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class QueueUsingArrayDequeWithSwitch {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Peek");
            System.out.println("4: Check if empty");
            System.out.println("5: Get size");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to enqueue: ");
                    int numberToEnqueue = scanner.nextInt();
                    queue.offer(numberToEnqueue);
                    System.out.println("Enqueued " + numberToEnqueue + " to the queue.");
                    System.out.println("Current queue: " + queue);
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty. Cannot dequeue.");
                    } else {
                        int dequeuedNumber = queue.poll();
                        System.out.println("Dequeued " + dequeuedNumber + " from the queue.");
                        System.out.println("Current queue: " + queue);
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty. Cannot peek.");
                    } else {
                        int frontNumber = queue.peek();
                        System.out.println("Front element is " + frontNumber);
                    }
                    break;

                case 4:
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;

                case 5:
                    System.out.println("Size of the queue: " + queue.size());
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

//----------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------
	
	Using java.uti.Set interface :
	----------------------------------

	The Set interface is part of the java.util package and extends the Collection interface. It represents a collection of 
	objects where each object is unique. In other words, a Set cannot contain duplicate values. 

	- A Set ensures that each element occurs only once. If you try to add a duplicate element, it won’t be added.
	- Unlike a List, a Set does not maintain any specific order for its elements. The order in which elements are stored 
	   is not guaranteed.
	- The Set interface follows the mathematical concept of a set. It provides methods to manipulate sets, such as union, 
	   intersection, and difference.
	
       some methods provided by the Set interface:

	 - add(element): Adds a specific element to the set. Returns true if the element was added successfully (i.e., it was not 
		already present), otherwise returns false.
	 - addAll(collection): Appends all elements from the specified collection to the existing set.
	 - clear(): Removes all elements from the set (the set itself remains intact).
	 - contains(element): Checks whether a specific element is present in the set.
	 - containsAll(collection): Checks if the set contains all elements from the given collection.
	 - hashCode(): Returns the hash code value for the set.
	 - isEmpty(): Checks if the set is empty.
	 - iterator(): Returns an iterator to traverse the set (order is random).
	 - remove(element): Removes the specified element from the set.


///----------------------------------------------------

	java.util.SortedSet interface 
	----------------------------------

	The SortedSet interface, which is part of the java.util package, extends the Set interface. It provides additional features 
	related to sorting and ordering of elements. Here are the key points about the SortedSet:

	-  Unlike a regular Set, a SortedSet maintains its elements in a sorted order. The order can be natural (based on the 
	   elements’ natural ordering) or defined by a custom comparator.
	- Like other sets, a SortedSet does not allow duplicate elements.
	- The SortedSet interface also provides navigation methods, allowing you to find elements greater than or less than 
	  a given value.
	- methods:

	 - Comparator<? super E> comparator(): Returns the comparator used to order the elements in this set, or null if this set 
		uses the natural ordering of its elements.
	 - E first(): Returns the first (lowest) element currently in this set.
	 - SortedSet<E> headSet(E to Element): Returns a view of the portion of this set whose elements are strictly less than 
		the specified element.
	 - E last(): Returns the last (highest) element currently in this set.
	 - SortedSet<E> subSet(E fromElement, E toElement): Returns a view of the portion of this set whose elements range 
		from fromElement, inclusive, to toElement, exclusive.
	 - SortedSet<E> tailSet(E fromElement): Returns a view of the portion of this set whose elements are greater than or 
		equal to fromElement.


//-----------------------------------------------------

	Using java.util.HashSet class
	------------------------------

	The HashSet class in Java is a member of the Java Collections Framework and it extends the AbstractSet class and implements 
	the Set interface. 

	- The elements in a HashSet are not ordered or sorted. There is no guarantee that the order will remain constant over time. 
	- HashSet does not allow duplicate values. It means you can only store a particular value once. If you try to add the same 
	  value again, it will replace the old value. 
	- HashSet is non-synchronized. This means that it is not thread-safe and multiple threads can access it simultaneously. 
	- HashSet is implemented in terms of a hash table. It uses a mechanism called hashing to store the elements. HashSet 
	  internally uses HashMap to store the elements.
	- HashSet are not index based data structure, thet stores the elements according to their Hashcode value. 
	- Hashset can not store mutiple null value
	- HashSet can store hetrogeneous elements.
	- The initial default capacity of HashSet is 16, and the default load factor is 0.75.
	-  It offers constant-time performance for the basic operations (add, remove, contains, and size). 

	* What is hash table, hashing and Hashmap and hash function?
	* What is laod factor.
	* what is rehash.

	HashSet Constructors:

	- HashSet(): Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load 
		factor (0.75).
	- HashSet(Collection<? extends E> c): Constructs a new set containing the elements in the specified collection.
	- HashSet(int initialCapacity): Constructs a new, empty set; the backing HashMap instance has the specified initial 
		capacity and default load factor (0.75).
	- HashSet(int initialCapacity, float loadFactor): Constructs a new, empty set; the backing HashMap instance has the 
		specified initial capacity and the specified load factor.

	HashSet Methods: 

	- boolean add(E e): Adds the specified element to this set if it is not already present.
	- void clear(): Removes all of the elements from this set.
	- Object clone(): Returns a shallow copy of this HashSet instance: the elements themselves are not cloned.
	- boolean contains(Object o): Returns true if this set contains the specified element.
	- boolean isEmpty(): Returns true if this set contains no elements.
	- Iterator<E> iterator(): Returns an iterator over the elements in this set.
	- boolean remove(Object o): Removes the specified element from this set if it is present.
	- int size(): Returns the number of elements in this set (its cardinality).
	- Spliterator<E> spliterator(): Creates a late-binding and fail-fast Spliterator over the elements in this set.


	// using all constructors

package collectionexamples;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collection;
public class HashSetExample {
    public static void main(String[] args) {
        // Using the no-argument constructor
        HashSet<String> set1 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.add("three");
        set1.add("one");
        System.out.println("Set1: " + set1);

        // Using the constructor that accepts a Collection
        Collection<String> collection = Arrays.asList("four", "five", "six");
	/*
		or you can create a list
		Collection<String> collection=new ArrayList<>();
		collection.add("four");
		collection.add("five",);
		collection.add("six");
		
	*/
        HashSet<String> set2 = new HashSet<>(collection);
        System.out.println("Set2: " + set2);

        // Using the constructor that accepts an initial capacity
        HashSet<String> set3 = new HashSet<>(10);
        set3.add("seven");
        set3.add("eight");
        System.out.println("Set3: " + set3);

        // Using the constructor that accepts an initial capacity and load factor
        HashSet<String> set4 = new HashSet<>(10, 0.5f);
        set4.add("nine");
        set4.add("ten");
        System.out.println("Set4: " + set4);
    }
}


//----------------------------------------------------------------------------------------------------------

	// Add Elements to HashSet

package collectionexamples;
import java.util.HashSet;

public class AddElementsInHashSet {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding new elements to the HashSet
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");
        set.add("Python");
        set.add("JavaScript");
        set.add("Python");

        // Displaying the HashSet elements
        for(String language : set){
            System.out.println(language);
        }
    }
}

//-------------------------------------------------------------------------------------

	// Create HashSet from Another Collection

package collectionexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetFromCollections {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);

		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(6);
		list2.add(9);
		list2.add(12);
		list2.add(15);

		// Creating a HashSet from another collection (ArrayList)
		Set<Integer> set = new HashSet<>(list);

		// Adding all the elements from an existing collection to a HashSet
		set.addAll(list2);

		System.out.println(set);
		// Accessing elements using an iterator
        	Iterator<Integer> iterator = set.iterator();
        	while(iterator.hasNext()){
            		Integer language = iterator.next();
            		System.out.println(language);
       	 	}
    	}
}

//-----------------------------------------------------------------------------------------

	// Remove elements

	We can remove elements from HashSet using these methods:
	- remove(Object o): This method is used to remove a single specified element from the set.
	- removeAll(Collection c): This method is used to remove all elements from the set that are contained in the 
	  specified collection.
	- removeIf(Predicate<? super E> filter): This method is used to remove all elements from the set that satisfy 
	  the given predicate.

package collectionexamples;
import java.util.HashSet;
import java.util.Arrays;

public class RemoveFromHashSet {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));

        System.out.println("Original HashSet: " + set);

        // Using remove(Object o)
        set.remove("Cherry");
        System.out.println("\nAfter remove('Cherry'): " + set);

        // Using removeAll(Collection c)
        set.removeAll(Arrays.asList("Apple", "Banana"));
        System.out.println("\nAfter removeAll(Arrays.asList('Apple', 'Banana')): " + set);

        // Using removeIf(Predicate<? super E> filter)
        set.removeIf(fruit -> fruit.startsWith("E"));
        System.out.println("\nAfter removeIf(fruit -> fruit.startsWith('E')): " + set);
    }
}


//-----------------------------------------------------------------------------------------

	// Using different iterators

package collectionexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class HashSetIterationExample {
    public static void main(String[] args) {
        // Create a HashSet of Integers
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // Using iterator()
        System.out.println("Using iterator():");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using spliterator()
        System.out.println("\nUsing spliterator():");
        Spliterator<Integer> spliterator = set.spliterator();
        spliterator.forEachRemaining((Integer i) -> System.out.println(i));

        // Using forEach()
        System.out.println("\nUsing forEach():");
        set.forEach((Integer i) -> System.out.println(i));
    }
}

//-----------------------------------------------------------------------------------------

	Using java.util.LinkedHashSet 
	------------------------------
	LinkedHashSet is a class that is part of the Java Collections Framework and is available in the java.util package. 
	It combines the characteristics of both a HashSet and a LinkedList. 

	LinkedHashSet is an extended version of HashSet. HashSet doesn’t follow any order where as LinkedHashSet maintains insertion 
	order. HashSet uses HashMap object internally to store it’s elements where as LinkedHashSet uses LinkedHashMap object
	internally to store and process it’s elements. It uses a hash table (like HashSet) to store the elements, and a linked list 
	to maintain the order of insertion.

	Constructors:
	- LinkedHashSet(): Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load 
	  factor (0.75).
	- LinkedHashSet(int initialCapacity): Constructs a new, empty set; the backing HashMap instance has the specified initial 
	  capacity and default load factor (0.75).
	- LinkedHashSet(int initialCapacity, float loadFactor): Constructs a new, empty set; the backing HashMap instance has the 
	  specified initial capacity and load factor.
	- LinkedHashSet(Collection<? extends E> c): Constructs a new set with the same elements as the specified collection. The 
	  backing HashMap is created with default load factor (0.75) and an initial capacity sufficient to contain the elements in 
	  the specified collection.

	Methods in LinkedHashSet

	- boolean add(E e): Adds the specified element to this set if it is not already present.

	- boolean remove(Object o): Removes the specified element from this set if it is present.
	- void clear(): Removes all of the elements from this set.

	- boolean contains(Object o): Returns true if this set contains the specified element.
	- Iterator<E> iterator(): Returns an iterator over the elements in this set in insertion order.
	- Spliterator<E> spliterator(): Creates a late-binding and fail-fast Spliterator over the elements in this set.

	- int size(): Returns the number of elements in this set.
	- boolean isEmpty(): Returns true if this set contains no elements.

	- Object clone(): Returns a shallow copy of this LinkedHashSet instance.
	- Object[] toArray(): Returns an array containing all of the elements in this set in proper sequence (insertion order).
	- <T> T[] toArray(T[] a): Returns an array containing all of the elements in this set in proper sequence (insertion order);
	  the runtime type of the returned array is that of the specified array.
	- boolean containsAll(Collection<?> c): Returns true if this set contains all of the elements in the specified collection.
	- boolean addAll(Collection<? extends E> c): Adds all of the elements in the specified collection to this set if they're 
	  not already present.
	- boolean retainAll(Collection<?> c): Retains only the elements in this set that are contained in the specified collection.
	- boolean removeAll(Collection<?> c): Removes from this set all of its elements that are contained in the 
	  specified collection.


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");

        // Attempting to add duplicate elements
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");

        // Displaying the LinkedHashSet
        System.out.println(linkedHashSet);

        // Removing an element
        linkedHashSet.remove("Two");

        // Displaying after removal
        System.out.println(linkedHashSet);

        // Iterating over the LinkedHashSet
        for (String element : linkedHashSet) {
            System.out.println(element);
        }
    }
}

//-----------------------------------------------------------------------------------------

 Using java.util.TreeSet:
 -------------------------- 

	The TreeSet class in Java is a part of the Java Collections Framework and implements the NavigableSet interface. 
	It represents a set that is sorted according to the natural ordering of its elements or by a custom Comparator provided 
	at the time of construction. TreeSet, which uses a self-balancing binary search tree to maintain the sorted order.
	It is not an indexbased data struction, and not follow insertation order but follows sorting order. It is collection of 
	homogeneous data elements. no duplication allowed. non-synchronized, no null allowed

     - Constructors
	- TreeSet(): Constructs a new, empty tree set, sorted according to the natural ordering of its elements.
	- TreeSet(Collection<? extends E> c): Constructs a new tree set containing the elements in the specified collection, sorted 
	   according to the natural ordering of its elements.
	- TreeSet(Comparator<? super E> comparator): Constructsa new, empty tree set, sorted according to the specified comparator.
	- TreeSet(SortedSet<E> s): Constructs a new tree set containing the same elements and using the same ordering as the 
	  specified sorted set.

package collectionexamples;
import java.util.*;

public class TreeSetConstructorsExample {
    public static void main(String[] args) {
        // Using the default constructor
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(3);
        treeSet1.add(1);
        treeSet1.add(2);
        System.out.println("TreeSet created with default constructor: " + treeSet1);

        // Using the constructor with a collection parameter
        List<Integer> list = Arrays.asList(7, 5, 6);
        TreeSet<Integer> treeSet2 = new TreeSet<>(list);
        System.out.println("TreeSet created with collection constructor: " + treeSet2);

        // Using the constructor with a comparator parameter
        TreeSet<String> treeSet3 = new TreeSet<>(Comparator.reverseOrder());
        treeSet3.add("banana");
        treeSet3.add("apple");
        treeSet3.add("cherry");
        System.out.println("TreeSet created with comparator constructor: " + treeSet3);

    }
}

//---------------------------------

	// Element insert

add() - inserts the specified element to the set
addAll() - inserts all the elements of the specified collection to the set

package collectionexamples;
import java.util.TreeSet;

class TreeSetAddExample {
    public static void main(String[] args) {

        TreeSet<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);

        // Using the addAll() method
        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);
    }
}

//-----------------------------------------------------------------------------------------

	// using iterator

package collectionexamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetElementAccessExample {
	 public static void main(String[] args) {
	        TreeSet<Integer> numbers = new TreeSet<>();
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(6);
	        System.out.println("TreeSet: " + numbers);

	        // Calling iterator() method
	        Iterator<Integer> iterate = numbers.iterator();
	        System.out.print("TreeSet using Iterator: ");
	        // Accessing elements
	        while(iterate.hasNext()) {
	            System.out.print(iterate.next());
	            System.out.print(", ");
	        }
	    }
}


//-----------------------------------------------------------------------------------------

	// Remove Elements
remove() - removes the specified element from the set
removeAll() - removes all the elements from the set

package collectionexamples;

import java.util.TreeSet;

public class TreeSetRemoveElements {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);

	}

}

//-----------------------------------------------------------------------------------------

	// first() and last() Methods
first() - returns the first element of the set
last() - returns the last element of the set


package collectionexamples;

import java.util.TreeSet;

public class TreeSetFirstLast {
	 public static void main(String[] args) {
	        TreeSet<Integer> numbers = new TreeSet<>();
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(6);
	        System.out.println("TreeSet: " + numbers);

	        // Using the first() method
	        int first = numbers.first();
	        System.out.println("First Number: " + first);

	        // Using the last() method
	        int last = numbers.last();
	        System.out.println("Last Number: " + last);
	 }
}



//-----------------------------------------------------------------------------------------
	// ceiling(), floor(), higher() and lower() Methods
higher(element) - Returns the lowest element among those elements that are greater than the specified element.
lower(element) - Returns the greatest element among those elements that are less than the specified element.
ceiling(element) - Returns the lowest element among those elements that are greater than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
floor(element) - Returns the greatest element among those elements that are less than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.

package collectionexamples;
import java.util.TreeSet;
public class TreeSetCeil {
	 public static void main(String[] args) {
	        TreeSet<Integer> numbers = new TreeSet<>();
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(4);
	        numbers.add(6);
	        System.out.println("TreeSet: " + numbers);

	        // Using higher()
	        System.out.println("Using higher: " + numbers.higher(4));

	        // Using lower()
	        System.out.println("Using lower: " + numbers.lower(4));

	        // Using ceiling()
	        System.out.println("Using ceiling: " + numbers.ceiling(4));

	        // Using floor()
	        System.out.println("Using floor: " + numbers.floor(3));

	    }
}

//-----------------------------------------------------------------------------------------
	//  pollfirst() and pollLast() Methods

pollFirst() - returns and removes the first element from the set
pollLast() - returns and removes the last element from the set

import java.util.TreeSet;

class TreeSetPoll{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);
    }
}

//-----------------------------------------------------------------------------------------

	- The headSet() method returns all the elements of a tree set before the specified element (which is passed as an argument).
	- The tailSet() method returns all the elements of a tree set after the specified element (which is passed as a parameter) 
	  including the specified element.
	- The subSet() method returns all the elements between e1 and e2 including e1.

import java.util.TreeSet;

public class TreeSetMethodsDemo {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(60);
        treeSet.add(70);

        // Displaying the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Demonstrating headSet() method
        TreeSet<Integer> headSet = (TreeSet<Integer>) treeSet.headSet(40);
        System.out.println("headSet(40): " + headSet);

        // Demonstrating tailSet() method
        TreeSet<Integer> tailSet = (TreeSet<Integer>) treeSet.tailSet(40);
        System.out.println("tailSet(40): " + tailSet);

        // Demonstrating subSet() method
        TreeSet<Integer> subSet = (TreeSet<Integer>) treeSet.subSet(20, 50);
        System.out.println("subSet(20, 50): " + subSet);
    }
}

//-----------------------------------------------------------------------------------------

	// Java program demonstrating the subset, difference, intersection, and union operations on TreeSet in Java.

import java.util.*;

public class TreeSetOperationsDemo {
    public static void main(String[] args) {
        // Creating TreeSets
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        // Adding elements to the first set
        set1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        // Adding elements to the second set
        set2.addAll(Arrays.asList(4, 5, 6, 7, 8));

        // Displaying the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union operation
        TreeSet<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2: " + union);

        // Subset operation
        TreeSet<Integer> subset = new TreeSet<>(set1);
        subset.retainAll(set2);
        System.out.println("Subset of set1 and set2: " + subset);

        // Difference operation (set1 - set2)
        TreeSet<Integer> difference1 = new TreeSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Difference of set1 and set2: " + difference1);

        // Difference operation (set2 - set1)
        TreeSet<Integer> difference2 = new TreeSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference of set2 and set1: " + difference2);

        // Intersection operation
        TreeSet<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersection);
    }
}

//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------

 Map interface in java
 ========================

	The Map interface in the java.util package is a part of Java's Collections Framework. It represents a collection that maps
 	keys to values, where each key is unique. This interface provides methods to perform basic operations like insertion,
	deletion, and retrieval of elements based on keys. 


	- Each element in a Map is a pair consisting of a key and a value. A key is used to uniquely identify the value in the Map.

	- A Map cannot contain duplicate keys. Each key can map to at most one value.

	- Depending on the implementation, a Map can contain null keys and values. For instance, HashMap allows one null key 
	  and multiple null values, whereas TreeMap does not allow null keys (because it sorts the keys and null cannot be compared).


	Map Implementations: 
	
	- HashMap: Uses a hash table to store the map. It allows null keys and values and does not maintain any order 
	  of the elements.

	- LinkedHashMap: Extends HashMap to maintain a doubly-linked list of the entries, preserving the insertion order.

	- TreeMap: Implements a map using a red-black tree, ensuring that the keys are sorted according to their natural order 
	  or by a comparator provided at map creation time.
	
	- Hashtable: Similar to HashMap but synchronized and does not allow null keys or values.


	Methods in Map Interface

	- put(K key, V value): Associates the specified value with the specified key in the map.
	- get(Object key): Returns the value to which the specified key is mapped, or null if the map contains 
	  no mapping for the key.
	- remove(Object key): Removes the mapping for a key from this map if it is present.
	- clear(): Removes all of the mappings from this map.
	- size(): Returns the number of key-value mappings in this map.
	- isEmpty(): Returns true if this map contains no key-value mappings.

	- putAll(Map<? extends K, ? extends V> m): Copies all of the mappings from the specified map to this map.
	- containsKey(Object key): Returns true if this map contains a mapping for the specified key.
	- containsValue(Object value): Returns true if this map maps one or more keys to the specified value.

	- keySet(): Returns a Set view of the keys contained in this map.
	- values(): Returns a Collection view of the values contained in this map.
	- entrySet(): Returns a Set view of the mappings contained in this map. Each element in the returned set 
	  is a Map.Entry<K, V>.


	//---------------------------------------------------------------------------------------------------------------------

	Using java.util.HashMap class
	=============================

		The HashMap class in Java is part of the Java Collections Framework and implements the Map interface. 
	It provides the basic implementation of the Map interface of Java and is used to store data in the form of key-value 
	pairs, which are known as entries. HashMap uses a technique called Hashing, which allows us to access elements directly by 
	calculating a unique key from their content. This unique key is the index at which the specific value is stored, making 
	retrieval efficient.

	- HashMap belongs to the java.util package and implements the Map interface.
	- It stores data in key-value pairs.
	- Unlike arrays where you access data using numerical indexes, you access data in HashMap using unique keys.
	- Keys can be any object (including String, Integer, or custom classes) as long as they implement the equals() and 
	  hashCode() methods properly. These methods are crucial for determining if two keys are equivalent and for efficient 
	  storage within the HashMap.
	- Uses the Hash table as a underlaying data structure.
	- HashMap allows for one null key but any number of null values.
	- Does not guarantee the order of iteration.
	- Constant time complexity (O(1)) for basic operations (add, remove, contains) assuming a good hash function.
	- Not thread-safe by default. Use Collections.synchronizedMap for synchronized version.

	Constructors: 
	
	- HashMap(): Creates an empty HashMap with the default initial capacity (16) and load factor (0.75).
	- HashMap(int initialCapacity): Creates an empty HashMap with the specified initial capacity and the 
	  default load factor (0.75).
	- HashMap(int initialCapacity, float loadFactor): Creates an empty HashMap with the specified initial capacity 
	  and load factor.
	- HashMap(Map<? extends K, ? extends V> m): Creates a HashMap with the same mappings as the specified Map. 
	  The HashMap is created with an initial capacity sufficient to hold the mappings in the specified map.

	Methods
	- put(K key, V value): Adds a key-value pair to the map.
	- get(Object key): Returns the value associated with the specified key.
	- remove(Object key): Removes the key-value pair for the specified key.
	- containsKey(Object key): Checks if the map contains the specified key.
	- containsValue(Object value): Checks if the map contains the specified value.
	- size(): Returns the number of key-value pairs in the map.
	- isEmpty(): Checks if the map is empty.
	- clear(): Removes all key-value pairs from the map.


package mapexamples;
import java.util.HashMap;
import java.util.Map;

public class HashMapConstructorsExample {
    public static void main(String[] args) {
        // Using the default constructor
        HashMap<String, Integer> defaultMap = new HashMap<>();
        defaultMap.put("Key1", 1);
        System.out.println("Default constructor: " + defaultMap);

        // Using the constructor with initial capacity
        HashMap<String, Integer> capacityMap = new HashMap<>(10);
        capacityMap.put("Key2", 2);
        System.out.println("Constructor with initial capacity: " + capacityMap);

        // Using the constructor with initial capacity and load factor
        HashMap<String, Integer> capacityLoadFactorMap = new HashMap<>(10, 0.7f);
        capacityLoadFactorMap.put("Key3", 3);
        System.out.println("Constructor with initial capacity and load factor: " + capacityLoadFactorMap);

        // Using the copy constructor
        Map<String, Integer> existingMap = new HashMap<>();
        existingMap.put("KeyA", 100);
        existingMap.put("KeyB", 200);

        HashMap<String, Integer> copyMap = new HashMap<>(existingMap);
        System.out.println("Copy constructor: " + copyMap);
    }
}

//--------------------------------------------------------------------------------------

package mapexamples;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 15);
        map.put("Orange", 20);

        // Accessing elements
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Removing an element
        map.remove("Banana");



        // Iterating over elements
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        System.out.println("Does key 'Orange' exist? " + map.containsKey("Orange"));

        // Checking if a value exists
        System.out.println("Does value 20 exist? " + map.containsValue(20));

        // Getting the size of the HashMap
        System.out.println("Size of the map: " + map.size());

        // Clearing the HashMap
        map.clear();
        System.out.println("Is the map empty? " + map.isEmpty());
    }
}

//---------------------------------------------------------------------------------------

package mapexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class HashMapIterating {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("Apple", "Red");
        map.put("Orange", "Orange");
        map.put("Banana", "Yellow");

        // Using `entrySet` and a `for-each` loop:
        System.out.println("Using `entrySet` and a `for-each` loop:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println();

        // Using `keySet` and a `for-each` loop:
        System.out.println("Using `keySet` and a `for-each` loop:");
        for (String key : map.keySet()) {
            System.out.println("Key = " + key + ", Value = " + map.get(key));
        }
        System.out.println();

        // Using `values` and a `for-each` loop:
        System.out.println("Using `values` and a `for-each` loop:");
        for (String value : map.values()) {
            System.out.println("Value = " + value);
        }
        System.out.println();

        // Using an `Iterator`:
        System.out.println("Using an `Iterator`:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println();

        // Using Java 8's `forEach` method:
        System.out.println("Using Java 8's `forEach` method:");
        map.forEach((key, value) -> System.out.println("Key = " + key + ", Value = " + value));
    }
}

//---------------------------------------------------------------------------------------------------------------------

  Using java.util.LinkedHashMap class
  ====================================

	LinkedHashMap is a subclass of HashMap in Java, and it maintains a doubly-linked list running through all of its entries. 
	This linked list defines the iteration ordering, which can be either the order in which keys were inserted 
	(insertion-order) or the order in which keys were accessed (access-order).

	- A LinkedHashMap contains values based on the key.
	- It contains only unique elements.
	- It may have one null key and multiple null values.
	- It is the same as HashMap instead maintains insertion order.
	- Unlike HashMap, the iteration order of the elements in a LinkedHashMap is predictable.
	- Just like HashMap, LinkedHashMap is not thread-safe. You must explicitly synchronize concurrent access to a 
	  LinkedHashMap in a multi-threaded environment.

	Constructors: 

	- LinkedHashMap():Creates an empty LinkedHashMap with the default initial capacity (16) and load factor (0.75).
	- LinkedHashMap(int initialCapacity): Creates an empty LinkedHashMap with the specified initial capacity and default 
	  load factor (0.75).
	- LinkedHashMap(int initialCapacity, float loadFactor): Creates an empty LinkedHashMap with the specified initial 
	  capacity and load factor.
	- LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder): Creates an empty LinkedHashMap with the 
	  specified initial capacity, load factor, and ordering mode (access-order if true).
	- LinkedHashMap(Map<? extends K, ? extends V> m): Creates a LinkedHashMap with the same mappings as the specified Map. 
	  The LinkedHashMap is created with an initial capacity sufficient to hold the mappings in the specified map.


	Methods
	- put(K key, V value): Associates the specified value with the specified key in this map.
	- get(Object key): Returns the value to which the specified key is mapped, or null if this map contains 
	  no mapping for the key.
	- remove(Object key): Removes the mapping for the specified key from this map if present.
	- containsKey(Object key): Returns true if this map contains a mapping for the specified key.
	- containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
	- size(): Returns the number of key-value mappings in this map.
	- isEmpty(): Returns true if this map contains no key-value mappings.
	- clear(): Removes all of the mappings from this map.
	- putAll(Map<? extends K, ? extends V> m): Copies all of the mappings from the specified map to this map.

	- keySet(): Returns a Set view of the keys contained in this map.
	- values(): Returns a Collection view of the values contained in this map.
	- entrySet(): Returns a Set view of the mappings contained in this map.

	- forEach(BiConsumer<? super K, ? super V> action): Performs the given action for each entry in this map until all 
	  entries have been processed or the action throws an exception.
	- replaceAll(BiFunction<? super K, ? super V, ? extends V> function): Replaces each entry’s value with the result of 
	  applying the given function to that entry.

	- putIfAbsent(K key, V value): If the specified key is not already associated with a value (or is mapped to null), 
	  associates it with the given value and returns null, else returns the current value.
	- remove(Object key, Object value): Removes the entry for the specified key only if it is currently mapped to the 
	  specified value.
	- replace(K key, V oldValue, V newValue): Replaces the entry for the specified key only if currently mapped to the 
	  specified value.
	- replace(K key, V value): Replaces the entry for the specified key only if it is currently mapped to some value.
	- computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction): If the specified key is not already associated
	  with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into 
	  this map unless null.
	- computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction): If the value for the specified 
	  key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.
	- compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction): Attempts to compute a mapping for the 
	  specified key and its current mapped value (or null if there is no current mapping).
	- merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction): If the specified key is not 
	  already associated with a value or is associated with null, associates it with the given non-null value. Otherwise, 
	  replaces the value with the results of the given remapping function.

package mapexamples;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConstructorsDemo {

    public static void main(String[] args) {
        // 1. Default constructor
        LinkedHashMap<String, Integer> defaultMap = new LinkedHashMap<>();
        defaultMap.put("One", 1);
        defaultMap.put("Two", 2);
        System.out.println("Default constructor: " + defaultMap);

        // 2. Constructor with initial capacity
        LinkedHashMap<String, Integer> initialCapacityMap = new LinkedHashMap<>(10);
        initialCapacityMap.put("Three", 3);
        initialCapacityMap.put("Four", 4);
        System.out.println("Constructor with initial capacity: " + initialCapacityMap);

        // 3. Constructor with initial capacity and load factor
        LinkedHashMap<String, Integer> capacityAndLoadFactorMap = new LinkedHashMap<>(10, 0.75f);
        capacityAndLoadFactorMap.put("Five", 5);
        capacityAndLoadFactorMap.put("Six", 6);
        System.out.println("Constructor with initial capacity and load factor: " + capacityAndLoadFactorMap);

        // 4. Constructor with initial capacity, load factor, and access order
        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(10, 0.75f, true);
        accessOrderMap.put("Seven", 7);
        accessOrderMap.put("Eight", 8);
        // Accessing one of the elements to change order if accessOrder is true
        accessOrderMap.get("Seven");
        System.out.println("Constructor with initial capacity, load factor, and access order: " + accessOrderMap);

        // 5. Copy constructor
        Map<String, Integer> existingMap = new LinkedHashMap<>();
        existingMap.put("Nine", 9);
        existingMap.put("Ten", 10);
        LinkedHashMap<String, Integer> copyMap = new LinkedHashMap<>(existingMap);
        System.out.println("Copy constructor: " + copyMap);
    }
}

//----------------------------------------------------------------------------

package mapexamples;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // Initialize the LinkedHashMap
        LinkedHashMap<String, Integer> dayNumberMapping = new LinkedHashMap<>();

        // Adding new key-value pairs to the LinkedHashMap
        dayNumberMapping.put("Mon", 1);
        dayNumberMapping.put("Tus", 2);
        dayNumberMapping.put("Wen", 3);
        dayNumberMapping.put("Thu", 4);
        dayNumberMapping.put("Fri", 5);
        dayNumberMapping.put("Sat", 6);

        // Display the map
        System.out.println("Initial map: " + dayNumberMapping);

        // Access an element
        System.out.println("Value for key 'Thu': " + dayNumberMapping.get("Thu"));

        // Remove an element
        dayNumberMapping.remove("Wen");
        System.out.println("After removing key 'Wen': " + dayNumberMapping);

        // Check for key and value
        System.out.println("Contains key 'Fri'? " + dayNumberMapping.containsKey("Fri"));
        System.out.println("Contains value 5? " + dayNumberMapping.containsValue(5));

        // Iterate over the map using forEach
        dayNumberMapping.forEach((key, value) -> System.out.println(key + ": " + value));

        // Using entrySet to iterate over the map
        for (Map.Entry<String, Integer> entry : dayNumberMapping.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Use putIfAbsent
        dayNumberMapping.putIfAbsent("Sun", 7);
        System.out.println("After putIfAbsent 'Sun': " + dayNumberMapping);

        // Replace an entry
        dayNumberMapping.replace("Sun", 0);
        System.out.println("After replace 'Sun' with 0: " + dayNumberMapping);

        // Compute a value if absent
        dayNumberMapping.computeIfAbsent("Wen", k -> 3);
        System.out.println("After computeIfAbsent 'Wen': " + dayNumberMapping);

        // Clear the map
        dayNumberMapping.clear();
        System.out.println("After clear: " + dayNumberMapping.isEmpty());
    }
}

//---------------------------------------------------------------------------------------------------------------------

  Using java.util.HashTable class
  ====================================

	The Hashtable class is a part of the java.util package and is a legacy class that was part of the original version of Java. 
	It provides thread-safe operations on key-value pairs.In general, it’s recommended to use the Map interface or one of its 
	implementations (such as HashMap or ConcurrentHashMap) instead of the Hashtable class.

	Constructor 
	- Hashtable(): Constructs a new, empty hashtable with a default initial capacity (11) and load factor (0.75).
	- Hashtable(int initialCapacity): Constructs a new, empty hashtable with the specified initial capacity 
	  and default load factor (0.75).
	- Hashtable(int initialCapacity, float loadFactor): Constructs a new, empty hashtable with the specified initial capacity 
	  and the specified load factor.
	- Hashtable(Map<? extends K,? extends V> t): Constructs a new hashtable with the same mappings as the given Map.

	Methods

	- put(K key, V value): Maps the specified key to the specified value in this hashtable.
	- get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for 
	  the key.
	- remove(Object key): Removes the key (and its corresponding value) from this hashtable.
	- containsKey(Object key): Tests if the specified object is a key in this hashtable.
	- contains(Object value): Tests if some key maps into the specified value in this hashtable.
	- containsValue(Object value): Returns true if this hashtable maps one or more keys to this value.
	- size(): Returns the number of keys in this hashtable.
	- isEmpty(): Tests if this hashtable maps no keys to values.
	- clear(): Clears this hashtable so that it contains no keys.
	- putAll(Map<? extends K, ? extends V> t): Copies all of the mappings from the specified map to this hashtable.

	- keys(): Returns an enumeration of the keys in this hashtable.
	- elements(): Returns an enumeration of the values in this hashtable.
	- entrySet(): Returns a Set view of the mappings contained in this map.
	- keySet(): Returns a Set view of the keys contained in this map.
	- values(): Returns a Collection view of the values contained in this map.

	- putIfAbsent(K key, V value): If the specified key is not already associated with a value (or is mapped to null), 
	  associates it with the given value and returns null, else returns the current value.
	- remove(Object key, Object value): Removes the entry for the specified key only if it is currently mapped to the 
	  specified value.
	- replace(K key, V oldValue, V newValue): Replaces the entry for the specified key only if currently mapped to the 
	  specified value.
	- replace(K key, V value): Replaces the entry for the specified key only if it is currently mapped to some value.

	- compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction): Attempts to compute a mapping for 
	  the specified key and its current mapped value (or null if there is no current mapping).
	- computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction): If the specified key is not already associated 
	  with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into 
	  this map unless null.
	- computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction): If the value for the specified 
	  key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.
	- merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction): If the specified key is not 
	  already associated with a value or is associated with null, associates it with the given non-null value. Otherwise, 
	  replaces the value with the results of the given remapping function.

	- clone(): Creates a shallow copy of this hashtable.
	- toString(): Returns a string representation of this hashtable.
	- equals(Object o): Compares the specified object with this map for equality.
	- hashCode(): Returns the hash code value for this map.


import java.util.Hashtable;

public class HashtableConstructorsDemo {

    public static void main(String[] args) {
        // Default constructor
        Hashtable<String, Integer> defaultHashtable = new Hashtable<>();
        defaultHashtable.put("One", 1);
        defaultHashtable.put("Two", 2);
        System.out.println("Default constructor: " + defaultHashtable);

        // Constructor with initial capacity
        Hashtable<String, Integer> initialCapacityHashtable = new Hashtable<>(20);
        initialCapacityHashtable.put("Three", 3);
        initialCapacityHashtable.put("Four", 4);
        System.out.println("Constructor with initial capacity: " + initialCapacityHashtable);

        // Clone constructor
        Hashtable<String, Integer> cloneHashtable = new Hashtable<>(initialCapacityHashtable);
        System.out.println("Clone constructor: " + cloneHashtable);
    }
}

//----------------------------------------------------------------------------

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

    public static void main(String[] args) {
        // Initialize the Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding new key-value pairs to the Hashtable
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        // Display the map
        System.out.println("Initial hashtable: " + hashtable);

        // Access an element
        System.out.println("Value for key 'Two': " + hashtable.get("Two"));

        // Remove an element
        hashtable.remove("Two");
        System.out.println("After removing key 'Two': " + hashtable);

        // Check for key and value
        System.out.println("Contains key 'Three'? " + hashtable.containsKey("Three"));
        System.out.println("Contains value 3? " + hashtable.contains(3));

        // Iterate over the map using entrySet
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Use putIfAbsent
        hashtable.putIfAbsent("Four", 4);
        System.out.println("After putIfAbsent 'Four': " + hashtable);

        // Replace an entry
        hashtable.replace("Four", 40);
        System.out.println("After replace 'Four' with 40: " + hashtable);

        // Compute a value if absent
        hashtable.computeIfAbsent("Five", k -> 5);
        System.out.println("After computeIfAbsent 'Five': " + hashtable);

        // Clear the map
        hashtable.clear();
        System.out.println("After clear: " + hashtable.isEmpty());
    }
}

//--------------------------------------------------------------------------------------------------------------------------
 
  Using java.util.TreeMap class
  ====================================

	TreeMap is a part of the Java Collections Framework and is an implementation of the Map interface. It provides an efficient 
	means of storing key-value pairs in sorted order based on the keys' natural ordering or a custom Comparator provided at 
	TreeMap creation time. TreeMap is based on a Red-Black Tree data structure, which ensures that the keys are always sorted.
	
	- TreeMap maintains the elements in sorted order, either based on their natural ordering or a custom Comparator.
	- Unlike HashMap, TreeMap does not allow duplicate keys; attempting to insert a duplicate key will replace the existing 
	  value associated with the key.
	- TreeMap provides efficient implementations of operations such as finding the smallest and largest keys, finding 
	  key-value pairs in a given range, and more.

	Constructor
	- TreeMap(): Constructs a new, empty tree map, using the natural ordering of its keys.
	- TreeMap(Comparator<? super K> comparator): Constructs a new, empty tree map, ordered according to the given comparator.
	- TreeMap(Map<? extends K,? extends V> m): Constructs a new tree map containing the same mappings as the given map, ordered 
	  according to the natural ordering of its keys.
	- TreeMap(SortedMap<K,? extends V> m): Constructs a new tree map containing the same mappings and using the same ordering 
	  as the specified sorted map.

	 Methods:
	- put(K key, V value): Associates the specified value with the specified key in this map.
	- get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping 
	  for the key.
	- remove(Object key): Removes the mapping for the specified key from this map if present.
	- containsKey(Object key): Returns true if this map contains a mapping for the specified key.
	- containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
	- size(): Returns the number of key-value mappings in this map.
	- isEmpty(): Returns true if this map contains no key-value mappings.
	- clear(): Removes all of the mappings from this map.
	- keySet(): Returns a Set view of the keys contained in this map.
	- values(): Returns a Collection view of the values contained in this map.
	- entrySet(): Returns a Set view of the mappings contained in this map.
	- firstKey(): Returns the first (lowest) key currently in this map.
	- lastKey(): Returns the last (highest) key currently in this map.
	- higherKey(K key): Returns the least key strictly greater than the given key, or null if there is no such key.
	- lowerKey(K key): Returns the greatest key strictly less than the given key, or null if there is no such key.

import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Get value for a key
        System.out.println("Value for key 2: " + treeMap.get(2));

        // Remove an entry
        treeMap.remove(3);
        System.out.println("After removing key 3: " + treeMap);

        // Check if a key exists
        System.out.println("Contains key 3? " + treeMap.containsKey(3));

        // Iterate over entries
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

//=================================================================================================================================
//=================================================================================================================================
//=================================================================================================================================

1. Introduction to File I/O
============================

I/O stands for the input and output. There are different way of input-output in java, some of these are

	- Console IO
	- file IO
	- Network IO
	- Mobile IO
	- Bluetooth, infra or wifi (wireless) IO
	....	

File Input/Output (I/O) is a fundamental concept in programming that involves reading from and writing to 
files on a storage device. In Java, file I/O operations are essential for handling persistent data, such as 
reading configuration files, logging information, and storing user data.


File I/O encompasses(involve) all the operations that a program performs to interact with files and directories. This 
includes creating, reading, writing, and deleting files, as well as managing file attributes and metadata. 
Java provides a rich set of classes and methods to perform these operations efficiently and reliably.

- Importance of File I/O in Java Applications

 - Data Persistence: Files provide a way to store data permanently, unlike internal-memory storage which is 
   temporary. This is essential for saving user data, application state, and other critical information.

 - Configuration Management: Many applications rely on configuration files to manage settings and preferences. 
   File I/O allows these configurations to be read and modified as needed.

 - Logging and Monitoring: Applications often need to record events, errors, and other significant activities. 
   File I/O enables the creation of log files that can be analyzed for troubleshooting and performance 
   monitoring.

Basic Concepts and Terminology

 - File: A file is a named location on a storage device that holds data. Files can be text files (containing 
   readable characters) or binary files (containing data in a format not meant to be read as text).

 - Directory (or Folder): A directory is a container that can hold files and other directories. It helps 
   organize files in a hierarchical structure.

 - Path: A path is a string representation that specifies the location of a file or directory within the file 
   system. Paths can be absolute (starting from the root of the file system) or relative (relative to the 
   current working directory).

 - Streams: Streams are abstractions that represent a flow of data. In Java, streams are used to read from and    
   write to files. There are input streams (for reading data) and output streams (for writing data).

    - Standard Streams in Java:

	In Java, 3 streams are created for us automatically. All these streams are attached to the console.

	- System.out (standard output stream): This is used to feed the data to the user’s program and usually a keyboard is 
	  used as a standard input stream and represented as System.in.

	- System.in (standard input stream): This is used to output the data produced by the user’s program and usually a 
	  computer screen is used for standard output stream and represented as System.out.

	- System.err (standard error stream): This is used to output the error data produced by the user’s program and usually 
	  a computer screen is used for standard error stream and represented as System.err.
   

 In Java File I/O, streams are used to read from and write to files. Streams are categorized mainly 
 into two types: 

	- byte streams 
	- character streams.


Byte Streams: Byte streams handle I/O of raw binary data. They read and write data in bytes (8 bits). 
---------------
The main classes for byte streams are:

- InputStream
	- FileInputStream
	- ByteArrayInputStream
	- FilterInputStream
		-- BufferedInputStream
		-- DataInputStream
		-- PushbackInputStream
	- ObjectInputStream
	- PipedInputStream
	- SequenceInputStream

- OutputStream
	- FileOutputStream
	- ByteArrayOutputStream
	- FilterOutputStream
		-- BufferedOutputStream
		-- DataOutputStream
	- ObjectOutputStream
	- PipedOutputStream
	- PrintStream

Character Streams:Character streams handle I/O of character data, which means they read and write data in 16-bit Unicode.
------------------
 The main classes for character streams are:

- Reader
	- FileReader
	- BufferedReader
	- CharArrayReader
	- FilterReader
		-- PushbackReader
	- InputStreamReader
		-- FileReader
		-- PipedReader
	- StringReader

- Writer
	- FileWriter
	- BufferedWriter
	- CharArrayWriter
	- FilterWriter
		-- OutputStreamWriter
			- FileWriter
		-- PipedWriter
		-- PrintWriter
	- StringWriter

Specialized Streams: These streams provide additional functionality on top of basic I/O operations.
===================================================================================================

Data Streams: Used to read and write primitive data types.

	- DataInputStream
	- DataOutputStream

Object Streams: Used to read and write objects, supporting object serialization.

	- ObjectInputStream
	- ObjectOutputStream


//-----------------------------------------------------------------------------------------------------------------

class hierarchy of java.io classes:

java.io
├── Closeable (interface)
│   ├── AutoCloseable (interface)
│   └── Flushable (interface)
├── Serializable (interface)
├── DataInput (interface)
├── DataOutput (interface)
├── Externalizable (interface)
├── InputStream (abstract class)
│   ├── ByteArrayInputStream
│   ├── FileInputStream
│   ├── FilterInputStream
│   │   ├── BufferedInputStream
│   │   ├── DataInputStream
│   │   ├── PushbackInputStream
│   │   └── LineNumberInputStream (deprecated)
│   ├── ObjectInputStream
│   ├── PipedInputStream
│   └── SequenceInputStream
├── OutputStream (abstract class)
│   ├── ByteArrayOutputStream
│   ├── FileOutputStream
│   ├── FilterOutputStream
│   │   ├── BufferedOutputStream
│   │   ├── DataOutputStream
│   │   └── PrintStream
│   ├── ObjectOutputStream
│   ├── PipedOutputStream
│   └── SequenceOutputStream (deprecated)
├── Reader (abstract class)
│   ├── BufferedReader
│   ├── CharArrayReader
│   ├── FilterReader
│   │   └── PushbackReader
│   ├── InputStreamReader
│   │   └── FileReader
│   ├── PipedReader
│   ├── StringReader
│   └── LineNumberReader
├── Writer (abstract class)
│   ├── BufferedWriter
│   ├── CharArrayWriter
│   ├── FilterWriter
│   ├── OutputStreamWriter
│   │   └── FileWriter
│   ├── PipedWriter
│   ├── PrintWriter
│   └── StringWriter
├── File
├── RandomAccessFile
├── FileDescriptor
└── FilePermission

//------------------------------------------------------------------------------------

	// Using java.io.File class: 

	The File class in Java is part of the java.io package and represents an abstract representation of file and directory 
	pathnames. This class provides methods for creating, deleting, and querying files and directories.

Constructors:

File(String pathname): Creates a new File instance by converting the given pathname string into an abstract pathname.
File(String parent, String child): Creates a new File instance from a parent pathname string and a child pathname string.
File(File parent, String child): Creates a new File instance from a parent abstract pathname and a child pathname string.
File(URI uri): Creates a new File instance by converting the given file: URI into an abstract pathname.

Methods: 

boolean createNewFile(): Creates a new, empty file if it does not exist.
boolean delete(): Deletes the file or directory.

boolean exists(): Tests whether the file or directory exists.
boolean isDirectory(): Tests whether the file is a directory.
boolean isFile(): Tests whether the file is a normal file.
long length(): Returns the length of the file in bytes.

String getName(): Returns the name of the file or directory.
String getAbsolutePath(): Returns the absolute pathname string.
String getCanonicalPath(): Returns the canonical pathname string.
String getParent(): Returns the pathname string of the parent directory.

String[] list(): Returns an array of strings naming the files and directories in the directory.
File[] listFiles(): Returns an array of File objects representing the files and directories in the directory.
boolean mkdir(): Creates the directory named by this abstract pathname.
boolean mkdirs(): Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories.

boolean canRead(): Tests whether the application can read the file.
boolean canWrite(): Tests whether the application can modify the file.
boolean canExecute(): Tests whether the application can execute the file.

boolean renameTo(File dest): Renames the file or directory.		

boolean setReadOnly(): Marks the file as read-only.
boolean setReadable(boolean readable, boolean ownerOnly): Sets the owner's or everyone's read permission.
boolean setWritable(boolean writable, boolean ownerOnly): Sets the owner's or everyone's write permission.
boolean setExecutable(boolean executable, boolean ownerOnly): Sets the owner's or everyone's execute permission.


package fileexamples;

import java.io.File;
import java.io.*;

public class FileExample {
	public static void main(String[] args) {
		
		File file = new File("example.txt");
		// Creates a new File instance by converting the given pathname string into an abstract pathname.

		// Check if the file exists
		if (file.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File does not exist");
		}

		// Create a new file
		try {
			boolean created = file.createNewFile();
			if (created) {
				System.out.println("File created successfully");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Get file information
		System.out.println("File name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Writable: " + file.canWrite());
		System.out.println("Readable: " + file.canRead());
		System.out.println("File size in bytes: " + file.length());
	}
}

//------------------------------

	// using delete()

package fileexamples;

import java.io.File;
import java.io.*;

public class FileExample {
	public static void main(String[] args) {
		
		File file = new File("example.txt");
		// Creates a new File instance by converting the given pathname string into an abstract pathname.

		// Check if the file exists
		if (file.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File does not exist");
		}

		// Create a new file
		try {
			boolean created = file.createNewFile();
			if (created) {
				System.out.println("File created successfully");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Get file information
		System.out.println("File name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Writable: " + file.canWrite());
		System.out.println("Readable: " + file.canRead());
		System.out.println("File size in bytes: " + file.length());
		
		if(file.delete()) {
			System.out.println("File "+file.getName()+" Deleted");
		}
		else {
			System.out.println("Unable to delete File "+file.getName());
		}
	}
}

//-----------------------------------------------------------------------------------------

	// creating and deleting Directory

package fileexamples;
import java.io.File;
import java.io.IOException;

public class FileParentChildExample {
    public static void main(String[] args) {
        // Define the parent directory
        String parentDir = "e:\\parentDir";
        
        // Create a File object for the parent directory
        File parentDirectory = new File(parentDir);

        // Create the parent directory if it does not exist
        if (!parentDirectory.exists()) {
            if (parentDirectory.mkdir()) {
                System.out.println("Parent directory created: " + parentDirectory.getAbsolutePath());
            } else {
                System.out.println("Failed to create parent directory.");
                return;
            }
        }

        // Define the child file name
        String childFile = "childFile.txt";

        // Create a File object using the parent directory and child file name
        File file = new File(parentDir, childFile);

        try {
            // Check if the file exists, if not create a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }

            // Display file information
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Parent: " + file.getParent());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());


        } catch (IOException e) {
            e.printStackTrace();
        }

        // Clean up: delete the file and directory created for this example
        if (file.delete()) {
            System.out.println("File deleted: " + file.getAbsolutePath());
        } else {
            System.out.println("Failed to delete file.");
        }

        if (parentDirectory.delete()) {
            System.out.println("Parent directory deleted: " + parentDirectory.getAbsolutePath());
        } else {
            System.out.println("Failed to delete parent directory.");
        }
    }
}

//--------------------------------------------------------------------------------------------------

	// dealing with multiple files

package fileexamples;

import java.io.*;

public class DirectoryExample {
	public static void main(String[] args) throws Exception {
		
			// Create a directory
			File directory = new File("exampleDir");
			if (directory.mkdir()) {
				System.out.println("Directory created: " + directory.getName());
			} else {
				System.out.println("Directory already exists or failed to create.");
			}

			for (int i = 0; i < 5; i++) {
				File file = new File("exampleDir", "example" + i + ".txt");

				// Create a new file if it does not exist
				if (file.createNewFile()) {
					System.out.println("File created: " + file.getName());
				} else {
					System.out.println("File already exists.");
				}

			}
			// List files in the directory
			System.out.println("Files in directory: ");
			File[] filesList = directory.listFiles();
			if (filesList != null) {
				for (File f : filesList) {
					System.out.println(f.getName());
				}
			}

			// Delete the file and directory
			if (filesList != null) {
				for (File f : filesList) {
					if (f.delete()) {
						System.out.println("File deleted: " + f.getName());
					} else {
						System.out.println("Failed to delete file.");
					}
				}
			}

			if (directory.delete()) {
				System.out.println("Directory deleted: " + directory.getName());
			} else {
				System.out.println("Failed to delete directory.");
			}

		
		}
	}

//------------------------------------------------------------------------------------------------------------------------------

	// Byte stream Classes

	byte streams are used to perform input and output of 8-bit bytes. They are part of the java.io package and are used for 
	handling binary data. Byte stream classes are divided into two main categories: input streams and output streams. 

	Input Stream Classes:

	- InputStream: This is an abstract superclass that defines methods for reading bytes from a stream. All other input stream 
		       classes are derived from it.
	   - FileInputStream: Reads bytes from a file.
	   - ByteArrayInputStream: Reads bytes from a byte array.
	   - FilterInputStream: A wrapper around another input stream that provides additional functionality.
		- BufferedInputStream: Adds buffering to an input stream, improving efficiency by reducing the number of read 
					operations.
		- DataInputStream: Reads primitive Java data types (int, float, etc.) from an input stream.
		- PushbackInputStream: Allows a byte to be "pushed back" onto the stream, enabling a byte to be read again.
	   - ObjectInputStream: Reads objects that were previously serialized using an ObjectOutputStream.
	   - PipedInputStream: Used to read data from a connected PipedOutputStream.
	   - SequenceInputStream: Concatenates multiple input streams into one stream.

	Output Stream Classes

	- OutputStream: This is an abstract superclass that defines methods for writing bytes to a stream. All other output 
		 	stream classes are derived from it.
	   - FileOutputStream: Writes bytes to a file.
	   - ByteArrayOutputStream: Writes bytes to a byte array.
	   - FilterOutputStream: A wrapper around another output stream that provides additional functionality.
		- BufferedOutputStream: Adds buffering to an output stream, improving efficiency by reducing the number of 
					write operations.
		- DataOutputStream: Writes primitive Java data types (int, float, etc.) to an output stream.
		- PrintStream: Adds functionality to output formatted representations of objects to the stream.
	   - ObjectOutputStream: Writes objects to an output stream so they can be read back using an ObjectInputStream.
	   - PipedOutputStream: Used to write data to a connected PipedInputStream.

//-----------------------------------------------------------------------

FileOutputStream: FileOutputStream is a class in the java.io package that is used to write raw byte streams to a file. 
		  It is used when you need to write binary data, such as images, audio files, etc., or when you need to 
		  write textual data in a specific encoding.

	- FileOutputStream allows you to write bytes to a file. It can write a single byte, an array of bytes, or a 
	  portion of an array.
	- You can specify whether to overwrite the file or append data to it.
	- If the specified file does not exist, FileOutputStream will create it.

	Methods:
	- write(int b): Writes the specified byte to this file output stream.
	- write(byte[] b): Writes b.length bytes from the specified byte array to this file output stream.
	- write(byte[] b, int off, int len): Writes len bytes from the specified byte array starting at offset off to 
					     this file output stream.
	- close(): Closes the file output stream and releases any system resources associated with it.

FileInputStream: FileInputStream is a class in the java.io package that is used to read raw byte streams from a file. 
		 It is used when you need to read binary data, such as images, audio files, etc., or when you need to read 
		 textual data in a specific encoding.

	- FileInputStream allows you to read bytes from a file. It can read a single byte, an array of bytes, 
	  or a portion of an array.
	- The specified file must exist when you create a FileInputStream

	Methods
	- int read(): Reads a byte of data from this input stream.
	- int read(byte[] b): Reads up to b.length bytes of data from this input stream into an array of bytes.
	- int read(byte[] b, int off, int len): Reads up to len bytes of data from this input stream into an array of bytes 
						starting at offset off.
	- int available(): Returns an estimate of the number of remaining bytes that can be read from this input stream.
	- void close(): Closes the file input stream and releases any system resources associated with it.

package fileexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExample {
	public static void main(String[] args) {
		String filename = "example.txt";
		String contentToWrite = "Hello, World! This is an example of FileOutputStream and FileInputStream.";

		// Write content to file using FileOutputStream
		FileOutputStream fos = new FileOutputStream(filename)
		try (fos) {
			fos.write(contentToWrite.getBytes());
			System.out.println("Content written to file: " + filename);
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}

		// Read content from file using FileInputStream
		try (FileInputStream fis = new FileInputStream(filename)) {
			int content;
			System.out.println("Content read from file: ");
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}
			System.out.println(); // Newline for clean output
		} catch (IOException e) {
			System.err.println("Error reading from file: " + e.getMessage());
		}
	}
}
//----------------- or -------------------------------
package fileexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamIOExample {
	public static void main(String[] args) throws Exception {
	
		String data = "This the data, that we have to write in to the file.";
		
		File datafile = new File("data.txt");
		//datafile.createNewFile();
		FileOutputStream fos=new FileOutputStream(datafile);
		byte []b=data.getBytes();
		fos.write(b);
		//fos.close();
		
		FileInputStream fis = new FileInputStream(datafile);
		byte []ba=new byte[fis.available()];
		fis.read(ba);
		
		System.out.println("The data read from file: ");
		for(byte t : ba)
		{
			System.out.print((char)t);
		}
		fis.close();
	}
}

//-----------------------------------------------------------------------------------

ByteArrayInputStream: ByteArrayInputStream is a class in the java.io package that allows an application to create an input stream 
		      from a byte array. This stream is used to read bytes from a byte array as if it were an input stream.

	- int read(): Reads the next byte of data from the input stream.
	- int read(byte[] b, int off, int len): Reads up to len bytes of data into an array of bytes.
	- long skip(long n): Skips n bytes of input.
	- int available(): Returns the number of remaining bytes that can be read from this input stream.
	- void reset(): Resets the input stream to the beginning of the byte array.

ByteArrayOutputStream: ByteArrayOutputStream is a class in the java.io package that allows an application to create an output 
		       stream in which data is written into a byte array. The buffer automatically grows as data is written to it.

	- void write(int b): Writes the specified byte to this byte array output stream.
	- void write(byte[] b, int off, int len): Writes len bytes from the specified byte array starting at offset off to 
						  this byte array output stream.
	- byte[] toByteArray(): Returns the current contents of the output stream as a byte array.
	- String toString(): Converts the buffer's contents into a string.
	- void reset(): Resets the ByteArrayOutputStream so that it can be reused.

package fileexamples;
import java.io.*;
public class ByteArrayInputStreamDemo {
	public static void main(String[] args) {
		String str = "Hello World";
		byte arrb[] = str.getBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(arrb);
		int ch;
		ch = bais.read();
		while (ch != -1) {
			System.out.print((char) ch);
			ch = bais.read();
		}
	}
}

//----------------------------------------------------

package fileexamples;
import java.io.*;
public class ByteArrayOutputStreamDemo {
	public static void main(String[] args) {
		String data = "Hello World";
		try {
			// Creates an output stream
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] array = data.getBytes();

			// Writes data to the output stream
			out.write(array);

			// Retrieves data from the output stream in string format
			String streamData = out.toString();
			System.out.println("Output stream: " + streamData);

			out.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

//--------------------------------------------------------------------------------------------------------------------------

	// FilterInputStream and FilterOutputStream in Java 

	FilterOutputStream is a concrete subclass class of OutputStream class that filters data of an underlying output stream.
	FilterInputStream class has following important subclasses that are as follows:

	- BufferedOutputStream
	- CheckedOutputStream
	- DataOutputStream
	- DeflaterOutputStream
	- DigestOutputStream
	- InflaterOutputStream
	- PrintStream

	
      Constructors
	- FilterOutputStream(OutputStream out): Creates an output stream filter built on top of the specified underlying 
						output stream.

	Method
	- void close(): Closes this output stream and releases any system resources associated with the stream.
	- void flush(): Flushes this output stream and forces any buffered output bytes to be written out to the stream.
	- void write(byte[] b): Writes b.length bytes to this output stream.
	- void write(byte[] b, int off, int len): Writes len bytes from the specified byte array starting at offset off to this output stream.
	- void write(int b): Writes the specified byte to this output stream.


	FilterInputStream in Java: FilterInputStream in Java is a concrete subclass class of InputStream class. Filter streams are 
	streams that wrap around underlying input or output streams and adds new features. filter streams are streams that filter 
	byte input or output streams for some purpose.

	ilterInputStream class has four important subclasses that are as follows:

	- BufferedInputStream
	- DataInputStream
	- LineNumberInputStream
	- PushbackInputStream

	Constructor:

	- protected FilterInputStream(InputStream in): Creates a FilterInputStream by assigning the argument in to the field 
	  this.in so as to remember it for later use.

	Methods:
	- int available()
	- void close()
	- void mark(int readlimit)
	- boolean markSupported()	
	- int read()
	- int read(byte[] b)
	- int read(byte[] b, int off, int len)
	- void reset()
	- long skip(long n)


//-----------------------------------------------------------------------------
	// BufferedInputStream and BufferedOutputStream class

	BufferedInputStream and BufferedOutputStream are two classes in the Java I/O framework that provide buffering capabilities 
	for input and output streams, respectively. Buffering improves the efficiency of I/O operations by reducing the number of 
	interactions with the underlying device, such as a file or network socket.

	BufferedOutputStream class in Java:

	Constructor of BufferedOutputStream class:
	
		- BufferedOutputStream(OutputStream outputStream): 
		- BufferedOutputStream(OutputStream outputStream, int size): 

	 Methods: BufferedOutputStream class in Java does not define any new methods. All the methods in BufferedOutputStream 
	 are inherited from the OutputStream class.

	 Some important methods are as follows:

	- void write(int b): This method writes the specified byte to the buffered output stream.
	- void write(byte[ ] b, int n, int m): This method writes the bytes from the specified byte-input stream m into a 
	  specified byte array, starting from the given nth byte.
	- void flush(): This method flushes the buffered output stream. It can be used to clear the internal buffer by forcing 
	  the output stream to write all data present in the buffer to the destination file.
	- void close(): This method closes the buffered output stream. Once the method is invoked, we cannot write the data again.

	All of the above methods will throw an exception named IOException if any error occurs.
	

	public class BufferedOutputStreamEx {
		public static void main(String[] args) {
		try {
			// Create a FileOutputStream object to connect myfile to FileOutputStream.	 
			FileOutputStream fos = new FileOutputStream("E:\\myfileout.txt");

			// Create a BufferedOutputStream object to wrap FileOutputStream in BufferedOutputStream.
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			String s = "Welcome to Archer InfoTech Pune";
			byte b[] = s.getBytes(); // Converting String into array bytes.
			bos.write(b); // Write data to the output stream.
			bos.close(); // Closing output stream.
			fos.close();
			System.out.println("Successfully written...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
//------------------------------------
package fileexamples;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		String data = "Hello Java";
		// Create a FileOutputStream object to connect myfile to FileOutputStream.	 
		FileOutputStream fos = new FileOutputStream("E:\\myfileout1.txt");

		// Create a BufferedOutputStream object to wrap FileOutputStream in BufferedOutputStream.
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

		bos.write(data.getBytes()); // Writing data to output stream.
		bos.flush(); // Flushing all data from internal buffer to destination file.
		bos.close();
		System.out.println("Successfully written...");
	}
}



   BufferedInputStream in Java

	A BufferedInputStream in Java is a concrete subclass of FilterInputStream that wraps (buffers) an input stream into a 
	buffered stream and makes read operations on the stream more efficient and fast. In simple words, it adds buffering 
	capabilities to an input stream that stores data (in bytes) temporarily into a memory buffer by reading from the stream.
	
	BufferedInputStream, a buffer is internally between the program and the source. During the read operation, the whole 
	block of data (in bytes) is read from the disk and temporarily stored into the internal buffer in the memory once.The data 
	are then transferred (read) individually to the program from the buffer.

	Constructors: 
	- BufferedInputStream(InputStream inputStream)
	- BufferedInputStream(InputStream inputStream, int size)	

	Methods:
	- int read(): Reads the next byte of data from the input stream.
	- int read(byte[] b, int off, int len): Reads up to len bytes of data into an array.
	- long skip(long n): Skips over and discards n bytes of data from the input stream.
	- int available(): Returns the number of bytes that can be read without blocking.
	- void mark(int readlimit): Marks the current position in the input stream.
	- void reset(): Resets the stream to the most recent mark.
	- boolean markSupported(): Indicates if mark and reset are supported.

package fileexamples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {
	public static void main(String[] args) {
		try {
			// Create a FileInputStream object to attach myfile to FileInputStream.	 
			FileInputStream fis = new FileInputStream("D:\\myfile.txt");

			// Create a BufferedInputStream object to wrap FileInputStream in BufferedInputStream.
			BufferedInputStream bis = new BufferedInputStream(fis);

			int i = 0;
			while ((i = bis.read()) != -1) {
				char ch = (char) i;
				System.out.print(ch);
			}
			bis.close();
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

//-----------------------------------------------------
package fileexamples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) {
		try {
			// Create a FileInputStream object to attach myfile to FileInputStream.	 
			FileInputStream fis = new FileInputStream("E:\\myfile.txt");

			// Create a BufferedInputStream object to wrap FileInputStream in BufferedInputStream.
			BufferedInputStream bis = new BufferedInputStream(fis);

			// Skips 5 bytes from the buffered input stream.
			bis.skip(5);
			System.out.println("Input stream after skipping first 5 bytes:");

			// Reads all available bytes from buffered input stream after skipping.
			int i = 0;
			while ((i = bis.read()) != -1) {
				System.out.print((char) i);
			}
			bis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

//------------------------------------------------

	// DataInputStream and DataOutputStream class:

	DataInputStream Class: DataInputStream is a byte stream class which is used to perform reading operation from any input 
	device like keyboard, file, etc. Java DataInputStream class allows an application to read primitive data from the input 
	stream in a machine-independent way.

	Methods:
	- readBoolean(): Reads a boolean value.
	- readByte(): Reads a byte value.
	- readChar(): Reads a char value.
	- readDouble(): Reads a double value.
	- readFloat(): Reads a float value.
	- readInt(): Reads an int value.
	- readLong(): Reads a long value.
	- readShort(): Reads a short value.
	- readUTF(): Reads a String encoded in UTF-8.

	DataOutputStream Class: Java DataOutputStream class allows an application to write primitive Java data types to the output 
	stream in a machine-independent way. Java application generally uses the data output stream to write data that can later be 
	read by a data input stream.
	
	Methods:
	- writeBoolean(boolean v): Writes a boolean value.
	- writeByte(int v): Writes a byte value.
	- writeChar(int v): Writes a char value.
	- writeDouble(double v): Writes a double value.
	- writeFloat(float v): Writes a float value.
	- writeInt(int v): Writes an int value.
	- writeLong(long v): Writes a long value.
	- writeShort(int v): Writes a short value.
	- writeUTF(String str): Writes a String encoded in UTF-8.


	// using DataInputStream 

package fileexamples;
import java.io.*;
public class DataInputStreamDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter any string");
		String str = dis.readLine(); // parsing
		System.out.println("str=" + str);
		
		System.out.println("Enter any Integer");
		int i = Integer.parseInt(dis.readLine()); // parsing
		System.out.println("i=" + i);
		
		System.out.println("Enter any Double");
		double d = Double.parseDouble(dis.readLine());
		System.out.println("d=" + d);
	}
}

//-------

package fileexamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamEx {
	public static void main(String[] args) throws IOException {
		String filepath = "e:\\myfileout.dat";
		// Create a FileOutputStream object to connect with myfileout.dat file.
		FileOutputStream fos = new FileOutputStream(filepath);

		// Create a DataOutputStream object to wrap on fos.  
		DataOutputStream dos = new DataOutputStream(fos);

		// Write following primitive data to the "myfileout.dat" file.
		dos.writeUTF("Welcome to Java world");
		dos.writeInt(1246);
		dos.writeDouble(125.25);
		dos.writeBoolean(true);
		dos.writeChar('S');

		dos.close();
		fos.close();

		// Reading data from the "myfileout.dat" file.
		FileInputStream fis = new FileInputStream(filepath);
		DataInputStream dis = new DataInputStream(fis);

		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());

		dis.close();
		fis.close();
	}
}

//----------------------------------------

   // PushbackInputStream in Java :

	PushbackInputStream in Java is an input stream that pushes (i.e. returns) a single byte or character back into the input 
	stream to reread. In other words, PushbackInputStream is a buffer stream that adds “push back” functionality to an input 
	stream to reread “unread” bytes (or push back read bytes). That’s why it is also called pushback buffer. It is used on an 
	input stream to allow a byte to be read and then returned to the stream.

	constructors:
	 - PushbackInputStream(InputStream inputStream)
	 - PushbackInputStream(InputStream inputStream, int numBytes)

	Methods: 
	 - int available()
	 - void close()
	 - void mark(int readlimit)
	 - boolean markSupported()
	 - int read()
	 - int read(byte[ ] b, int n, int m)
	 - long skip(long n)
	 - void unread(byte[ ] b)
	 - void unread(byte[ ] b, int n, int m)	
	 - void unread(int b)

package fileexamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackFileReading {
	public static void main(String[] args) throws IOException {
		String filepath = "myfileout.txt";
		FileInputStream fis = new FileInputStream(filepath);
		PushbackInputStream pushback = new PushbackInputStream(fis);

		// Read a single byte at a time and print it.
		byte bytedata;
		while ((bytedata = (byte) pushback.read()) != -1) {
			System.out.print((char) bytedata);

			// Unread the last byte that we have just read.
			pushback.unread(bytedata);

			// Reread the byte we unread (or pushed back).
			bytedata = (byte) pushback.read();
			System.out.print((char) bytedata);
		}
	}
}

//--------------------------------------------------------------------------------------------------------

	// PrintStream class in Java

	The PrintStream class in Java is a subclass of FilterOutputStream and is used for producing formatted output to a stream. 
	It adds the ability to print various data types conveniently, with automatic flushing, and supports formatting similar 
	to printf in C.

	Constructors:

	- PrintStream(OutputStream out): Creates a new print stream with automatic line flushing.
	- PrintStream(OutputStream out, boolean autoFlush): Creates a new print stream with optional automatic line flushing.
	- PrintStream(OutputStream out, boolean autoFlush, String encoding): Creates a new print stream with optional automatic 
	  line flushing and a specified character encoding.

	Methods:

	- void print(boolean b): Prints a boolean value.
	- void print(char c): Prints a character.
	- void print(int i): Prints an integer.
	- void print(long l): Prints a long integer.
	- void print(float f): Prints a floating-point number.
	- void print(double d): Prints a double-precision floating-point number.
	- void print(char[] s): Prints an array of characters.
	- void print(String s): Prints a string.
	- void print(Object obj): Prints an object.
	- void println(): Terminates the current line by writing the line separator string.
	- void println(boolean b): Prints a boolean value and then terminates the line.
	- void println(char c): Prints a character and then terminates the line.
	- void println(int i): Prints an integer and then terminates the line.
	- void println(long l): Prints a long integer and then terminates the line.
	- void println(float f): Prints a floating-point number and then terminates the line.
	- void println(double d): Prints a double-precision floating-point number and then terminates the line.
	- void println(char[] s): Prints an array of characters and then terminates the line.
	- void println(String s): Prints a string and then terminates the line.
	- void println(Object obj): Prints an object and then terminates the line.
	- PrintStream printf(String format, Object... args): A method to format and print text.
	- PrintStream printf(Locale l, String format, Object... args): A method to format and print text with a specified locale.
	- void flush(): Flushes the stream.
	- void close(): Closes the stream.

package fileexamples;
import java.io.PrintStream;
public class PrintStreamExample {
	public static void main(String[] args) {
		PrintStream ps = System.out;

		ps.print("Hello, ");
		ps.println("World!");
		ps.printf("This is a number: %d%n", 42);
		ps.printf("This is a floating-point number: %.2f%n", 3.14159);

		boolean b = true;
		char c = 'A';
		int i = 123;
		long l = 123456789L;
		float f = 1.23f;
		double d = 1.23456789;
		String str = "Hello, PrintStream!";

		ps.println(b);
		ps.println(c);
		ps.println(i);
		ps.println(l);
		ps.println(f);
		ps.println(d);
		ps.println(str);
	}
}

//--------------------
package fileexamples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamToFileExample {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("output.txt"))) {
            ps.println("Writing to a file");
            ps.printf("Formatted number: %d%n", 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//----------

package fileexamples;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamFormattingExample {
    public static void main(String[] args) {
        PrintStream ps = System.out;

        ps.printf("Current date and time: %tc%n", new Date());
        ps.printf("Number with leading zeros: %04d%n", 5);
        ps.printf("Floating-point number with 2 decimals: %.2f%n", 123.456);
        ps.printf("Right-justified number: %10d%n", 42);
    }
}
//---------------------------------

package fileexamples;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class RedirectSystemOutExample {
    public static void main(String[] args) {
        try {
            PrintStream fileOut = new PrintStream(new FileOutputStream("system_out.txt"));
            System.setOut(fileOut);
            
            System.out.println("This will be written to the file");
            System.out.printf("Formatted output to the file: %d%n", 123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//------------------------------------------------------------------------------------------------------------------------

	// ObjectInputStream and ObjectOutputStream classes

	ObjectInputStream and ObjectOutputStream are classes in the Java I/O framework that are used for serializing and 
	deserializing objects. Serialization is the process of converting an object's state into a byte stream, while 
	deserialization is the process of reconstructing the object from the byte stream.


	ObjectOutputStream: ObjectOutputStream is a subclass of OutputStream that is used to write objects to an output stream. 
	It allows objects to be written to a stream in a way that they can be read back later.
	
	Constructors:

	- ObjectOutputStream(OutputStream out): Creates an ObjectOutputStream that writes to the specified OutputStream.

	Methods:

	- void writeObject(Object obj): Writes the specified object to the ObjectOutputStream.
	- void writeInt(int val): Writes an int to the stream.
	- void writeBoolean(boolean val): Writes a boolean to the stream.
	- void writeDouble(double val): Writes a double to the stream.
	- void close(): Closes the ObjectOutputStream.

	ObjectInputStream: ObjectInputStream is a subclass of InputStream that is used to read objects from an input stream. 
	It allows objects to be reconstructed from the byte stream

	Constructors:

	- ObjectInputStream(InputStream in): Creates an ObjectInputStream that reads from the specified InputStream.

	Methods:

	- Object readObject(): Reads an object from the ObjectInputStream.
	- int readInt(): Reads an int from the stream.
	- boolean readBoolean(): Reads a boolean from the stream.
	- double readDouble(): Reads a double from the stream.
	- void close(): Closes the ObjectInputStream.

	// example demonstrating how to use ObjectInputStream and ObjectOutputStream to serialize and deserialize an object

package fileexamples;

import java.io.*;

class Person implements Serializable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}

public class SerializationExample {
	public static void main(String[] args) {
		Person person = new Person("John Doe", 30);
		String filename = "person.ser";

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(person);// Serialize
			System.out.println("Serialization successful: " + person);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			Person deserializedPerson = (Person) ois.readObject();// Deserialize 
			System.out.println("Deserialization successful: " + deserializedPerson);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

//------------------------------

	// Serializing and Deserializing Multiple Objects
package fileexamples;

import java.io.*;

class Employee implements Serializable {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', salary=" + salary + "}";
	}
}

public class MultipleObjectsExample {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Alice", 75000);
		Employee emp2 = new Employee("Bob", 80000);
		String filename = "employees.ser";

		// Serialize the objects
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			System.out.println("Serialization successful: " + emp1 + ", " + emp2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the objects
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			Employee deserializedEmp1 = (Employee) ois.readObject();
			Employee deserializedEmp2 = (Employee) ois.readObject();
			System.out.println("Deserialization successful: " + deserializedEmp1 + ", " + deserializedEmp2);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

//--------------------------------------------------

	// Handling Transient Fields: Fields declared as transient are not serialized. This can be useful for sensitive data 
				      or fields that can be recalculated.

	The transient keyword is used to exclude fields from the serialization process. This can be useful for:

	- Sensitive information (e.g., passwords, security tokens) that should not be stored or transmitted.
	- Fields that can be easily recomputed and do not need to be saved.
	- Reducing the size of the serialized object by excluding non-essential fields.

package fileexamples;

import java.io.*;

class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private transient String password; // This field will not be serialized

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{username='" + username + "', password='" + password + "'}";
	}
}

public class TransientFieldExample {
	public static void main(String[] args) {
		User user = new User("john_doe", "password123");
		String filename = "user.ser";

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(user);
			System.out.println("Serialization successful: " + user);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			User deserializedUser = (User) ois.readObject();
			System.out.println("Deserialization successful: " + deserializedUser);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


///-------------------------------------------------------------

	// PipedInputStream and PipedOutputStream 
	//-------------------------------------------

	PipedInputStream and PipedOutputStream are part of the java.io package in Java and provide a way to create a communication 
	pipe between two threads. The PipedOutputStream can be connected to a PipedInputStream, and data written to the 
	PipedOutputStream can be read from the PipedInputStream.

	 - PipedInputStream: This stream reads data written to a PipedOutputStream. It is used to create a communication channel 
	   between threads.
	 - PipedOutputStream: This stream writes data to a PipedInputStream.

	- PipedInputStream Class
	Fields:
	- byte[] buffer: The circular buffer to hold the data.
	- int in: The index one position beyond the last byte written.
	- int out: The index of the first byte to be read.
	- boolean connected: Indicates if the pipe is connected to a PipedOutputStream.

	Constructor:	
	- PipedInputStream(): Creates an unconnected pipe.
	- PipedInputStream(PipedOutputStream src): Creates a pipe connected to the specified PipedOutputStream.

	Methods:
	- read(): Reads the next byte of data from the input stream.
	- read(byte[] b, int off, int len): Reads up to len bytes of data from the input stream into an array.
	- close(): Closes the input stream and releases any system resources associated with it.
	- connect(PipedOutputStream src): Connects this PipedInputStream to a PipedOutputStream.

	- PipedOutputStream Class
	Fields:
	- PipedInputStream sink: The connected PipedInputStream.
	Constructor:
	- PipedOutputStream(): Creates an unconnected pipe.
	- PipedOutputStream(PipedInputStream snk): Creates a pipe connected to the specified PipedInputStream.

	Methods:
	- write(int b): Writes the specified byte to the output stream.
	- write(byte[] b, int off, int len): Writes len bytes from the specified byte array starting at off to this output stream.
	- close(): Closes the output stream and releases any system resources associated with it.
	- connect(PipedInputStream snk): Connects this PipedOutputStream to a PipedInputStream.

		Thread 1 (Writer)                        Thread 2 (Reader)
		==================                       ==================
		  |                                       |
		  | write(int b)                          | read()
		  |    |                                  |    |
		  |    V                                  |    V
		+-------------+    +----------------+    +-------------+
		|             |    |                |    |             |
		| PipedOutput |--->| PipedInternal  |--->| PipedInput  |
		|   Stream    |    |    Buffer      |    |   Stream    |
		|             |    |                |    |             |
		+-------------+    +----------------+    +-------------+


package fileexamples;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

public class PipedStreamExample {
	public static void main(String[] args) {
		try {
			// Create piped input and output streams
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);

			// Create a thread to write data
			Thread writerThread = new Thread(() -> {
				try {
					for (int i = 0; i < 10; i++) {
						pos.write(i);
						System.out.println("Written: " + i);
						Thread.sleep(500);
					}
					pos.close();
				} catch (IOException | InterruptedException e) {
					e.printStackTrace();
				}
			});

			// Create a thread to read data
			Thread readerThread = new Thread(() -> {
				try {
					int data;
					while ((data = pis.read()) != -1) {
						System.out.println("Read: " + data);
					}
					pis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			// Start both threads
			writerThread.start();
			readerThread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



//---------------------------------------------------------------

	// Reader and Writer class in Java IO:
	// -------------------------------------

	The Java Reader (java.io.Reader) and Java Writer class (java.io.Writer) in Java IO work much like the InputStream and 
	OutputStream with the exception that Reader and Writer are character based. They are intended for reading and writing text.

	BufferedReader and BufferedWriter class:
	----------------------------------------

	In Java, the BufferedReader and BufferedWriter classes in the java.io package are used to efficiently read from and write 
	to character streams, respectively. They provide buffering for the I/O operations, which improves performance by reducing 
	the number of read/write operations performed directly on the underlying stream.

	- BufferedReader Class
	The BufferedReader maintains an internal buffer of 8192 characters.During the read operation in BufferedReader, a chunk 
	of characters is read from the disk and stored in the internal buffer. And from the internal buffer characters are read 
	individually. Hence, the number of communication to the disk is reduced. This is why reading characters is faster using 
	BufferedReader.

	Constructors: 
	- BufferedReader buffer = new BufferedReader(file)
	- BufferedReader buffer = new BufferedReader(file, int size)

	Methods:
	- read(): Reads a single character.
	- read(char[] cbuf, int off, int len): Reads characters into a portion of an array.
	- readLine(): Reads a line of text. A line is considered to be terminated by any one of a line feed ('\n'), 
		      a carriage return ('\r'), or a carriage return followed immediately by a line feed.
	- close(): Closes the stream and releases any system resources associated with it.


	- BufferedWriter Class
	The BufferedWriter class writes text to an output stream, buffering characters to provide efficient writing of single 
	characters, arrays, and strings. It is often wrapped around a FileWriter or OutputStreamWriter.

	Methods:
	- write(int c): Writes a single character.
	- write(char[] cbuf, int off, int len): Writes a portion of an array of characters.
	- write(String s, int off, int len): Writes a portion of a string.
	- newLine(): Writes a line separator.
	- flush(): Flushes the stream.
	- close(): Closes the stream and releases any system resources associated with it.

	By wrapping FileReader/InputStreamReader and FileWriter/OutputStreamWriter with BufferedReader and BufferedWriter, 
	you can achieve better performance in your I/O operations in Java.

package fileexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileExample {
	public static void main(String[] args) {
		String inputFile = "source.txt";
		String outputFile = "destination.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//----------------------------------------------------------
package fileexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountExample {
    public static void main(String[] args) {
        String filePath = "source.txt";
        int wordCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Total number of words: " + wordCount);
    }
}

//----------------------------------------------------------
package fileexamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputExample {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Enter your name: ");
			String name = reader.readLine();
			System.out.println("Hello, " + name + "!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//--------------------------------------------------------------

	// CharArrayReader and CharArrayWriter class

	The CharArrayReader and CharArrayWriter classes in java.io are part of Java's I/O (input/output) framework. They are 
	specifically designed for reading and writing character data from and to character arrays. 

	CharArrayReader class:
	Constructor:
	- CharArrayReader(char[] buf)
	- CharArrayReader(char[] buf, int offset, int length)

	Methods:
	- int read(): Reads a single character.
	- int read(char[] cbuf, int off, int len): Reads characters into a portion of an array.
	- boolean ready(): Tells whether the stream is ready to be read.
	- void close(): Closes the stream and releases any system resources associated with it.
	- long skip(long n): Skips the specified number of characters in the stream.
	- boolean markSupported(): Returns true if this stream supports mark/reset.
	- void mark(int readAheadLimit): Marks the current position in the stream.
	- void reset(): Resets the stream to the most recent mark.


	CharArrayWriter class:
	The CharArrayWriter class is a character stream that collects its output in a character array, which can then be 
	converted to a string or a character array.

	Constructors
	CharArrayWriter() - Creates a new CharArrayWriter with a default initial size.
	CharArrayWriter(int initialSize) - Creates a new CharArrayWriter with the specified initial size.

	Methods:
	- void write(int c): Writes a single character.
	- void write(char[] cbuf, int off, int len): Writes characters from a portion of an array.
	- void write(String str, int off, int len): Writes a portion of a string.
	- void writeTo(Writer out): Writes the contents of the buffer to another writer.
	- CharArrayWriter append(CharSequence csq): Appends a character sequence.
	- char[] toCharArray(): Returns a copy of the input data as a character array.
	- int size(): Returns the current size of the buffer.
	- void reset(): Resets the buffer so that it can be used again without throwing away the already allocated buffer.
	- String toString(): Converts the buffer's contents to a string.
	- void close(): Closes the stream.

package fileexamples;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayReaderWriterExample {
	public static void main(String[] args) {
		// Create a CharArrayWriter instance
		CharArrayWriter charArrayWriter = new CharArrayWriter();

		// Write some data to the CharArrayWriter
		String data = "Hello, World!";
		try {
			charArrayWriter.write(data);

			// Convert the CharArrayWriter's content to a character array
			char[] charArray = charArrayWriter.toCharArray();

			// Print the character array
			System.out.println("Written to CharArrayWriter: " + new String(charArray));

			// Create a CharArrayReader to read the data from the character array
			CharArrayReader charArrayReader = new CharArrayReader(charArray);

			// Read and print the data from CharArrayReader
			int i;
			System.out.print("Read from CharArrayReader: ");
			while ((i = charArrayReader.read()) != -1) {
				System.out.print((char) i);
			}

			// Close the readers and writers
			charArrayReader.close();
			charArrayWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//----------------------------------------------------------------

	// InputStreamReader and OutputStreamWriter
	------------------------------------------

	InputStreamReader and OutputStreamWriter are part of the java.io package in Java and serve as bridges between byte streams 
	and character streams. 
		
	- InputStreamReader class:
	InputStreamReader is a subclass of Reader and is used to convert a byte stream (InputStream) into a character 
	stream (Reader). It reads bytes from an input stream and decodes them into characters using a specified charset.

	Constructor:

	- InputStreamReader(InputStream in): Creates an InputStreamReader that uses the default charset.
	- InputStreamReader(InputStream in, Charset charset): Creates an InputStreamReader that uses the specified charset.

	Methods:
	- read(): Reads a single character. Reads bytes from the underlying input stream into a byte buffer. Decodes the bytes 
	  into characters using the charset decoder. Returns the character read or -1 if the end of the stream is reached.
	- read(char[] cbuf, int offset, int length): Reads characters into a portion of an array.
	- close(): Closes the underlying input stream.

	- OutputStreamWriter class:
	OutputStreamWriter is a subclass of Writer and is used to convert a character stream (Writer) into a byte 
	stream (OutputStream). It encodes characters into bytes using a specified charset and writes them to an output stream.

	Methods:
	- write(int c): Writes a single character. Encodes the character into bytes using the charset encoder. Writes the bytes 
	  to the underlying output stream.
	- write(char[] cbuf, int offset, int length): Writes characters from a portion of an array.
	- write(String str, int offset, int length): Writes a portion of a string.
	- flush(): Flushes the stream, ensuring that all buffered characters are encoded and written to the output stream.
	- close(): Closes the underlying output stream, flushing it first.


package fileexamples;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("example.txt"), "UTF-8")) {
            int data;
            while ((data = isr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//----------------------------
package fileexamples;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriterExample {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8")) {
            osw.write("Hello, World!");
            osw.write("\nThis is an example of OutputStreamWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//----------------------------------------------------------------------------------------------------------------------

	// FileReader and FileWriter class in java
	// --------------------------------------------

 	FileReader and FileWriter in Java, which are used for reading from and writing to files, respectively. Both classes are 
	part of the java.io package and are designed for handling character streams, making them suitable for text files.

	- FileReader class
	The FileReader class is a convenient class for reading character files. It provides a way to read the contents of a 
	file as a stream of characters.

	Constructors:
	- FileReader(String fileName): Creates a new FileReader, given the name of the file to read.
	- FileReader(File file): Creates a new FileReader, given the File object to read.
	- FileReader(FileDescriptor fd): Creates a new FileReader, given a FileDescriptor object.

	Methods:
	- int read(): Reads a single character.
	- int read(char[] cbuf, int offset, int length): Reads characters into a portion of an array.
	- boolean ready(): Tells whether this stream is ready to be read.
	- void close(): Closes the stream and releases any system resources associated with it.

	- FileWriter class
	The FileWriter class is a convenient class for writing characters to files. It provides a way to write characters to a file.

	Constructors:
	- FileWriter(String fileName): Creates a new FileWriter, given the name of the file to write to.
	- FileWriter(String fileName, boolean append): Creates a new FileWriter, given the name of the file to write to, with an option to append data to the end of the file.
	- FileWriter(File file): Creates a new FileWriter, given the File object to write to.
	- FileWriter(File file, boolean append): Creates a new FileWriter, given the File object to write to, with an option to append data.
	- FileWriter(FileDescriptor fd): Creates a new FileWriter, given a FileDescriptor object.
	
	Methods:
	- void write(int c): Writes a single character.
	- void write(char[] cbuf, int offset, int length): Writes a portion of an array of characters.
	- void write(String str, int offset, int length): Writes a portion of a string.
	- void flush(): Flushes the stream.
	- void close(): Closes the stream and releases any system resources associated with it.

package fileexamples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
	public static void main(String[] args) {
		String fileName = "example.txt";
		String data = "Hello, World!\nThis is an example of FileReader and FileWriter.";

		// Write data to the file using FileWriter
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write(data);
			System.out.println("Data written to file: " + fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Read data from the file using FileReader
		try (FileReader reader = new FileReader(fileName)) {
			int ch;
			System.out.print("Data read from file: ");
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//-------------------------------------------------------------------------------------------------------------

	// FilterReader and FilterWriter
	// -----------------------------

	FilterReader and FilterWriter are part of the java.io package and are used as abstract classes to provide a way to create 
	filtered character streams. They are subclasses of Reader and Writer respectively, and are used to read and write character 
	streams with additional filtering capabilities.

	- FilterReader class:
	The FilterReader class is an abstract class that provides a base for creating filtered reader streams. It reads from another 
	Reader, which it uses as its basic source of data, possibly transforming the input while doing so.

	Constructor:
	FilterReader(Reader in): Creates a new filtered reader with the specified underlying reader.

	Methods:
	- int read(): Reads a single character.
	- int read(char[] cbuf, int off, int len): Reads characters into a portion of an array.
	- boolean ready(): Tells whether this stream is ready to be read.
	- void close(): Closes the stream and releases any system resources associated with it.

	- FilterWriter
	The FilterWriter class is an abstract class that provides a base for creating filtered writer streams. It writes to 
	another Writer, which it uses as its basic sink of data, possibly transforming the output while doing so.

	Constructor:
	- FilterWriter(Writer out): Creates a new filtered writer with the specified underlying writer.

	Methods:
	- void write(int c): Writes a single character.
	- void write(char[] cbuf, int off, int len): Writes characters from a portion of an array.
	- void write(String str, int off, int len): Writes a portion of a string.
	- void flush(): Flushes the stream.
	- void close(): Closes the stream and releases any system resources associated with it.

//---------------------------------------------------------------------

	// Some addiotional classes

	- RandomAccessFile: Allows reading and writing to any position within a file.
	- FileDescriptor: Represents the handle to the underlying machine-specific file structure.
	- FilePermission: Represents access rights to a file or directory, used for enforcing security policies.


	- RandomAccessFile class:
		The RandomAccessFile class in Java provides both reading and writing capabilities to files and allows you to move 
		the file pointer to any position within the file. This enables non-sequential (random) access, unlike the 
		traditional sequential access provided by streams. The RandomAccessFile class is part of the java.io package. It 
		implements the DataInput and DataOutput interfaces, which provide methods to read and write primitive data types. 
		This makes RandomAccessFile suitable for working with binary files as well as text files.

	Constructors:
	- RandomAccessFile(String name, String mode): Opens a file with the specified name and mode.
	- RandomAccessFile(File file, String mode): Opens a file represented by a File object and mode.

	The mode parameter can be:
		- "r": Open for reading only.
		- "rw": Open for reading and writing.
		- "rws": Open for reading and writing, with every update to the file’s content or metadata immediately 
			 written to the storage device.
		- "rwd": Open for reading and writing, with every update to the file’s content immediately written to the 
			 storage device.

	Methods
	- read(): Reads a byte of data from the file.
	- read(byte[] b): Reads data into a byte array.
	- readInt(), readLong(), readDouble(), etc.: Read different types of primitive data.

	- write(int b): Writes a byte of data to the file.
	- write(byte[] b): Writes data from a byte array.
	- writeInt(int v), writeLong(long v), writeDouble(double v), etc.: Write different types of primitive data.

	- seek(long pos): Sets the file pointer to the specified position.
	- getFilePointer(): Returns the current position of the file pointer.
	- length(): Returns the length of the file.
	- setLength(long newLength): Sets the length of the file.
	
package fileexamples;
import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            // Create a RandomAccessFile instance in "rw" (read/write) mode
            RandomAccessFile file = new RandomAccessFile("source.txt", "rw");

            // Write data to the file
            file.writeUTF("Hello, RandomAccessFile!");
            file.writeInt(12345);

            // Move the file pointer to the beginning
            file.seek(0);

            // Read data from the file
            String str = file.readUTF();
            int num = file.readInt();

            System.out.println("Read from file: " + str + ", " + num);

            // Move the file pointer to the beginning again
            file.seek(0);

            // Write new data, overwriting the old data
            file.writeUTF("Updated text");
            
            // Set the file length to truncate the file
            file.setLength(file.getFilePointer());

            // Move the file pointer to the beginning
            file.seek(0);

            // Read the updated data
            str = file.readUTF();

            System.out.println("Read after update: " + str);

            // Close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//--------------------------------------------------------------------------------------------------------------------------------

	/// CRUD APPLICATION USING FILE AND COMMAND LINE INTERFACE - MINI PROJECT

package fileexamples;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;
class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


class FileUtil {
    private static final String FILE_NAME = "items.txt";

    public static void saveItems(List<Item> items) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(items);
        }
    }

    public static List<Item> loadItems() throws IOException, ClassNotFoundException {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Item>) ois.readObject();
        }
    }
}

public class CRUDApplication {
    public static void main(String[] args) {
        try {
            List<Item> items = FileUtil.loadItems();
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("Choose an operation: create, read, update, delete, exit");
                String operation = scanner.nextLine();

                switch (operation.toLowerCase()) {
                    case "create":
                        createItem(scanner, items);
                        break;
                    case "read":
                        readItems(items);
                        break;
                    case "update":
                        updateItem(scanner, items);
                        break;
                    case "delete":
                        deleteItem(scanner, items);
                        break;
                    case "exit":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid operation");
                }
                FileUtil.saveItems(items);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void createItem(Scanner scanner, List<Item> items) {
        System.out.println("Enter item id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter item name:");
        String name = scanner.nextLine();
        items.add(new Item(id, name));
        System.out.println("Item created.");
    }

    private static void readItems(List<Item> items) {
        if (items.isEmpty()) {
            System.out.println("No items found.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    private static void updateItem(Scanner scanner, List<Item> items) {
        System.out.println("Enter item id to update:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Item item : items) {
            if (item.getId() == id) {
                System.out.println("Enter new item name:");
                String newName = scanner.nextLine();
                item.setName(newName);
                System.out.println("Item updated.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void deleteItem(Scanner scanner, List<Item> items) {
        System.out.println("Enter item id to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        items.removeIf(item -> item.getId() == id);
        System.out.println("Item deleted.");
    }
}

//---------------------------------------------------------------------------------------------------------------------------------

	// NIO (New Input/Output)
	//---------------------------

	In Java, blocking I/O and non-blocking I/O are key concepts for handling input and output operations, particularly in the 
	context of network communications and file operations. 

	In blocking I/O is the traditional and straightforward way of handling I/O operations. When a thread performs a blocking 
	I/O operation, it is suspended until the operation completes. During this period, the thread is idle and cannot perform 
	any other tasks.

	The Non-blocking I/O allows a thread to initiate an I/O operation and continue executing other tasks before the I/O operation 
	completes. This is particularly useful in applications requiring high concurrency and performance, such as web servers and 
	real-time systems.

			Blocking I/O (java.io)			Non-Blocking I/O (java.nio)

	avilable After I/O operation completes	    avilable Immediately after initiating I/O operation
	Less efficient (threads may be idle)	    More efficient (threads can do other work)
	Easier to implement and understand	    More complex to implement
	efficiency Limited, as threads are blocked  efficiency High, as multiple I/O operations can be handled concurrently

	The java.nio Package: Java provides the java.nio (New I/O) package, which includes classes for non-blocking I/O. It was 
	introduced in Java 1.4 and provides a more efficient and scalable way to handle IO operations compared to the traditional 
	IO API (java.io package). With NIO, IO operations can be performed in a non-blocking manner, allowing a thread to continue 
	processing other tasks while waiting for IO operations to complete.

	There are three key terms in NIO

	- Buffers: NIO uses buffers to read and write data. A buffer is essentially a block of memory into which data can be read 
	  and from which data can be written. Traditional IO Uses streams for reading and writing data. A stream reads or writes 
	  one byte at a time, which can be less efficient.

	- Channels: Channels are analogous to streams in traditional IO, but they are bi-directional. A channel can be used for 
	  reading, writing, or both. Channels provide a direct connection to the underlying data source, such as a file or a network 
	  socket. Traditional IO Uses input and output streams to read and write data.

	- Selectors: Selectors allow a single thread to monitor multiple channels for events, such as data arriving (read event) 
	  or ready to be written (write event). means NIO introduces selectors, which allow a single thread to manage multiple 
	  channels. This non-blocking approach enables the thread to continue processing other tasks while waiting for IO operations 
	  to complete.
	

	Buffers in Java NIO
	--------------------
	Buffers are a fundamental component of the Java NIO (New Input/Output) library. They provide a mechanism for handling data 
	in memory and are used in conjunction with channels for reading and writing data. Buffers simplify the process of moving 
	data between the application's memory and an external data source or sink, such as a file or a network socket.

	Each buffer has three main properties:

	- Capacity: The maximum amount of data the buffer can hold.
	- Limit: The limit up to which data can be read or written.
	- Position: The index of the next element to be read or written.

	Types of Buffers: Java NIO provides several types of buffers for different data types

	- ByteBuffer: For handling byte data.
	- CharBuffer: For handling character data.
	- ShortBuffer: For handling short integer data.
	- IntBuffer: For handling integer data.
	- LongBuffer: For handling long integer data.
	- FloatBuffer: For handling floating-point data.
	- DoubleBuffer: For handling double-precision floating-point data.

	Buffer Allocation: 

	- ByteBuffer buffer = ByteBuffer.allocate(1024) - Buffers are allocated using factory methods provided by the 
							   buffer classes. 
	- ByteBuffer directBuffer = ByteBuffer.allocateDirect(1024) -  Direct buffers can be faster for IO operations since they 
								       can be passed directly to native OS functions, bypassing the 
								       Java heap.

	Buffer Methods:

	- position(): Returns or sets the buffer's position.
	- limit(): Returns or sets the buffer's limit.
	- capacity(): Returns the buffer's capacity.
	- mark() and reset(): Allows you to mark a particular position in the buffer and reset the position to this mark later.

	- clear(): Clear the buffer to prepare it for writing.
	- put(data): Put data into the buffer.
	- flip(): Flip the buffer to prepare it for reading.
	- rewind(): Rewinds the buffer to the beginning.
	- compact(): Compacts the buffer, moving any remaining data to the beginning of the buffer.

package fileexamples;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        // Write to a file using NIO
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            String data = "Hello, From NIO!";
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(data.getBytes());
            buffer.flip();
            fileChannel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from a file using NIO
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = fileChannel.read(buffer);
            buffer.flip();
            byte[] bytes = new byte[bytesRead];
            buffer.get(bytes);
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

	// Channels in Java NIO
	// -----------------------

	Channels are a core component of the Java NIO (New Input/Output) library. They represent connections to input/output sources 
	or destinations, such as files, network sockets, or other channels. Channels provide a more flexible and efficient way to 
	perform IO operations compared to the traditional stream-based IO provided by java.io.

	- Channels provide a bi-directional flow of data, meaning they can be used for both reading and writing.
	- Channels are typically used in conjunction with buffers, where data is read from or written to the channel via buffers.

	Types of Channels: Java NIO provides several types of channels to suit different IO scenarios

	- FileChannel: Used for reading, writing, and manipulating files.
	- SocketChannel: Used for client-side and server-side TCP socket communication.
	- ServerSocketChannel: Used for server-side TCP socket communication.
	- DatagramChannel: Used for UDP (User Datagram Protocol) communication.

	Creating and Opening Channels

	- FileChannel fileChannel = FileChannel.open(Paths.get("file.txt"), StandardOpenOption.READ);
	- SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("example.com", 8080));
	- ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

package fileexamples;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {
	public static void main(String[] args) {
		try (RandomAccessFile file = new RandomAccessFile("example.txt", "r");
				FileChannel channel = file.getChannel()) {

			ByteBuffer buffer = ByteBuffer.allocate(48);
			int bytesRead = channel.read(buffer);

			while (bytesRead != -1) {
				buffer.flip();
				while (buffer.hasRemaining()) {
					System.out.print((char) buffer.get());
				}
				buffer.clear();
				bytesRead = channel.read(buffer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//-------------------------------------------------------------------------------------------------------
	
	// Selectors in Java NIO
	// ------------------------

	Selectors are a key component in Java NIO that enable non-blocking I/O operations, allowing a single 
	thread to manage multiple channels. This can significantly enhance the performance and scalability of 
	I/O-intensive applications.

	In Java NIO, selectors are primarily designed to work with network channels, such as SocketChannel, 
	ServerSocketChannel, and DatagramChannel. They are used to handle non-blocking I/O operations for 
	these network channels efficiently. Selectors are not intended to be used with file channels
	(FileChannel), as file I/O operations are typically blocking by nature and do not fit the event-driven 
	model that selectors provide.

	Why Selectors Are Not Used with File Channels?
	 - Nature of File I/O: File I/O operations are inherently blocking. When you read from or write to a file,
	the operation typically blocks until it completes. This behavior does not align with the non-blocking, 
	event-driven model that selectors support.

	- Selector Design: Selectors are designed to handle network events like connection requests, readiness 
	for reading or writing data, etc. These events are not applicable to file I/O, which does not generate 
	such asynchronous events.

	- Alternative for Asynchronous File I/O
	While you can't use selectors with file channels, Java NIO.2 (introduced in Java 7) provides an 
	alternative for asynchronous file operations: AsynchronousFileChannel. This class supports asynchronous 
	read and write operations, allowing you to perform non-blocking file I/O using callbacks or futures.

	// Charsets:
	// ----------
	Charsets in Java NIO are essential for encoding and decoding character data. They enable conversion 
	between bytes and characters, supporting a wide range of character sets. The Charset, CharsetEncoder, 
	and CharsetDecoder classes, along with the StandardCharsets utility class, provide a comprehensive API 
	for working with different character encodings. Understanding and correctly handling charsets is 
	crucial for building robust I/O operations, especially in applications that deal with multiple 
	languages and character sets.

	// Scattering and Gathering in Java NIO
	Scattering and Gathering are two key concepts in Java NIO that deal with the way data is read from and 
	written to channels. These concepts are particularly useful when dealing with protocols or file formats 
	that have a fixed structure.

	- Scattering reads refer to reading data from a single channel into multiple buffers. This is useful 
	when you want to split the read data into distinct parts. For example, you might want to separate a 
	header from a body in a network protocol.
		Scattering reads with a FileChannel involve reading data from a file into multiple buffers in 
	a single read operation. This is useful when the file data is structured in a way that different parts 
	should be processed separately.

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ScatteringReadFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer header = ByteBuffer.allocate(128);
            ByteBuffer body = ByteBuffer.allocate(1024);
            ByteBuffer[] buffers = {header, body};

            fileChannel.read(buffers);

            header.flip();
            body.flip();

            System.out.println("Header: " + new String(header.array(), 0, header.limit()));
            System.out.println("Body: " + new String(body.array(), 0, body.limit()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


	- Gathering writes refer to writing data from multiple buffers into a single channel. This is useful 
	when you have distinct parts of data that you want to send as a single unit. For example, you might 
	want to send a header and a body together in a network protocol.
		Gathering writes with a FileChannel involve writing data from multiple buffers to a file in a 
	single write operation. This is useful when you want to combine different parts of data and write them 
	to a file together.

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GatheringWriteFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer header = ByteBuffer.wrap("Header information".getBytes());
            ByteBuffer body = ByteBuffer.wrap("Body of the file content".getBytes());
            ByteBuffer[] buffers = {header, body};

            fileChannel.write(buffers);

            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

     - Use Cases and Benefits
	Use Cases for Scattering Reads
	- Structured Data Files: Files where data is split into fixed sections, such as file headers, metadata,
	  and body content.
	- Log Files: Reading log files where each entry consists of a fixed-size timestamp and a variable-size 
	  message.

     - Use Cases for Gathering Writes
	- Combining Data Sections: Writing structured data to a file where different sections (like headers 
	  and body content) are combined.
	- Batch Writes: Efficiently writing multiple data segments in one operation to reduce I/O overhead.



	// File Locking in Java NIO
	// ---------------------------

	File locking is a mechanism that prevents multiple processes from accessing a file concurrently, 
	which can help avoid data corruption or inconsistencies. Java NIO provides support for file locking 
	through the FileChannel class.

	Java NIO supports two types of file locks:

	- Shared Lock (Read Lock): Multiple processes can hold shared locks on a file, allowing them to read 
	  from it simultaneously. However, no process can write to the file while a shared lock is held.

	- Exclusive Lock (Write Lock): Only one process can hold an exclusive lock on a file, preventing both 
	  read and write access by other processes.

	File Locking API - 
	The main methods related to file locking in FileChannel are:

	- lock(): Acquires an exclusive lock on the file.
	- lock(long position, long size, boolean shared): Acquires a lock on a specific region of the file. 
	  The shared parameter specifies whether the lock is shared.
	- tryLock(): Attempts to acquire an exclusive lock on the file without blocking.
	- tryLock(long position, long size, boolean shared): Attempts to acquire a lock on a specific region 
	  of the file without blocking.

	Locks are represented by the FileLock class, which provides methods to check the lock status and 
	release the lock.

package fileexamples;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExclusiveFileLockExample {
	public static void main(String[] args) {
		Path path = Paths.get("example.txt");

		try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			// Acquire an exclusive lock on the file
			FileLock lock = fileChannel.lock();

			System.out.println("File is locked.");

			// Write data to the file while holding the lock
			ByteBuffer buffer = ByteBuffer.wrap("This is some test data.".getBytes());
			fileChannel.write(buffer);

			// Release the lock
			lock.release();

			System.out.println("File lock released.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


package fileexamples;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SharedFileLockExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            // Acquire a shared lock on the file
            FileLock lock = fileChannel.lock(0, Long.MAX_VALUE, true);

            System.out.println("File is locked.");

            // Read data from the file while holding the lock
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            fileChannel.read(buffer);

            buffer.flip();
            byte[] data = new byte[buffer.limit()];
            buffer.get(data);

            System.out.println("Read data: " + new String(data));

            // Release the lock
            lock.release();

            System.out.println("File lock released.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

- Exclusive Lock:
  - Acquired using lock() or tryLock().
  - Ensures that no other process can read or write to the file.
  - Used when you need complete control over the file for operations like writing or updating.

- Shared Lock:
  - Acquired using lock(long position, long size, boolean shared) or tryLock(long position, long size, boolean shared) with shared set to true.
  - Allows multiple processes to read from the file concurrently but prevents writing.
  - Used when you want to allow concurrent read access while preventing modifications.

// Region Locking
// -----------------
    Java NIO also allows locking specific regions of a file, which can be useful for large files where 
    different processes need access to different parts of the file.

package fileexamples;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class RegionFileLockExample {
	public static void main(String[] args) {
		Path path = Paths.get("example.txt");

		try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			// Acquire an exclusive lock on a region of the file
			FileLock lock = fileChannel.lock(0, 50, false);

			System.out.println("File region is locked.");

			// Write data to the locked region of the file
			ByteBuffer buffer = ByteBuffer.wrap("This is some test data for a specific region.".getBytes());
			fileChannel.write(buffer);

			// Release the lock
			lock.release();

			System.out.println("File region lock released.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//=================================================================================================================================

	// User Interface: 

	User interface is actually a program used by the user of application which acts as a medium to transfer the command to 
	program for the execution start and it is also used to represent the output given by the program to the user.

	we have used unknowing an interface and we must use some other advanced interfaces which are as listed below.
		
	- Command Line Interface (CLI): Dos styled textbased black and white user interface, used some commands for the interaction.
	- Graphical User Interface (GUI): Pictorial interface generally provides point-and-click interaction, or operated using
	  some keyboard shortcuts.

		Generaly there are two types of appocations

			- Stand-Alone Applications: CLI(Java SE provides default JSL) -> GUI (AWT -> Swing )
			- Networked/web Applications: Networked app using CLI (java.net) -> Networked app using GUI -> Applets 
					web(client-server) -> Servlets/jsp -> .... spring/spring boot 

	The Java programming language class library provides a user interface toolkit called the Abstract Windowing Toolkit,
	or the AWT. 

	What is a user interface
	
	The user interface is that part of a program that interacts with the user of the program. User interfaces take many forms. 
	These forms range in complexity from simple command-line interfaces to the point-and-click graphical user interfaces provided 
	by many modern applications.
	
	AWT is a platform-independent. The AWT was designed to provide a common set of tools for graphical user interface design that 
	work on a variety of platforms. The user interface elements provided by the AWT are implemented using each platform's native 
	GUI toolkit, thereby preserving the look and feel of each platform. This is one of the AWT's strongest points. The 
	disadvantage of such an approach is the fact that a graphical user interface designed on one platform may look different 
	when displayed on another platform. 

	Components and containers

	A graphical user interface is built of graphical elements called components. Typical components include such items as 
	buttons, scrollbars, and text fields. Components allow the user to interact with the program and provide the user with 
	visual feedback about the state of the program. In the AWT, all user interface components are instances of class Component 
	or one of its subtypes. 
	Components do not stand alone, but rather are found within containers. Containers contain and control the layout of 
	components. Containers are themselves components, and can thus be placed inside other containers. In the AWT, all containers
	are instances of class Container or one of its subtypes

	Types of containers

	The AWT provides four container classes. They are class Window and its two subtypes -- class Frame and class Dialog -- as 
	well as the Panel class. In addition to the containers provided by the AWT, the Applet class is a container -- it is a 
	subtype of the Panel class and can therefore hold components. Brief descriptions of each container class provided by the 
	AWT are provided below

	Component:
	At the top of the AWT hierarchy is the Component class. Component is an abstract class that encapsulates all of the attributes
	of a visual component. All user interface elements that are displayed on the screen and that interact with the user are 
	subclasses of Component. It defines over a hundred public methods that are responsible for managing events, such as mouse 
	and keyboard input, positioning and sizing the window, and repainting. A Component object is responsible for remembering 
	the current foreground and background colors and the currently selected text font.

	Container:
	The Container class is a subclass of Component. It has additional methods that allow other Component objects to be nested
	within it. Other Container objects can be stored inside of a Container (since they are themselves instances of Component). 
	This makes for a multileveled containment system. A container is responsible for laying out (that is, positioning) any 
	components that it contains.

	Panel
	A generic container for holding components. An instance of the Panel class provides a container to which to add components. 
	The Panel class is a concrete subclass of Container. It doesn’t add any new methods; it simply implements Container. Panel is 
	the super class for Applet. When screen output is directed to an applet, it is drawn on the surface of a Panel object. In 
	essence, a Panel is a window that does not contain a title bar, menu bar, or border

	Window
	A top-level display surface (a window). An instance of the Window class is not attached to nor embedded within another 	
	container. An instance of the Window class has no border and no title Generally, you won’t create Window objects directly. 		Instead, you will use a subclass of Window called Frame

	Frame
	It is a subclass of Window and has a title bar, menu bar, borders, and resizing corners. It very much like an instance of 
	the Window class. 

	Dialog
	A top-level display surface (a window) with a border and title. An instance of the Dialog class cannot exist without an 
	associated instance of the Frame class. 

//------------------------------------------------------------------------------------------------

	// Interactive components in java.awt

	- Button: A push button.
	- Checkbox: A check box component.
	- CheckboxGroup: A group of checkboxes in which only one checkbox at a time can be selected.
	- Choice: A pop-up list of choices.
	- *Dialog: A top-level window with a title and a border.
	- *FileDialog: A dialog window from which the user can select a file.
	- Frame: A top-level window with a title and a border.
	- Label: A component for placing text in a container.(passive)
	- List: A component that allows the user to select one or more items from a list.
	- Scrollbar: A component that represents a scroll bar.
	- TextArea: A multi-line area to display/edit text.
	- TextField: A single-line text field.
	- MenuComponent: The superclass for all menu-related components.
		- MenuBar: A menu bar to hold menus.
		- Menu: A pull-down menu.
		- MenuItem: An item in a menu.
//-------------------------------------------------------------------------------------------------

	// Working with Frame Windows

	A class Frame is used to create child windows within applets, and top-level or child windows for applications.
	It having constructors:
		Frame( )
		Frame(String title)
	Methods:
	Setting the Window’s Dimensions
		void setSize(int newWidth, int newHeight)
		void setSize(Dimension newSize)
		Dimension getSize( )
	Hiding and Showing a Window
		void setVisible(boolean visibleFlag)
		void setTitle(String newTitle)
	Setting a Window’s Title
		void setTitle(String newTitle)

 // Program to create the simpe window

import java.awt.*;
class DemoWindow 
{
	public static void main(String[] args) 
	{
		Frame f=new Frame("First Frame Example");
		f.setSize(400,300);
		f.setVisible(true);
	}
}

//----------------------------------------------------------------------------------------------------------------

	// We know Frame is a container, which is used to place the interactive components.
	
	lets see how..??


import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
	Button b1,b2,b3;
	public MyFrame()
	{
		super("First Frame Example");
		setSize(400,300);
		setLayout(new FlowLayout());

		b1=new Button("Red");
		b1.addActionListener(this);

		b2=new Button("Green");
		b2.addActionListener(this);

		b3=new Button("Blue");
		b3.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=((Button)e.getSource()).getLabel();
		System.out.println(str+" Button pressed");
	}
}
class DemoWindow 
{
	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
		mf.setVisible(true);
	}
}

//----------------------------------------------------------------------------------------

// using seperate eventhandler class

import java.awt.*;
import java.awt.event.*;
class MyActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		String str=((Button)e.getSource()).getLabel();
		System.out.println(str+" Button pressed");
	}
}
class MyFrame extends Frame 
{
	Button b1,b2,b3;
	public MyFrame()
	{
		super("First Frame Example");
		setSize(400,300);
		setLayout(new FlowLayout());

		b1=new Button("Red");
		b1.addActionListener(new MyActionListener());

		b2=new Button("Green");
		b2.addActionListener(new MyActionListener());

		b3=new Button("Blue");
		b3.addActionListener(new MyActionListener());

		add(b1);
		add(b2);
		add(b3);
	}
}
class DemoWindow1
{
	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
		mf.setVisible(true);
	}
}

//------------------------------------------------------------------------------------------------


// Event handlilng using anonymous inner class

import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
{
	Button b1,b2,b3;
	public MyFrame()
	{
		super("First Frame Example");
		setSize(400,300);
		setLayout(new FlowLayout());

		b1=new Button("Red");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str=((Button)e.getSource()).getLabel();
				System.out.println(str+" Button pressed");
			}	
		});

		b2=new Button("Green");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str=((Button)e.getSource()).getLabel();
				System.out.println(str+" Button pressed");
			}	
		});

		b3=new Button("Blue");
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str=((Button)e.getSource()).getLabel();
				System.out.println(str+" Button pressed");
			}	
		});

		add(b1);
		add(b2);
		add(b3);
	}
}
class DemoWindow2
{
	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
		mf.setVisible(true);
	}
}

//----------------------------------------------------------------------------------------------------------------

 comprehensive table that lists all AWT components along with their events and corresponding event names:

Component		Event			Event Name

Component		ComponentEvent		componentResized, componentMoved, componentShown, componentHidden
			FocusEvent		focusGained, focusLost
			KeyEvent		keyPressed, keyReleased, keyTyped
			MouseEvent		mouseClicked, mousePressed, mouseReleased, mouseEntered, mouseExited
			MouseMotionEvent	mouseMoved, mouseDragged
			MouseWheelEvent		mouseWheelMoved
Container		ContainerEvent		componentAdded, componentRemoved
Button			ActionEvent		actionPerformed
Canvas			Same as Component	Same as Component
Checkbox		ItemEvent		itemStateChanged
Choice			ItemEvent		itemStateChanged
Label			Same as Component	Same as Component
List			ActionEvent		actionPerformed
			ItemEvent		itemStateChanged
Scrollbar		AdjustmentEvent		adjustmentValueChanged
ScrollPane		Same as Component	Same as Component
TextComponent		TextEvent		textValueChanged
			FocusEvent		focusGained, focusLost
			KeyEvent		keyPressed, keyReleased, keyTyped
			MouseEvent		mouseClicked, mousePressed, mouseReleased, mouseEntered, mouseExited
			MouseMotionEvent	mouseMoved, mouseDragged
TextField		ActionEvent		actionPerformed
TextArea		Same as TextComponent	Same as TextComponent
Window			WindowEvent		windowOpened, windowClosing, windowClosed, windowIconified, windowDeiconified, 								windowActivated, windowDeactivated
			FocusEvent		focusGained, focusLost
			KeyEvent		keyPressed, keyReleased, keyTyped
			MouseEvent		mouseClicked, mousePressed, mouseReleased, mouseEntered, mouseExited
			MouseMotionEvent	mouseMoved, mouseDragged
			MouseWheelEvent		mouseWheelMoved
Frame			Same as Window		Same as Window
Dialog			Same as Window		Same as Window
FileDialog		Same as Dialog		Same as Dialog
MenuComponent		ActionEvent		actionPerformed
			ItemEvent		itemStateChanged
MenuBar			Same as MenuComponent	Same as MenuComponent
Menu			Same as MenuComponent	Same as MenuComponent
MenuItem		ActionEvent		actionPerformed
CheckboxMenuItem	ItemEvent		itemStateChanged
PopupMenu		Same as MenuComponent	Same as MenuComponent

//-------------------------------------------------------------------------------------------------------------------

// Table listing all AWT components, their events, corresponding event names, and when each event is generated:

Component: Component
Event: ComponentEvent
Event Name: componentResized
When Event is Generated: When the component is resized

Component: Component
Event: ComponentEvent
Event Name: componentMoved
When Event is Generated: When the component is moved

Component: Component
Event: ComponentEvent
Event Name: componentShown
When Event is Generated: When the component is shown

Component: Component
Event: ComponentEvent
Event Name: componentHidden
When Event is Generated: When the component is hidden

Component: Component
Event: FocusEvent
Event Name: focusGained
When Event is Generated: When the component gains focus

Component: Component
Event: FocusEvent
Event Name: focusLost
When Event is Generated: When the component loses focus

Component: Component
Event: KeyEvent
Event Name: keyPressed
When Event is Generated: When a key is pressed

Component: Component
Event: KeyEvent
Event Name: keyReleased
When Event is Generated: When a key is released

Component: Component
Event: KeyEvent
Event Name: keyTyped
When Event is Generated: When a key is typed

Component: Component
Event: MouseEvent
Event Name: mouseClicked
When Event is Generated: When the mouse is clicked

Component: Component
Event: MouseEvent
Event Name: mousePressed
When Event is Generated: When a mouse button is pressed

Component: Component
Event: MouseEvent
Event Name: mouseReleased
When Event is Generated: When a mouse button is released

Component: Component
Event: MouseEvent
Event Name: mouseEntered
When Event is Generated: When the mouse enters the component

Component: Component
Event: MouseEvent
Event Name: mouseExited
When Event is Generated: When the mouse exits the component

Component: Component
Event: MouseMotionEvent
Event Name: mouseMoved
When Event is Generated: When the mouse is moved

Component: Component
Event: MouseMotionEvent
Event Name: mouseDragged
When Event is Generated: When the mouse is dragged

Component: Component
Event: MouseWheelEvent
Event Name: mouseWheelMoved
When Event is Generated: When the mouse wheel is moved

Component: Container
Event: ContainerEvent
Event Name: componentAdded
When Event is Generated: When a component is added to the container

Component: Container
Event: ContainerEvent
Event Name: componentRemoved
When Event is Generated: When a component is removed from the container

Component: Button
Event: ActionEvent
Event Name: actionPerformed
When Event is Generated: When the button is clicked

Component: Canvas
Event: Same as Component
Event Name: Same as Component
When Event is Generated: Same as Component

Component: Checkbox
Event: ItemEvent
Event Name: itemStateChanged
When Event is Generated: When the state of the checkbox is changed

Component: Choice
Event: ItemEvent
Event Name: itemStateChanged
When Event is Generated: When an item is selected or deselected

Component: Label
Event: Same as Component
Event Name: Same as Component
When Event is Generated: Same as Component

Component: List
Event: ActionEvent
Event Name: actionPerformed
When Event is Generated: When an item is double-clicked or Enter is pressed

Component: List
Event: ItemEvent
Event Name: itemStateChanged
When Event is Generated: When an item is selected or deselected

Component: Scrollbar
Event: AdjustmentEvent
Event Name: adjustmentValueChanged
When Event is Generated: When the scrollbar value is changed

Component: ScrollPane
Event: Same as Component
Event Name: Same as Component
When Event is Generated: Same as Component

Component: TextComponent
Event: TextEvent
Event Name: textValueChanged
When Event is Generated: When the text value is changed

Component: TextComponent
Event: FocusEvent
Event Name: focusGained
When Event is Generated: When the component gains focus

Component: TextComponent
Event: FocusEvent
Event Name: focusLost
When Event is Generated: When the component loses focus

Component: TextComponent
Event: KeyEvent
Event Name: keyPressed
When Event is Generated: When a key is pressed

Component: TextComponent
Event: KeyEvent
Event Name: keyReleased
When Event is Generated: When a key is released

Component: TextComponent
Event: KeyEvent
Event Name: keyTyped
When Event is Generated: When a key is typed

Component: TextComponent
Event: MouseEvent
Event Name: mouseClicked
When Event is Generated: When the mouse is clicked

Component: TextComponent
Event: MouseEvent
Event Name: mousePressed
When Event is Generated: When a mouse button is pressed

Component: TextComponent
Event: MouseEvent
Event Name: mouseReleased
When Event is Generated: When a mouse button is released

Component: TextComponent
Event: MouseEvent
Event Name: mouseEntered
When Event is Generated: When the mouse enters the component

Component: TextComponent
Event: MouseEvent
Event Name: mouseExited
When Event is Generated: When the mouse exits the component

Component: TextComponent
Event: MouseMotionEvent
Event Name: mouseMoved
When Event is Generated: When the mouse is moved

Component: TextComponent
Event: MouseMotionEvent
Event Name: mouseDragged
When Event is Generated: When the mouse is dragged

Component: TextField
Event: ActionEvent
Event Name: actionPerformed
When Event is Generated: When the Enter key is pressed

Component: TextArea
Event: Same as TextComponent
Event Name: Same as TextComponent
When Event is Generated: Same as TextComponent

Component: Window
Event: WindowEvent
Event Name: windowOpened
When Event is Generated: When the window is opened

Component: Window
Event: WindowEvent
Event Name: windowClosing
When Event is Generated: When the user attempts to close the window

Component: Window
Event: WindowEvent
Event Name: windowClosed
When Event is Generated: When the window is closed

Component: Window
Event: WindowEvent
Event Name: windowIconified
When Event is Generated: When the window is minimized

Component: Window
Event: WindowEvent
Event Name: windowDeiconified
When Event is Generated: When the window is restored from being minimized

Component: Window
Event: WindowEvent
Event Name: windowActivated
When Event is Generated: When the window is activated

Component: Window
Event: WindowEvent
Event Name: windowDeactivated
When Event is Generated: When the window is deactivated

Component: Window
Event: FocusEvent
Event Name: focusGained
When Event is Generated: When the window gains focus

Component: Window
Event: FocusEvent
Event Name: focusLost
When Event is Generated: When the window loses focus

Component: Window
Event: KeyEvent
Event Name: keyPressed
When Event is Generated: When a key is pressed

Component: Window
Event: KeyEvent
Event Name: keyReleased
When Event is Generated: When a key is released

Component: Window
Event: KeyEvent
Event Name: keyTyped
When Event is Generated: When a key is typed

Component: Window
Event: MouseEvent
Event Name: mouseClicked
When Event is Generated: When the mouse is clicked

Component: Window
Event: MouseEvent
Event Name: mousePressed
When Event is Generated: When a mouse button is pressed

Component: Window
Event: MouseEvent
Event Name: mouseReleased
When Event is Generated: When a mouse button is released

Component: Window
Event: MouseEvent
Event Name: mouseEntered
When Event is Generated: When the mouse enters the window

Component: Window
Event: MouseEvent
Event Name: mouseExited
When Event is Generated: When the mouse exits the window

Component: Window
Event: MouseMotionEvent
Event Name: mouseMoved
When Event is Generated: When the mouse is moved

Component: Window
Event: MouseMotionEvent
Event Name: mouseDragged
When Event is Generated: When the mouse is dragged

Component: Window
Event: MouseWheelEvent
Event Name: mouseWheelMoved
When Event is Generated: When the mouse wheel is moved

Component: Frame
Event: Same as Window
Event Name: Same as Window
When Event is Generated: Same as Window

Component: Dialog
Event: Same as Window
Event Name: Same as Window
When Event is Generated: Same as Window

Component: FileDialog
Event: Same as Dialog
Event Name: Same as Dialog
When Event is Generated: Same as Dialog

Component: MenuComponent
Event: ActionEvent
Event Name: actionPerformed
When Event is Generated: When a menu item is selected

Component: MenuComponent
Event: ItemEvent
Event Name: itemStateChanged
When Event is Generated: When a checkbox menu item is selected or deselected

Component: MenuBar
Event: Same as MenuComponent
Event Name: Same as MenuComponent
When Event is Generated: Same as MenuComponent

Component: Menu
Event: Same as MenuComponent
Event Name: Same as MenuComponent
When Event is Generated: Same as MenuComponent

Component: MenuItem
Event: ActionEvent
Event Name: actionPerformed
When Event is Generated: When a menu item is selected

Component: CheckboxMenuItem
Event: ItemEvent
Event Name: itemStateChanged
When Event is Generated: When a checkbox menu item is selected or deselected

Component: PopupMenu
Event: Same as MenuComponent
Event Name: Same as MenuComponent
When Event is Generated: Same as MenuComponent

//-------------------------------------------------------------------------------------------------------------

	// Layout Manager

	a layout manager automatically arranges your controls within a window by using some type of algorithm. Each Container 
	object has a layout manager associated with it. A layout manager is an instance of any class that implements the 
	LayoutManager interface. The layout manager is set by the setLayout( ) method. If no call to setLayout( ) is made, then the 	default layout manager is used. Whenever a container is resized (or sized for the first time), the layout manager is used to 
	position each of the components within it. The setLayout( ) method has the following general form: 

			void setLayout(LayoutManager layoutObj)

	If you wish to disable the layout manager and position components manually, pass null for layoutObj. If you do this, 
	you will need to determine the shape and position of each component manually, using the setBounds( ) method defined by 
	Component.

	// FlowLayout: 

	The FlowLayout class arranges components in a directional flow, much like lines of text in a paragraph. Here, we'll create 
	a frame with several buttons laid out using FlowLayout.

import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("FlowLayout Example");

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Create some buttons and add them to the frame
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

	Note: 

	WindowAdapter is used instead of WindowListener in the above example because WindowAdapter provides default (empty) 
	implementations for all methods in the WindowListener interface. This allows you to override only the methods you need.

//--------------------------------------------------------------------------------------------------------------------------

	// BorderLayout:

	BorderLayout is a layout manager provided by java.awt that divides a container into five areas: North, South, East, West, 
	and Center. Components added to a container using BorderLayout are positioned in one of these five regions. Here's a simple 
	example demonstrating the use of BorderLayout:

import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("BorderLayout Example");

        // Set BorderLayout for the frame
        frame.setLayout(new BorderLayout());

        // Create buttons for each region
        Button northButton = new Button("North");
        Button southButton = new Button("South");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button centerButton = new Button("Center");

        // Add buttons to the frame with BorderLayout constraints
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        // Add window listener to handle window close event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}


//----------------------------------------------------------------------------------------------------------------

	// GridLayout: 

	GridLayout in java.awt arranges components in a grid of rows and columns. All components in a GridLayout are of equal size. 
	Here's a simple example demonstrating the use of GridLayout:

import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("GridLayout Example");

        // Set GridLayout for the frame (3 rows, 2 columns)
        frame.setLayout(new GridLayout(3, 2));

        // Create buttons for the grid
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        // Add window listener to handle window close event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

//------------------------------------------------------------------------------------------------------------

	// CardLayout: 

		CardLayout in java.awt is a layout manager that allows you to display different components in the same area of a 
	container, like a deck of cards. Only one component (or "card") is visible at a time. Here's a simple example demonstrating 
	the use of CardLayout:



import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample1 {
    private Frame frame;
    private Panel cardPanel;
    private CardLayout cardLayout;

    public CardLayoutExample1() {
        frame = new Frame("CardLayout Example");

        // Create a Panel with CardLayout
        cardPanel = new Panel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Create panels for each "card"
        Panel card1 = new Panel();
        card1.setBackground(Color.RED);
        Label label1 = new Label("Card 1");
        card1.add(label1);

        Panel card2 = new Panel();
        card2.setBackground(Color.GREEN);
        Label label2 = new Label("Card 2");
        card2.add(label2);

        Panel card3 = new Panel();
        card3.setBackground(Color.BLUE);
        Label label3 = new Label("Card 3");
        card3.add(label3);

        // Add cards to the cardPanel with unique names
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");
        cardPanel.add(card3, "Card 3");

        // Create buttons for navigation
        Panel buttonPanel = new Panel();
        Button prevButton = new Button("Previous");
        Button nextButton = new Button("Next");

        // Add action listeners to the buttons
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Add the cardPanel and buttonPanel to the frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutExample1();
    }
}

//-------------------------------------------------------------------------------------------------------

	// Using Checkbox and CheckboxGroup

import java.awt.*;
import java.awt.event.*;

public class CheckboxExample {
    private Frame frame;
    private CheckboxGroup checkboxGroup;

    public CheckboxExample() {
        frame = new Frame("Checkbox Example");

        // Create a CheckboxGroup
        checkboxGroup = new CheckboxGroup();

        // Create Checkboxes
        Checkbox checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("Option 2", checkboxGroup, false);
        Checkbox checkbox3 = new Checkbox("Option 3", checkboxGroup, false);

        // Create a Label to display selected option
        Label selectionLabel = new Label("Selected option: ");

        // Add ItemListener to handle checkbox selection change
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Checkbox selectedCheckbox = checkboxGroup.getSelectedCheckbox();
                if (selectedCheckbox != null) {
                    selectionLabel.setText("Selected option: " + selectedCheckbox.getLabel());
                }
            }
        };

        checkbox1.addItemListener(itemListener);
        checkbox2.addItemListener(itemListener);
        checkbox3.addItemListener(itemListener);

        // Create a Panel for checkboxes
        Panel checkboxPanel = new Panel();
        checkboxPanel.setLayout(new FlowLayout());
        checkboxPanel.add(checkbox1);
        checkboxPanel.add(checkbox2);
        checkboxPanel.add(checkbox3);

        // Create a Panel for selection label
        Panel labelPanel = new Panel();
        labelPanel.setLayout(new FlowLayout());
        labelPanel.add(selectionLabel);

        // Add panels to the frame
        frame.add(checkboxPanel, BorderLayout.CENTER);
        frame.add(labelPanel, BorderLayout.SOUTH);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set frame size and make it visible
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}

//-------------------------------------------------------------------------------------------------------

	// Using Checkbox 
import java.awt.*;
import java.awt.event.*;

public class CheckboxExample {
    private Frame frame;
    private CheckboxGroup checkboxGroup;

    public CheckboxExample() {
        frame = new Frame("Checkbox Example");

        // Create Checkboxes
        Checkbox checkbox1 = new Checkbox("Option 1",  false);
        Checkbox checkbox2 = new Checkbox("Option 2",  false);
        Checkbox checkbox3 = new Checkbox("Option 3",  false);

        // Create a Label to display selected option
        Label selectionLabel = new Label("Selected option: ");

        // Add ItemListener to handle checkbox selection change
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Checkbox selectedCheckbox = (Checkbox)e.getSource();
                if (selectedCheckbox != null) {
                    selectionLabel.setText("Selected option: " + selectedCheckbox.getLabel());
                }
            }
        };

        checkbox1.addItemListener(itemListener);
        checkbox2.addItemListener(itemListener);
        checkbox3.addItemListener(itemListener);

        // Create a Panel for checkboxes
        Panel checkboxPanel = new Panel();
        checkboxPanel.setLayout(new FlowLayout());
        checkboxPanel.add(checkbox1);
        checkboxPanel.add(checkbox2);
        checkboxPanel.add(checkbox3);

        // Create a Panel for selection label
        Panel labelPanel = new Panel();
        labelPanel.setLayout(new FlowLayout());
        labelPanel.add(selectionLabel);

        // Add panels to the frame
        frame.add(checkboxPanel, BorderLayout.CENTER);
        frame.add(labelPanel, BorderLayout.SOUTH);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set frame size and make it visible
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}


//---------------------------------------------------------------------------------------------------------------

	// Using Choice and List

import java.awt.*;
import java.awt.event.*;

public class ChoiceAndListExample {
    private Frame frame;
    private Choice choice;
    private List list;

    public ChoiceAndListExample() {
        frame = new Frame("Choice and List Example");

        // Create Choice
        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Create List
        list = new List(3); // Maximum visible rows in the list
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 8");
        list.add("Item 9");

        // Create Label to display selection
        Label selectionLabel = new Label("Selected item: ");

        // Add ItemListener to Choice
        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                selectionLabel.setText("Selected item: " + choice.getSelectedItem());
            }
        });

        // Add ItemListener to List
        list.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                selectionLabel.setText("Selected item: " + list.getSelectedItem());
            }
        });

        // Create Panels for Choice, List, and Label
        Panel choicePanel = new Panel(new BorderLayout());
        choicePanel.add(choice, BorderLayout.NORTH);

        Panel listPanel = new Panel(new BorderLayout());
        listPanel.add(list, BorderLayout.CENTER);

        Panel labelPanel = new Panel(new FlowLayout());
        labelPanel.add(selectionLabel);

        // Add Panels to the Frame
        frame.setLayout(new GridLayout(1, 3));
        frame.add(choicePanel);
        frame.add(listPanel);
        frame.add(labelPanel);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ChoiceAndListExample();
    }
}

//-------------------------------------------------------------------------------------------------------------------------

		Using Scrollbar, TextArea, and TextField
import java.awt.*;
import java.awt.event.*;

public class ScrollbarTextAreaTextFieldExample {
    private Frame frame;
    private Scrollbar scrollbar;
    private TextArea textArea;
    private TextField textField;

    public ScrollbarTextAreaTextFieldExample() {
        frame = new Frame("Scrollbar, TextArea, and TextField Example");

        // Create Scrollbar
        scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100);

        // Create TextArea
        textArea = new TextArea(10, 30);

        // Create TextField
        textField = new TextField(30);

        // Add AdjustmentListener to Scrollbar
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textArea.setFont(new Font("Arial", Font.PLAIN, e.getValue()));
            }
        });

        // Add ActionListener to TextField
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textArea.append(text + "\n");
                textField.setText("");
            }
        });

        // Create Panels for Scrollbar, TextArea, and TextField
        Panel scrollbarPanel = new Panel();
        scrollbarPanel.add(scrollbar);

        Panel textAreaPanel = new Panel();
        textAreaPanel.add(textArea);

        Panel textFieldPanel = new Panel();
        textFieldPanel.add(textField);

        // Add Panels to the Frame
        frame.setLayout(new BorderLayout());
        frame.add(scrollbarPanel, BorderLayout.EAST);
        frame.add(textAreaPanel, BorderLayout.CENTER);
        frame.add(textFieldPanel, BorderLayout.SOUTH);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollbarTextAreaTextFieldExample();
    }
}


//-------------------------------------------------------------------------------------------------------------------------

	// Using MenuBar, Menu, and MenuItem

import java.awt.*;
import java.awt.event.*;

public class MenuBarMenuMenuItemExample {
    private Frame frame;

    public MenuBarMenuMenuItemExample() {
        frame = new Frame("MenuBar, Menu, and MenuItem Example");

        // Create MenuBar
        MenuBar menuBar = new MenuBar();

        // Create Menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        // Create MenuItems for File Menu
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Create MenuItems for Edit Menu
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        // Create MenuItem for Help Menu
        MenuItem aboutItem = new MenuItem("About");

        // Add ActionListeners to MenuItems
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("New File action performed");
            }
        });

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open File action performed");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save File action performed");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cut action performed");
            }
        });

        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Copy action performed");
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Paste action performed");
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("About action performed");
            }
        });

        // Add MenuItems to Menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        // Add Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set MenuBar to the Frame
        frame.setMenuBar(menuBar);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuBarMenuMenuItemExample();
    }
}

//-----------------------------------------------------------------------------------------------------------------------

	// Using MouseEvents

import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener, MouseMotionListener {
    private Label statusLabel;

    public MouseEventExample() {
        setTitle("Mouse Events Example");

        // Create a label to display mouse event status
        statusLabel = new Label("Mouse status will be displayed here.");
        add(statusLabel, BorderLayout.SOUTH);

        // Add mouse listeners to the frame
        addMouseListener(this);
        addMouseMotionListener(this);

        // Add window listener to handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(400, 300);
        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
		System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        statusLabel.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        statusLabel.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }F
}
