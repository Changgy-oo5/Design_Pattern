package pattern;

//RealSubject
public class ImageFile implements DisplayObject {

    private String path;
    private boolean loaded = false;

    public ImageFile(String path) {
        this.path = path;
    }

    public void load() {
        System.out.println("Loading image from disk: " + path);
        loaded = true;
    }

    @Override
    public void display() {
        if (!loaded) {
            load(); // load khi cần (expensive)
        }
        System.out.println("Displaying image: " + path);
    }
}