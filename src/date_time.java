import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date_time {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh/mm/ss a");
        Date date = cal.getTime();
        String d = dinhDang.format(date);
        System.out.println("result: "+d);
    }
}
