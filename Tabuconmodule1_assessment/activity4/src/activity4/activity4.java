package activity4;

import java.util.*;
public class activity4
{
public boolean endsNg(String str) 
{
int len = str.length();
String ng = "ng";
if (len < 2)
return false;
else if (ng.equals(str.subst­ring(len-2,len)))
return true;
else
return false;
}
public static void main (String[] args)
{
activity4 m= new activity4();
String str1 = "string";
System.out.println("­The given strings is: "+str1);
System.out.println("­The string containing ng at last: "+m.endsNg(str1));
}
}