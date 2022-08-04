
//prisha manish faldu
//21ce028
import java.util.Scanner;

public class Accoutn1 {
    public String id;
    double balance = 300;

    Accoutn1() {

    }

    public Accoutn1(String s) {
        id = s;
    }

    public static void main(String[] args) {
        Accoutn1[] acc = new Accoutn1[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            acc[i] = new Accoutn1();
            acc[i] = new Accoutn1("AC" + i);
            System.out.println(acc[i].id + " 100 ");
        }
        int k = 0;
        int l;
        int j;

        do {
            System.out.println("Enter valid ID number");
            String t = sc.next();
            for (j = 1; j <= 10; j++) {
                if (t.equals(acc[j].id)) {
                    k++;
                    break;

                } else {

                }
            }
            if (k == 0) {
                l = 10;
            } else {
                l = 3;
            }
        } while (l != 3);
        System.out.println("Hello");

        System.out.println("ENter 1 for balance");
        System.out.println("ENter 2 for withdraw");
        System.out.println("ENter 3 for deposit");
        System.out.println("ENter 4 for money transfer");
        System.out.println("ENter 5 for create account");
        System.out.println("ENter 6 for deactivate account");
        System.out.println("Enter 7 for exiting");
        int x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println(acc[2].balance);
                break;
            }
            case 2: {
                int s = sc.nextInt();
                acc[j].balance -= s;
                System.out.println(acc[2].balance);
                break;
            }
            case 3: {
                int s = sc.nextInt();
                acc[j].balance += s;
                System.out.println(acc[2].balance);
                break;
            }
            case 4: {
                int s = sc.nextInt();
                System.out.print("To be transferred in :");
                int i = sc.nextInt();
                acc[i].balance += s;
                acc[j].balance -= s;
                System.out.println(acc[j].balance);

                System.out.println(acc[i].balance);
                break;

            }
            case 5: {
                acc[11] = new Accoutn1();
                System.out.println("Account created");
                break;

            }
            case 6: {
                acc[j].balance = 0;
                acc[j].id = "0A";
                break;
            }

        }

    }
}
