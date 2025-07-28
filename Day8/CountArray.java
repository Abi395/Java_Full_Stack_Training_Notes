package Day8;

public class CountArray {
    public static void main(String[] args) {
        int a[] = {'a', 'b', 'a', 'c', 'd', 'd', 'b', 'b', 'a', 'c'};
        int b[] = new int[26];

        for (int i = 0; i < a.length; i++) {
            b[a[i] - 'a']++;
        }
        for (int f = 1; f <= a.length; f++) {
            for (int i = 25; i >= 0; i--) { //for the reverse character order
                if (b[i] == f) {
                    System.out.print((char)(i + 'a'));
                }
            }
        }
    }
}
