package Banks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SBI.rateOfInterest = 7.0;
        HDFC.rateOfInterest = 6.5;
        System.out.println("Enter Your SBI Details : ");
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        System.out.println();
        System.out.print("Enter Your Password : ");
        String pass = sc.next();
        System.out.println();
        System.out.print("Enter Your balance : ");
        int bal = sc.nextInt();
        System.out.println();
        SBI firstCustomer = new SBI(pass,bal,name);

        System.out.println();
        System.out.println("Enter Your HDFC Details : ");
        System.out.print("Enter Your Name : ");
        String nam = sc.next();
        System.out.println();
        System.out.print("Enter Your Password : ");
        String pas = sc.next();
        System.out.println();
        System.out.print("Enter Your balance : ");
        int bala = sc.nextInt();
        System.out.println();
        HDFC secondCustomer = new HDFC(pas,bala, nam);

        int no;
        do{
            System.out.println("Enter 1 for Check Your Balance");
            System.out.println("Enter 2 for Add Money");
            System.out.println("Enter 3 for Withdraw Money");
            System.out.println("Enter 4 for Change Password");
            System.out.println("Enter 5 for Check Interest On Money");
            System.out.println("Enter 0 for exit");
            no = sc.nextInt();
            switch(no) {

//                case 1:
//                //check Balance with wrong password
//                    System.out.println("Check Balance with wrong pwd : ");
//                    int sbiBal = firstCustomer.checkbalance("111");
//                    int hdfcBal = secondCustomer.checkbalance("111");
//                    System.out.println(sbiBal);
//                    System.out.println(hdfcBal);
                case 1:
                //check Balance with correct password
                    System.out.print("Enter Your SBI Password : ");
                    String pws = sc.next();
                    System.out.println();
                    System.out.print("Enter Your HDFC Password : ");
                    String pwh = sc.next();
                    System.out.println();
                    System.out.println("Check Balance with right pwd : ");
                    int sbiBala = firstCustomer.checkbalance(pws);
                    int hdfcBala = secondCustomer.checkbalance(pwh);
                    System.out.println(sbiBala);
                    System.out.println(hdfcBala);
                    break;
                case 2:
                //add money
                    System.out.println("Add Money : ");
                    String sbiadd = firstCustomer.addMoney(5000);
                    String hdfcadd = secondCustomer.addMoney(5000);
                    System.out.println(sbiadd);
                    System.out.println(hdfcadd);
                    break;
                case 3:
                //withdraw money
                    System.out.print("Enter Your SBI Password : ");
                    String pwsb = sc.next();
                    System.out.println();
                    System.out.print("Enter Your HDFC Password : ");
                    String pwhd = sc.next();
                    System.out.println();
                    System.out.println("WithDraw Money : ");
                    String sbiwithDraw = firstCustomer.withdrawMoney(10000, pwsb);
                    String hdfcwithDraw = secondCustomer.withdrawMoney(10000, pwhd);
                    System.out.println(sbiwithDraw);
                    System.out.println(hdfcwithDraw);
                    break;
                case 4:
                //Change Password
                    System.out.println("Change Password : ");
                    System.out.println("First change Your SBI password");
                    System.out.print("Enter Your old Password : ");
                    String opwd = sc.next();
                    System.out.println();
                    System.out.print("Enter Your old Password : ");
                    String npwd = sc.next();
                    System.out.println();

                    System.out.println("First change Your HDFC password");
                    System.out.print("Enter Your old Password : ");
                    String ohpwd = sc.next();
                    System.out.println();
                    System.out.print("Enter Your old Password : ");
                    String nhpwd = sc.next();
                    System.out.println();

                    String sbipwd = firstCustomer.changePassword(opwd, npwd );
                    String hdfcpwd = secondCustomer.changePassword(ohpwd, nhpwd);
                    System.out.println(sbipwd);
                    System.out.println(hdfcpwd);
                    break;
                case 5:
                //Check Interest Money
                    System.out.println("Check Interest Money : ");
                    double sbiInterest = firstCustomer.interestOnTotalMoney(4);
                    double hdfcInterest = secondCustomer.interestOnTotalMoney(4);
                    System.out.println("Your Interest Amount is " + sbiInterest);
                    System.out.println("Your Interest Amount is " + hdfcInterest);
                    break;
            }

        }while(no != 0);
        System.out.println("Exit");


    }
}