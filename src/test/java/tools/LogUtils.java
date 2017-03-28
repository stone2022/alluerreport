package tools;
import org.apache.log4j.Logger;
public class LogUtils {
    public static Logger log=Logger.getLogger("logUtil tool");

   // private static Logger logger = Logger.getLogger(Zip.class);
     public static void info(String info){
         log.info(info);
     }
     public static void main(String[] ff){
         log.info("ff");
     }
     public static void error(String error){
         log.error(error);
     }
}
