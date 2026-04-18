package pattern;

public class EmployeeIterator implements Iterator {

    private EmployeeCollection collection;
    private int index = 0;

    public EmployeeIterator(EmployeeCollection collection) {
        this.collection = collection;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public boolean isDone() {
        return index >= collection.size();
    }

    @Override
    public String currentItem() {
        if (!isDone()) {
            return collection.getEmployee(index);
        }
        return null;
    }
}