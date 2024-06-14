/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_system;

/**
 *
 * @author nkuna
 */
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        
        // Adding some test accounts
        atm.addAccount(new Account("1234567890", "1234", 1000.0));
        atm.addAccount(new Account("6543215667", "4321", 500.0));
        atm.addAccount(new Account("4269896670", "0000", 0.0));
        atm.addAccount(new Account("9762837629", "4379", 500.0));
         
        Options options = new Options(atm);
        options.start();
    }
}
