package java1;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Anagrams {
    //Processing the strings and standardize the format(all lowercase)
    static String standardize(String sourceString) {
        return sourceString.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
    public static boolean isLetterBasedAnagramMultiset(String string1, String string2) {
        return isAnagramMultiset(standardize(string1), standardize(string2));
    }
    //Converting each input strings into a MultiSet of characters and checking if they are equal
    public static boolean isAnagramMultiset(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        Multiset<Character> multiset1 = HashMultiset.create();
        Multiset<Character> multiset2 = HashMultiset.create();
        for (int i = 0; i < string1.length(); i++) {
            multiset1.add(string1.charAt(i));
            multiset2.add(string2.charAt(i));
        }
        return multiset1.equals(multiset2);
    }

    public static void main(String[] args) {
        String string1 = "Desperation";
        String string2 = "A Rope Ends It";
        if (isLetterBasedAnagramMultiset(string1, string2)){
            System.out.println("The two strings are anagrams!");
        }else {
            System.out.println("The tow strings are not anagrams!");
        }
        }
}