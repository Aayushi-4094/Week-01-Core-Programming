import java.io.*;
public class Ques14
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
System.out.println("Enter a power");
int power=Integer.parseInt(br.readLine());
int result = 1;
int i = 1;
while(i <= power) {
result *= n;
i++;
}
System.out.println("Result of the number "+ n+" with Power "+ power +" is " + result);
}
}