package uni.fmi.myproject.models;
import java.util.*;

public class Student extends User {

    private String Fname;

    private String Sname;

    private String Lname;

    private String EGN;

    private SchoolClass school_class;

    private Set<Grade> grades;

    private Set<Parent> parents;

    public Student() {
    }
    
    public Student(String fname, String sname, String lname, String EGN, SchoolClass cls) {
    	this.Fname = fname;
    	this.Sname = sname;
    	this.Lname = lname;
    	this.EGN = EGN;
    	this.school_class = cls;
    }
    
    public Student(String fname, String sname, String lname, String EGN, Set<Parent>parents, SchoolClass cls) {
    	this.Fname = fname;
    	this.Sname = sname;
    	this.Lname = lname;
    	this.EGN = EGN;
    	this.parents = parents;
    	this.school_class = cls;
    }
    
    public String getFname() {
    	return Fname;
    }

    public String getSname() {
        return Sname;
    }

    public String getLname() {
        return Lname;
    }

    public String getEGN() {
    	return EGN;
    }

    public Set<Parent> getParents() {
        if(parents == null) {
        	this.parents = new HashSet<Parent>();
        }
        return parents;
    }

    public void setParents(Set<Parent> parents) {
        this.parents = parents;
    }

    public Set<Grade> getGrades() {
    	if(grades == null) {
    		this.grades = new HashSet<Grade>();
    	}
    	return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    public void addGrade(Grade grade) {
    	if(grades == null) {
    		this.grades = new HashSet<Grade>();
    	}
    	grades.add(grade);
    }
    
    public SchoolClass getSchoolClass() {
    	return school_class;
    }

    public void setClass(SchoolClass schoolclass) {
        this.school_class = schoolclass;
    }

}