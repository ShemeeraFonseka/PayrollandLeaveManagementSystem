
package control;

import Model.MChangePassword;


public class CChangePassword {
    public void submitUser(String username,String newpass)
    {
        MChangePassword mam=new MChangePassword();
        mam.submitUser(username, newpass);
        
    }
    public void submitUser2(String username,String newpass)
    {
        MChangePassword mam=new MChangePassword();
        mam.submitUser2(username, newpass);
        
    }
    
}
