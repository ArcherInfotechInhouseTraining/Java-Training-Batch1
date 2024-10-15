package intechOlympiad;

public class ProblemStatement_PallaviJadhav_Assignment1 {
	private static final String generateCorrectAnswer = null;

	/**
	 * Problem statement=Factors of P(x)=2x^2-2x-12
	 */
	
	 static // Followings are global variables to get question with options and solution 
	String questionWithOptions = "";
	String solution = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProblemStatement_PallaviJadhav_Assignment1 template = new ProblemStatement_PallaviJadhav_Assignment1();

		template.run();

	}
	

	// This functions returns the question statement with options and solution
	public void run() {
		int a = 2;
		int b = -2;
		int c = -12;
		double secondRoot = 0;
		double firstRoot = 0;
		

		// This functions returns the question statement with options and solution
		 
		  // use global variable questionWithOptions to assign the output of the generateProblemStatementWithOptions() functions
		questionWithOptions = generateProblemStatementWithOptions(a,b,c,firstRoot,secondRoot);

		
			// use global variable solution to assign the output of the generateSolutionText() functions
		solution = generateSolutionText(a,b,c,firstRoot,secondRoot);
		System.out.println(solution);
	}

	
	// Change the number of parameters to this method depending on nature of your question
	public static String getQuestionStatement(int a,int b,int c,double firstRoot,double secondRoot) {

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
	

	
	public static String generateCorrectAnswer(int a,int b,int c,double firstRoot,double secondRoot) {

	      double determinant = (b*b)-(4*a*c);
	      double sqrt = Math.sqrt(determinant);
	      if(determinant>0) {
	    	   firstRoot = (-b + sqrt)/(2*a);
	    	   secondRoot = (-b - sqrt)/(2*a);
	    	   System.out.println("$ Roots are :: "+ firstRoot +" and "+secondRoot);
	    	   
	      }
	      else if(determinant==0) {
	    	  System.out.println("$ Root is ::"+ (-b + sqrt)/(2*a));
	      }
	      else {
	    	  System.out.println("Roots are not real");
	      }
	      
	      
	      return generateCorrectAnswer;
	      
	
		// This function returns one or more correct answers
		// Each question should have at least one correct answer
		// Each option should have all information in English as well as one more language other than English.

	}

	


	// Change the number of parameters to this method depending on nature of your question
	public static String wrongOption1(int a,int b,int c,double firstRoot,double secondRoot) {
		
		
	
		// Write an algorithm which will have mistake in the logic and hence will generate wrong option
		double determinant = (b*b)+(4*a*c);
	      double sqrt = Math.sqrt(determinant);
	      if(determinant>0) {
	    	   firstRoot = (b + sqrt)/(2*a);
	    	   secondRoot = (b - sqrt)/(2*a);
	    	   System.out.println("$ Roots are :: "+ firstRoot +" and "+secondRoot);
	    	   
	      }
	      else if(determinant==0) {
	    	  System.out.println("$ Root is ::"+ (b + sqrt)/(2*a));
	      }
	      else {
	    	  System.out.println("Roots are  real");
	      }
		return questionWithOptions;
	      
	      
		
		
		// Should include a option leading to wrong answers.
		// Each option should have a mistake in only one step of the correct solution.
		// Discard a option where wrong answer is equal to the correct answer.
		// Each option should have all information in English as well as one more language other than English.
		// This function returns 1st wrong option 

	}

	


	// Change the number of parameters to this method depending on nature of your question
	public static String wrongOption2(int a,int b,int c,double firstRoot,double secondRoot) {

		// Write an algorithm which will have another mistake in the logic and hence will generate another wrong option
		// Should include a option leading to wrong answers.
		double determinant = (b*b)-(4*a*c);
	      double sqrt = Math.sqrt(determinant);
	      if(determinant>0) {
	    	   firstRoot = (-b + sqrt)/(2*b);
	    	   secondRoot = (-b + sqrt)/(2*b);
	    	   System.out.println("$ Roots are :: "+ firstRoot +" and "+secondRoot);
	    	   
	      }
	      else if(determinant==0) {
	    	  System.out.println("$ Root is ::"+ (-b + sqrt)/(2*b));
	      }
	      else {
	    	  System.out.println("Roots are  real");
	      }
	      
	      return questionWithOptions;
	      
	      	
		
		
		// Each option should have a mistake in only one step of the correct solution
		// Discard a option where wrong answer is equal to the correct answer
		// Each option should have all information in English as well as one more language other than English.
		// This function returns 2nd wrong option 
	
	}
	
	


	// Change the number of parameters to this method depending on nature of your question
	public static String wrongOption3(int a,int b,int c,double firstRoot,double secondRoot) {
		
		// Write an algorithm which will have another mistake in the logic and hence will generate another wrong option
		// Should include a option leading to wrong answers.
		double determinant = (b*b)-(4*a*c);
	      double sqrt = Math.sqrt(determinant);
	      if(determinant>0) {
	    	   firstRoot = (-b + sqrt)/(2*a);
	    	   secondRoot = (-b + sqrt)/(2*a);
	    	   System.out.println("$ Roots are :: "+ firstRoot +" and "+secondRoot);
	    	   
	      }
	      else if(determinant==0) {
	    	  System.out.println("$ Root is ::"+ (-b + sqrt)/(2*a));
	      }
	      else {
	    	  System.out.println("$ Roots are  real");
	      }
	      return questionWithOptions;
	      
	      
		// Each option should have a mistake in only one step of the correct solution.
		// Discard a option where wrong answer is equal to the correct answer.
		// Each option should have all information in English as well as one more language other than English.
		// This function returns 3rd wrong option 
		

	}



	// Change the number of parameters to this method depending on nature of your question
	public static String generateSolutionText(int a, int b, int c,double firstRoot,double secondRoot) {
		String CorrectAns = generateCorrectAnswer( a, b, c, firstRoot,secondRoot);

		// This function prints the solution text
		// Each question should have automatically generated solution explanation
		//This is where you can get the correct answer by calling the generateCorrectAnswers() function instead of writing the same logic to get correct again
		
		String Solution = "<br>Solution: first we have to find out determinant of our equation so Formula  for $ determinant = (b*b)-(4*a*c) $ Now to find out Roots we have to take Square root of our determinant,After taking Square Root we find our first and second Root.\n formula for $ firstRoot=(-b + sqrt)/2*a $ and for $ secondRoot = (-b - sqrt)/2*a $ <br> \n From given data we have $ a= " + a +"\"+ b = "+ 	b + " and +\"+ c = " + c + "factors are... is asked. <br> \\\\therefore $ firstRoot=(-b + sqrt)/2*a $,and $ secondRoot=(-b - sqrt)/2*a $" + "+ a + b + c+ \"=\" + correctAns\r\n"
				+ "		+ \"$ is the answer \";";
		return Solution;
	}

	
	// This function prints the problem statement with options
	private static String generateProblemStatementWithOptions(int a, int b, int c,double firstRoot,double secondRoot) {

		
		// Generate Problem Statement With Options here
		String output = "$ Question :" + getQuestionStatement(a,b,c,firstRoot,secondRoot) + "<br>Correct Options :<br>" + generateCorrectAnswer(a, b, c,firstRoot,secondRoot) + "<br>Wrong Options :<br>"+ wrongOption1(a, b, c,firstRoot,secondRoot) + "<br>" + wrongOption2(a, b, c,firstRoot,secondRoot) + "<br>" + wrongOption3(a, b, c,firstRoot,secondRoot) ;
		return output;

	}

}
