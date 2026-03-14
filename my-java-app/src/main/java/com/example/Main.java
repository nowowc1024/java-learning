package com.example;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("What is your name? ");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "! Welcome to Maven!");
while (true) {
System.out.print("Enter a message (or 'exit' to quit): ");
String input = scanner.nextLine();
if (input.equals("exit")) {
System.out.println("Goodbye, " + name + "!");
break;
}
System.out.println("You said: " + input);
}
scanner.close();
}
}
