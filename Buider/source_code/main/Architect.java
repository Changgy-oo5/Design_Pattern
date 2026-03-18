package main;

import builder.*;
import model.*;

/*
 * Director trong Builder Pattern
 * Điều phối quá trình build object
 */
public class Architect {

    /*
     * Nhận builder (interface) → đúng UML
     * Dùng polymorphism để build Room
     */
    public Room constructRoom(RoomBuilder builder) {

        // nếu là BedroomBuilder
        if (builder instanceof BedroomBuilder) {
            return ((BedroomBuilder) builder)
                    .setSize(20)
                    .setFloorType("Wood")
                    .setBedType("King Size")
                    .build();
        }

        // nếu là LivingRoomBuilder
        if (builder instanceof LivingRoomBuilder) {
            return ((LivingRoomBuilder) builder)
                    .setSize(30)
                    .setFloorType("Tile")
                    .setHasTV(true)
                    .build();
        }

        return null;
    }

    /*
     * Xây dựng House từ nhiều Room
     */
    public House constructHouse() {

        HouseBuilder houseBuilder = new HouseBuilder();

        // tạo phòng thông qua builder
        Room bedroom = constructRoom(new BedroomBuilder());
        Room livingRoom = constructRoom(new LivingRoomBuilder());

        // ghép thành House
        return houseBuilder
                .addRoom(bedroom)
                .addRoom(livingRoom)
                .setStories(2)
                .build();
    }

    public static void main(String[] args) {

        Architect architect = new Architect();

        House house = architect.constructHouse();

        System.out.println(house);
    }
}