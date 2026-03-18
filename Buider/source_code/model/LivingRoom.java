package model;

/*
 * LivingRoom kế thừa từ Room
 */
public class LivingRoom extends Room {

    // Thuộc tính riêng của LivingRoom
    // cho biết phòng khách có TV hay không
    private boolean hasTV;

    /*
     * Setter được Builder gọi để gán giá trị
     * → Builder Pattern sử dụng setter để thiết lập
     * các thuộc tính của object từng bước
     */
    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    /*
     * Override toString() để hiển thị thông tin object
     * nếu không override thì Java sẽ in:
     * model.LivingRoom@xxxx (địa chỉ bộ nhớ)
     */
    @Override
    public String toString() {
        return "LivingRoom [size=" + size +
                ", floorType=" + floorType +
                ", hasTV=" + hasTV + "]";
    }
}