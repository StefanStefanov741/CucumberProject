package uni.fmi.myproject.models;
import java.util.*;

public class Parent extends User {

    private String Fname;

    private String Lname;

    private String phone;

    private Set<Student> students;

    public Parent() {
    }
    
    public Parent(String fn, String ln, String num) {
    	this.Fname = fn;
    	this.Lname = ln;
    	this.phone = num;
    }
    
    public Set<Student> getChildren() {
    	if(students==null) {
    		students = new HashSet<Student>();
    	}
    	return students;
    }

    public void setChildren(Set<Student> child) {
        this.students = child;
    }

    public void addChild(Student child) {
    	if(students==null) {
    		students = new HashSet<Student>();
    	}
    	students.add(child);
    }

    public void removeChild(Student child) {
    	if(students==null) {
    		return;
    	}
    	students.remove(child);
    }

    public String getFname() {
    	return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setFname(String name) {
        this.Fname = name;
    }

    public void setLname(String name) {
        this.Lname = name;
    }

    public void setPhone(String phone) {
    	this.phone = phone;
    }
    
    public String GetFullName() {
    	return Fname+" "+Lname;
    }

}