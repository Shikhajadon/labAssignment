package q2lab2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {

		BookStore bookStore = new BookStore();

		System.out.println("Select books from the given menu");
		System.out.println("Enter '1',to display Books:Title--Author--ISBN--Quantity");
		System.out.println("Enter '2',to order new books");
		System.out.println("Enter '3',to sell books");
		System.out.println("Enter '0',to exit the system");

		while(true) {
			int noOfBooks;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			if (choice == 1) {
				bookStore.display();
			}

			else if (choice == 2) {
				System.out.println("Plzz enter the ISBN and number of books you want to order");

				System.out.println("Enter ISBN");
				sc.nextLine();
				String isbn = sc.nextLine();

				System.out.println("Enter Number of Books");
				noOfBooks = sc.nextInt();
				bookStore.order(isbn, noOfBooks);
			}

			else if (choice == 3) {

				System.out.println("Plzz enter the title and number of books you want to purchase");

				System.out.println("Enter BOOK TITLE");
				sc.nextLine();
				String bookTitle = sc.nextLine();

				System.out.println("Enter Number of Books");
				noOfBooks = sc.nextInt();
				bookStore.sell(bookTitle, noOfBooks);
			}

			else {
				System.out.println("THANKS FOR VISITING");
				sc.close();
				break;
			}

		}

	}

}
