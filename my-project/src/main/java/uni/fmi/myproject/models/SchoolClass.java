package uni.fmi.myproject.models;
import java.util.*;

public class SchoolClass {

    private String ClassName;

    private Set<Student> students;

    private Set<Subject> subjects;

    private Teacher class_teacher;
    
    public SchoolClass() {
    }
    
    public SchoolClass(String name) {
    	this.ClassName = name;
    }
    
    public SchoolClass(String name, Set<Student>students,Set<Subject>subjects,Teacher teacher) {
    	this.ClassName=name;
    	this.students = students;
    	this.subjects = subjects;
    	this.class_teacher = teacher;
    }

    public String getName() {
        return ClassName;
    }

    public void setName(String name) {
        this.ClassName = name;
    }

    public Teacher getClassTeacher() {
        return class_teacher;
    }

    public void setClassTeacher(Teacher teacher) {
        this.class_teacher = teacher;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        if(this.students == null) {
        	this.students = new HashSet<Student>();
        }
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        if(this.students == null) {
        	return;
        }
        students.remove(student);
    }

    public void setSubjects(Set<Subject> subjects) {
    	this.subjects = subjects;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
    	if(this.subjects == null) {
    		this.subjects = new HashSet<Subject>();
        }
    	this.subjects.add(subject);
    }

    public void removeSubject(Subject subject) {
    	if(this.subjects == null) {
        	return;
        }
    	this.subjects.remove(subject);
    }

}