package assignment9;

import java.util.*;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";
        int x = sc.nextInt();
        char[] ch = str1.toCharArray();
        for (int i=0;i<ch.length;i++){
            ch[i] = (char) (ch[i]+x);
            str2 +=ch[i];
        }
        System.out.println(str2);
    }
}