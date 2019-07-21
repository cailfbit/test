import java.util.Date;
import java.text.SimpleDateFormat;

public class NowString {
    public static void main(String[] args) { 
          SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
          System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
          long now=System.currentTimeMillis();   //获取出来的是当前时间的毫秒值
          System.out.println(now);
    }
}
