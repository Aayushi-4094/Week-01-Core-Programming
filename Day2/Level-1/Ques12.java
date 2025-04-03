import java.io.*;
public class Ques12
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
if(n<=0){
System.out.println("Please enter a natural number");
}else{
int formulaSum=n*(n+1)/2;
int loopSum=0;
int i=1;
while(i<=n){
loopSum+=i;
i++;
}
System.out.println("Sum using formula: "+formulaSum);
System.out.println("Sum using while loop: "+loopSum);
if(formulaSum==loopSum){
System.out.println("Results match! Computation is correct");
}else{
System.out.println("Results don't match");
}
}
}
}