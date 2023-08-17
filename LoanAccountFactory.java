package FactoryPatternBank;
public class LoanAccountFactory{
        public static BankAccount createAccount(){
            return new LoanAccount(15.2);
        }
    }

