package com.company;

import com.model.AddressModel;
import com.model.StudentModel;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SerializationTest {


    void Serialization(String file) throws ParseException {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter FirstName");
        String sname = scanner.next();

        System.out.print("Enter Bod");
        String sdob = scanner.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(sdob);

        System.out.print("Enter city");
        String scity = scanner.next();

        System.out.print("Enter state");
        String sstate = scanner.next();

        System.out.print("Enter pinCode");
        Integer spinCode = scanner.nextInt();

        System.out.print("Enter country");
        String scountry = scanner.next();


        AddressModel addressModel = new AddressModel(scity, sstate, spinCode, scountry);

        StudentModel studentModel = new StudentModel(sname, date, addressModel);


        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(studentModel);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

}






