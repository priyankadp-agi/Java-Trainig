import java.util.Arrays;
import java.util.Scanner;
public class AlphabeticalOrder {
 
    // Function that checks whether
    // the string is in alphabetical
    // order or not
    static boolean isAlphabaticOrder(String s)
    {
        // length of the string
        int n = s.length();
       
        // create a character array
        // of the length of the string
        char c[] = new char [n];
       
        // assign the string
        // to character array
        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }
        Arrays.sort(c);
        
        // check if the character array
        // is equal to the string or not
        for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) 
                return false;
               
        return true;    
    }
     
    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        s = sc.nextLine();
        // check whether the string is
        // in alphabetical order or not
        if (isAlphabaticOrder(s))
           System.out.println("String is poitive");
        else
            System.out.println("String is negative");
           
    }
    // This Code is contributed by ANKITRAI1
}
