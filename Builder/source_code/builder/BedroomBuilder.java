package builder;

import model.Bedroom;

/*
 * Concrete Builder cho Bedroom
 */
public class BedroomBuilder implements RoomBuilder {

    private Bedroom bedroom;

    // Constructor → khởi tạo object
    public BedroomBuilder() {
        reset();
    }

    // reset để tạo object mới (chuẩn Builder Pattern)
    public void reset() {
        bedroom = new Bedroom();
    }

    // set từng thuộc tính
    public BedroomBuilder setSize(int size) {
        bedroom.setSize(size);
        return this;
    }

    public BedroomBuilder setFloorType(String floorType) {
        bedroom.setFloorType(floorType);
        return this;
    }

    public BedroomBuilder setBedType(String bedType) {
        bedroom.setBedType(bedType);
        return this;
    }

    // build object hoàn chỉnh
    @Override
    public Bedroom build() {
        Bedroom result = bedroom;
        reset(); // chuẩn pattern: dùng xong reset
        return result;
    }
}