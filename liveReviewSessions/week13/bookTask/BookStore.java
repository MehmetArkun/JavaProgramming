package week13.bookTask;


public class BookStore {

    public static void main(String[] args) {

        Book book = new Book("1984", "Novel", "George Orwell", 29.5);

        System.out.println("book = " + book);

        book.buy("D&R");
        book.borrow("Oscar");


    }
}
