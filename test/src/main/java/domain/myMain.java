package domain;

import utils.readTxt;
import xp.CosineSimilarity;

import java.util.List;
import java.util.Scanner;

/**
 * 计算两个字符串的相识度
 */
public class myMain {

    public static String content1;

    public static  String content2;


    public static void main(String[] args) {
        int index=0;
        Scanner scan=new Scanner(System.in);
        while (index!=5){
            System.out.println("1.通过配置文件读取：");
            System.out.println("2.在输入出输入文件");
            System.out.println("请输入您想要读取文件的方式：");
            index =scan.nextInt();
            switch (index){
                case 1:readPre();break;
                case 2:readScan();break;

            }
        }

    }
    public static void readPre(){
        List<String> list= readTxt.readString1();
        content1= list.get(0);
        content2=list.get(1);
        double  score= CosineSimilarity.getSimilarity(content1,content2);
        System.out.println("相似度："+score);

        score=CosineSimilarity.getSimilarity(content1,content1);
        System.out.println("相似度："+score);
    }
    public static void readScan(){
      Scanner scan=new Scanner(System.in);
        System.out.println("请输入原文:");
      content1=scan.next();
        System.out.println("请输入抄袭文章:");
        content2=scan.next();
        double  score=CosineSimilarity.getSimilarity(content1,content2);
        System.out.println("相似度："+score);


    }



}
