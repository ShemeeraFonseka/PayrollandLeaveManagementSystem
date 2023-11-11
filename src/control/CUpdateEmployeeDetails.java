package control;

import Model.MUpdateEmployeeDetails;


public class CUpdateEmployeeDetails {
    public void submitUser(String empID,String fn,String ln,String address,String email,String gender,String tp,String username,String password,String depID,String depName,String accType,String jobRole,String empStatus,String bankName,String branchName,String accNumber,String accName)
    {
        MUpdateEmployeeDetails mam=new MUpdateEmployeeDetails();
        mam.submitUser(empID,fn, ln, address, email, gender, tp, username, password, depID, depName, accType, jobRole, empStatus, bankName, branchName, accNumber, accName);
    }
}
