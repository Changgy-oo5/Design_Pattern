package builder;

import model.House;
import model.Room;

/*
 * Builder tạo House từ nhiều Room
 */
public class HouseBuilder {

    private House house;

    public HouseBuilder() {
        house = new House();
    }

    // thêm phòng vào nhà
    public HouseBuilder addRoom(Room room) {
        house.addRoom(room);
        return this;
    }

    // set số tầng
    public HouseBuilder setStories(int stories) {
        house.setStories(stories);
        return this;
    }

    // build House
    public House build() {
        return house;
    }
}
