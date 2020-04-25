class Question2 {
    boolean isPermutation(String a, String b) {
        int[] arr = new int[256];
        for(char c: a.toCharArray()) {
            arr[(int) c]++;
        }
        for(char c: b.toCharArray()) {
            arr[(int) c]--;
        }
        for(int n: arr) {
            if(n != 0) return false;
        }
        return true;
    }
}