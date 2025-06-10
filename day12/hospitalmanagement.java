package day12;
import java.util.Scanner;
class Patient {
    int id;
    String name;
    int age;
    String disease;
    Patient next;

    public Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.next = null;
    }
}

class Hospital {
    private Patient head;

    
    public void addPatient(int id, String name, int age, String disease) {
        Patient newPatient = new Patient(id, name, age, disease);
        if (head == null) {
            head = newPatient;
        } else {
            Patient temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newPatient;
        }
        System.out.println("Patient added successfully!");
    }

    
    public void displayPatients() {
        if (head == null) {
            System.out.println("No patients in the hospital.");
            return;
        }
        Patient temp = head;
        System.out.println("Patient Records:");
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Age: " + temp.age + ", Disease: " + temp.disease);
            temp = temp.next;
        }
    }

    // Delete patient by ID
    public void deletePatient(int id) {
        if (head == null) {
            System.out.println("No patients to delete.");
            return;
        }
        if (head.id == id) {
            head = head.next;
            System.out.println("Patient with ID " + id + " deleted.");
            return;
        }
        Patient temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Patient with ID " + id + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Patient with ID " + id + " deleted.");
        }
    }
}

public class hospitalmanagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int choice;

        do {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Delete Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();
                    hospital.addPatient(id, name, age, disease);
                    break;
                case 2:
                    hospital.displayPatients();
                    break;
                case 3:
                    System.out.print("Enter Patient ID to delete: ");
                    int delId = sc.nextInt();
                    hospital.deletePatient(delId);
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}

    

