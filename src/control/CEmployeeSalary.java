
package control;

import Model.MEmployeeSalary;

public class CEmployeeSalary {
   public void submitUser(String empID,String month, double sal,double etfamount,double epfamount,double gsal,double allow,double nsal)
    {
        MEmployeeSalary mam=new MEmployeeSalary();
        mam.submitUser(empID,month, sal, etfamount, epfamount, gsal, allow, nsal);
    } 
}
