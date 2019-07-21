package test.manipal;

class Employee {
    int id;
    String name;

    public Employee() {
        id = 222;
        name = "John";
    }

    public Employee(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }
}
