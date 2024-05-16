package assignment9;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        String[] words = str1.split(" ");
        for(String word:words){
            if(!word.isEmpty()){
                char ch = Character.toUpperCase(word.charAt(0));
                str2.append(ch);
            }
        }
        System.out.println(str2);
    }
}