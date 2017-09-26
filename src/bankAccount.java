import javax.swing.*;

public class bankAccount {
    public static void main(String[] args) {
        String accnum,person;
        double balance;


        accnum = JOptionPane.showInputDialog("Account Number:");
        balance = Double.parseDouble(JOptionPane.showInputDialog("Balance"));

        person =JOptionPane.showInputDialog("Account Holder:");

        JOptionPane.showMessageDialog(null,"Account Number: "+accnum);
        JOptionPane.showMessageDialog(null,"Balance: "+balance);
        JOptionPane.showMessageDialog(null,"Account Holder: "+person);
    }
}
