package Seminar4;

import java.util.HashMap;

public class Task1 {

    public static HashMap<Character, Integer> toLetterDic(String str) {
        HashMap<Character, Integer> letterDic = new HashMap<>();
        char[] arr = str.toCharArray();
        for (int i=0; i< arr.length; i++) {
            if (letterDic.containsKey(arr[i])) {
                letterDic.put(arr[i], letterDic.get(arr[i])+1);
            } else {
                letterDic.put(arr[i], 1);
            }
        }
        System.out.println(letterDic.toString());
        return letterDic;
    }


    public static void main(String[] args) {
        toLetterDic("fsjkngvjn;vlasn;lnsddkksldfpwfervcnm salw;dkcn;alkvna;lvniowvnwoervndfkv  ");
    }




}
