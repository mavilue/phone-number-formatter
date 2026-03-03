package application;

import entities.PhoneService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mobile/landline number: ");
        String numberPhone = sc.nextLine();

        var result = PhoneService.process(numberPhone);

        if (result.isPresent()){
            System.out.println("Formatted number: " + result.get());
        } else {
            System.out.println("Invalid entry");
        }
    }
}
