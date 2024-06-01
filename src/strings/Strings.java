package strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // concatenation
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        // charAt
        for(int i = 0; i < fullName.length(); i ++)
            System.out.print(fullName.charAt(i) + " ");
        System.out.println();

        // compare : s1 > s2 returns +tive, s1 == s2 returns 0, s1 < s2 returns -tive
        // remember it compares the first dissimilar letter
        if(firstName.compareTo(lastName) == 0) System.out.println("Strings are equal !");
        else if (firstName.compareTo(lastName) > 0) System.out.println("String 1 is greater !");
        else System.out.println("String 2 is greater !");

        // substring, end is exclusive
        String sentence = "My name is Tony Stark";
        String substring = sentence.substring(11);
        System.out.println(substring);

        StringBuilder sb = new StringBuilder("Tony Stark"); // setCharAt, insert, append, delete
        for(int i = 0; i < sb.length()/2; i ++) {
            int back = sb.length() - 1 - i;
            char backChar = sb.charAt(back);
            sb.setCharAt(back, sb.charAt(i));
            sb.setCharAt(i, backChar);
        }
        System.out.println(sb); // reversed string
    }
}
