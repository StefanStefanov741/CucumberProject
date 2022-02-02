package uni.fmi.myproject.parent.model;

import uni.fmi.myproject.models.Parent;
import uni.fmi.myproject.models.Student;
import uni.fmi.myproject.models.Subject;
import uni.fmi.myproject.service.parent.ParentService;

public class ParentCheckGradeModel {
	private Parent parent;
	private Student student;
	private Subject subject;
	private int grade = 0;
	private String message = "";
	
	public void setParent(String fn, String ln, String ph) {
		this.parent=ParentService.GetParentByInfo(fn,ln,ph);
	}
	
	public void setChild(String name) {
		if(name.isEmpty()) {
			student = null;
		}else {
			this.student = ParentService.GetStudentByName(name);
		}
	}

	public void setSubject(String subject2) {
		this.subject = ParentService.GetSubjectByName(subject2);
	}

	public void setGrade(String grade2) {
		if(!grade2.equals("") && !grade2.isEmpty()) {
			this.grade = Integer.parseInt(grade2);
		}
	}

	public void Search() {
		this.message = ParentService.searchGrades(parent,student,subject,grade);
	}

	public String FinalMessage() {
		return message;
	}
	
}
