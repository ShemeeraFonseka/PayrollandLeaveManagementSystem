package Model;
import java.sql.*;
import javax.swing.JOptionPane;

public class mydbconnection 
{
    private static Connection con;
    public static Connection getConnection()
    {
        try
        {
        String path="jdbc:mysql://localhost:3306/employeedetails";
        con = DriverManager.getConnection(path,"root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return con;
    }

    static Object getconnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}