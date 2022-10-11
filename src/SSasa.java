import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * @ClassName: SSasa
 * @Author: DKL
 * @CreateTime: 2022-09-09  16:09
 */
public class SSasa {
    public static void main(String[] args) {
        System.out.println("2222");
        System.out.println("3333");
        System.out.println("4444");
        String zf = "<select class=\"form-control jie\" style=\"width: 150px;background-color: rgba(255,255,255,0);\"" +
                " id=\"areaCode\" name=\"areaCode\" autocomplete=\"off\" data-bv-field=\"areaCode\"><option " +
                "value=\"\">请选择</option><option value=\"440118001\">荔城街道</option><option " +
                "value=\"440118002\">增江街道</option><option value=\"440118003\">朱村街道</option><option " +
                "value=\"440118004\">永宁街道</option><option value=\"440118005\">荔湖街道</option><option " +
                "value=\"440118006\">宁西街道</option><option value=\"440118101\">新塘镇</option><option " +
                "value=\"440118102\">石滩镇</option><option value=\"440118103\">中新镇</option><option " +
                "value=\"440118104\">正果镇</option><option value=\"440118105\">派潭镇</option><option " +
                "value=\"440118106\">小楼镇</option><option value=\"440118107\">仙村镇</option></select>";
        getData(zf);
    }

    private static void getData(String zf) {
        String s = zf.replace("</option>", ",");
        String surplusString = getSurplusString(s, "<", ">");
        String s2 = surplusString.substring(0, surplusString.length() - 1);
        List<String> list = Arrays.asList(s2.split(","));
        for (String s1 : list) {
            if (!s1.equals("请选择")){
                System.out.println("+++"+s1);
            }
        }

    }


    private static String getSurplusString(String body, String str1, String str2) {
        while (true) {
            int index1 = body.indexOf(str1);
            if (index1 != -1) {
                int index2 = body.indexOf(str2, index1);
                if (index2 != -1) {
                    String str3 = body.substring(0, index1) + body.substring(index2 +    str2.length(), body.length());
                    body = str3;
                }else {
                    return body;
                }
            }else {
                return body;
            }
        }
    }


    public static void getSum(){
        ArrayList<Double> list = new ArrayList<>();
        list.add(2.2);
        list.add(2.2);
        list.add(2.2);
        list.add(2.2);
        list.add(2.2);
        double sum = 0;
        for (Double a : list) {
            sum+=a;
        }
        System.out.println(sum);
    }


    /**
     * @description:
     * @author: dkl
     * @date: 2022/9/14 9:56
     **/
    public static void getName(){
        Calendar cal = Calendar.getInstance();
        // 将每周第一天设为星期一，默认是星期天
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.add(Calendar.DATE, -1 * 7);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        String format = f.format(cal.getTime());
        System.out.println(format);
    }

    /**
     * @description: 获取上周日的日期
     * @author: dkl
     * @date: 2022/9/14 15:14
     * @return: Date
     **/
    public static void getSunday() {
        Calendar cal = Calendar.getInstance();
        //将每周第一天设为星期一，默认是星期天
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.add(Calendar.DATE, -1*7);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        String format = f.format(cal.getTime());
        System.out.println(format);
    }



}
