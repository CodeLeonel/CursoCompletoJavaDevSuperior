package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static SimpleDateFormat sdfDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
	
	public static String dateFormat(Date date) {
		
		return sdfDate.format(date);
	
	}

	public static String dateTimeFormat(Date date) {
		
		return sdfDateTime.format(date);
		
	}
	
	public static Date dateParse(String source) throws ParseException {
		
		return sdfDate.parse(source);
	
	}

	public static Date dateTimeParse(String source) throws ParseException {
		
		return sdfDateTime.parse(source);
		
	}
	
	
	
	
	
}
