
import java.io.*;
public class Ques2
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a salary");
int salary = Integer.parseInt(br.readLine());
System.out.println("Enter a year of service");
int service = Integer.parseInt(br.readLine());
double bonusAmount = 0.0;
if(service>=5)
{
int bonus = service;
bonusAmount = salary + ((bonus * salary)/100);
System.out.println("The Bonus amount is  " + bonusAmount );
}
else{
System.out.println("The no Bonus received");
}
}
}

