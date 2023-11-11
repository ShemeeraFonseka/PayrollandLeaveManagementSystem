
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class MUpdateEmpSalary {
    public void submitUser(String empID, String month, double sal,double etfamount,double epfamount,double gsal,double allow,double nsal)
    {
        try
        {
           Statement st = mydbconnection.getConnection().createStatement();
           st.executeUpdate("update empsal set sal='"+sal+"',etfamount='"+etfamount+"',epfamount='"+epfamount+"',gsal='"+gsal+"',allow='"+allow+"',nsal='"+nsal+"' where empid='"+empID+"' and month = '"+month+"'");
           JOptionPane.showMessageDialog(null, "Record updated Successfully","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
