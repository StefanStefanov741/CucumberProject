package uni.fmi.myproject.grade;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.myproject.grade.model.GradingModel;

public class GradingSteps {
	private GradingModel model;
	
	@Given("^Преподавателят отваря екрана за писане на нова оценка$")
	public void OpenGradingScreen() throws Throwable {
		model = new GradingModel();
	}

	@When("^Избира клас: \\\"([^\\\"]*)\\\"$")
	public void ChooseClass(String cls) throws Throwable {
		model.SetClass(cls);
	}

	@When("^Избира ученик: \"([^\"]*)\"$")
	public void ChooseStudent(String student) throws Throwable {
		model.SetStudent(student);
	}
	

	@When("^Избира предмет: \"([^\"]*)\"$")
	public void ChooseSubject(String subj) throws Throwable {
		model.SetSubject(subj);
	}
	
	@When("^Избира оценка: \"([^\"]*)\"$")
	public void ChooseGrade(String grdString) throws Throwable {
		int grd = 0;
		try {
			grd=Integer.parseInt(grdString);
		} catch (NumberFormatException e) { }
		model.SetGrade(grd);
	}

	@When("^Натиска бутона за добавяне на оценката$")
	public void AddGrade() throws Throwable {
		model.clickAddGrade();
	}

	@Then("^Получава съобщение: \"([^\"]*)\"$")
	public void CorrectMessage(String msg) throws Throwable {
		assertEquals(msg,model.FinalMessage());
	}

}
