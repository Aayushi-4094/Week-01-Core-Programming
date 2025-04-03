import java.util.*;
public class Ques9 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of rows");
int m = input.nextInt();
System.out.println("Enter the number of columns");
int n = input.nextInt();
int[][] arr = new int[m][n];
System.out.println("Enter the numbers");
for(int i = 0;i<m;i++){
for(int j = 0;j<n;j++){
arr[i][j] = input.nextInt();
}
}
int idx = 0;
int[] arr2 = new int[m*n];
for(int i =0;i<m;i++){
for(int j = 0;j<n;j++){
arr2[idx++] = arr[i][j];
}
}
for(int element : arr2){
System.out.print(element +" ");
}
}
}