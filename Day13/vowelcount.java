package Day13;

import java.util.*;
import java.lang.*;

public class vowelcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String vowels="aeiouAEIOU";
        int vowel_count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))){  //vowels.indexof(s.charAt(i) != -1)
                vowel_count++;
            }
        }

        System.out.println(vowel_count);
    }

}
