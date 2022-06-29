import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String strDate, strTime = "";
        Date objDate = new Date();
        System.out.println("The date today is " + objDate);
        long time = objDate.getTime();
        System.out.println("Millisecond from 1970.1.1: " + time);

        strDate = objDate.toString();
        strTime = strDate.substring(11, (strDate.length() - 4));
        strTime = "Time: " + strTime.substring(0, 8);
        System.out.println(strTime);
        System.out.println(strDate);
    }
}
