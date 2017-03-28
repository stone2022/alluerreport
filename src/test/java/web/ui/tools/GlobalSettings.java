package web.ui.tools;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by meicai on 2017/1/10.
 */
public class GlobalSettings {
    public static String path="D:\\zhoufeng-zhiliang\\alluerreport\\res\\WebUI\\config.ini";
    public static Properties config=getPro();
    public static int inter_time=Integer.parseInt(config.getProperty("inter_time","2000"));
    public static int browser_type=Integer.parseInt(config.getProperty("browser_type","2"));


    public static Properties getPro(){
        Properties pro=new Properties();
        FileInputStream ins=null;
        try {
            System.out.println("patch=="+path);
           ins= new FileInputStream(path);
            pro.load(ins);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                ins.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return pro;
    }
    public static void main(String[] arg){

        System.out.println("all test is");
    }
}
