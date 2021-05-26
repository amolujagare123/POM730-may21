package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String convertGender(String genderID) // 0,1,2
    {
        String convertedGender = "";

        switch (genderID)
        {
            case "0" : convertedGender = "Male";break;
            case "1" : convertedGender = "Female";break;
            case "2" : convertedGender = "Other";break;

        }
        return  convertedGender;
    }

    public static String convertCountry(String shortCountry) // database
    {
        String convertedCountry = "";

        switch (shortCountry) {
            case "IN":
                convertedCountry = "India";
                break;
            case "CN":
                convertedCountry = "China";
                break;
            case "AF":
                convertedCountry = "Afghanistan";
                break;
            case "AQ":
                convertedCountry = "Antarctica";
                break;

        }

        return convertedCountry;
    }

    /*  1990-02-21
        database date --> yyyy-MM-dd


        excel /expected date

        --> 02/21/1990
        --> MM/dd/yyyy  */

    public static String convertDate(String dbDate) throws ParseException //yyyy-MM-dd
    {
        String convertedDate = "";

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDate);

        convertedDate =  new SimpleDateFormat("MM/dd/yyyy").format(date);

        return  convertedDate ;
    }
}
