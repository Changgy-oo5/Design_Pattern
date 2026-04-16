package pattern;

import java.util.ArrayList;
import java.util.List;

public class LibraryGroup implements LibraryItem {

    private List<LibraryItem> items = new ArrayList<>();

    // varargs
    public LibraryGroup(LibraryItem... items) {
        for (LibraryItem item : items) {
            this.items.add(item);
        }
    }

    @Override
    public void checkout() {
        for (LibraryItem item : items) {
            item.checkout();
        }
    }

    @Override
    public void returnItem() {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }
}