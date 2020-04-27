
public class Question4 {
    boolean isPalindromePermutation(String s) {
        s = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            if(c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        boolean oddValue = false;
        for(int val: map.values()) {
            if(val % 2 != 0) {
                if(!oddValue) oddValue = true;
                else return false;
            }
        }
        return true;
    }
}