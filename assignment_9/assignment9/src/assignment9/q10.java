package assignment9;

import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String contactStr1 = str1+str1;
        if(contactStr1.contains(str2)){
            System.out.println(str2+" is a rotation of "+str1);
            System.out.println("No of rotation:"+contactStr1.indexOf(str2));
        }
    }
}