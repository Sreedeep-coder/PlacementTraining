package day06;
public class task {
    public static void main(String[] args) {
        String a = "listen", b = "nothing";
        int[] c = new int[26];

        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        for (int i = 0; i < a.length(); i++) {
            c[a.charAt(i) - 'a']++;
            c[b.charAt(i) - 'a']--;
        }

        for (int n : c)
            if (n != 0) {
                System.out.println("Not Anagrams");
                return;
            }

        System.out.println("Anagrams");
    }
}
