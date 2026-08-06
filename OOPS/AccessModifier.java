/*
Access Modifier   within class   within package   outside package by subclass only    outside package

private               Yes             No                       No                           No

default               Yes             Yes                      No                           No

protected             Yes             Yes                      Yes                          No

public                Yes             Yes                      Yes                          Yes

*/

import javax.sound.sampled.SourceDataLine;

public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "VIRAJ JADHAV";
        System.out.println(myAcc.username);
        //myAcc.password = "abcdefg"; // Can't access outside the class
        myAcc.setPassword("abcdefg");
        // We still can't print the password
        // we need to use getters and setters
    }
    
}

class BankAccount {
    public String username;
    private String password;
    // We still can't access the 'PASSWORD' but we create a method that can store the password and it can accesseble outside the class
    public void setPassword(String pwd) {
        password = pwd;
    }
}