package Java_Assignment5;

import java.util.Scanner;

//User-defined exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String msg) {
     super(msg);
 }
}

public class VoteEligibility {
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Candidate is not eligible to vote");
     } else {
         System.out.println("Candidate is eligible to vote");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter age: ");
     int age = sc.nextInt();

     try {
         checkAge(age);
     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     }
 }
}

