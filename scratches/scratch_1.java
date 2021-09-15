import java.util.Calendar;
import java.util.Date;

class Scratch {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date d =  new Date(cal.getTimeInMillis());

        System.out.println("년도 : " + cal.get(Calendar.YEAR));
        System.out.println("월 : " + cal.get(Calendar.MONTH));
        System.out.println("일 : " + cal.get(Calendar.DATE));
        System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));


        cal.set(Calendar.HOUR_OF_DAY, 10); // 날짜 바꾸기기
        cal.set(Calendar.MINUTE, 10);

    }
}