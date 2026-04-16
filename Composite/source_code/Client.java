package pattern;

public class Client {
    public static void main(String[] args) {

        LibraryItem book1 = new Book("Java Basics");
        LibraryItem book2 = new Book("Design Patterns");
        LibraryItem mag1 = new Magazine("Tech Monthly");

        // group
        LibraryItem group = new LibraryGroup(book1, book2, mag1);

        // gọi giống nhau cho cả group và single
        group.checkout();

        System.out.println("----");

        group.returnItem();
    }
}