//StudentApp
import java.util.Scanner;

public class Library {

	public static void main(String[] args){

		String name = null;
		String book1t = null;
		String book2t = null;
		String book3t = null;
		String book1a = null;
		String book2a = null;
		String book3a = null;
		
		String newP = null;
		String newB = null;
		int booksH = 0;
		String nb1 = null;
		String nb2 = null;
		String nb3 = null;
		
		String function = null;
		int checkBook1 = 0;
		int checkBook2 = 0;
		
		String response = null;
		int Response = 0;
		String response2 = null;
		int Response2 = 0;
		
		String stb1 = "Percy Jackson";
		String sab1 = "Rick Riordan";
		String stb2 = "Harry Potter";
		String sab2 = "J.K. Rowling";
		String stb3 = "Fundamentals of Java";
		String sab3 = "Kenneth A. Lambert";
		String stb4 = "The Oddessy";
		String sab4 = "Homer";
		String stb5 = "Animal Farm";
		String sab5 = "George Orwell";
		String nbt1 = null;
		String nba1 = null;
		
		Patron patron1 = new Patron();
		patron1.bookCount(1);
		Scanner reader = new Scanner(System.in);
		
		int BookCnt = 1;
		String nbk2 = null;
		String Return = null;
		
		//patron1.storedBooks(stb1, stb2, stb3, stb4, stb5, sab1, sab2, sab3, sab4, sab5, nbt1, nba1);
		
		//int numerator = 0;
		//int denominator = 0;

		System.out.println("Hello, what is your name: ");
		name = reader.nextLine();	
		patron1.setName(name);
		
		System.out.println("If you would like to checkout, type 'Checkout Book', If you want to add a book, type 'Add Book',");
		System.out.println("If you want to see the books we have, type 'See Books', If you want to return a book, type 'Return Book', ");
		System.out.println("If you want to see your borrowed books, type 'See Borrowed Books': ");
		function = reader.nextLine(); 
		
		/*if(function.equals("Add Patron")){
			
			System.out.print("Enter the Patron's name: ");
			name = reader.nextLine();
			patron1.setName(name);
			
			//System.out.println(name);
			
		}*/
		if(function.equals("Add Book")){
			
				
			
				System.out.println("Enter the title of the book: ");
				nbt1 = reader.nextLine();
				
				System.out.println("Enter the author of the book: ");
				nba1 = reader.nextLine();
				
				patron1.storedBooks(stb1, stb2, stb3, stb4, stb5, sab1, sab2, sab3, sab4, sab5, nbt1, nba1);
				
				System.out.println(patron1.storedBook());
			
		}
		
		else if(function.equals("Checkout Book")){
			
			patron1.storedBooks(stb1, stb2, stb3, stb4, stb5, sab1, sab2, sab3, sab4, sab5, nbt1, nba1);
			
			System.out.println(patron1.checkoutBook());
			checkBook1 = reader.nextInt();
			if(checkBook1 == 1 && Response == 0){
				
				patron1.setBook1(stb1, sab1);
				Response = 1;
				
			}
			else if(checkBook1 == 2 && Response == 0){
				
				patron1.setBook1(stb2, sab2);
				Response = 2;
				
			}
			else if(checkBook1 == 3 && Response == 0){
				
				patron1.setBook1(stb3, sab3);
				Response = 3;
				
			}
			else if(checkBook1 == 4 && Response == 0){
				
				patron1.setBook1(stb4, sab4);
				Response = 4;
				
			}
			else if(checkBook1 == 5 && Response == 0){
				
				patron1.setBook1(stb5, sab5);
				Response = 5;
				
			}
			
			System.out.println("Would you like to checkout another book?");
			response = reader.nextLine();
			response = reader.nextLine();
			
			if(response.equals("Yes")){
				
				System.out.println(patron1.checkoutBook());
				checkBook2 = reader.nextInt();
				if(checkBook2 == 1 && Response != 1 && Response2 == 0){
					
					patron1.setBook2(stb1, sab1);
					Response2 = 1;
					
				}
				else if(checkBook2 == 2 && Response != 2 && Response2 == 0){
					
					patron1.setBook2(stb2, sab2);
					Response2 = 2;
					
				}
				else if(checkBook2 == 3 && Response != 3 && Response2 == 0){
					
					patron1.setBook2(stb3, sab3);
					Response2 = 3;
					
				}
				else if(checkBook2 == 4 && Response != 4 && Response2 == 0){
					
					patron1.setBook2(stb4, sab4);
					Response2 = 4;
					
				}
				else if(checkBook2 == 5 && Response != 5 && Response2 == 0){
					
					patron1.setBook2(stb5, sab5);
					Response2 = 5;
					
				}
				System.out.println("Would you like to checkout another book?");
				response2 = reader.nextLine();
				response2 = reader.nextLine();
				
				if(response2.equals("Yes")){
					
					System.out.println(patron1.checkoutBook());
					checkBook2 = reader.nextInt();
					if(checkBook2 == 1 && Response != 1 && Response2 != 1){
						
						patron1.setBook3(stb1, sab1);
					
					}
					else if(checkBook2 == 2 && Response != 2 && Response2 != 2){
						
						patron1.setBook3(stb2, sab2);
						
					}
					else if(checkBook2 == 3 && Response != 3 && Response2 != 3){
						
						patron1.setBook3(stb3, sab3);
						
					}
					else if(checkBook2 == 4 && Response != 4 && Response2 != 4){
						
						patron1.setBook3(stb4, sab4);
						
					}
					else if(checkBook2 == 5 && Response != 5 && Response2 != 5){
						
						patron1.setBook2(stb5, sab5);
						
					}
					
					System.out.println(patron1.toString());
					
				}
				else if(response2.equals("No")){
					
					System.out.println(patron1.toString());
					
					}
				
			}
			
			else if(response.equals("No")){
				
				System.out.println(patron1.toString());
				
				}
			
		}
		else if(function.equals("See Books")){
			
			patron1.storedBooks(stb1, stb2, stb3, stb4, stb5, sab1, sab2, sab3, sab4, sab5, nbt1, nba1);
			
			System.out.println(patron1.storedBook());
			
		}
		
		else if(function.equals("Return Book")){
			
			patron1.storedBooks(stb1, stb2, stb3, stb4, stb5, sab1, sab2, sab3, sab4, sab5, nbt1, nba1);
			
			System.out.println("What Book would you like to return? ");
			Return = reader.nextLine();
			
			if(Return.equals(stb1)){
				
				patron1.setBook1(null, null);
				patron1.bookCount(0);
				
			}
			else if(Return.equals(stb2)){
				
				patron1.setBook1(null, null);
				patron1.bookCount(0);
				
			}
			else if(Return.equals(stb3)){
				
				patron1.setBook1(null, null);
				patron1.bookCount(0);
				
			}
			else if(Return.equals(stb4)){
				
				patron1.setBook1(null, null);
				patron1.bookCount(0);
				
			}
			else if(Return.equals(stb5)){
	
				patron1.setBook1(null, null);
				patron1.bookCount(0);
	
			}
			System.out.println(patron1.toString());
			
		}
		else if(function.equals("See Borrowed Books")){
			
			System.out.println(patron1.toString());
			
		}
		

	}
}
