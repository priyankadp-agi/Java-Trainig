import java.util.regex.*;
public class PatternRegex 
{
	public static void main(String[] args) 
	{
		String regex="..mo";
		String str="smosmos";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		while(m.find()) 
		{
		System.out.println(true);
		}


	}

}