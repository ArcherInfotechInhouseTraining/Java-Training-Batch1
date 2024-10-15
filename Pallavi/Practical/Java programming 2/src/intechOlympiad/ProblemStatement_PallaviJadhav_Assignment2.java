package intechOlympiad;

public class ProblemStatement_PallaviJadhav_Assignment2 {
	private static final String generateCorrectAnswer = null;

	/**
	 * Problem statement=Factors of P(x)=2x^2-2x-12
	 */
	
	 static // Followings are global variables to get question with options and solution 
	String questionWithOptions = "";
	String solution = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProblemStatement_PallaviJadhav_Assignment2 template = new ProblemStatement_PallaviJadhav_Assignment2();

		template.run();

	}
	

	// This functions returns the question statement with options and solution
	public void run() {
		int a = 2;
		int b = -2;
		int c = -12;
		int m = 0;
		int n = 0;
		double x = 0;
//		double secondRoot = 0;
		double firstRoot = 0;
		

		// This functions returns the question statement with options and solution
		 
		  // use global variable questionWithOptions to assign the output of the generateProblemStatementWithOptions() functions
		questionWithOptions = generateProblemStatementWithOptions(a,b,c,m,n,x);

		
			// use global variable solution to assign the output of the generateSolutionText() functions
		solution = generateSolutionText(a,b,c,m,n,x);
		System.out.println(solution);
	}

	
	// Change the number of parameters to this method depending on nature of your question
	public static String getQuestionStatement2(int a,int b,int c,int m,int n, double x) {

		// This function prints the question statement
		// Each question should have different numbers data and solution
		// Each question should have all information in English as well as one more language other than English.
		
		String question = "Factors of $ P(x) a= "+ a +"b= "+ b +"c= "+ c +"are...$";
		return question;
	}
	

	// Change the number of parameters to this method depending on nature of your question
//	here we have a standard form of a quadratic equation is:
//   ax2 + bx + c = 0
//		Here, a, b, and c are real numbers and a can't be equal to 0.
//
//		We can calculate the root of a quadratic by using the formula:
//
//		x = (-b  squarerootof(b^2-4ac)) / (2a)
//		The +,- sign indicates that there will be two roots:
//
//		firstRoot = (-b + squarerootof(b2-4ac)) / (2a)
//		secondRoot = (-b - squarerootof(b2-4ac)) / (2a)
//		The term b^2-4ac is known as the determinant of a quadratic equation. It specifies the nature of roots. That is,
//
//		if determinant > 0, roots are real and different
//		if determinant == 0, roots are real and equal
//		if determinant < 0, roots are  complex and different
	
//	Here we solve our example using complete square method
	

	
	public static String generateCorrectAnswer(int a,int b,int c,int m,int n,double x) {
		double root;
		  ((a*x*x)+b*(x)) = c
		  root = ((a*x*x)+(b*x)+c)/2;
          double root1 = ((a*x*x)+(b*x)+((b/2*(a))^2)-((b/2*(a))^2)+c);
//		  m = (b/(2*a));
//		  n = c - ((b^2)/(4*a));
//		  double sqrt = Math.sqrt(n);
//	      x = (((-sqrt)/a)-m); 
//		  ax2 + bx + c = a(x + M)2 + n
          double sqrt = Math.sqrt(root1);
	      System.out.println("$ Roots are   :: "+sqrt);
//	      System.out.println("$ Roots are   :: ");
	      
	      
	      return generateCorrectAnswer;
	      
	
		// This function returns one or more correct answers
		// Each question should have at least one correct answer
		// Each option should have all information in English as well as one more language other than English.

	}

	


//	private static int sqrt(double root) {
//		 TODO Auto-generated method stub
//		return 0;
//	}


	// Change the number of parameters to this method depending on nature of your question
	public static String wrongOption1(int a,int b,int c,int m,int n,double x) {
		
		
	
		// Write an algorithm which will have mistake in the logic and hence will generate wrong option

		  m =(b/(2*a));
		  n = c - ((b^2)/(4*a));
		  double sqrt = Math.sqrt(n);
	      x = ((-sqrt/a)+m);
	      System.out.println("$ Roots are   :: "+x);
		return questionWithOptions;
	      
	      
		
		
		// Should include a option leading to wrong answers.
		// Each option should have a mistake in only one step of the correct solution.
		// Discard a option where wrong answer is equal to the correct answer.
		// Each option should have all information in English as well as one more language other than English.
		// This function returns 1st wrong option 

	}

	


	// Change the number of parameters to this method depending on nature of your question
	public static String wrongOption2(int a,int b,int c,int m,int n,double x) {

		// Write an algorithm which will have another mistake in the logic and hence will generate another wrong option
		// Should include a option leading to wrong answers.

		  m =(b/(2*a));
		  n = c - ((b^2)/(4*a));
		  double sqrt = Math.sqrt(n);
	      x = ((-sqrt/a)-m);
	      System.out.println(x);
	      
	      return questionWithOptions;
	      
	      	
		
		
		// Each option should have a mistake in only one step of the correct solution
		// Discard a option where wrong answer is equal to the correct answer
		// Each option should have all information in English as well as one more language other than English.
		// This function returns 2nd wrong option 
	
	}
	
	


	// Change the number of parameters to this method depending on nature of your question
	public static String wrongOption3(int a,int b,int c,int m,int n,double x) {
		
		// Write an algorithm which will have another mistake in the logic and hence will generate another wrong option
		// Should include a option leading to wrong answers.
		  m =(b/(2*a));
		  n = c + ((b^2)/(4*a));
		  double sqrt = Math.sqrt(n);
	      x = ((-sqrt/a)-m);
	      System.out.println("$ Roots are   :: "+x);
	      return questionWithOptions;
	      
	      
		// Each option should have a mistake in only one step of the correct solution.
		// Discard a option where wrong answer is equal to the correct answer.
		// Each option should have all information in English as well as one more language other than English.
		// This function returns 3rd wrong option 
		

	}



	// Change the number of parameters to this method depending on nature of your question
	public static String generateSolutionText(int a, int b, int c,int m,int n,double x) {
		String CorrectAns = generateCorrectAnswer( a, b, c, m, n, x );

		// This function prints the solution text
		// Each question should have automatically generated solution explanation
		//This is where you can get the correct answer by calling the generateCorrectAnswers() function instead of writing the same logic to get correct again
		
		String Solution = "<br>Solution: first we have to find out m , $ m = b/2*a $ and also n,$ n =   c - (b^2/4a)"
				+ "		+ \"$ is the answer \";";
		return Solution;
	}

	
	// This function prints the problem statement with options
	private static String generateProblemStatementWithOptions(int a, int b, int c,int m,int n,double x) {

		
		// Generate Problem Statement With Options here
		String output = "$ Question :" + getQuestionStatement2(a,b,c,m,n,x) + "<br>Correct Options :<br>" + generateCorrectAnswer(a, b, c,m,n,x) + "<br>Wrong Options :<br>"+ wrongOption1(a, b, c,m,n,x) + "<br>" + wrongOption2(a, b, c,m,n,x) + "<br>" + wrongOption3(a, b, c,m,n,x) ;
		return output;

	}


	private static String getQuestionStatement(int a, int b, int c, int m, int n, double x) {
		// TODO Auto-generated method stub
		return null;
	}

}
