/ Account Details:
Create a class ‘Account’ in which all the fields are declared private.
Attributes are as follows:
int account_number;
int account_balance;
Get n user details and store them in the private variables. The account number to which the deposit must be made is then read. If an account number already exists, print the account balance; otherwise, display "Account Number Does Not Exist."
Note:
Use public setter and getter methods to set and read the value of the attributes.
The initial value of account_balance is zero.

Input Format
The first integer input represents n number of users.
Each user's account number and initial deposit amount are represented by the next n entries.
The last integer input represents the account number for which the balance needs to be displayed.

Output Format
Display the balance for the given account number.
Refer sample output

Sample Input
2
1111
40000
1112
45000
1111
Sample Output
40000
Sample Input
2
1111
40000
1112
45000
1113
Sample Output
Account Number does not exist/
  import java.util.Scanner;

class Account {
    private int accNo, accBal;

    public void set(int a, int b) {
        accNo = a;
        accBal = b;
    }
    
    public int getNo(){
        return accNo;
    }

    public void getBal() {
        System.out.println(accBal);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Account[] accounts = new Account[n];
        for (int i = 0; i < n; i++) {
            Account a = new Account();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            a.set(x,y);
            accounts[i] = a;
        }
        
        int acc = sc.nextInt();
        for(Account a : accounts){
            if(a.getNo() == acc){
                a.getBal();
                return;
            }
        }
        System.out.println("Account Number does not exist");
    }

}
