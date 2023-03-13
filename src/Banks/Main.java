package Banks;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7.0;
        HDFC.rateOfInterest = 6.5;
        SBI firstCustomer = new SBI("123",50000,"Rohit");

        HDFC secondCustomer = new HDFC("124",100000, " Arvind");

        //check Balance with wrong password
        System.out.println("Check Balance with wrong pwd : ");
        int sbiBal = firstCustomer.checkbalance("111");
        int hdfcBal = secondCustomer.checkbalance("111");
        System.out.println(sbiBal);
        System.out.println(hdfcBal);

        //check Balance with correct password
        System.out.println("Check Balance with right pwd : ");
        int sbiBala = firstCustomer.checkbalance("123");
        int hdfcBala = secondCustomer.checkbalance("124");
        System.out.println(sbiBala);
        System.out.println(hdfcBala);

        //add money
        System.out.println("Add Money : ");
        String sbiadd = firstCustomer.addMoney(5000);
        String hdfcadd = secondCustomer.addMoney(5000);
        System.out.println(sbiadd);
        System.out.println(hdfcadd);

        //withdraw money
        System.out.println("WithDraw Money : ");
        String sbiwithDraw = firstCustomer.withdrawMoney(10000, "123");
        String hdfcwithDraw = secondCustomer.withdrawMoney(10000,"124");
        System.out.println(sbiwithDraw);
        System.out.println(hdfcwithDraw);

        //Change Password
        System.out.println("Change Password : ");
        String sbipwd = firstCustomer.changePassword("123", "12345");
        String hdfcpwd = secondCustomer.changePassword("124","98765");
        System.out.println(sbipwd);
        System.out.println(hdfcpwd);

        //Check Interest Money
        System.out.println("Check Interest Money : ");
        double sbiInterest = firstCustomer.interestOnTotalMoney(4);
        double hdfcInterest = secondCustomer.interestOnTotalMoney(4);
        System.out.println("Your Interest Amount is "+sbiInterest);
        System.out.println("Your Interest Amount is "+hdfcInterest);




    }
}