package at.ac.fhstp.core8.streams.ue1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    private static String TWEET_PATH = "src/assets/vaccination_all_tweets.csv";
    private static String HEART_PATH = "src/assets/heart.csv";

    public static void main(String[] args) {
        try {
            // App.streamFile(TWEET_PATH).skip(1).map(mapToTweet).forEach(t -> System.out.println(t.user_name));
            List<Heart> hearts = App.streamFile(HEART_PATH).skip(1).map(mapToHeart).filter(h -> h.age > 60)
            .collect(Collectors.toList());
            System.out.println(hearts.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Stream<String> streamFile(String source) throws Exception {
        Path path = Paths.get(source);
        Stream<String> lines = Files.lines(path);
        return lines;
    }

    private static Function<String, Heart> mapToHeart = (line) -> {
        String[] p = line.split(",");
        Heart heart = new Heart(Integer.parseInt(p[0]), p[1], p[2], p[3], p[4]);
        return heart;
    };

    private static Function<String, Tweet> mapToTweet = (line) -> {

        String[] p = line.split(",");// a CSV has comma separated lines

        Tweet item = new Tweet(p[0], p[1], p[2], p[3], p[4]);

        return item;
    };
}