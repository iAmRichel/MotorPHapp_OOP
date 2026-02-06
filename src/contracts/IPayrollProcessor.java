/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contracts;
import model.Employee;
import model.PayrollRecord;
import java.time.LocalDate;
/**
 *
 * @author thris
 */
public interface IPayrollProcessor {
    PayrollRecord computePayroll(Employee employee, LocalDate periodStart, LocalDate periodEnd);
    double getGrossPay(Employee employee);
    double getNetPay(PayrollRecord record);
}
