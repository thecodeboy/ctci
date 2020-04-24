class Question1 {
    boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()) {
            if(set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }
}