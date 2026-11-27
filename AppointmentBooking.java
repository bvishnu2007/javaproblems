import java.util.Scanner;

class AppointmentBooking {

    String patientName = "Rahul";
    int age = 25;
    String appointmentTime = "10:30 AM";

    String[] availableSlots = {"09:00 AM", "10:30 AM", "12:00 PM"};

    void bookAppointment(Scanner sc) {

        try {
            if (patientName == null) {
                throw new NullPointerException();
            }

            System.out.println("Patient Name: " + patientName);
            System.out.println("Name Length: " + patientName.length());

            if (age <= 0) {
                throw new IllegalArgumentException("Age must be greater than zero");
            }

            System.out.println("Patient Age: " + age);

            System.out.println("Available Appointment Slots:");

            for (int i = 0; i < availableSlots.length; i++) {
                System.out.println(i + ". " + availableSlots[i]);
            }

            System.out.print("Enter appointment slot position: ");
            int position = Integer.parseInt(sc.nextLine());

            appointmentTime = availableSlots[position];
            System.out.println("Selected Appointment: " + appointmentTime);
            System.out.println("Appointment Booked Successfully");
        }
        catch (NullPointerException e) {
            System.out.println("Patient information is missing");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid appointment slot position");
        }
        finally {
            System.out.println("Appointment Booking Process Completed");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AppointmentBooking a = new AppointmentBooking();

        a.bookAppointment(sc);
    }
}