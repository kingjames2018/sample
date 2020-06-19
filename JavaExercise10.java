/* HashMap */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaExercise10 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Kevin", "09333278235");
        phoneBook.put("Shania", "09971632655");
	phoneBook.put("Nate", "888-8888");
		
        Set<Map.Entry<String, String>> values = phoneBook.entrySet();

        System.out.println(phoneBook.get("Kevin"));

        for(Map.Entry<String, String> e: values) {
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
