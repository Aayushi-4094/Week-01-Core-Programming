
import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmt = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for(int i =0;i<10;i++){
            while(true){
                System.out.println("Enter the salary for employee "+(i+1));
                salary[i] = input.nextDouble();
                System.out.println("Enter the years of service for employee "+(i+1));
                yearsOfService[i] = input.nextDouble();
                break;
            }
        }
        for(int i = 0;i<10;i++){
            if(yearsOfService[i] > 5){
                bonusAmt[i] = salary[i] * 0.05;
            } else{
                bonusAmt[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonusAmt[i];
            totalBonus += bonusAmt[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Bonus Payout: "+totalBonus);
        System.out.println("Total Old Salary: "+totalOldSalary);
        System.out.println("Total New Salary: "+totalNewSalary);
    }
}