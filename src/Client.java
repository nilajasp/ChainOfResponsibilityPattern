/**
 * Created by nilajapatankar on 2/24/15.
 */
public class Client {
    public static void main(String[] args) {
        BankStaff bankStaff = ChainResponsibility.CreateChain();

        //First Request can be handled by security guard
        Request request = new Request();
        request.Description = "Where is FD Section?";
        request.Level = ResponsibilityLevel.Low;

        bankStaff.ProcessRequest(request);

        //Second Request can be handled by clerk
        request = new Request();
        request.Description = "Print new Entries in passbook";
        request.Level = ResponsibilityLevel.Medium;

        bankStaff.ProcessRequest(request);

        //Third Request can be processed by manager
        request = new Request();
        request.Description = "Request for passing loan";
        request.Level = ResponsibilityLevel.High;

        bankStaff.ProcessRequest(request);
    }
}
