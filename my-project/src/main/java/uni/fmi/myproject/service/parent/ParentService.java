package uni.fmi.myproject.service.parent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import uni.fmi.myproject.models.Grade;
import uni.fmi.myproject.models.Parent;
import uni.fmi.myproject.models.SchoolClass;
import uni.fmi.myproject.models.Student;
import uni.fmi.myproject.models.Subject;

public class ParentService {
	private static List<Student> childrenDB = new ArrayList<Student>();
	private static List<Subject> subjectsDB = new ArrayList<Subject>();
	private static List<Grade> gradesDB = new ArrayList<Grade>();
	private static List<Parent> parentsDB = new ArrayList<Parent>();
	
	public static void DummyDB() {
		//изчистване на предишно записаните данни
		childrenDB.clear();
		parentsDB.clear();
		subjectsDB.clear();
		gradesDB.clear();
		//създаване на предмети
		Subject sbj1 = new Subject("Математика");
		Subject sbj2 = new Subject("Български език");
		Subject sbj3 = new Subject("История");
		Subject sbj4 = new Subject("География");
		Subject sbj5 = new Subject("ФВС");
		Subject sbj6 = new Subject("Музика");
		//добавяне на предметите в базата с данни
		subjectsDB.add(sbj1);
		subjectsDB.add(sbj2);
		subjectsDB.add(sbj3);
		subjectsDB.add(sbj4);
		subjectsDB.add(sbj5);
		subjectsDB.add(sbj6);
		//създаване на класове
		SchoolClass class1 = new SchoolClass("1-А");
		SchoolClass class2 = new SchoolClass("2-А");
		SchoolClass class3 = new SchoolClass("3-А");
		SchoolClass class4 = new SchoolClass("4-А");
		//създаване на родители
		Parent p1 = new Parent("Йордан","Стоянов","0888777521");
		Parent p2 = new Parent("Марияна","Стоянова","0888777522");
		Parent p3 = new Parent("Красимир","Христов","0888777523");
		Parent p4 = new Parent("Пенчо","Пенчев","0888777524");
		Parent p5 = new Parent("Мария","Пенчева","0888777525");
		Parent p6 = new Parent("Иван","Иванов","0888777526");
		Parent p7 = new Parent("Донка","Младенова","0888777527");
		Parent p8 = new Parent("Михаил","Керанов","0888777528");
		Parent p9 = new Parent("Бойко","Борисов","0888777529");
		Parent p10 = new Parent("Владилена","Плевнелиева","0888777530");
		//добавяне на родителите в база с данни
		parentsDB.add(p1);
		parentsDB.add(p2);
		parentsDB.add(p3);
		parentsDB.add(p4);
		parentsDB.add(p5);
		parentsDB.add(p6);
		parentsDB.add(p7);
		parentsDB.add(p8);
		parentsDB.add(p9);
		parentsDB.add(p10);
		//създаване на set-ове от родители
		Set<Parent>setp1 = new HashSet<Parent>();
		setp1.add(p1);
		setp1.add(p2);
		Set<Parent>setp2 = new HashSet<Parent>();
		setp2.add(p3);
		Set<Parent>setp3 = new HashSet<Parent>();
		setp3.add(p4);
		setp3.add(p5);
		Set<Parent>setp4 = new HashSet<Parent>();
		setp4.add(p6);
		Set<Parent>setp5 = new HashSet<Parent>();
		setp5.add(p7);
		Set<Parent>setp6 = new HashSet<Parent>();
		setp6.add(p8);
		Set<Parent>setp7 = new HashSet<Parent>();
		setp7.add(p9);
		Set<Parent>setp8 = new HashSet<Parent>();
		setp8.add(p10);
		//създаване на ученици
		Student st1 = new Student("Стефан","Иванов","Стоянов","2412341234",setp1,class1);
		Student st2 = new Student("Стоян","Младенов","Христов","2423413133",setp2,class1);
		Student st3 = new Student("Маргарита","Иванова","Пенчева","2367341288",setp3,class2);
		Student st4 = new Student("Калоян","Стефанов","Иванов","2344444133",setp4,class2);
		Student st5 = new Student("Христо","Асенов","Младенов","2211111234",setp5,class3);
		Student st6 = new Student("Владислав","Владиславов","Керанов","222322223",setp6,class3);
		Student st7 = new Student("Кристиян","Христов","Борисов","2112333334",setp7,class4);
		Student st8 = new Student("Росен","Лазаров","Плевнелиев","2123444445",setp8,class4);
		//добавяне на учениците в базата от данни
		childrenDB.add(st1);
		childrenDB.add(st2);
		childrenDB.add(st3);
		childrenDB.add(st4);
		childrenDB.add(st5);
		childrenDB.add(st6);
		childrenDB.add(st7);
		childrenDB.add(st8);
		//създаване на оценки
		Grade gr1 = new Grade(5,sbj1,st1);
		Grade gr2 = new Grade(4,sbj2,st1);
		Grade gr3 = new Grade(6,sbj1,st2);
		Grade gr4 = new Grade(6,sbj2,st2);
		Grade gr5 = new Grade(5,sbj2,st3);
		Grade gr6 = new Grade(3,sbj1,st4);
		Grade gr7 = new Grade(5,sbj2,st5);
		Grade gr8 = new Grade(6,sbj1,st6);
		Grade gr9 = new Grade(4,sbj2,st7);
		Grade gr10 = new Grade(6,sbj2,st8);
		//добавяне на оценките в база с данни
		gradesDB.add(gr1);
		gradesDB.add(gr2);
		gradesDB.add(gr3);
		gradesDB.add(gr4);
		gradesDB.add(gr5);
		gradesDB.add(gr6);
		gradesDB.add(gr7);
		gradesDB.add(gr8);
		gradesDB.add(gr9);
		gradesDB.add(gr10);
	}
	
	public static String searchGrades(Parent p, Student st,Subject sub, int gr) {
		if(p==null || p==new Parent() || !parentsDB.stream().anyMatch(pr-> pr.getLname().equals(p.getLname())&&pr.getFname().equals(p.getFname())&&pr.getPhone().equals(p.getPhone()))){
			return "Проблем при оторизацията ви! Моля, влезте отново в акаунта си!";
		}
		if(st==null) {
			return "Моля, изберете ученик!";
		}
		boolean childExists = false;
		for(int i =0; i<childrenDB.size();i++) {
			if(childrenDB.get(i).getFullName().equals(st.getFullName())) {
				childExists = true;
			}
		}
		if(!childExists) {
			return "Избраният ученик не съществува! Моля, опреснете страницата!";
		}
		for(int i = 0; i<childrenDB.size();i++) {
			if(childrenDB.get(i).getFullName().equals(st.getFullName())) {
				boolean hasParent = false;
				ArrayList<Parent> parentsList = new ArrayList<>(childrenDB.get(i).getParents());
				for(int j=0;j<parentsList.size();j++) {
					if(parentsList.get(j).GetFullName().equals(p.GetFullName())) {
						hasParent=true;
					}
				}
				if(!hasParent) {
					return "Нямате достъп до оценките на този ученик!";
				}
				break;
			}
		}
		if(gr<0) {
			return "Невалидна оценка!";
		}
		if(sub.getName()!=null) {
			if(gr>=2 && gr<=6) {
				//Търсене по предмет и оценка
				if(gradesDB.stream().anyMatch(g-> g.getStudent().getFullName().equals(st.getFullName()) && g.getSubject().equals(sub) && g.getGrade()==gr)) {
					return "Открити оценки!";
				}else {
					return "Няма открити оценки!";
				}
			}else {
				//Търсене само по предмет
				if(gradesDB.stream().anyMatch(g-> g.getStudent().getFullName().equals(st.getFullName()) && g.getSubject().equals(sub))) {
					return "Открити оценки!";
				}else {
					return "Няма открити оценки!";
				}
			}
		}else {
			if(gr>=2 && gr<=6) {
				//Търсене само по оценка
				if(gradesDB.stream().anyMatch(g-> g.getStudent().getFullName().equals(st.getFullName()) && g.getGrade()==gr)) {
					return "Открити оценки!";
				}else {
					return "Няма открити оценки!";
				}
			}else {
				//Търсене само по ученик
				if(gradesDB.stream().anyMatch(g-> g.getStudent().getFullName().equals(st.getFullName()))) {
					return "Открити оценки!";
				}else {
					return "Няма открити оценки!";
				}
			}
		}
	}
	
	public static Student GetStudentByName(String name) {
		DummyDB();
		if(name == null) {
			return new Student();
		}
		for(int i = 0; i<childrenDB.size();i++) {
			if(name.equals(childrenDB.get(i).getFname()+" "+childrenDB.get(i).getSname()+" "+childrenDB.get(i).getLname())) {
				return childrenDB.get(i);
			}
		}
		return new Student();
	}
	
	public static Subject GetSubjectByName(String name) {
		DummyDB();
		for(int i = 0; i<subjectsDB.size();i++) {
			if(subjectsDB.get(i).getName().equals(name)) {
				return subjectsDB.get(i);
			}
		}
		return new Subject();
	}
	
	public static Grade GetGradeByInt(int grd) {
		DummyDB();
		return gradesDB.get(0);
	}

	public static Parent GetParentByInfo(String fn, String ln, String ph) {
		DummyDB();
		for(int i = 0; i<parentsDB.size();i++) {
			if(parentsDB.get(i).getFname().equals(fn)&&parentsDB.get(i).getLname().equals(ln)&&parentsDB.get(i).getPhone().equals(ph)) {
				return parentsDB.get(i);
			}
		}
		return new Parent();
	}
	
}
