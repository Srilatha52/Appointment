package appointment;

import java.time.LocalDate;

public class DetailsforAppointment {
    private final int appointmentId;
    private final Client client;
    private final LocalDate date;
    private final StatusforAppointment status;
    private final Doctor doctor;

    public DetailsforAppointment(int appointmentId, Client client, LocalDate date, StatusforAppointment status, Doctor doctor) {
        this.appointmentId = appointmentId;
        this.client = client;
        this.date = date;
        this.status = status;
        this.doctor = doctor;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public StatusforAppointment getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Appointment[ID=" + appointmentId + ", Client=" + client + ", Date=" + date + ", Status=" + status + ", Doctor=" + doctor + "]";
    }
}

