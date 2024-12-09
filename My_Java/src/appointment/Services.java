package appointment;

public interface Services {
	void displayDetails();

    default void greeting() {
        System.out.println("Welcome to SriSaiService: Patient Administration!");
        internalLogic();
    }

    static void policies() {
        System.out.println("System Policies:\n1. Continuous monitoring of patient outcomes and satisfaction.\n2. Ensure appointments are addressed effectively.");
    }

    private void internalLogic() {
        System.out.println("Internal logic for healthcare management.");
    }

}
