package appointment;

public interface Services {
    void displayDetails();

    // Default method
    default void greeting() {
        System.out.println("Welcome to SriSaiService: Patient Administration!");
        internalLogic();
    }

    // Static method
    static void policies() {
        System.out.println("System Policies:\n1. Continuous monitoring of patient outcomes and satisfaction.\n2. Ensure appointments are addressed effectively.");
    }

    // Private method
    private void internalLogic() {
        System.out.println("Internal logic for healthcare management.");
    }
}
