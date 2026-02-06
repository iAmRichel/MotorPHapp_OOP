/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contracts;

import model.AttendanceLog;
import java.time.LocalDate;
import java.util.List;

public interface IAttendanceRepository {
    List<AttendanceLog> findByEmployeeAndDateRange(String employeeId, LocalDate start, LocalDate end);
    void save(AttendanceLog attendance);
    boolean hasAttendanceRecords(String employeeId, int month, int year);
}
