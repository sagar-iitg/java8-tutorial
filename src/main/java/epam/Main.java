package epam;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList(
            "sagar", "sagar", "sagar",
            "shadan", "shadan", "shadan",
            "ankit"
        );

        // Step 1: Frequency Map
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : str) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        int maxFreq = 0;
        for (int count : freqMap.values()) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        List<String> ans=new ArrayList<>();
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);

        System.out.println(ans.get(0));
    }
}
