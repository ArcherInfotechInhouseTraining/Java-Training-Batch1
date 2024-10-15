//Enter marks of n students in n subject

import java.util.Scanner;
class MarksOfNInNSubject 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the student count : ");
		int stud = sc.nextInt();

		int x[][] = new int[stud][];
		int i,j;

		System.out.println("Enter the marks for "+stud+" Students: ");

		for(i=0;i<stud;i++)
		{
			System.out.println("Enter the subject count for "+(i+1)+" student: ");
			int cnt = sc.nextInt();
			x[i] = new int[cnt];
			for(j=0;j<cnt;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}

		System.out.println("Display Student Marks : ");

		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
