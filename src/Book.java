import com.sun.org.apache.bcel.internal.classfile.Unknown;

public class Book {
   //declare attributes of the class
    private String title;
    private float price;
    private String isbn;
    private int pages;

    //accessor methods
    public String getTitle(){
        return title;
    }

    public float getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }
    //mutator methods

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPages(int pages) {
        this.pages = pages;

    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Book(){

        this("Unknown", "Unknown",0,0.0f );
    }
    public Book(String title,String isbn,int pages,float price){
        setTitle(title);
        setPages(pages);
        setIsbn(isbn);
        setPrice(price);
    }
    @Override
    public String toString(){
        return String.format("title %-20s isbn %-20s" );
    }

}
