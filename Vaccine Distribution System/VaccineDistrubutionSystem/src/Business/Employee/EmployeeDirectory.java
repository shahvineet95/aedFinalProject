/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String emailId, String phoneNumber, String location){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmailId(emailId);
        employee.setPhoneNumber(phoneNumber);
        employee.setLocation(location);
        employeeList.add(employee);
        return employee;
    }
}