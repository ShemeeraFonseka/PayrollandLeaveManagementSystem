
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;


public class MChangePassword {
    public void submitUser(String username,String newpass)
    {
        try
        {
           Statement st = mydbconnection.getConnection().createStatement();
           st.executeUpdate("update empdetails set password='"+newpass+"' where username='"+username+"'");

        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void submitUser2(String username,String newpass)
    {
        try
        {
           Statement st = mydbconnection.getConnection().createStatement();
           st.executeUpdate("update login set password='"+newpass+"' where username='"+username+"'");

        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
