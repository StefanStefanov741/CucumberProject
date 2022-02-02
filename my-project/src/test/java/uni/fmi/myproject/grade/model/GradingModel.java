package uni.fmi.myproject.grade.model;

import uni.fmi.myproject.models.Grade;
import uni.fmi.myproject.models.SchoolClass;
import uni.fmi.myproject.models.Student;
import uni.fmi.myproject.models.Subject;
import uni.fmi.myproject.service.grade.GradingService;

public class GradingModel {
	private SchoolClass schoolclass = new SchoolClass();
	private Student student = new Student();
	private Subject subject = new Subject();
	private int grade = 0;
	private String message = "";
	
	public void SetClass(String class_name) {
		this.schoolclass = GradingService.GetClassByName(class_name);
	}
	
	public void SetStudent(String student_name) {
		this.student = GradingService.GetStudentByName(student_name);
	}
	
	public void SetSubject(String subject) {
		this.subject = GradingService.GetSubjectByName(subject);
	}
	
	public void SetGrade(int grade) {
		this.grade = grade;
	}
	
	public void clickAddGrade() {
		message = GradingService.AddGrade(schoolclass,student,subject,grade);
	}
	
	public String FinalMessage() {
		return message;
	}
}
