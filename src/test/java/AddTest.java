import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {

    private StringCalculator stringCalculator;
    private int result;

    @Given("the stringCalculator")
    public void the_string_calculator() {
        // Write code here that turns the phrase above into concrete actions
        stringCalculator = new StringCalculator();
    }
    @When("user inputs {string}")
    public void user_inputs(String string) {
        // Write code here that turns the phrase above into concrete actions
        result = stringCalculator.add(string);
    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(int1,result);
    }

}
