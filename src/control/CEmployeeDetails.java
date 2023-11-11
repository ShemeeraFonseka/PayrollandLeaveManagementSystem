
package control;

import Model.MEmployeeDetails;


public class CEmployeeDetails {
  public void submitUser(String empID,String fn,String ln,String address,String email,String gender,String tp,String username,String password,String depID,String depName,String accType,String jobRole,String empStatus,String bankName,String branchName,String accNumber,String accName)
    {
        MEmployeeDetails mam=new MEmployeeDetails();
        mam.submitUser(empID,fn, ln, address, email, gender, tp, username, password, depID, depName, accType, jobRole, empStatus, bankName, branchName, accNumber, accName);
    }  

    public void log(String username,String password,String accType)
    {
        MEmployeeDetails mam=new MEmployeeDetails();
        mam.log(username, password, accType);
    }
}
