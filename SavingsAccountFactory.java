package FactoryPatternBank;

public class SavingAccountFactory {

        public static BankAccount createAccount(){
            return new SavingAccount(8.5);
        }
    }

