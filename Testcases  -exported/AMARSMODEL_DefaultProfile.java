package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://herokuapp.cloud.testinsights.io/app/#!/model-engine/guid/f835385e-d1de-411a-a332-0ec3e277092d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 99, profileId = 100090)
public class AMARSMODEL_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"AMARS MODEL","AMARS MODEL - Default Profile"})
    @TestModellerPath(guid = "2244a95b-5d55-4456-8db9-bb9cceded14e")
    public void GoToUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginsUCCESS()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("10220abc-bf03-4f0c-9339-5066ddda1301");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7e84ed0f-950c-4e9b-850b-19f88fa9137d");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("5dcf7c14-08dd-49f9-80f9-320be69d4978");
    _The_Internet.Enter_Password("SuperSecretPassword!");
    

    TestModellerLogger.SetLastNodeGuid("ec408b44-5bf9-4d6f-b96d-ff2a0433849a");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"AMARS MODEL","AMARS MODEL - Default Profile"})
    @TestModellerPath(guid = "394b243b-7ab6-43be-b1f1-5c2e9817a5ac")
    public void GoToUrlPositiveEnterUsernameNegativeEnterPasswordClickLoginFAILED()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("10220abc-bf03-4f0c-9339-5066ddda1301");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7e84ed0f-950c-4e9b-850b-19f88fa9137d");
    _The_Internet.Enter_Username("tomsmith");
    

    TestModellerLogger.SetLastNodeGuid("d5ac08af-8d63-4b49-9226-c7fd79eaa5d8");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("e632b145-64b0-4e37-a1ce-7d6f8a1d3a15");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"AMARS MODEL","AMARS MODEL - Default Profile"})
    @TestModellerPath(guid = "5c8fcec7-312f-4e0c-927f-cc3b9030f54e")
    public void GoToUrlNegativeEnterUsernamePositiveEnterPasswordClickLoginFAILED()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("10220abc-bf03-4f0c-9339-5066ddda1301");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("927f4079-4538-4141-a278-f161255f5401");
    _The_Internet.Enter_Username("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("6acbccba-f855-4f28-8903-2ac00026cbfe");
    _The_Internet.Enter_Password("SuperSecretPassword!");
    

    TestModellerLogger.SetLastNodeGuid("0106565c-889e-419b-b073-4102c8b5e114");
    _The_Internet.Click__Login();
    

    }

    @Test  (groups= {"AMARS MODEL","AMARS MODEL - Default Profile"})
    @TestModellerPath(guid = "bd68738c-67d0-4dfa-8a16-f4e53c2b9cef")
    public void GoToUrlNegativeEnterUsernameNegativeEnterPasswordClickLoginFAILED()
    {
        
        pages.The_Internet _The_Internet = new pages.The_Internet(driver);
    TestModellerLogger.SetLastNodeGuid("10220abc-bf03-4f0c-9339-5066ddda1301");
    _The_Internet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("927f4079-4538-4141-a278-f161255f5401");
    _The_Internet.Enter_Username("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("8c8dafa7-648d-4b3a-97a7-4d3ef05cb466");
    _The_Internet.Enter_Password("#!_ @");
    

    TestModellerLogger.SetLastNodeGuid("97dc1e0c-5ce7-4fd8-bf61-8e3f5156bc95");
    _The_Internet.Click__Login();
    

    }

}