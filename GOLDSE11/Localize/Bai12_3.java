package Localize;

import java.util.Locale;

public class Bai12_3 {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage(Locale.FRENCH));
        System.out.println(loc.getDisplayCountry(Locale.KOREAN));
        loc = new Locale("en");
        System.out.println(loc.getDisplayLanguage(Locale.US));
        System.out.println(loc.getDisplayCountry(Locale.US));
    }
}