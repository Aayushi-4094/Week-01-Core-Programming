import java.io.*;
public class Ques12
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
System.out.println("Enter a power");
int power=Integer.parseInt(br.readLine());
int result = 1;
for (int i = 1; i <= power; i++) {
result *= n;
}
System.out.println("Result of the number "+ n+" with Power "+ power +" is " + result);

}
}
