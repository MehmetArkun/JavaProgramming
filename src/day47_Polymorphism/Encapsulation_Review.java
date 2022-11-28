package day47_Polymorphism;

public class Encapsulation_Review {

    private String bookTitle;
    private final String publishedDate;

    public Encapsulation_Review(String bookTitle, String publishedDate) {
        this.bookTitle = bookTitle;
        this.publishedDate = publishedDate;
    }

    // you can not generate setter for final keyword.
    // if data is private you can give conditions


    public String getBookTitle() {
        if (bookTitle == null) {
            return "";
        }

        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }

        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
}
