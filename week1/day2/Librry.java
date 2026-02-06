package week1.day2;

public class Librry {

			String addBook(String bookTitle) {
	        System.out.println("Book added successfully");
	        return bookTitle;
	    }
			public void issueBook() {
		        System.out.println("Book issued successfully");
		    }
			public static void main(String[] args) {
		        Librry lib = new Librry();
		        lib.addBook("Add Book");
		        lib.issueBook();
		    }
	}


