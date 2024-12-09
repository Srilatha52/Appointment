package appointment;


import java.util.List;

public class SchedulingforAppointment {
	public void schedule(DetailsforAppointment... appointments) {
        Arrays.stream(appointments).forEach(System.out::println);
    }

    public void batchSchedule(String description, List<DetailsforAppointment> appointments) {
        System.out.println(description);
        appointments.stream().forEach(System.out::println);
    }

}
