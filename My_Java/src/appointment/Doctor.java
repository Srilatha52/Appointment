package appointment;

public class Doctor extends Person implements Services {
    public Doctor(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor[ID=" + id + ", Name=" + name + "]");
    }

    @Override
    public String toString() {
        return "Doctor[ID=" + id + ", Name=" + name + "]";
    }
}

