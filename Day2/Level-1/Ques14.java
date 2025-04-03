import java.io.*;
public class Ques14
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
int pro = 1;
int i = n;
while(i>=1){
pro *= i;
i--;
}
System.out.println("Factorial of number " + n + " is " + pro);
}
}