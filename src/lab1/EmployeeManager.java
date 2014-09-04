/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
import java.util.*;
/**
 *
 * @author viewt_000
 */
public class EmployeeManager {
    private ArrayList<Employee> employeeList;
    
    public EmployeeManager()
    {
        employeeList = new ArrayList();
    }
    
    public void addEmployee(String firstName, String lastName, String ssn)
    {
        Employee temp = new Employee();
        temp.setFirstName(firstName);
        temp.setLastName(lastName);
        temp.setSsn(ssn);
        employeeList.add(temp);
    }
    
    public String getEmployeeStatus(String ssn)
    {
        for (Employee temp : employeeList) {
            if(temp.getSsn().equals(ssn))
            {
                return temp.getStatus();
            }
        }
        return "Employee not found.";
    }
    
    public void doOrientation(String ssn, String cubeId)
    {
        for(Employee temp : employeeList)
        {
            if(temp.getSsn().equals(ssn))
            {
                temp.doOrientation(cubeId);
            }
        }
    }
}
