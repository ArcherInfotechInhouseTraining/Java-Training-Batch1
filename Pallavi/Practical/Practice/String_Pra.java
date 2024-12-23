/*

Problem Statement
Find the next 15 leap years from the year passed as parameter to the findLeapYears() method. Include the year passed as parameter if it is a leap year. Implement the logic inside findLeapYears() method and return an int array containing all the leap years.

 

Test the functionalities using the main method of the Tester class.

[Hint: Any year which is divisible by 4 and not by 100 are leap years. Otherwise, any year which is divisible by 400 is also a leap year]

Sample Input and Output

Expected OP	   		 sampleInput

2000 ,2004,2008,2012                 2000
2016,2020,2024,2028
2032,2036,2040,2044
2048,2052,2056




1000,1008,1012,1016                   	1004
1020,1024,1028,1032
1036,1040,1044,1048
1052,1056,1060

	*/
	

public class String_Pra{
	
	public static int[] findLeapYears(int year){
       //Implement your code here and change the return value accordingly
       int[] leap = new int[15];
       int j=0;
       
       for(int i=0; ;i++){
           if( (year%4==0 && year%100!=0) || year%400==0 ){
               leap[j]=year;
               j++;
           }
           if(j==15){
               return leap;
           }
           year++;
       }
       
        
   }
	public static void main(String []args) {
		int year = 2000;
	   int[] leapYears;
	   leapYears=findLeapYears(year);
	   for ( int index = 0; index<leapYears.length; index++ ) {
	       System.out.println(leapYears[index]);
	   }
	}
}


//=================================================
/*
import java.util.*;

public class String_Pra
{
	public static int romanToInt(String s) {

		int i, num=0;
		for(i=0; i<s.length(); i++){

			if( (i < (s.length()-1) ) && i>0)
			{

				if( (s.charAt(i) == 'I' && (s.charAt(i+1) != 'V' && s.charAt(i+1) != 'X') ) ){
					num+=1;
				}

				else if( s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
					num+=4;
				}

				else if( ( (s.charAt(i) == 'V') && s.charAt(i-1) != 'I') && i>0 ){
					num+=5;
				}

				else if( (s.charAt(i) == 'X') && ( (s.charAt(i-1) != 'I') && (s.charAt(i+1) != 'L') && (s.charAt(i+1) != 'C') ) ){
					num+=10;
				}
				else if( (s.charAt(i) == 'I') && s.charAt(i+1) == 'X'){
					num+=9;
				}
				else if( (s.charAt(i) == 'L') && s.charAt(i-1) == 'X'){
					num+=40;
				}
				else if( (s.charAt(i) == 'C') && s.charAt(i-1) == 'X'){
					num+=90;
				} 
				else if( s.charAt(i) == 'D' && (s.charAt(i-1) == 'C') ){
					num+=400;
				} 
				else if( s.charAt(i) == 'M' && (s.charAt(i-1) == 'C') ){
					num+=900;
				} 
				else if( s.charAt(i) == 'D' && (s.charAt(i-1) != 'C') ){
					num+=500;
				} 
				else if( s.charAt(i) == 'M' && (s.charAt(i-1) != 'C') ){
					num+=1000;
				} 


			}

			else if( i == (s.length() - 1) ){
				if( s.charAt(i) == 'I' ){
					num+=1;
				}
				else if( s.charAt(i) == 'I' &&  (s.charAt(i+1) == 'V') ) {
					num+=4;
				}
				else if( s.charAt(i) == 'V' && (s.charAt(i-1) != 'I') ){
					num+=5;
				}
				else if( (s.charAt(i) == 'X' && (s.charAt(i-1) != 'I') ) ){
					num+=10;
				}
				else if( s.charAt(i) == 'L' && (s.charAt(i-1) == 'X') ){
					num+=40;
				} 
				else if( s.charAt(i) == 'C' && (s.charAt(i-1) == 'X') ){
					num+=90;
				} 
				else if( s.charAt(i) == 'D' && (s.charAt(i-1) == 'C') ){
					num+=400;
				} 
				else if( s.charAt(i) == 'M' && (s.charAt(i-1) == 'C') ){
					num+=900;
				} 
				else if( s.charAt(i) == 'D' && (s.charAt(i-1) != 'C') ){
					num+=500;
				} 
				else if( s.charAt(i) == 'M' && (s.charAt(i-1) != 'C') ){
					num+=1000;
				} 
			}

			else if( i==0 ){

				if( s.charAt(i) == 'I' && ( (s.charAt(i+1) != 'X') || (s.charAt(i+1) != 'V') )){
					num+=1;
				}
				else if( s.charAt(i) == 'I' &&  (s.charAt(i+1) == 'V') ) {
					num+=4;
				}
				else if( s.charAt(i) == 'V' ){
					num+=5;
				}
				else if( (s.charAt(i) == 'X') ){
					num+=10;
				}
				else if( s.charAt(i) == 'I' && (s.charAt(i+1) == 'X') ){
					num+=9;
				}
				else if( s.charAt(i) == 'L'){
					num+=50;
				}
				else if( s.charAt(i) == 'C'){
					num+=100;
				}
				else if( s.charAt(i) == 'D'){
					num+=500;
				}
				else if( s.charAt(i) == 'M'){
					num+=1000;
				}

			}
			
			
			
			
		}

		return num;
        
    }

	public static void main( String[] args){

		String str;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any string: ");
		str = sc.nextLine();

		System.out.println(" string: "+str);

		int num = romanToInt(str);

		System.out.println("Num is: "+num);


	}
}
*/