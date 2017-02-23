import java.io.*;

/**
 * Created by kanbe on 2017/2/23.
 */
public class FileTools {
   public static byte[] ReadFromFile(String srcPath){
       File file = new File (srcPath);
       byte[] bytes= new byte [8*1024];
       String data=null;
       try {
           FileInputStream fis = new FileInputStream(file);
           BufferedInputStream bis = new BufferedInputStream(fis);
           int len=0;
           while (-1!=(len=bis.read(bytes))){

           }
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
       return bytes;
   }
   public static void writetoFile(String src,String data,boolean cover){
       File file = new File (src);
       byte[] bytes=data.getBytes();
       try{
           FileOutputStream fos = new FileOutputStream(file);
           BufferedOutputStream bos = new BufferedOutputStream(fos);
           fos.write(bytes);
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
   }
}
