package pattern;

public class Client {

    public static void main(String[] args) {

        EmployeeCollection employees = new EmployeeCollection();

        employees.addEmployee("Holly");
        employees.addEmployee("Bam");
        employees.addEmployee("Yeontan");

        Iterator iterator = employees.createIterator();

        for (iterator.first(); !iterator.isDone(); iterator.next()) {
            System.out.println(iterator.currentItem());
        }
    }
}
