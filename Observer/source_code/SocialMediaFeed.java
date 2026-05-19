package pattern;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements Observer {

    private List<String> statuses =
            new ArrayList<>();

    @Override
    public void update(String status) {

        statuses.add(status);

        System.out.println(
                "New status added to feed: "
                        + status);
    }

    public void showFeed() {

        System.out.println("Social Media Feed:");

        for (String status : statuses) {
            System.out.println(status);
        }
    }
}
