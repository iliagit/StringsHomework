import java.util.Scanner;
public class Loops {
	public static void main(String [] args){
	/*	int i;
		for( i=1;i<=10;i++){
			System.out.println(i+" "+i*i);
			
		}
		*/	
	/*Scanner input = new Scanner(System.in);
	System.out.println("Enter a: ");
	int a =input.nextInt();
	System.out.println("Enter b: ");
	int b =input.nextInt();
	
	for(int i = a;i<=b;i++){
		System.out.println(i+" "+i*i);
	}*/
	

		int rightWeightSum = 0;
		int leftWeightSum = 0;
		int leftWeight;
		int rightWeight;
		Scanner input1 = new Scanner(System.in);

		while (true) {
			System.out.println("Enter left weight: ");
			leftWeight = input1.nextInt();
			System.out.println("Enter right weight: ");
			rightWeight = input1.nextInt();
			rightWeightSum = rightWeightSum + rightWeight;
			System.out.println("rightWeightSum: " + rightWeightSum);
			leftWeightSum = leftWeightSum + leftWeight;
			System.out.println("leftWeightSum: " + leftWeightSum);
			if (leftWeightSum == rightWeightSum)break;
				// {
			//	System.exit(0);
			}
		}
	}



