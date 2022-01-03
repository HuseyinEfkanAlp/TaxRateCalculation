import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tax1 = 1.18; //$0 - $1000 tax rate 18%
        double tax2 = 1.08; //$1000 < $$ tax rate %8
        double amount;
        double taxedAmount;
        double taxAmount; // amount of tax added to the principal
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the amount you want to calculate tax : ");
        amount = scn.nextDouble();
        if (amount > 1000){
            taxedAmount = amount * tax2;
            taxAmount = taxedAmount-amount;
            System.out.println("The amount you entered : " + amount
                                +"\n"+"Taxed amount : "+taxedAmount +
                                "\n Amount of tax added to the principal : "+taxAmount);
            }
        else{
            taxedAmount = amount * tax1;
            taxAmount = taxedAmount-amount;
            System.out.println("The amount you entered : " + amount
                    +"\n"+"Taxed amount : "+taxedAmount +
                    "\n Amount of tax added to the principal : "+taxAmount);

        }
    }
}
