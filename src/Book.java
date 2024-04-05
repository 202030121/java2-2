public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book () {
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book(String t) {
        this(t, "작자미상");
 }

    public Book(String t, String a) {
        this.title = t; 
        this.author = a; 
 }

    public static void main(String [] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리"); 
        Book loveStory = new Book("춘향전"); 
        Book b = new Book();
        loveStory.show();
 }
}