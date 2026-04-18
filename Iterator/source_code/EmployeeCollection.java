package pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection implements Aggregate {

    private List<String> employees = new ArrayList<>();

    public void addEmployee(String name) {
        employees.add(name);
    }

    public String getEmployee(int index) {
        return employees.get(index);
    }

    public int size() {
        return employees.size();
    }

    @Override
    public Iterator createIterator() {
        return new EmployeeIterator(this);
    }
}