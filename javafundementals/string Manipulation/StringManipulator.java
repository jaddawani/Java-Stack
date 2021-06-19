

public class StringManipulator {
    public static String trimAndConcat(String string1, String string2) {
        return string1.trim().concat(string2.trim());
    }


public static Integer getIndexOrNull(String input, char c) {
        return input.indexOf(c) != -1 ? input.indexOf(c) : null;
    }



public static Integer getIndexOrNull(String input, String c) {
        return input.indexOf(c) != -1 ? input.indexOf(c) : null;
    }


public static String concatSubstring(String input,int x,int y, String c) {
      String str3=input.substring(x,y);
String g=str3+c;
return g;
    }

}
