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

    public void addSubscriber(User user) {
        this.subscribers.add(user);
    }

    public void removeSubscriber(User user) {
        this.subscribers.remove(user);
    }

    public void postVideo(String name, int length) {
        // create video
        Video v = new Video(name, length, this);
        this.videos.add(v);

        // notify all subscribers of new video
        for (User user : this.subscribers) {
            user.alertNewVideo(v);
        }
    }

    public static void main(String[] args) {
        Producer p1 = new Producer("Producer1");
        User u1 = new User("User1");

        p1.addSubscriber(u1);
        p1.postVideo("Video1", 10);

        User u2 = new User("user2");
        p1.addSubscriber(u2);
        p1.postVideo("Video2", 20);
    }

}