package at.ac.fhstp.core8.streams.ue1;

public class Tweet {
    String id;
    String user_name;
    String user_location;
    String user_description;
    String user_created;

    public Tweet(String id, String user_name, String user_location, String user_description, String user_created) {
        this.id = id;
        this.user_name = user_name;
        this.user_location = user_location;
        this.user_description = user_description;
        this.user_created = user_created;
    }
}
