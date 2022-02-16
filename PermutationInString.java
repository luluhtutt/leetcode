/*
    Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
    In other words, return true if one of s1's permutations is the substring of s2.
 */
import java.util.*;
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] letters = new int[26];
        for(int i = 0; i < s1.length(); i++)    {
            letters[s1.charAt(i) - 'a']++;
            letters[s2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < s2.length()-s1.length(); i++) {
            if(checkZeros(letters)) return true;
            letters[s2.charAt(i) - 'a']++;
            System.out.println("letter added: " + s2.charAt(i));
            letters[s2.charAt(i + s1.length()) - 'a']--;
            System.out.println("letter subtracted: " + s2.charAt(i + s1.length()));
        }
        if(checkZeros(letters)) return true;
        return false;
    }

    public static boolean checkZeros(int[] a)   {
        for(int i: a) if(i != 0) return false;
        return true;
    }
}