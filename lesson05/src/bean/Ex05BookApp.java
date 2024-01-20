package bean;

import java.util.Arrays;

import view.Book;
import view.ClassicalBook;
import view.ReferenceBook;

public class Ex05BookApp {
	public static void main(String[] args) {
		Book[] books = intital();
		Book[] booksByPublisher = findBooks(books,"Nhi Dong");
		printf(booksByPublisher);
		System.out.println("===========================");
		Book[] booksByPrice= findBooks50(books,50);
		printf(booksByPrice);
		System.out.println("===========================");
		Book[] booksBySGK= findBooksa(books);
		printf(booksBySGK);
		System.out.println("===========================");
		double totalOfMoney = bill(books);
		System.out.println("totalOfMoney : " + totalOfMoney);
	}
	
	private static Book[] intital () {
		return new Book[] {
			new ClassicalBook("SGKA1",123d,"Nhi Dong",true),
			new ClassicalBook("SGKB2",34d,"Au Lac",false),
			new ClassicalBook("SGKC3",23d,"Lac Viet",true),
			new ReferenceBook("STKR1",66d,"Nhi Dong",5),
			new ReferenceBook("STKR2",77d,"Sao Mai",8),
			new ReferenceBook("STKR3",88d,"Nhi Dong",5),
		};
	}
	private static Book[] findBooks(Book[] books , String publisher) {
		int k = 0 ; 
		Book[] result = new Book[books.length];
		for (Book book : books)
		{
			if (publisher.equals(book.getPublisher()))
			{
				result[k++] = book; 
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	private static Book[] findBooks50(Book[] books , double ltprice) {
		int k = 0 ; 
		Book[] result = new Book[books.length];
		for (Book book : books)
		{
			if (book.getPrice() < ltprice)
			{
				result[k++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	
	private static Book[] findBooksa(Book[] books) {
		int k = 0 ; 
		Book[] result = new Book[books.length];
		for (Book book : books)
		{
			if (book.getId().startsWith("SGK"))
			{
				if (book.getPrice() > 50 && book.getPrice() < 100)
				{
					result[k++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	private static double bill (Book ...books) {
		double totalOfMoney = 0 ;
		for (Book book : books)
		{
			double price = book.getPrice();
			if ( book.getId().startsWith("SGK")) {
				ClassicalBook cbook = (ClassicalBook)book;
				if (!cbook.isStatus()) {
					price *= 0.7;
				}
			}
			else {
				
				ReferenceBook rbook = (ReferenceBook)book;
				price *= (1 + rbook.getTax())/100;
			}
			totalOfMoney += price;
		}
		return totalOfMoney;
	}
	
	private static void printf (Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
