package lab3;

import java.util.Scanner;

public class BookStore {
	public static void printDetails(Book myBooks[])
	{
		for(Book b:myBooks)
		{
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numberOfBooks,numberOfPages;
		String name,author;
		float price;
		System.out.println("Enter the number of books:");
		numberOfBooks=Integer.parseInt(input.nextLine());
		Book myBooks[]=new Book[numberOfBooks];
		for(int i=0;i<numberOfBooks;i++)
		{
			System.out.println("Enter book details");
			System.out.print("Book Title:");
			name=input.nextLine();
			System.out.print("Book Author:");
			author=input.nextLine();
			System.out.print("Price:");
			price=Float.parseFloat(input.nextLine());
			System.out.print("Total number of pages:");
			numberOfPages=Integer.parseInt(input.nextLine());
			myBooks[i]=new Book(name,author,price,numberOfPages);
		}
		System.out.println("--------------------------------------");
		System.out.println("************Book catalog**************");
		printDetails(myBooks);
		System.out.println(" Lets update the price");
		for(Book book:myBooks)
		{
			System.out.print("Price of book is:"+book.getPrice()+"Enter the new price:");
			price=Float.parseFloat(input.nextLine());
			book.setPrice(price);
		}
		System.out.println("**************Updated Catalog************");
		printDetails(myBooks);
		input.close();
	}

}
