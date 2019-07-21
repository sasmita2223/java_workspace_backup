
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class Student {
    Scanner sc = new Scanner(System.in);
    private int studentid;
    private String name;
    private String address;
    
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void acceptStudentDetails() {
        
        studentid = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        address = sc.nextLine();
    }
    
    public void displayStudentDetails() {
        System.out.println("Stuent ID: " + studentid);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}


public class EmpArrayList {
	
    public static void main(String[] args) throws ParseException {
        ArrayList<Student> st = new ArrayList<Student>();
        
        for(int i =1;i<=5;i++)
        {            
            Student student = new Student();
            student.acceptStudentDetails();
            st.add(student);
        }
        
        for(Student s : st) {
            s.displayStudentDetails();
        }
        String str = "12-JAN-2019";
        SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy EEEE");
        System.out.println(s.parseObject(str));
    }
}

/*output
 * Stuent ID: 1
Name: sasmita
Address: bng
Stuent ID: 2
Name: ram
Address: hsr
Stuent ID: 3
Name: madhu
Address: whitefield
Stuent ID: 4
Name: rahim
Address: gm pallya
Stuent ID: 5
Name: bittu
Address:marathali
 */


