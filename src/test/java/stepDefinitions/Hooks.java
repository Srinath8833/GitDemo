package stepDefinitions;

;
import io.cucumber.java.Before;
import io.cucumber.messages.types.StepDefinition;

import java.io.IOException;

public class Hooks {

    @Before("@DeletePlace")
    public void beforeScenario() throws IOException {
        //write a code that will give you place id
        //Execute this code only when place id is null

        stepDefinitions m = new stepDefinitions();

        if(stepDefinitions.place_id == null)
        {
            m.add_place_payload_with("Shetty", "French", "Asia");
            m.user_calls_with_http_request("AddPlaceAPI", "POST");
            m.verify_place_id_created_maps_to_using("Shetty", "getPlaceAPI");

        }



    }

}



