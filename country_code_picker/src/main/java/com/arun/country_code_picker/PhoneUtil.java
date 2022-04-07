package com.arun.country_code_picker;

import android.content.Context;
import android.telephony.TelephonyManager;

public class PhoneUtil {

    public static String GetCountryZipCode(Context context){
        String CountryID="";
        String CountryZipCode="";

        TelephonyManager manager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        //getNetworkCountryIso
        if (manager!=null){
            CountryID= manager.getSimCountryIso().toUpperCase();
        }
        if (CountryID.equals("")){
            CountryID=context.getResources().getConfiguration().locale.getCountry();
        }

        String[] rl=context.getResources().getStringArray(R.array.CountryCodes);
        for (String s : rl) {
            String[] g = s.split(",");
            if (g[1].trim().equals(CountryID.trim())) {
                CountryZipCode = g[0];
                break;
            }
        }
        return CountryZipCode;
    }
}
