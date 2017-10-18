import java.util.Scanner;

public class Shop {
	public static void main(String [] args){
		/*System.out.print("Please enter the price of the item: ");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();

		double discount;
		double finalPrice;
		if(price>=10){
			System.out.println("price is: "+price);
			discount = (5/100.00)*price; //if i use 5/100 it will consider 100 as integer
			finalPrice = price-discount;
			System.out.println("Price after discount is: "+ finalPrice);
		}
		else{
			System.out.println("Sorry purchase has to be over $10 to get a discount");
		}*/
	
		System.out.print("Please enter the number of cookies: ");
		Scanner cookies = new Scanner(System.in);
		double cookiesCount = cookies.nextDouble();
		
		System.out.print("Please enter the number of cakes: ");
		Scanner cakes = new Scanner(System.in);
		double cakesCount = cakes.nextDouble();
	   
		double totalAmount = cookiesCount*5+cakesCount*3;
		System.out.println("total price of cookies and cakes: "+totalAmount);
		double discount1 = (5/100.00)*totalAmount;
		if (totalAmount>10){
			System.out.println("Discount amount is: "+discount1);
		}
		else{
			System.out.println("totalAmount should be more than $10 to get a discount");
		}
		
	}

}



/*
 * There is a small shop near my home. I know the owner of the shop. He wants to increase his sales, 
 * so he added a new discount policy to attract the customers. He came to my house and asked me to develop a small software. 
 * I am busy with my work, can you guys please help me to develop the following functionalities.Thanks in advance.

Program 1:
Write a program which calculate the Discount(5%) price for an Item.
Note: take the item price from user and find 5% discount
Hint: Use Scanner class and nextDouble() method
 
Program 2:
Write a program which calculate the Discount(5%) price for an Item, where the discount applies to purchases over $10.00.
Note: take the item price from user and find 5% discount
Hit: use if statement

Program 3:
Write a program which calculate the Discount(5%) price for a collection of items, where the discount applies to purchases of total over $10.00. 
cost details:
    5 cents per a cookie
    3 cents per a cake
Note: take no.of cookies and no.of cakes from user and find 5% discount
Hit: use if statement and multiplication operation
 * 
 * 
 * 
 */
