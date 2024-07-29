package org.example;

public class StringManipulator {
    public String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string
        String res = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            res += String.valueOf(input.charAt(i));
        }
        return res;
    }

    public boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        if (reverseString(input).equals(input)) {
            return true;
        } else {
            return false;
        }
    }
}
