package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class MUpdateEmployeeDetails {
    public void submitUser(String empID,String fn,String ln,String address,String email,String gender,String tp,String username,String password,String depID,String depName,String accType,String jobRole,String empStatus,String bankName,String branchName,String accNumber,String accName)
    {
        try
        {
           Statement st = mydbconnection.getConnection().createStatement();
           st.executeUpdate("update empdetails set fn='"+fn+"',ln='"+ln+"',address='"+address+"',email='"+email+"',gender='"+gender+"',tp='"+tp+"',username='"+username+"',password='"+password+"',depID='"+depID+"',depName='"+depName+"',accType='"+accType+"',jobRole='"+jobRole+"',empStatus='"+empStatus+"',bankName='"+bankName+"',branchName='"+branchName+"',accNumber='"+accNumber+"',accName='"+accName+"' where empID='"+empID+"'");
           JOptionPane.showMessageDialog(null, "Record updated Successfully","Information",JOptionPane.INFORMATION_MESSAGE);

        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
