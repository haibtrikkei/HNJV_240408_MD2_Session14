package date_time_api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NgayHienThoi {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyy");
        System.out.println("Hom nay la: "+sf.format(today));

        final LocalDate now = LocalDate.now();
        System.out.println("Hom nay la: "+now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
