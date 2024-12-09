package appointment;

import java.util.*;
import java.util.function.Predicate;
import java.time.LocalDate;


public class SriSaiService {
	public static void main(String[] args) throws Exception {
		try {
        Client client1 = new Client(1, "Srilatha", 25);
        Client client2 = new Client(2, "LathaSri", 24);
        Client client3 = new Client(3, "Sri Latha", 16);

        Doctor doctor = new Doctor(108, "Dr. SriKanth");
        
        doctor.greeting();

        DetailsforAppointment appointment1 = new DetailsforAppointment(1, client1, LocalDate.of(2024, 2, 29), StatusforAppointment.scheduled, doctor);
        DetailsforAppointment appointment2 = new DetailsforAppointment(2, client2, LocalDate.of(2024, 2, 28), StatusforAppointment.cancelled, doctor);
        DetailsforAppointment appointment3 = new DetailsforAppointment(3, client3, LocalDate.of(2024, 2, 25), StatusforAppointment.completed, doctor);

        List<DetailsforAppointment> appointments = List.of(appointment1, appointment2, appointment3);

        Predicate<DetailsforAppointment> isScheduled = a -> a.getStatus() == StatusforAppointment.scheduled;
        long countScheduled = appointments.stream().filter(isScheduled).count();
        
        Thread.sleep(1000);
        System.out.println("Appointments scheduled today: " + countScheduled);
        
        
        Thread.sleep(1000);
        StringBuilder report = new StringBuilder("Daily Appointments:\n");
        appointments.forEach(appointment -> report.append(appointment).append("\n"));
        System.out.println(report);

        try {
            riskyOperation();
        } catch (Exception e) {
        	/*Thread.sleep(500);
        	System.out.println("Caught checked exception: " + e.getMessage());*/
        }
        Thread.sleep(1000); 
        try {
            causeRuntimeError();
        } catch (RuntimeException e) {
        	/*Thread.sleep(500);
        	System.out.println("Caught unchecked exception: " + e.getMessage());*/
        }
        Thread.sleep(1000);
        AppointmentChecker checker = new SpecificAppointmentChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter appointment ID to check:");
        int appointmentId = scanner.nextInt();
        Thread.sleep(1000);
        checker.checkAppointmentStatus(appointments, appointmentId);
        
        Thread.sleep(1000); 
        Reports labReport = appointmentId == 1 || appointmentId == 3
                ? new Reports(1, client1, "Reports are normal")
                : new Reports(appointmentId, null, "No data found");
        System.out.println("Lab Report: " + labReport);

        scanner.close();
		}catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void riskyOperation() throws Exception {
        throw new Exception("Risky operation failed!");
    }

    private static void causeRuntimeError() {
        throw new RuntimeException("Runtime error occurred!");
    }
}
