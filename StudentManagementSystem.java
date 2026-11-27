import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> studentIds = new ArrayList<>();
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();
        LinkedList<String> attendanceList = new LinkedList<>();

        int choice = 0;

        while (choice != 11) {
            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Remove Student");
            System.out.println("6. Add Student Attendance");
            System.out.println("7. Display Attendance");
            System.out.println("8. Remove Attendance");
            System.out.println("9. Display Student Statistics");
            System.out.println("10. Sort Student Names");
            System.out.println("11. Exit");
            System.out.print("\nEnter Your Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    
                    System.out.print("\nEnter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    int marks = sc.nextInt();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
                    } else {
                        studentIds.add(id);
                        studentNames.add(name);
                        studentMarks.add(marks);
                        System.out.println("\nStudent Added Successfully!");
                    }
                    break;

                case 2:
                    
                    if (studentNames.isEmpty()) {
                        System.out.println("\nNo student records found.");
                    } else {
                        System.out.println("\n--------- STUDENT RECORDS ---------");
                        System.out.printf("%-10s %-20s %-10s\n", "ID", "Student Name", "Marks");
                        for (int i = 0; i < studentNames.size(); i++) {
                            System.out.printf("%-10d %-20s %-10d\n", studentIds.get(i), studentNames.get(i), studentMarks.get(i));
                        }
                        System.out.println("\nTotal Students: " + studentNames.size());
                    }
                    break;

                case 3:
                    System.out.print("\nEnter Student Name: ");
                    String searchName = sc.nextLine();

                    if (studentNames.contains(searchName)) {
                        int index = studentNames.indexOf(searchName);
                        System.out.println("\nStudent Found!");
                        System.out.println("ID: " + studentIds.get(index));
                        System.out.println("Name: " + studentNames.get(index));
                        System.out.println("Marks: " + studentMarks.get(index));
                    } else {
                        System.out.println("\nStudent not found!");
                    }
                    break;

                case 4:
                    System.out.print("\nEnter Student Name: ");
                    String updateName = sc.nextLine();

                    if (studentNames.contains(updateName)) {
                        int index = studentNames.indexOf(updateName);
                        System.out.print("Enter New Marks: ");
                        int newMarks = sc.nextInt();

                        if (newMarks < 0 || newMarks > 100) {
                            System.out.println("Invalid Marks! Must be between 0 and 100.");
                        } else {
                            studentMarks.set(index, newMarks);
                            System.out.println("\nStudent Marks Updated Successfully!");
                            System.out.println("Updated Record -> Name: " + studentNames.get(index) + ", Marks: " + studentMarks.get(index));
                        }
                    } else {
                        System.out.println("\nStudent does not exist!");
                    }
                    break;

                case 5:
                    System.out.print("\nEnter Student Name to Remove: ");
                    String removeName = sc.nextLine();

                    if (studentNames.contains(removeName)) {
                        int index = studentNames.indexOf(removeName);
                        studentIds.remove(index);
                        studentNames.remove(index);
                        studentMarks.remove(index);
                        System.out.println("\nStudent Removed Successfully!");
                    } else {
                        System.out.println("\nStudent does not exist!");
                    }
                    break;

                case 6:
                    System.out.print("\nEnter Present Student Name: ");
                    String attName = sc.nextLine();

                    System.out.println("1. Add Normally (End)");
                    System.out.println("2. Add at Beginning (addFirst)");
                    System.out.print("Choose position: ");
                    int pos = sc.nextInt();

                    if (pos == 2) {
                        attendanceList.addFirst(attName);
                    } else {
                        attendanceList.addLast(attName);
                    }
                    System.out.println("Attendance marked for " + attName);
                    break;

                case 7:
                    if (attendanceList.isEmpty()) {
                        System.out.println("\nAttendance list is empty.");
                    } else {
                        System.out.println("\nPresent Students: " + attendanceList);
                        System.out.println("Total Present Students: " + attendanceList.size());

                        System.out.print("Search student in attendance (or press Enter to skip): ");
                        String checkAtt = sc.nextLine();
                        if (!checkAtt.isEmpty()) {
                            if (attendanceList.contains(checkAtt)) {
                                System.out.println(checkAtt + " is Present.");
                            } else {
                                System.out.println(checkAtt + " is Absent.");
                            }
                        }
                    }
                    break;

                case 8:
                    if (attendanceList.isEmpty()) {
                        System.out.println("\nAttendance list is already empty.");
                    } else {
                        System.out.println("1. Remove specific student");
                        System.out.println("2. Clear entire attendance list");
                        System.out.print("Enter choice: ");
                        int remChoice = sc.nextInt();
                        sc.nextLine();

                        if (remChoice == 1) {
                            System.out.print("Enter Student Name to remove from attendance: ");
                            String remAttName = sc.nextLine();
                            if (attendanceList.contains(remAttName)) {
                                attendanceList.remove(remAttName);
                                System.out.println(remAttName + " removed from attendance.");
                            } else {
                                System.out.println("Student not found in attendance list.");
                            }
                        } else if (remChoice == 2) {
                            attendanceList.clear();
                            System.out.println("All attendance records cleared!");
                        }
                    }
                    break;

                case 9:
                    if (studentMarks.isEmpty()) {
                        System.out.println("\nNo student data available for statistics.");
                    } else {
                        int highest = studentMarks.get(0);
                        int lowest = studentMarks.get(0);
                        int sum = 0;
                        int above75 = 0;

                        for (int i = 0; i < studentMarks.size(); i++) {
                            int m = studentMarks.get(i);
                            if (m > highest) {
                                highest = m;
                            }
                            if (m < lowest) {
                                lowest = m;
                            }
                            if (m > 75) {
                                above75++;
                            }
                            sum += m;
                        }

                        double average = (double) sum / studentMarks.size();

                        System.out.println("\nTotal Students: " + studentNames.size());
                        System.out.println("Highest Marks: " + highest);
                        System.out.println("Lowest Marks: " + lowest);
                        System.out.printf("Average Marks: %.2f\n", average);
                        System.out.println("Students Above 75: " + above75);
                    }
                    break;

                case 10:
                    if (studentNames.isEmpty()) {
                        System.out.println("\nNo students to sort.");
                    } else {
                        ArrayList<String> sortedNames = new ArrayList<>(studentNames);

                        Collections.sort(sortedNames);
                        System.out.println("\nAlphabetical Order: " + sortedNames);

                        Collections.reverse(sortedNames);
                        System.out.println("Reverse Order: " + sortedNames);
                    }
                    break;

                case 11:
                    System.out.println("\nExiting Student Management System...");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 11.");
            }
            System.out.println("------------------------------------");
        }

        
    }
}