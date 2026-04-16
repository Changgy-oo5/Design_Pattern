package pattern;

public class Magazine implements LibraryItem {

    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void checkout() {
        System.out.println("Magazine \"" + title + "\" checked out");
    }

    @Override
    public void returnItem() {
        System.out.println("Magazine \"" + title + "\" returned");
    }
}