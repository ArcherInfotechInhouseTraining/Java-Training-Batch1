 // WAP to input and display the marks obtained to 3 students in different subjects.

import java.util.*;
class MarksOfThreeInNSubjects
{
	public static void main(String []args)
	{
		/*
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

		System.out.println();
		*/

		int i,j;

		for(i=0;i<11;i++)
		{
			for(j=0;j<11;j++)
			{
				if(j>=(10-i))
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
