package utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class readTxt {
   private  static final Properties pro;
    private  static  String origin;
    private  static  String  plagiarism;

    static {
       pro = new Properties();
       InputStream is = readTxt.class.getClassLoader().getResourceAsStream("txt.properties");
       try {
           pro.load(is);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
    public static List<String> readString1(){
        String originPath = pro.getProperty("origin");
        String plagiarismPath=pro.getProperty("plagiarism");
        List<String> list=new ArrayList<>();

        Path path = Paths.get(originPath);
        byte[] data;
        try {
            data = Files.readAllBytes(path);
          origin = new String(data, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        path =Paths.get(plagiarismPath);
        try{
            data=Files.readAllBytes(path);
            plagiarism=new String(data, StandardCharsets.UTF_8);
        }catch (Exception e){
            System.out.println(e);
        }
        list.add(origin);
        list.add(plagiarism);
        return list;




    }

}
