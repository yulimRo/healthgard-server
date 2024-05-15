package com.healthgard.server.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
	
	public static String convertToStrYYYYMMDD_Dash(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
		String strDate = format.format(date);
		return strDate;
	}

}
