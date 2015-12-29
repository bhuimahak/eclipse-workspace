package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCompare {
	static String date1 = "October 2016";
	static String date2 = "2/12/2015";

	public static void main(String[] args) throws ParseException {
		// compare
		int result = compareDate(date1, date2);
		if (result > 0) {
			System.out.println("Date1 is more than Date2.");
		} else if (result == 0) {
			System.out.println("Both the dates are same.");
		} else
			System.out.println("Date1 is less than Date2.");
	}

	public static int compareDate(String date1, String date2) throws ParseException {
		System.out.println("Date 1: " + date1 + ", Date 2: " + date2);

		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM yyyy");
		Date date11 = sdf1.parse(date1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		Date date22 = sdf2.parse(date2);

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date11);
		int year1 = cal1.get(Calendar.YEAR);
		int month1 = cal1.get(Calendar.MONTH);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date22);
		int year2 = cal2.get(Calendar.YEAR);
		int month2 = cal2.get(Calendar.MONTH);

		System.out.println("Month1: " + month1 + ", Month2: " + month2 + ", Year1: " + year1 + ", Year2: " + year2);
		
		if (year1 == year2) {
			return (month1 - month2);
		} else {
			return (year1 - year2);
		}
	}
}
