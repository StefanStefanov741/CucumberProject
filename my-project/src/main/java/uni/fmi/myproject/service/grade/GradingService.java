package uni.fmi.myproject.service.grade;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.myproject.models.Grade;
import uni.fmi.myproject.models.SchoolClass;
import uni.fmi.myproject.models.Student;
import uni.fmi.myproject.models.Subject;

public class GradingService {
	
	private static List<SchoolClass> classesDB = new ArrayList<SchoolClass>();
	private static List<Student> studentsDB = new ArrayList<Student>();
	private static List<Subject> subjectsDB = new ArrayList<Subject>();
	private static List<Grade> gradesDB = new ArrayList<Grade>();
	
	public static void DummyDBs() {
		//изчистване на предишно записаните данни
		classesDB.clear();
		studentsDB.clear();
		subjectsDB.clear();
		gradesDB.clear();
		//създаване на предмети
		Subject sbj1 = new Subject("Математика");
		Subject sbj2 = new Subject("Български език");
		Subject sbj3 = new Subject("История");
		Subject sbj4 = new Subject("География");
		Subject sbj5 = new Subject("ФВС");
		Subject sbj6 = new Subject("Музика");
		//създаване на класове
		SchoolClass class1 = new SchoolClass("1-А");
		SchoolClass class2 = new SchoolClass("2-А");
		SchoolClass class3 = new SchoolClass("3-А");
		SchoolClass class4 = new SchoolClass("4-А");
		//създаване на ученици
		Student st1 = new Student("Стефан","Иванов","Стоянов","2412341234",class1);
		Student st2 = new Student("Стоян","Младенов","Христов","2423413133",class1);
		Student st3 = new Student("Маргарита","Иванова","Пенчева","2367341288",class2);
		Student st4 = new Student("Калоян","Стефанов","Иванов","2344444133",class2);
		Student st5 = new Student("Христо","Асенов","Младенов","2211111234",class3);
		Student st6 = new Student("Владислав","Владиславов","Керанов","222322223",class3);
		Student st7 = new Student("Кристиян","Христов","Борисов","2112333334",class4);
		Student st8 = new Student("Росен","Лазаров","Плевнелиев","2123444445",class4);
		//Добавяне на предмети в класове
		class1.addSubject(sbj1);
		class1.addSubject(sbj2);
		class1.addSubject(sbj6);
		class2.addSubject(sbj1);
		class2.addSubject(sbj2);
		class2.addSubject(sbj5);
		class3.addSubject(sbj1);
		class3.addSubject(sbj2);
		class3.addSubject(sbj3);
		class4.addSubject(sbj1);
		class4.addSubject(sbj2);
		class4.addSubject(sbj4);
		//Добавяне на ученици по класове
		class1.addStudent(st1);
		class1.addStudent(st2);
		class2.addStudent(st3);
		class2.addStudent(st4);
		class3.addStudent(st5);
		class3.addStudent(st6);
		class4.addStudent(st7);
		class4.addStudent(st8);
		//добавяне на класовете, предметите и учениците в "базата с данни"
		classesDB.add(class1);
		classesDB.add(class2);
		classesDB.add(class3);
		classesDB.add(class4);
		subjectsDB.add(sbj1);
		subjectsDB.add(sbj2);
		subjectsDB.add(sbj3);
		subjectsDB.add(sbj4);
		subjectsDB.add(sbj5);
		subjectsDB.add(sbj6);
		studentsDB.add(st1);
		studentsDB.add(st2);
		studentsDB.add(st3);
		studentsDB.add(st4);
		studentsDB.add(st5);
		studentsDB.add(st6);
		studentsDB.add(st7);
		studentsDB.add(st8);
	}
	
	public static String AddGrade(SchoolClass schoolclass, Student student, Subject subject, int grade) {
		DummyDBs();
		boolean classExists = false;
		for(int i = 0; i<classesDB.size();i++) {
			if(classesDB.get(i).getName().equals(schoolclass.getName())) {
				classExists = true;
			}
		}
		if(!classExists) {
			return "Класът, който сте избрали не съществува ! Моля, опреснете страницата!";
		}
		boolean subjectExists = false;
		for(int i = 0; i<subjectsDB.size();i++) {
			if(subjectsDB.get(i).getName().equals(subject.getName())) {
				subjectExists = true;
			}
		}
		if(!subjectExists) {
			return "Предметът, който сте избрали не съществува! Моля, опреснете страницата!";
		}
		boolean studentExists = false;
		for(int i = 0; i<studentsDB.size();i++) {
			if(studentsDB.get(i).getFullName().equals(student.getFullName())) {
				studentExists = true;
			}
		}
		if(!studentExists) {
			return "Ученикът, който сте избрали не съществува! Моля, опреснете страницата!";
		}
		if(grade<2 || grade>6) {
			return "Избраната оценка е невалидна!";
		}
		if(student.getSchoolClass().getName()!=schoolclass.getName()) {
			return "Несъвместимост между клас и ученик!";
		}
		if(!student.getSchoolClass().getSubjects().contains(subject)) {
			return "Несъвместимост между клас и предмет!";
		}
		Grade grd = new Grade(grade,subject,student);
		gradesDB.add(grd);
		return "Оценката е добавена успешно!";
	}
	
	public static SchoolClass GetClassByName(String name) {
		DummyDBs();
		for(int i = 0; i<classesDB.size();i++) {
			if(classesDB.get(i).getName().equals(name)) {
				return classesDB.get(i);
			}
		}
		return new SchoolClass();
	}

	public static Student GetStudentByName(String name) {
		DummyDBs();
		if(name == null) {
			return new Student();
		}
		for(int i = 0; i<studentsDB.size();i++) {
			if(name.equals(studentsDB.get(i).getFname()+" "+studentsDB.get(i).getSname()+" "+studentsDB.get(i).getLname())) {
				return studentsDB.get(i);
			}
		}
		return new Student();
	}

	public static Subject GetSubjectByName(String name) {
		for(int i = 0; i<subjectsDB.size();i++) {
			if(subjectsDB.get(i).getName().equals(name)) {
				return subjectsDB.get(i);
			}
		}
		return new Subject();
	}
}
