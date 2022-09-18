package utils;

import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list=readTxt.readString1();
        for (String s : list) {
            System.out.println(s);

        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

}
