package Banks;

import java.util.UUID;

public class HDFC implements BankFunctions{

    public static double rateOfInterest;
    private String accountNo;
    private String password;
    private int balance;
    public String name;

    public HDFC(String password, int balance, String name) {
        accountNo = UUID.randomUUID().toString();
        this.password = password;
        this.balance = balance;
        this.name = name;
    }

    @Override
    public int checkbalance(String Password) {
        if(this.password.equals(Password))
        {
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance = money + balance;
        String updatedBalance = "Your money has been Successfully added in Your Account NO "+accountNo+" is "+balance;
        return updatedBalance;
    }

    @Override
    public String withdrawMoney(int drawMoney, String Password) {
        if(this.password.equals(Password))
        {
            if(drawMoney>balance)
            {
                return "You Do not have a Sufficient balance in your account. Sorry";
            }
            else
            {
                balance = balance - drawMoney;
                String remBalance = "After withdraw of "+drawMoney+" Rs. "+"Your Remaining Balance is "+ balance;
                return remBalance;
            }
        }
        else
        {
            return "Please check Your Password, we have found your password is incorrect";
        }

    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword))
        {
            this.password = newPassword;
            return "You have Successfully created a new Password. Thank You.";
        }
        else
        {
            return "You entered wrong password, Please enter your correct old password to make new password";
        }
    }

    @Override
    public double interestOnTotalMoney(int year) {

        double interest = (balance*year*rateOfInterest)/100;
        return interest;
    }
}
