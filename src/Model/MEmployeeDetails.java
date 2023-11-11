package Model;
import java.sql.Date;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MEmployeeDetails {
    public void submitUser(String empID,String fn,String ln,String address,String email,String gender,String tp,String username,String password,String depID,String depName,String accType,String jobRole,String empStatus,String bankName,String branchName,String accNumber,String accName)
    {
        try
        {
           Statement st = mydbconnection.getConnection().createStatement();
           st.executeUpdate("insert into empdetails values('"+empID+"','"+fn+"','"+ln+"','"+address+"','"+email+"','"+gender+"','"+tp+"','"+username+"','"+password+"','"+depID+"','"+depName+"','"+accType+"','"+jobRole+"','"+empStatus+"','"+bankName+"','"+branchName+"','"+accNumber+"','"+accName+"')");
           JOptionPane.showMessageDialog(null, "Record inserted Successfully","Information",JOptionPane.INFORMATION_MESSAGE);

        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void log(String username,String password,String accType)
    {
        try
        {
           Statement st = mydbconnection.getConnection().createStatement();
           st.executeUpdate("insert into login values('"+username+"','"+password+"','"+accType+"')");

        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
}