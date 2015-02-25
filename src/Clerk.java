/**
 * Created by nilajapatankar on 2/24/15.
 */
public class Clerk extends BankStaff {
    @Override
    public void ProcessRequest(Request aRequest) {
        if(aRequest.Level == ResponsibilityLevel.Medium)
            System.out.println("Clerk is handling your request for "+aRequest.Description);
        else
            Boss.ProcessRequest(aRequest);
    }
}
