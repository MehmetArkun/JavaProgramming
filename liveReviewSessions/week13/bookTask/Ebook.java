package week13.bookTask;

public class Ebook extends Book{

    int sizeAtMemory;
    int pages;

    public Ebook(String title, String type, String author, double price){
        super(title, type,author,price);
    }

    public void readBook(){
        System.out.println("Reading the book from my tablet");
        System.out.println("title = " + title); // since there is inheritance relationship, I can reach this field
        System.out.println("author" + author);
        System.out.println("price" + price);
    }

}
