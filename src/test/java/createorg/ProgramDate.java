package createorg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProgramDate {
	public static void main(String[] args) {
		Date dateObj= new Date();
		System.out.println(dateObj.toString());
		
		SimpleDateFormat sim= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sim.format(dateObj));
		
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, -30);
		String reqDate=sim.format(cal.getTime());
		System.out.println(reqDate);
			
		}

}
