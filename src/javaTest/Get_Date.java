package javaTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Get_Date {
    /*時間格式*/
    private static SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss:SSS");

    protected static String getDateNow(){
        /*取得目前時間*/
        Date timeCurrent = new Date();
        /*格式化時間*/
        return sdf0.format(timeCurrent);
    }

    protected static String getTimeDifference(String timeStart, String timeEnd) throws ParseException {
        Date start = sdf0.parse(timeStart);
        Date end = sdf0.parse(timeEnd);
        long l =  end.getTime() - start.getTime();
        long day =  l / (24 * 60 * 60 * 1000);
        long hour = (l / (60 * 60 * 1000) - day * 24);
        long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = ((l / 1000) - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        long ms = l - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000 - hour * 60 * 60 * 1000 - min * 60 * 1000 - s * 1000;
        return "共花費 "+String.valueOf(day)+" 天 "+String.valueOf(hour)+" 小時 "+String.valueOf(min)+" 分 "+String.valueOf(s)+" 秒 "+String.valueOf(ms)+" 毫秒";
    }
}
