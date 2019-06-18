import java.util.HashMap;
public class Hashmatique {
    public static void main(Stringcopy[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Happy Birthday", "");
        userMap.put("", "");
        userMap.put("", "");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}