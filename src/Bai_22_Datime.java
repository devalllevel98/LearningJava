import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai_22_Datime {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("xin chao"+ date + "/"+(month+1)+"/"+year);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy hh:mm:ss a");
        Date d = cal.getTime();
        System.out.println("datetime: "+format.format(d));

    }
}
