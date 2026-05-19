package pattern;

public class Client {

    public static void main(String[] args) {

        Connection connection =
                new Connection();

        SocialMediaFeed feed =
                new SocialMediaFeed();

        // ban đầu chưa observe
        System.out.println(
                "No observers attached.");

        connection.setStatus(
                "First status - nobody sees this");

        // bắt đầu observer
        connection.add(feed);

        System.out.println(
                "\nObserver attached.");

        connection.setStatus(
                "Learning Observer Pattern");

        connection.setStatus(
                "New status updated");

        System.out.println();

        feed.showFeed();
    }
}