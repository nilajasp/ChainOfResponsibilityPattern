/**
 * Created by nilajapatankar on 2/24/15.
 */
public class SecurityGuard extends BankStaff {
    @Override
    public void ProcessRequest(Request aRequest) {
        if(aRequest.Level == ResponsibilityLevel.Low)
            System.out.println("Security guard is handling your request for "+aRequest.Description);
        else
            Boss.ProcessRequest(aRequest);
    }
}
