package appointment;

import java.util.List;

public sealed class AppointmentChecker permits SpecificAppointmentChecker {
	public void checkAppointmentStatus(List<DetailsforAppointment> appointments, int appointmentId) {
        appointments.stream()
                .filter(a -> a.getAppointmentId() == appointmentId)
                .findFirst()
                .ifPresentOrElse(
                        a -> {
                        	try {
                                System.out.println("Appointment Found: " + a);
                                Thread.sleep(2500);  // Pause for 1 second

                                if (a.getStatus() == StatusforAppointment.cancelled) {
                                    System.out.println("Status: cancelled");
                                    Thread.sleep(2500);  

                                    System.out.println("Sorry, Appointment is cancelled.");
                                    Thread.sleep(2500);  

                                    System.out.println("No Doctor is Assigned");
                                    Thread.sleep(2500);  

                                    System.out.println("Lab Reports: As appointment is cancelled no reports found");
                                    Thread.sleep(2500);  
                                }
                            } catch (InterruptedException e) {
                                System.out.println("Error while pausing: " + e.getMessage());
                            }
                        },
                        () -> System.out.println("No appointment found for ID: " + appointmentId)
                );
    }
}


