import java.io.*;
public class Ques15
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
int pro = 1;
for (int i = n; i >= 1; i--) {
pro *= i;
}
System.out.println("Factorial of number " + n + " is " + pro);
}
}