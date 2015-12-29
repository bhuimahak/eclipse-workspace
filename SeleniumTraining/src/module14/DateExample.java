package module14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String dateStr = "10/02/2015";
		Date date = sdf1.parse(dateStr);
		System.out.println(dateStr);
		System.out.println(date);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		// cal.add(Calendar.YEAR, -1);
		// cal.add(Calendar.DATE, 10);
		// cal.set(Calendar.YEAR, 2010);

		int maxDateOftheMonth = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, maxDateOftheMonth);
		Date d2 = cal.getTime();

		System.out.println(d2);
		long diff = Math.abs(date.getTime() - d2.getTime());
		long daysDiff = diff / (1000 * 60 * 60 * 24);
		System.out.println(daysDiff);
		// int year = cal.get(Calendar.YEAR);
		// System.out.println(year);
		// ------------------------------- //
		// String outputDateStr = formatDateToANotherFormat("20110129",
		// "yyyyMMdd", "MMMM");
		// System.out.println(outputDateStr);
		
//		String abc = "xyz";
//		
//		String xyz = "hdhkfkdsofc;" + abc + "jefgwefljwief";
//		String pqr = "hdhkfkdsofc" + ";jefgwefljwief";
	}

	static String formatDateToANotherFormat(String inputDateString, String inputFormat, String outputFormat)
			throws ParseException {
		SimpleDateFormat inputSdf = new SimpleDateFormat(inputFormat);
		SimpleDateFormat outputSdf = new SimpleDateFormat(outputFormat);

		Date inputDate = inputSdf.parse(inputDateString);
		return outputSdf.format(inputDate);
	}

}
