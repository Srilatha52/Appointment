package appointment;

class Client extends Person {
	private int age;

    public Client(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void displayDetails() {
        System.out.println("Client[ID=" + id + ", Name=" + name + ", Age=" + age + "]");
    }

    @Override
    public String toString() {
        return "Client[ID=" + id + ", Name=" + name + ", Age=" + age + "]";
    }

}
