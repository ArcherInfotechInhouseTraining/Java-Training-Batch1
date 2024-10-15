
/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *


class StarPattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<=4+i;j++)
			{	
				if(j>=4-i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();	
		}
	}
}


*/
///==========================================================================================================================
/*
    *
   * *
  * * *
 * * * *
* * * * *

class StarPattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{	
				if(j>=4-i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	}
}

*/
//===============================================================================================================================

/*

*
 *
* *
 * *
* * *
 * * *
* * * *
 * * * *
* * * * *
 * * * *
* * * *
 * * *
* * *
 * *
* *
 *
*


class StarPattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<17;i++)
		{
			for(j=0;j<9;j++)
			{	
				if(i<9 && j<=i)
				{
					if( (i%2==0 && j%2==0) || (i%2!=0 && j%2!=0) )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
				else if(j<=16-i && i>8)
				{
				 	if( (i%2==0 && j%2==0) || (i%2!=0 && j%2!=0) )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();	
		}
	}
}

*/


///============================================================================
/*

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*


class StarPattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<10;i++)
		{
			for(j=0;j<5;j++)
			{	
				if(j<=i && i<5)
				{
					System.out.print("* ");
				}
				else if(j<9-i && i>4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	}
}

*/

///===============================================================================================

/*

     1
    2 2 2
   3 3 3 3 3
  4 4 4 4 4 4 4
 5 5 5 5 5 5 5 5 5
6 6 6 6 6 6 6 6 6 6 6


class StarPattern
{

	public static void main(String []args)
	{
		int i,j;
		
		for(i=0;i<6;i++)
		{
			for(j=0;j<6+i;j++)
			{
				if(j>=5-i && j<=5+i)
				{
					System.out.print(+i+1+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

*/

///===============================================================

/*

     A
    ABC
   ABCDE
  ABCDEFG
 ABCDEFGHI
ABCDEFGHIJK

 class StarPattern
{

	public static void main(String args[])
	{
		int i,j;
		char a;
		for(i=0;i<6;i++)
		{
			a='A';
			for(j=0;j<=6+i;j++)
			{
				if(j>=(5-i) && j<= (5+i))
				{
					System.out.print(a);
					a++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}

*/

///=================================================================================================

















