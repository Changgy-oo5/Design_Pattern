package pattern;

import java.util.ArrayList;
import java.util.List;

public class Connection implements Subject {

    private String status;

    private List<Observer> observers =
            new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {

        this.status = status;
     // khi status thay đổi tự động notify observers
        notifyObservers();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
