/**
 * Created by nilajapatankar on 2/24/15.
 */
public class ChainResponsibility {
    public static BankStaff CreateChain()
    {
        BankStaff securityGuard = new SecurityGuard();
        BankStaff clerk = new Clerk();
        BankStaff manager = new Manager();
        securityGuard.Boss = clerk;
        clerk.Boss = manager;
        return securityGuard;
    }
}