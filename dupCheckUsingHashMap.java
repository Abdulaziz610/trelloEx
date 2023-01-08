package questionO;

import java.util.HashMap;
import java.util.Map;
public class dupCheck {
	public static void main(String[] args) {
		String[] names = {"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "atyab", "Abdullah", "Abdullah"};
		Map<String, Integer> nameMap = new HashMap<>();
		for (String nameS : names) {
			if (!nameMap.containsKey(nameS)) {
				nameMap.put(nameS, 0);
			}
			else {
				
				nameMap.put(nameS, nameMap.get(nameS) + 1);
			}
		}
		for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
			System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times ");
		}
	}
}