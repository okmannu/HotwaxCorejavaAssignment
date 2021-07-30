package com.company;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        int number;
        System.out.println("Please enter your number");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();

        if (number == 1) {
            SerializationTest stest = new SerializationTest();
            stest.Serialization("C:\\Users\\dell\\IdeaProjects\\StudentProperty\\src\\com\\output1.ser");
        }
        if (number == 2) {
            DeserializationTest d = new DeserializationTest();
            d.Deserialization("C:\\Users\\dell\\IdeaProjects\\StudentProperty\\src\\com\\output1.ser");
        }
        if (number == 3) {
            SerializationTest stest = new SerializationTest();
            stest.Serialization("C:\\Users\\dell\\IdeaProjects\\StudentProperty\\src\\com\\output2.ser");
        }
        if (number == 4) {
            DeserializationTest d = new DeserializationTest();
            d.Deserialization("C:\\Users\\dell\\IdeaProjects\\StudentProperty\\src\\com\\output2.ser");
        }
    }
}








