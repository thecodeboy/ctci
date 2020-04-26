class Question3 {
    String urlify(String s) {
        char[] arr = s.toCharArray();
        int loc = -1;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != ' ') {
                loc = i;
                break;
            }
        }
        if(loc == -1) return s;
        int i = arr.length - 1;
        while(i >= 0) {
            if(arr[loc] == ' ') {
                arr[i--] = '0';
                arr[i--] = '2';
                arr[i--] = '%';
            }
            else {
                arr[i--] = arr[loc];
            }
        }
        return new String(arr);
    }
}