package custom.classes;
import java.util.*;
import java.text.*;



public class DateFunctions {
	public static void main(String args[])
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		long convertedDate = 12345678910L;
		try
		{
			String inputDate = "2018-05-18T13:51:15";
			
			if (inputDate.isEmpty()|| inputDate == " "){
				Date date = df.parse("1970-01-01T00:00:00+02:00");
				convertedDate = date.getTime();
				convertedDate = (convertedDate)/1000;
					}
			else{			
				Date date = df.parse(inputDate);
				convertedDate = date.getTime();
				/*double plus2Hours = 7.2e+6;
				long epoch2Hours = Math.round(plus2Hours); 
				convertedDate = (convertedDate + epoch2Hours)/1000;*/
				convertedDate = (convertedDate)/1000;
			}
		}
		
		catch (ParseException e)
	    {
	    	e.printStackTrace();
	    }
	    //return convertedDate;
		System.out.println(convertedDate);
		
	}

}
