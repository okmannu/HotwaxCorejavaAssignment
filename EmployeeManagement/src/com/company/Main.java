package com.company;
import java.io.*;
import java.util.*;


public class Main {



    public static void main(String[] args) throws Exception {
try {

    int choice = -1;
    Scanner scanner = new Scanner(System.in);  // it is int value
    Scanner scanner1 = new Scanner(System.in);   // it is String value

    File file = new File("E:\\file's\\Employee.txt");
    ArrayList<Employee> arrayList = new ArrayList<Employee>();

    ObjectOutputStream objectOutputStream = null;
    ObjectInputStream objectInputStream = null;

    ListIterator listIterator = null;

    //file is available or not available than array list data store
    if (file.isFile()) {
        objectInputStream = new ObjectInputStream(new FileInputStream(file));
        arrayList = (ArrayList<Employee>) objectInputStream.readObject();
        objectInputStream.close();
    }


    do {
        System.out.println(" 1. INSERT");
        System.out.println(" 2. DISPLAY");
        System.out.println(" 3. SEARCH");
        System.out.println(" 4. DELETE");
        System.out.println(" 5. UPDATE");
        System.out.println(" 6. SORT BY EMPLOYEE ID - ON CONSOLE");
        System.out.println(" 7. SORT BY EMPLOYEE ID - ON FILE");
        System.out.println(" 8. SORT BY EMPLOYEE NAME ASCENDING ");
        System.out.println(" 9. SORT BY EMPLOYEE NAME DESCENDING");
        System.out.println(" 10. 0.EXIT");
        System.out.print(" Enter Your Choice:- ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter How Many  Employee Enter You Want : ");
                int n = scanner.nextInt();
                for (int i = 0; i < n; i++) {

                    System.out.println("Enter Employee ID: ");
                    int eid = scanner.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String ename = scanner1.nextLine();

                    System.out.print("Enter Employee Email: ");
                    String email = scanner1.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int eage = scanner.nextInt();

                    System.out.print("Enter Employee DOB: ");
                    int edob = scanner.nextInt();

                    arrayList.add(new Employee(ename, email, eid, eage, edob));
                }
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                objectOutputStream.writeObject(arrayList);
                objectOutputStream.close();

                break;

            case 2:

                if (file.isFile()) {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                    objectInputStream.close();

                    System.out.println(".....................................................");
                    System.out.println("Employee Information");
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext())
                        System.out.println(listIterator.next());
                    System.out.println(".....................................................");
                } else {
                    System.out.println("File not Exists.....!");
                }
                break;


            case 3:
                if (file.isFile()) {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                    objectInputStream.close();

                    boolean found = false;
                    System.out.println("Enter Employee To Search : ");
                    int eid = scanner.nextInt();
                    System.out.println(".....................................................");
                    System.out.println("Employee Information");
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        Employee employee = (Employee) listIterator.next();
                        if (employee.eid == eid) {
                            System.out.println(employee);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not Found...!");
                    }
                    System.out.println(".....................................................");
                } else {
                    System.out.println("File not Exists.....!");
                }
                break;

            case 4:
                if (file.isFile()) {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                    objectInputStream.close();

                    boolean found = false;
                    System.out.print("Enter Employee To Delete : ");
                    int eid = scanner.nextInt();
                    System.out.println(".....................................................");
                    System.out.println("Employee Information");
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        Employee employee = (Employee) listIterator.next();
                        if (employee.eid == eid) {
                            listIterator.remove();
                            found = true;
                        }
                    }
                    if (found) {
                        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                        objectOutputStream.writeObject(arrayList);
                        objectOutputStream.close();
                        System.out.println("Record Delete Successfully....!");
                    } else {
                        System.out.println("Record not Found...!");
                    }
                    System.out.println(".....................................................");
                } else {
                    System.out.println("File not Exists.....!");
                }
                break;

            case 5:
                if (file.isFile()) {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                    objectInputStream.close();

                    boolean found = false;
                    System.out.print("Enter Employee To Update : ");
                    int eid = scanner.nextInt();
                    System.out.println(".....................................................");
                    System.out.println("Employee Information");
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        Employee employee = (Employee) listIterator.next();
                        if (employee.eid == eid) {


                            System.out.println("Enter New Employee Name");
                            String ename = scanner1.nextLine();

                            System.out.println("Enter New Employee Email");
                            String eemail = scanner1.nextLine();

                            System.out.println("Enter New Employee Age");
                            int eage = scanner1.nextInt();

                            System.out.println("Enter New Employee DOB");
                            int ebad = scanner1.nextInt();

                            listIterator.set(new Employee(ename, eemail, eid, eage, ebad));
                            found = true;
                        }
                    }
                    if (found) {
                        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                        objectOutputStream.writeObject(arrayList);
                        objectOutputStream.close();
                        System.out.println("Record Updated Successfully....!");
                    } else {
                        System.out.println("Record not Found...!");
                    }
                    System.out.println(".....................................................");
                } else {
                    System.out.println("File not Exists.....!");
                }
                break;

            case 6:
                if (file.isFile()) {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                    objectInputStream.close();


                    Collections.sort(arrayList, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee e1, Employee e2) {
                            return e1.eid - e2.eid;
                        }
                    });
                    System.out.println(".....................................................");
                    System.out.println("Employee Information");
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext())
                        System.out.println(listIterator.next());
                    System.out.println(".....................................................");
                } else {
                    System.out.println("File not Exists.....!");
                }
                break;

            case 7:
                if (file.isFile()) {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                    objectInputStream.close();


                    Collections.sort(arrayList, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee e1, Employee e2) {
                            return e1.eid - e2.eid;
                        }
                    });  // file data sorted
                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                    objectOutputStream.writeObject(arrayList);
                    objectOutputStream.close();

                    System.out.println(".....................................................");
                    System.out.println("Employee Information");
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext())
                        System.out.println(listIterator.next());
                    System.out.println(".....................................................");
                } else {
                    System.out.println("File not Exists.....!");
                }
                break;

            case 8:
                if (file.isFile()) {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                    objectInputStream.close();


                    Collections.sort(arrayList, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee e1, Employee e2) {
                            return e1.ename.compareTo(e2.ename);
                        }
                    });  // file data sorted
                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                    objectOutputStream.writeObject(arrayList);
                    objectOutputStream.close();

                    System.out.println(".....................................................");
                    System.out.println("Employee Information");
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext())
                        System.out.println(listIterator.next());
                    System.out.println(".....................................................");
                } else {
                    System.out.println("File not Exists.....!");
                }
                break;


            case 9:
                if (file.isFile()) {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                    objectInputStream.close();


                    Collections.sort(arrayList, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee e1, Employee e2) {
                            return e2.ename.compareTo(e1.ename);
                        }
                    });  // file data sorted
                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                    objectOutputStream.writeObject(arrayList);
                    objectOutputStream.close();

                    System.out.println(".....................................................");
                    System.out.println("Employee Information");
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext())
                        System.out.println(listIterator.next());
                    System.out.println(".....................................................");
                } else {
                    System.out.println("File not Exists.....!");
                }
                break;
        }


    } while (choice != 0);
    {
        System.out.println("Please Enter Valid Choice Number");
    }
}catch (InputMismatchException e){
    e.printStackTrace();

}catch (FileNotFoundException e){
    e.printStackTrace();
}
    }
}


class Employee implements Serializable {

    String ename;
    String eemail;
    int eage;
    int edob;
    int eid;

    Employee(String ename, String eemail, int eid, int eage, int edob) {
        this.ename = ename;
        this.eemail = eemail;
        this.eid = eid;
        this.eage = eage;
        this.edob = edob;
    }

    public String toString() {
        return eid + " " + ename + " " + eemail + " " + eage + " " + edob;
    }

}