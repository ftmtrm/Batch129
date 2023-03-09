package ProjectStudies.ATM_Project;

import java.util.Scanner;
public class ATM_Runner {
    static int select;

    public static void main(String[] args) {

        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        AccountService accountService = new AccountService();

        System.out.println("====Welcome TechnoBank ATM=====");
        System.out.println("1-Login");
        System.out.println("0-Cikis");
        System.out.println("Seciminiz: ");
        select = scanner.nextInt();
        if (select == 1) {
            accountService.login();
            do {
                System.out.println("=====Welcome TechnoBank ATM====");
                System.out.println("1-Login");
                System.out.println("2-Withdrawal");
                System.out.println("3-Deposit");
                System.out.println("4-Balance Inquiry");
                System.out.println("5-Transfer");
                System.out.println("6-Change Password");
                System.out.println("0-Exit");
                System.out.println("Seciminiz: ");
                select = scanner.nextInt();
                switch (select) {
                    case 1:
                        accountService.login();
                        break;
                    case 2:
                        accountService.withdrawal();
                        break;
                    case 3:
                        accountService.deposit();
                        break;
                    case 4:
                        accountService.balanceInquiry();
                        break;
                    case 5:
                        accountService.transfer();
                        break;
                    case 6:
                        accountService.changePassword();
                        break;
                    case 0:
                        System.out.println("Iyi gunler dileriz");
                        break;
                    default:
                        System.out.println("Hatali giris yaptiniz.Yeniden deneyiniz");
                }

            } while (select != 0);

        }
    }
}

