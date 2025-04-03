import java.io.*;
public class Ques7
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
for (int i = 1; i <= n; i++) {
if(n%i ==0){
System.out.println("Number" +n + " is divible by "+ i);
}
}
}
}