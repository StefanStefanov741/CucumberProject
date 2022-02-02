package uni.fmi.myproject.models;
import java.util.*;

public class Subject {

    private String Name;

    private Set<SchoolClass> classes;

    private Set<Grade> grades;

    private Set<Teacher> teachers;

    public Subject() {
    }
    
    public Subject(String name) {
    	this.Name = name;
    }
    
    public String getName() {
    	return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    public Set<Grade> getGrades() {
        if(this.grades ==null) {
        	this.grades = new HashSet<Grade>();
        }
        return grades;
    }

    public Set<SchoolClass> getClasses() {
    	 if(this.classes ==null) {
         	this.classes = new HashSet<SchoolClass>();
         }
         return classes;
    }

    public void setClasses(Set<SchoolClass> classes) {
    	this.classes = classes;
    }

    public void addClass(SchoolClass schoolclass) {
	   	 if(this.classes ==null) {
	      	this.classes = new HashSet<SchoolClass>();
	      }
	   	 classes.add(schoolclass);
    }

    public void removeClass(SchoolClass schoolclass) {
      	 if(this.classes ==null) {
           	this.classes = new HashSet<SchoolClass>();
           }
        classes.remove(schoolclass);
    }

    public void addGrade(Grade grade) {
      	 if(this.grades ==null) {
           	this.grades = new HashSet<Grade>();
           }
        	 grades.add(grade);
    }

    public void removeGrade(Grade grade) {
     	 if(this.grades ==null) {
            	this.grades = new HashSet<Grade>();
            }
     	grades.remove(grade);
    }

    public Set<Teacher> getTeachers() {
    	 if(this.teachers ==null) {
         	this.teachers = new HashSet<Teacher>();
         }
    	return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
	   	 if(this.teachers ==null) {
	      	this.teachers = new HashSet<Teacher>();
	      }
	 	 teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
    	if(this.teachers ==null) {
	      	this.teachers = new HashSet<Teacher>();
	      }
	 	 teachers.remove(teacher);
    }

}