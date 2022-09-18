package testDemo01;

import org.junit.Test;
import utils.readTxt;

import java.util.List;

public class ReadTest {
    @Test
    public void test1(){
        List<String> list= readTxt.readString1();
        for (String s : list) {
            System.out.println(s);

        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

}
