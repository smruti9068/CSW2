package assignment9;

import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";
        str1 = str1.toLowerCase();
        char[] ch = str1.toCharArray();
        for (int i=0;i<str1.length();i++){
            str2+=ch[i];
        }
        if(str1.equals(str2)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}