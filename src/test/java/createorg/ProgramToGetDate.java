package createorg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProgramToGetDate {
	public static void main(String[] args) {
	  
		Date dateObj= new Date();
		System.out.println(dateObj.toString());//it will return date and time in its own format
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");//this class is used to get only the date that too in our required format
		System.out.println(sim.format(dateObj));//this is used to capture the actual date(current date)

		
		Calendar cal = sim.getCalendar();//getcalendar() is a method which contains the entire calendar information, it returns the calendar object
		cal.add(Calendar.DAY_OF_MONTH, 30);
		String reqDate=sim.format(cal.getTime());//this is used to get the required date
		System.out.println(reqDate);
		
		
		
		
		
		
	  
	  
	  
	}

}
