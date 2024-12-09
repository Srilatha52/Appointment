package appointment;

import java.util.ArrayList;
import java.util.List;

public sealed class AppointmentChecker permits SpecificAppointmentChecker {
    public void checkAppointmentStatus(List<DetailsforAppointment> appointments, int appointmentId) {
        var appointmentsCopy = new ArrayList<>(appointments); 
        appointmentsCopy.stream()
                .filter(a -> a.getAppointmentId() == appointmentId)
                .findFirst()
                .ifPresentOrElse(
                        a -> {
                            try {
                                System.out.println("Appointment Found: " + a);
                                Thread.sleep(2500);  

                               
                                switch (a.getStatus()) {
                                    case cancelled -> {
                                        System.out.println("Status: cancelled");
                                        Thread.sleep(2500);
                                        System.out.println("Sorry, Appointment is cancelled.");
                                    }
                                    case completed -> {
                                        System.out.println("Status: completed");
                                        Thread.sleep(2500);
                                        System.out.println("Appointment completed successfully.");
                                    }
                                    case scheduled -> {
                                        System.out.println("Status: scheduled");
                                        Thread.sleep(2500);
                                        System.out.println("Appointment is scheduled.");
                                    }
                                }
                            } catch (InterruptedException e) {
                                System.out.println("Error while pausing: " + e.getMessage());
                            }
                        },
                        () -> System.out.println("No appointment found for ID: " + appointmentId)
                );
    }
}



