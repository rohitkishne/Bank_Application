package Banks;

public interface BankFunctions {
    public int checkbalance(String Password);
    public String addMoney(int money);
    public String withdrawMoney(int drawMoney, String Password);
    public String changePassword(String oldPassword, String newPassword);
    public double interestOnTotalMoney(int year);
}
