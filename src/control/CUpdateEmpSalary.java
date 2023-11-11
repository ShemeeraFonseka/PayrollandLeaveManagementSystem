
package control;

import Model.MUpdateEmpSalary;


public class CUpdateEmpSalary {
    public void submitUser(String empID,String month, double sal,double etfamount,double epfamount,double gsal,double allow,double nsal)
    {
        MUpdateEmpSalary mam=new MUpdateEmpSalary();
        mam.submitUser(empID,month, sal, etfamount, epfamount, gsal, allow, nsal);
    } 
}
