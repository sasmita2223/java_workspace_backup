
abstract class Salary {
	//non abstract method
	    public int calcSalary(int hra,int da,int basic, int tax) {
        return (hra+da+basic)-tax;
    }
    // abstract method    
    public abstract int benefits();
}
class ProjectManager extends Salary { // exteding the abstract class
    public int benefits() { //overriding the abstract method
        return calcSalary(10000, 2000, 50000, 25000) + 23000;
    }
}

class ProjectLead extends Salary {
    public int benefits() {
        return calcSalary(5000, 1000, 30000, 5000) + 10000;
    }    
}

public class TestAbstractProgram {
    public static void main(String[] args) {
        ProjectManager obj = new ProjectManager();
        ProjectLead obj1 = new ProjectLead();
        System.out.println("PM: " + obj.benefits());
        System.out.println("PL: " + obj1.benefits());
    }
}

