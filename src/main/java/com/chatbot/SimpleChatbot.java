package com.chatbot;

import opennlp.tools.tokenize.SimpleTokenizer;
import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        SimpleTokenizer tokenizer = SimpleTokenizer.INSTANCE;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hello! How can I help you today?");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.toLowerCase().contains("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String[] tokens = tokenizer.tokenize(userInput);
            System.out.println("Chatbot: You said: " + String.join(" ", tokens));
        }
        scanner.close();
    }
}
