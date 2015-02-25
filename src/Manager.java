/**
 * Created by nilajapatankar on 2/24/15.
 */
public class Manager extends BankStaff {
    @Override
    public void ProcessRequest(Request aRequest) {
        if(aRequest.Level == ResponsibilityLevel.High)
            System.out.println("Manager is handling your request for "+aRequest.Description);
        else
            System.out.println("Sorry, Your request can't be fulfilled");
    }
}
