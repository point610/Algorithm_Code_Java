package LeetCode.Middle.LeetCode535;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class Codec {
    private Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String[] split = longUrl.split("/");
        String value = split[0] + UUID.randomUUID();
        map.put(value, longUrl);
        return value;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
public class LeetCode535 {
}
