
//prisha manish faldu
//21ce028
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Account {
    private int id = 0;
    private double balance = 500;
    private double annualInterestRate = 0.07;
    private Date date;

    Account() {

    }

    Account(int a, double b, double c) {

        id = a;
        balance = b;
        annualInterestRate = c;

    }

    public void getdata() {

        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        balance = sc.nextDouble();
        annualInterestRate = sc.nextDouble();

    }

    public void putdata() {
        System.out.println(id);
        System.out.println(balance);
        System.out.println(annualInterestRate);
    }

    public void getdate() {
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
        Date newdate = new Date();
        System.out.println(dateform.format(newdate));

    }

    public double getMonthlyIntrestRate() {
        double l;
        l = balance * annualInterestRate;
        System.out.println(l);
        return l;
    }

    public void Withdraw() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        balance -= l;

    }

    public void Deposit() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        balance += l;

    }

    public static void main(String[] args) {

        Account acc = new Account();
System.out.println("enter id balance and annual intrest rate");
        acc.getdata();
        System.out.println("data that you have entered");
        acc.putdata();
        System.out.println("date");
        acc.getdate();
        System.out.println("your monthly intrest");
        acc.getMonthlyIntrestRate();
        System.out.println("money you want to deposite");
        acc.Deposit();
        System.out.println("money you want to withdraw");
        acc.Withdraw();
        System.out.println("your final id balance and intrest rate");
        acc.putdata();

    }

}     

