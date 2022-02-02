package uni.fmi.myproject.parent;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.myproject.models.Parent;
import uni.fmi.myproject.parent.model.ParentCheckGradeModel;

public class ParentSteps {
	
	private ParentCheckGradeModel model;
	
	@Given("^Родителят \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\", отваря екрана за проверка на оценки$")
	public void openCheckGradesScreen(String pfn, String pln, String ph) throws Throwable {
		model = new ParentCheckGradeModel();
		model.setParent(pfn,pln,ph);
	}

	@When("^Избира дете: \"([^\"]*)\"$")
	public void chooseChild(String name) throws Throwable {
		model.setChild(name);
	}

	@When("^Избира предмет: \"([^\"]*)\"$")
	public void pickSubject(String subject) throws Throwable {
		model.setSubject(subject);
	}

	@When("^Избира оценка: \"([^\"]*)\"$")
	public void chooseGrade(String grade) throws Throwable {
		model.setGrade(grade);
	}

	@When("^Натиска бутона за търсене$")
	public void search() throws Throwable {
		model.Search();
	}

	@Then("^Получава съобщение: \"([^\"]*)\"$")
	public void getMessage(String msg) throws Throwable {
		assertEquals(msg,model.FinalMessage());
	}

}
