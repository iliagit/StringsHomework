
import java.util.*;
class ArithmeticOperations{
	
	public static void main(String[]args){
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("Enter no of hourseWorked: ");
		double hoursWorked = input1.nextDouble();
		System.out.print("Enter payRate: ");
		double payRate = input1.nextDouble();
		
		double salary = hoursWorked*payRate;
		System.out.println("The total salary of the part time employee is: " + salary);
	
	
	//Exercise 2
		System.out.println("\n Exercise 2");
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the value of x as integer: ");
		int x = input2.nextInt();
		double result = ((3*Math.pow(x, 2))-(8*x)+4);
		System.out.println("Value of x is: "+result);
	
	//Exercise 3
		System.out.println("\n Exercise 3");
		Scanner input3 = new Scanner(System.in);
		
		System.out.println("Enter values of a, b and c");
		double a = input3.nextDouble();
		double b = input3.nextDouble();
		double c = input3.nextDouble();
	
		double d =  b*b -4*a*c;
		
		if(d<0){
			System.out.println("Roots are imaginary");
		}
		else{
			
			double root1 = (-b-Math.sqrt(d))/(2*a);
			double root2 = (-b+Math.sqrt(d))/(2*a);
			System.out.println("Roots of quadratic equations are: "+root1+"  "+root2);
		}
	
	//Exercise 4
	System.out.println("\n Exercise 4");
		int sub1 = 50;
		int sub2 = 30;
		int sub3 = 40;
		int sub4 = 70;
		int sub5 = 95;
		int sub6 = 100;
		
		int totalMarks = sub1+sub2+sub3+sub4+sub5+sub6;
		System.out.println("TotalMarks is:  "+totalMarks);
		
		double average = (totalMarks/6);
		System.out.println("Average marks is: "+average);

	
	//Exercise 5
		
		System.out.println("\n Exercise 5");
		

		for (int j = 0; j < 3; j++) {
			int total = 0;
			double average1 = 0;
			Scanner input5 = new Scanner(System.in);
			int[] subject = new int[6];
			for (int i = 0; i < subject.length; i++) {
				System.out.print("Please enter marks for the subject" + i + ":");
				subject[i] = input5.nextInt();
				total = total + subject[i];
			}

			System.out.println("Total marks for the student is: " + total);
			average = total / (subject.length);
			System.out.println("Average marks for students is: " + average1);

		}
	}

}

/*
 *Exercise 1:	
Create a payroll program for the part-time employee. 
display no of hours he/she worked, pay rate value and pay rate per month.
Input: no of hours he/she worked and pay rate value per hour
output: display both input values and salary of the person per month
Hint: create 3 double variables hoursWorked, pay rate and use multiplication operation

Exercise 2:
Find result for the following quadratic equation
a quadratic equation is 3*X^2 - 8*X + 4
give different values to X and run the program and display the result
Input: integer value for x
Output: result after substituting the x value.
e.g: 
input: 1
output: -1 
explanation: 3*1*1 - 8*1 + 4 = -1

Exercise 3:
FFind roots for the following quadratic equation.
The quadratic equation is a*X^2 - b*X + c
give different values to a,b and c. Find roots by using formula. (-b +/- sqrt(b^2 - 4*a*c) / 4* a*c)
If roots are imaginary then display no roots.
check with value 1, 5,6 and 2,3,2

Exercise 4:
Your university asked you to develop a java application to calculate the average of the student's performance. 
Create 6 int variables sub1,sub2,...sub6. give some values to subjects and find the total marks and average of the student

Exercise 5:
Repeat the above program for 3 students
hint: don't run 3 time - use loop to run 3 times 
 
 */
