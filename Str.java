package VG;

public class Str {

    // Podaj STRING oraz ILOŚĆ ZNAKÓW. [STRING]
    public static String getLeft(String yourString,int length){
        int stringlength=yourString.length();
        if(stringlength<=length){
            return yourString;
        }
        return yourString.substring((stringlength-length));
    }
    public static String getRight(String yourString,int length){
        int stringlength=yourString.length();
        if(stringlength<=length){
            return yourString;
        }
        String yourNewString = yourString.replace(yourString.substring((stringlength-length)),"");
        return yourNewString;
    }
    
}

