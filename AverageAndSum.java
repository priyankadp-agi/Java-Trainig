import java.util.*;
public class AverageAndSum {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

int sum = 0;
int count = 0;
int product = 1;
String choice = "";
while(!choice.equals("q")) {
System.out.println("Enter a number or q");
choice = sc.nextLine();
if(!choice.equals("q")) {
int n = Integer.parseInt(choice);
sum = sum + n ;
product = product * n;
count++;
}

}
System.out.println("Average is " +(float) sum/count);
}



}
