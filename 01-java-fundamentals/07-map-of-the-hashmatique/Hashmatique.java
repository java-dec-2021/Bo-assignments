import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Rudolf The Red Nose Reindeer", "Nose So Bright");
        trackList.put("Dear Santa", "Santa Clause Is So Merry");
        trackList.put("Little Drummer Boy", "Play A Song For Me");
        trackList.put("Frosty The Snowman", "Had A Very Shiny Nose");

        System.out.println(trackList.get("Dear Santa") + "\n");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }

    }
}
