package uni.fmi.myproject.models;

public class Grade {

    private int grade;

    private Subject subject;

    private Student student;
    
    public Grade() {
    }
    
    public Grade(int grade,Subject sub, Student stu) {
    	this.grade = grade;
    	this.subject = sub;
    	this.student = stu;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
    	this.subject = subject;
    }

}