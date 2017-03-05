import java.io.*;

/**
 * Created by kanbe on 2017/2/23.
 */
public class FileTools {
   public static byte[] ReadFromFile(String srcPath){
       File file = new File (path);
        BufferedInputStream bis = null;
        ByteArrayOutputStream baos = null;
        byte[] bytes = new byte[5];
        int len = 0;
        if (file.exists()){
            try {
                FileInputStream fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                baos=new ByteArrayOutputStream();
                while (-1!=(len=bis.read(bytes))){
                    baos.write(bytes,0,len);
                    baos.flush();
                }
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return baos.toByteArray();
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
