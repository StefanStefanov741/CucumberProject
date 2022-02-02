package uni.fmi.myproject.models;
import java.util.*;

public class Teacher extends User {

    private String Fname;

    private String Lname;

    private SchoolClass schoolclass;

    private Set<Subject> subjects;

    public Teacher() {
    }
    
    public String getFname() {
    	return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setFname(String name) {
        this.Fname = name;
    }

    public void setLname(String name) {
    	this.Lname = name;
    }

    public SchoolClass getSchoolClass() {
        return schoolclass;
    }

    public void setClass(SchoolClass schoolclass) {
        this.schoolclass = schoolclass;
    }

    public Set<Subject> getSubjects() {
        if(subjects == null) {
        	subjects = new HashSet<Subject>();
        }
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(Subject sub) {
    	if(subjects == null) {
        	subjects = new HashSet<Subject>();
        }
    	subjects.add(sub);
    }

    public void removeSubject(Subject sub) {
    	if(subjects == null) {
        	subjects = new HashSet<Subject>();
        }
    	subjects.remove(sub);
    }

}