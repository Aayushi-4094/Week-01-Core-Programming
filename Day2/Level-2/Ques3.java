import java.io.*;
public class Ques3
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number between 6 and 9");
int n=Integer.parseInt(br.readLine());
for (int i = 1; i <= 10; i++) {
System.out.println(n + " * "+ i +" = "+ (i*n));
}
}
}
