package testDemo01;

import org.junit.jupiter.api.Test;
import xp.CosineSimilarity;

public class CosineSimilarityTest {
    @Test
    public void test1(){
        String content1="今天是星期天，天气晴，今天晚上我要去看电影。";
        String content2="今天是周天，天气晴朗，我晚上要去看电影。";
        double  score= CosineSimilarity.getSimilarity(content1,content2);

        String  str = String.format("%.2f",score);
        double number = Double.parseDouble(str);
        System.out.println("查重率：" +number);
    }

}
