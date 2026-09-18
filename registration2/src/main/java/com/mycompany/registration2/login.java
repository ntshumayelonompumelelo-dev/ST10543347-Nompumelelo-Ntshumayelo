/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration2;

/**
 *
 * @author Nompumelelo
 */
public class login {
 String firstName;
    String lastName;
    String username;
    String password;
    String cellphone;

    public login(String firstName, String lastName, String username, String password, String cellphone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellphone = cellphone;
    }

    // 3a. Check username - must contain _ and <=5 chars
    public Boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // 3b. Check password complexity
    public Boolean checkPasswordComplexity() {
        return password.length() >= 8
                && password.matches(".[A-Z].")
                && password.matches(".[0-9].")
                && password.matches(".[!@#$%^&()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }

    // 3c. Check cell phone - Regex for +27...
    public Boolean checkCellPhoneNumber() {
        return cellphone.matches("^\\+27[0-9]{9}$");
    }

    // 3d. registerUser - returns messages from your brief
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        return "User registered successfully.";
    }

    // 3e. loginUser
    public Boolean loginUser(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    // 3f. returnLoginStatus - messages from your brief page 2
    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if (loginUser(enteredUsername, enteredPassword)) {
            return "Welcome " + firstName + " " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}   

