package builder;

import model.LivingRoom;

/*
 * Concrete Builder cho LivingRoom
 */
public class LivingRoomBuilder implements RoomBuilder {

    private LivingRoom room;

    public LivingRoomBuilder() {
        reset();
    }

    public void reset() {
        room = new LivingRoom();
    }

    public LivingRoomBuilder setSize(int size) {
        room.setSize(size);
        return this;
    }

    public LivingRoomBuilder setFloorType(String floorType) {
        room.setFloorType(floorType);
        return this;
    }

    public LivingRoomBuilder setHasTV(boolean hasTV) {
        room.setHasTV(hasTV);
        return this;
    }

    @Override
    public LivingRoom build() {
        LivingRoom result = room;
        reset();
        return result;
    }
}
