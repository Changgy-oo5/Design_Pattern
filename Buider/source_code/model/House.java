package model;

import java.util.ArrayList;
import java.util.List;

/*
 * House là object được xây dựng bởi HouseBuilder trong Builder Pattern
 */
public class House {

    // Danh sách các phòng trong nhà
    private List<Room> rooms = new ArrayList<>();

    // Số tầng của ngôi nhà
    private int stories;

    /*
     * Thêm phòng vào nhà
     * → được gọi từ HouseBuilder
     */
    public void addRoom(Room room) {
        rooms.add(room);
    }

    /*
     * Setter cho số tầng
     */
    public void setStories(int stories) {
        this.stories = stories;
    }

    /*
     * Override toString()
     */
    @Override
    public String toString() {

        String result = "House [stories=" + stories + "]\n";

        // duyệt từng phòng và in ra
        for (Room r : rooms) {
            result += "  " + r.toString() + "\n";
        }

        return result;
    }
}
