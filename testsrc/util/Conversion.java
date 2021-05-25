package util;

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
}
