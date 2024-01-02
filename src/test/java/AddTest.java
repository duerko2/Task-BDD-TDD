import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.NegativeNumberException;
import org.example.StringCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class AddTest {

    private StringCalculator stringCalculator;
    private String string;

    @Given("the stringCalculator")
    public void the_string_calculator() {
        // Write code here that turns the phrase above into concrete actions
        stringCalculator = new StringCalculator();
    }
    @When("user inputs {string}")
    public void user_inputs(String string) {
        // Write code here that turns the phrase above into concrete actions
        this.string = string.replace("\\n","\n");

    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) throws NegativeNumberException {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(int1,stringCalculator.add(string));
    }

    @Then("the result should fail with {string}")
    public void the_result_should_fail_with(String string)  {
        Throwable exception = assertThrows(NegativeNumberException.class,() ->{
           stringCalculator.add(this.string);
        });

        assertEquals(string,exception.getMessage());
    }

}
