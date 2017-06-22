package ws;

/**
 * Created by gaurav.raval on 23/06/17.
 */
public class Billing {
    private final long id;
    private final String content;

    public Billing(long id, String content) {
        this.id = id;
        this.content = "bid: 123, bdetais: \"name=\"test1\"";


    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
