/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contracts;

import model.Employee;
import java.util.List;

public interface IEmployeeRepository {
    Employee findById(String employeeId);
    List<Employee> findAll();
    void save(Employee employee);
    void update(Employee employee);
    void delete(String employeeId);
    String getNextEmployeeNumber();
}