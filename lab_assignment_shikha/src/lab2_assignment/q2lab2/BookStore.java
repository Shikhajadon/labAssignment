package q2lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	private ArrayList<Book> books = new ArrayList<>();

	public void sell(String bookTitle, int numOfCopies) {

		boolean findBook = false;
		for (Book book : books) {

			if (book.getBookTitle().equals(bookTitle)) {
				if (book.getNumOfCopies() - numOfCopies >= 0) {

					book.setNumOfCopies(book.getNumOfCopies() - numOfCopies);
					System.out.println(numOfCopies + " Book sold with title : " + bookTitle);
				} else {
					System.out.println(numOfCopies + bookTitle+ " Book is not available right now");
					System.out.println("We have only " + book.getNumOfCopies());
				}
				findBook = true;
			}

		}
		if (!findBook) {
			System.out.println("Book with " + bookTitle + " is not available");
		}

	}

	public void order(String ISBN, int numOfCopies) {
		boolean findBook = false;
		for (Book book : books) {

			if (book.getISBN().equals(ISBN)) {

				book.setNumOfCopies(book.getNumOfCopies() + numOfCopies);
				findBook = true;
			}

		}
		if (!findBook) {
			Scanner sc = new Scanner(System.in);
			System.out.println("You ordered new book");
			System.out.println("Plzz enter the title and author name");
			
			System.out.println("Enter BOOK TITLE");
			String bookTitle = sc.nextLine();
			
			System.out.println("Enter AUTHOR NAME");
			String author = sc.nextLine();
			
			Book book1 = new Book(bookTitle, author, ISBN, numOfCopies);
			books.add(book1);
			
		}
		System.out.println("Order placed Successfully!!");
	}

	public void display() {

		if (books.size() == 0)
			System.out.println("No books to display,SORRY,Plzz visit any other time");

		else {
			for (Book book : books) {
				book.display();
			}
		}

	}
}
