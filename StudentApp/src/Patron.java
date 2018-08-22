
public class Patron {
	
	public String name;
	public String bk1t = "Harry Potter";
	public String bk2t;
	public String bk3t;
	public String bk1a = "J.K Rowling";
	public String bk2a;
	public String bk3a;
	public int BookCnt;
	public String tb1;
	public String tb2;
	public String tb3;
	public String tb4;
	public String tb5;
	public String ab1;
	public String ab2;
	public String ab3;
	public String ab4;
	public String ab5;
	
	public String stb1 = null;
	public String stb2 = null;
	public String stb3 = null;
	public String stb4 = null;
	public String stb5 = null;
	public String sab1 = null;
	public String sab2 = null;
	public String sab3 = null;
	public String sab4 = null;
	public String sab5 = null;
	public String ntb1 = null;
	public String nab1 = null;
	
	Book newBook1 = new Book();
	Book newBook2 = new Book();
	Book newBook3 = new Book();
	
	Book storedb1 = new Book();
	Book storedb2 = new Book();
	Book storedb3 = new Book();
	Book storedb4 = new Book();
	Book storedb5 = new Book();
	Book addbook1 = new Book();
	
	/*public Patron(String nm, String b1t, String b2t, String b3t, String b1a, String b2a, String b3a){
		
		name = nm;
		Book.Book1(b1t, b1a);
		bk1t = b1t;
		bk1a = b1a;
		Book.Book2(b2t, b2a);
		bk2t = b2t;
		bk2a = b2a;
		Book.Book3(b3t, b3a);
		bk3t = b3t;
		bk3a = b3a;
		
	}*/
	
	public void setName(String nm){
		
		name = nm;

	}
	public void setBook1(String b1t, String b1a){
		
		newBook1.book(b1t, b1a);
		bk1t = b1t;
		bk1a = b1a;
		bookCount(1);
		
	}
	public void setBook2(String b2t, String b2a){
		
		newBook2.book(b2t, b2a);
		bk2t = b2t;
		bk2a = b2a;
		bookCount(2);
		
	}
	public void setBook3(String b3t, String b3a){
		
		newBook3.book(b3t, b3a);
		bk3t = b3t;
		bk3a = b3a;
		bookCount(3);
		
	}
	public void bookCount(int nco){
		
		if(nco == 0){
			
			BookCnt = 3;
			
		}
		else if(nco == 1){
			
			BookCnt = 2;
			
		}
		else if(nco == 2){
			
			BookCnt = 1;
			
		}
		else{
			
			BookCnt = 0;
			
		}
		
	}
	public void storedBooks(String tb1, String tb2, String tb3, String tb4, String tb5, String ab1, String ab2, String ab3, String ab4, String ab5, String nb1t, String nb1a){
		
		storedb1.book(tb1, ab1);
		storedb2.book(tb2, ab2);
		storedb3.book(tb3, ab3);
		storedb4.book(tb4, ab4);
		storedb5.book(tb5, ab5);
		addbook1.book(nb1t, nb1a);
		stb1 = tb1;
		stb2 = tb2;
		stb3 = tb3;
		stb4 = tb4;
		stb5 = tb5;
		sab1 = ab1;
		sab2 = ab2;
		sab3 = ab3;
		sab4 = ab4;
		sab5 = ab5;
		ntb1 = nb1t;
		nab1 = nb1a;
		
	}
	public String checkoutBook(){
		
		String check;
		check = "Would you like to check out: " + "\n" +
				"" + "\n" +
				"1." + stb1 + "\n" +
				"By:  " + sab1 + "\n" + 
				"" + "\n" +
				"2." + stb2 + "\n" +
				"By: " + sab2 + "\n" +
				"" + "\n" +
				"3." + stb3 + "\n" +
				"By: " + sab3 + "\n" +
				"" + "\n" +
				"4." + stb4 + "\n" + 
				"By: " + sab4 + "\n" +
				"" + "\n" +
				"5." + stb5 + "\n" +
				"By: " + sab5 + "\n" +
				"6." + ntb1 + "\n" +
				"By: " + nab1;
		return check;
		
	}
	public String storedBook(){
		
		String store;
		store = "" + "\n" +
				"1." + stb1 + "\n" +
				"By:  " + sab1 + "\n" + 
				"" + "\n" +
				"2." + stb2 + "\n" +
				"By: " + sab2 + "\n" +
				"" + "\n" +
				"3." + stb3 + "\n" +
				"By: " + sab3 + "\n" +
				"" + "\n" +
				"4." + stb4 + "\n" + 
				"By: " + sab4 + "\n" +
				"" + "\n" +
				"5." + stb5 + "\n" +
				"By: " + sab5 + "\n" +
				"" + "\n" +
				"6." + ntb1 + "\n" +
				"By: " + nab1;
		return store;
		
	}
	public String toString(){
		
		String str;
		str = "Name : " + name + "\n" +
			  "Remaining Number Of Checkouts: "+ BookCnt + "\n" +	
			  "Book 1 Title  : " + bk1t + "\n" +
			  "Book 1 Author : " + bk1a + "\n" +	
			  "Book 2 Title  : " + bk2t + "\n" +
			  "Book 2 Author : " + bk2a + "\n" +
			  "Book 3 Title  : " + bk3t + "\n" +
			  "Book 3 Author : " + bk3a + "\n";
		return str;
		
	}
	
}
