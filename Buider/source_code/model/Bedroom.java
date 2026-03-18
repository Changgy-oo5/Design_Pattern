package model;

/*
 * Bedroom kế thừa từ Room (Abstract class)
 */
public class Bedroom extends Room {

    // thuộc tính riêng của Bedroom
    private String bedType; 
    /*
     * Setter dùng trong Builder
     * → Builder sẽ gọi hàm này để gán giá trị
     */
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    /*
     * Override toString() để in thông tin đẹp
     * → Nếu không có, Java sẽ in địa chỉ object (model.Bedroom@xxx)
     */
    @Override
    public String toString() {
        return "Bedroom [size=" + size +
                ", floorType=" + floorType +
                ", bedType=" + bedType + "]";
    }
}