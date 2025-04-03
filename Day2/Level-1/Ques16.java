import java.io.*;
public class Ques16
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
for (int i = 1; i <= n; i++) {
if(i%2 == 0){
System.out.println("The number " + i + " is even");
}
else{
System.out.println("The number " + i + " is odd");
}
}
}
}