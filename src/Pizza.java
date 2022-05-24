/**
 * Program for pizza order
 * 
 * This program basically is helps the user to order a pizza it is basically an 
 * digital menu where user is allowed to order certain flavour of pizza such as 
 * in this program you can order Margherita, Cheese and Sausage. 
 * Then after you are given a option to choose the size and price is set accordingly.
 * Then after you are given option to add chessy breads or not.
 * Then in  the final you are given a summary of menu is printed to the user.
 * 
 * Zoyace Shrestha
 * CS-120 Section 2
 * Fall 2019
 * 
 * Programming Assignment 3
 * 30th September, 2019
 * 
 */
//Importing 
import java.util.Scanner;

//Making a class name pizza
public class Pizza {
	@SuppressWarnings("resource")
	public static void  main (String[] args ) {
		
		//DECLARATION OF STRINGS, INTEGER & DOUBLE.
		
		char pizzaType;
		int pizzaSizeC;
		int pizzaSizeM;
		int pizzaSizeS;
		int numPizza;
		double totalCost;
		char chzBread;
		int finalSize;
		String flavour;
		String cheeseBread;
		
		//Initializing integers to Zero
		
		pizzaSizeC = 0;
		pizzaSizeM = 0;
		pizzaSizeS = 0;
		numPizza = 0;
		totalCost = 0.000;
		chzBread = 0;
		
		//Introduction Order
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to Java and a Slice Pizza Parlour.");
		System.out.print("PLease enter your name for transaction process: " );
		String name = scnr.next();
		System.out.println("Thank you, " + name);
		System.out.println("Which pizza would you like?");
		System.out.println("-------------------------------");
		
		//Pizza Type
		
		System.out.println ("     [C] Classic Cheese");
		System.out.println("     [M] Margherita");
		System.out.println ("     [S] Sausage");
		System.out.println("-------------------------------");
		
		//Choosing Pizza
		
		System.out.println("PLease Enter Pizza Choice : ");
		pizzaType = scnr.next().charAt(0);
		
		// 1 ) Cheese Pizza
		
		if (pizzaType == 'C' || pizzaType == 'c')  {
			
			System.out.println("Price list for Cheese Pizza ");
			System.out.println("-------------------------------");
			System.out.println(" 12 inch : $9.50 ");
			System.out.println(" 16 inch : $13.50 ");
			System.out.println("-------------------------------");
			System.out.println(" ");
			System.out.println("What size pizza would you like?");
			pizzaSizeC = scnr.nextInt();
			System.out.println("Your pizza size is : " + pizzaSizeC);
			finalSize = pizzaSizeC;
			flavour = "Classic Cheese" ;
		
		}
		
		
		// 2 ) Margherita Pizza 
		
		else if (pizzaType == 'M' || pizzaType == 'm') {
			
			System.out.println("Price list for Magarita Pizza ");
			System.out.println("-------------------------------");
			System.out.println(" 12 inch : $11.50 ");
			System.out.println(" 16 inch : $15.50 ");
			System.out.println("-------------------------------");
			System.out.println(" ");
			System.out.println("What size pizza would you like?");
			pizzaSizeM = scnr.nextInt();
			System.out.println("Your pizza size is : " + pizzaSizeM);
			finalSize = pizzaSizeM;
			flavour = "Margherita Pizza";
				
		}
		
		// 3 ) Sausage Pizza
		
		else if (pizzaType == 'S' || pizzaType == 's') {
			
			System.out.println("Price list for Sausage Pizza");
			System.out.println("-------------------------------");
			System.out.println(" 12 inch : $12.50 ");
			System.out.println(" 16 inch : $16.50 ");
			System.out.println("-------------------------------");
			System.out.println(" ");
			System.out.println("What size pizza would you like?");
			pizzaSizeS = scnr.nextInt();
			System.out.println("Your pizza size is : " + pizzaSizeS);
			finalSize = pizzaSizeS;
			flavour = "Sausage Pizza";
				
		}
		
		// If other pizza besides C, M, S.
		
		else {
			
			System.out.println("I am sorry " + name + " we do not have that pizza");
			return;
		
		}
		
		// Choosing Size For Cheese
		
		if ( ( pizzaSizeC == 12 )  && ( pizzaType == 'c' || pizzaType == 'C') )  {
			totalCost = totalCost + 9.50;
			
		}
		
		else if ( (pizzaSizeC == 16 ) && ( pizzaType == 'c' || pizzaType == 'C') ){
			totalCost = totalCost + 13.50;
		}
		
		
		
		// Choosing Size For Margherita
		
		else if ( ( pizzaSizeM == 12 )  && ( pizzaType == 'm' || pizzaType == 'M') )  {
			totalCost = totalCost + 11.50;
			
		}
		
		else if ( (pizzaSizeM == 16 ) && ( pizzaType == 'm' || pizzaType == 'M') ){
			totalCost = totalCost + 15.50;
		}
		
		
		
		//Choosing Size For Sausage
		
		else if ( ( pizzaSizeS == 12 )  && ( pizzaType == 's' || pizzaType == 'S') )  {
			totalCost = totalCost + 12.50;
			
		}
		
		else if ( (pizzaSizeS == 16 ) && ( pizzaType == 's' || pizzaType == 'S') ){
			totalCost = totalCost + 16.50;
		}
		
		else {
			System.out.print(" I am sorry we dont have that.");
			return;
		}
			
			
		//Total Number of Pizza
		
		System.out.println("How many pizza would you like to have?");
			if (scnr.hasNextInt())
			{
				numPizza = scnr.nextInt();
			}
			
			if ( numPizza>=0 && numPizza<=13) {
				totalCost = totalCost * numPizza;
			}
			
			
			else {
				System.out.println("I am sorry " + name + " we cannot provide that amount of pizza");
				System.out.println("Goodbye.");
				return;
			}
		
			
			
		//Asking for Chessy Bread
			
			    System.out.println("Do you want Chezzy Bread or no ? ");
			    System.out.print("Please enter Yes(y) or No(n) : ");
			    if ( scnr.hasNext())
			    {
			    	chzBread = scnr.next().charAt(0);
			    }
			
			    if ( chzBread == 'y' || chzBread == 'Y')
			    {
				totalCost = totalCost + 3.00;
				System.out.println("You have added a Cheese Bread.");
				cheeseBread ="One order of cheese bread.";
			    }
			    
			    else if ( chzBread == 'n' || chzBread == 'N')
			    {
			    	totalCost = totalCost + 0.00;
			    	System.out.println("You did not add a Cheese Bread.");
			    	cheeseBread = "No cheese bread.";
			    }
			    
			    else 
			    {
			    	System.out.println( "Sorry " + name + "we didnt get you. Goodbye.");
			    	return;
			    } 
			    
			    
			//FINALIAZATION AND RECIEPTS
			    
			    System.out.println ("-------------------------------");
			    System.out.println("Thank you " + name + " for your purchase.");
			    System.out.println( "Here is a summary about your purchase.");
			    System.out.println ("-------------------------------");
			    System.out.println( numPizza + " " + finalSize +"-inch"  + " " + flavour );
			    System.out.println(cheeseBread);
			    System.out.println ("-------------------------------");
			    System.out.println("Total Cost : "+ "$" + totalCost);
			    System.out.println ("-------------------------------");
			    
		
			    scnr.close();
	}
	
}
