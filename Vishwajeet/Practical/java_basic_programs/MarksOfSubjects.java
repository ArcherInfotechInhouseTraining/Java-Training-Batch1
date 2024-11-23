import java.util.*;
class MarksOfSubjects
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;

		System.out.println("Enter the number of students:");
		int stud=sc.nextInt();
		int [][]marks=new int[stud][];
		System.out.println("Enter the marks "+stud+" students");
		for(i=0;i<stud;i++)
		{
			System.out.println("Enter the subject count of student "+(i+1)+" :");
			int subs=sc.nextInt();
			marks[i]=new int[subs];
			System.out.println("Enter the marks obtained in "+subs+" subjects");
			for(j=0;j<subs;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n Marks list \n");
		for(i=0;i<marks.length;i++)
		{
			System.out.print("\n Student "+(i+1)+": ");
			for(j=0;j<marks[i].length;j++)
			{
				System.out.print(" "+marks[i][j]);
			}
		}
	}

}