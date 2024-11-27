package dsa.solutions.adobe;

public class ChristmasAtOffice {
    public static int totalStrings(String s) {


        int[] counter = new int[26];
        for (int i = 0; i < 26; i++) {
            counter[i] = 0;
        }
        int i = 0, j = 0, elementCount = 0, k = 2;


        int greater = 0;

        int n = s.length();
        while (i < n) {


            counter[s.charAt(i) - 'a']++;


            if (counter[s.charAt(i) - 'a'] == 1) {
                elementCount++;
            }


            if (elementCount > k) {

                while (elementCount > k) {
                    counter[s.charAt(j) - 'a']--;


                    if (counter[s.charAt(j) - 'a'] == 0) {
                        elementCount--;
                    }
                    j++;
                }


                greater += j;
                j--;
                counter[s.charAt(j) - 'a']++;
                if (counter[s.charAt(j) - 'a'] == 1) {
                    elementCount++;
                }
            }
            i++;
        }
        return n * (n + 1) / 2 - greater;
    }
}
