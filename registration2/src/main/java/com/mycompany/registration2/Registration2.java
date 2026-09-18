/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration2;
import java.util.Scanner;
/**
 *
 * @author Nompumelelo
 */
public class Registration2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");         
        System.out.println("-----Registration------");     
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Enter Username (must contain _ and <=5 chars): ");
        String username = input.nextLine();
        System.out.print("Enter Password (8 chars, capital, number, special): ");
        String password = input.nextLine();
        System.out.print("Enter Cell (+27...): ");
        String cellphone = input.nextLine();
        
        login login = new login(firstName, lastName, username, password, cellphone);
        
        if (login.checkUserName()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        
        if (login.checkPasswordComplexity()) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }
        
        if (login.checkCellPhoneNumber()) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
        
        System.out.println(login.registerUser());
        
        if (login.loginUser(username, password)) {
            System.out.println("");         
            System.out.println("-----Login-------");
            System.out.print("Enter login username: ");
            String lu = input.nextLine();
            System.out.print("Enter login password: ");
            String lp = input.nextLine();
            System.out.println(login.returnLoginStatus(lu, lp));
        }
        input.close();
    }
}
    

