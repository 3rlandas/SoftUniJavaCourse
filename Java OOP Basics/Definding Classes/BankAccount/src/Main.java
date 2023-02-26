import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<Integer, BankAccount> bankAccounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String[] line = scanner.nextLine().split("\\s+");
            if (line[0].equals("End")) {
                break;
            }
            switch (line[0]) {

                case "Create":
                    createBankAccount();
                    break;
                case "Deposit":
                    depositSum(Integer.parseInt(line[1]), Double.parseDouble(line[2]));
                    break;
                case "SetInterest":
                    setInterest(Double.parseDouble(line[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                    break;
            }

        }

    }
    private static void getInterest(int account, int years) {
        if (bankAccounts.containsKey(account)) {
            System.out.printf("%.2f%n", bankAccounts.get(account).getInterestRate(years));
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void setInterest(double interest) {
        BankAccount.setInterestRate(interest);
    }

    private static void depositSum(int id, double amount) {
        if (bankAccounts.containsKey(id)) {
            bankAccounts.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to ID%d%n", amount, id);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void createBankAccount() {
        BankAccount bankAccount = new BankAccount();
        bankAccounts.put(bankAccount.getId(), bankAccount);
    }
}
