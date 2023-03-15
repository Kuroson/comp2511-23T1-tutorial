package youtube;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 */
public class Producer {
    private String name;
    private List<Video> videos = new ArrayList<>();
    private List<User> subscribers = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    public void addSubscriber(User u) {
        this.subscribers.add(u);
    }

    // Notify all subscribers/observers that my state has changed
    public void postVideo(String name, int length) {
        Video v = new Video(name, length, this);
        this.videos.add(v);

        // Notify all subscribers
        this.subscribers.forEach(subscriber -> {
            subscriber.alertNewVideo(v);
        });
        return;
    }
}