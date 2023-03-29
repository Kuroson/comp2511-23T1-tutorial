package youtube;

/**
 * Observer
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer p) {
        p.addSubscriber(this);
    }

    public void alertNewVideo(Video v) {
        System.out.println(this.name + " New video: " + v.getName());
    }
}