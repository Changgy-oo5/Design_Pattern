package pattern;

//Client
public class ImageGallery {

    public static void main(String[] args) {

        DisplayObject img1 = new ImageProxy("image1.jpg");
        DisplayObject img2 = new ImageProxy("image2.jpg");

        System.out.println("Gallery opened...");

        // chưa load gì

        System.out.println("Displaying images...");

        img1.display();
        img2.display();
    }
}