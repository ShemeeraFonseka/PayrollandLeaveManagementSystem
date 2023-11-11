
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;


public class MEmployeeSalary {
    public void submitUser(String empID, String month, double sal,double etfamount,double epfamount,double gsal,double allow,double nsal)
    {
        try
        {
           Statement st = mydbconnection.getConnection().createStatement();
           st.executeUpdate("insert into empsal values('"+empID+"','"+month+"','"+sal+"','"+etfamount+"','"+epfamount+"','"+gsal+"','"+allow+"','"+nsal+"')");
           JOptionPane.showMessageDialog(null, "Record inserted Successfully","Information",JOptionPane.INFORMATION_MESSAGE);

        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
}
