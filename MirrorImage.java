package get.image;
import java.util.Scanner;
public class MirrorImage 
{
	/*public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("EARTH");
		StringBuffer str1 = str;
		System.out.println("INPUT "+ str1);
		StringBuffer str2 = str1.reverse();
		System.out.println("OUTPUT " + "EARTH" + "|" + str2);
		
	}*/
    public static String getImage(String str)
    {
           StringBuffer sbr = new StringBuffer(str);
           sbr.append('|');
           StringBuffer sb = new StringBuffer(str);
           sb.reverse();
           sbr.append(sb);
           return sbr.toString();
    }
    public static void main(String[] ar)
    {
           Scanner s = new Scanner(System.in);
           System.out.println("Enter a String");
           String str = s.next();
           System.out.println(getImage(str));
    }
}


