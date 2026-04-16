package pattern;

public class ImageProxy implements DisplayObject {

    private String path;
    private ImageFile imageFile;

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {

        // lazy tạo object
        if (imageFile == null) {
            imageFile = new ImageFile(path);
        }

        imageFile.display();
    }
}