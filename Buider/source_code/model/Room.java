package model;

public abstract class Room {
    protected int size;
    protected String floorType;

    public void setSize(int size) {
        this.size = size;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }
}