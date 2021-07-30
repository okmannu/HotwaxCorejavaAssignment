package com.company;
import java.io.*;
import com.model.StudentModel;

public class DeserializationTest {
    void Deserialization(String file) {
        try {
            StudentModel smodel = new StudentModel();
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            smodel = (StudentModel) in.readObject();

            System.out.println("Deserialized Student...!");
            System.out.println("Name: " + smodel.getFirstName());
            System.out.println("BOD : " + smodel.getDateOfBirth());
            System.out.print("Address" + smodel.getAddress().getCity());
            System.out.print(" " + smodel.getAddress().getPinCode());
            System.out.print(" " + smodel.getAddress().getState());
            System.out.print(" " + smodel.getAddress().getCountry());
            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
    }
}






