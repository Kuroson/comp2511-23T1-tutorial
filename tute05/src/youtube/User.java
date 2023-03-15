package youtube;

/**
 * Observer
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer p) { // Observer subscribing
        p.addSubscriber(this);
    }

    // Update method
    public void alertNewVideo(Video video) {
        System.out.println(this.name + " A new video has been posted: " + video.getName());
    }
}