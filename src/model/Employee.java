/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Employee {
    private String employeeId;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String sssNumber;
    private String philHealthNumber;
    private String tin;
    private String pagIbigNumber;
    private String status;
    private String position;
    private String immediateSupervisor;
    
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthlyRate;
    private double hourlyRate;

    public Employee(String employeeId, String lastName, String firstName, String birthDate, String address, String phoneNumber, String sssNumber, String philHealthNumber, String tin, String pagIbigNumber, String status, String position, String immediateSupervisor, double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossSemiMonthlyRate, double hourlyRate) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philHealthNumber = philHealthNumber;
        this.tin = tin;
        this.pagIbigNumber = pagIbigNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSssNumber() {
        return sssNumber;
    }

    public void setSssNumber(String sssNumber) {
        this.sssNumber = sssNumber;
    }

    public String getPhilHealthNumber() {
        return philHealthNumber;
    }

    public void setPhilHealthNumber(String philHealthNumber) {
        this.philHealthNumber = philHealthNumber;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getPagIbigNumber() {
        return pagIbigNumber;
    }

    public void setPagIbigNumber(String pagIbigNumber) {
        this.pagIbigNumber = pagIbigNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImmediateSupervisor() {
        return immediateSupervisor;
    }

    public void setImmediateSupervisor(String immediateSupervisor) {
        this.immediateSupervisor = immediateSupervisor;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getRiceSubsidy() {
        return riceSubsidy;
    }

    public void setRiceSubsidy(double riceSubsidy) {
        this.riceSubsidy = riceSubsidy;
    }

    public double getPhoneAllowance() {
        return phoneAllowance;
    }

    public void setPhoneAllowance(double phoneAllowance) {
        this.phoneAllowance = phoneAllowance;
    }

    public double getClothingAllowance() {
        return clothingAllowance;
    }

    public void setClothingAllowance(double clothingAllowance) {
        this.clothingAllowance = clothingAllowance;
    }

    public double getGrossSemiMonthlyRate() {
        return grossSemiMonthlyRate;
    }

    public void setGrossSemiMonthlyRate(double grossSemiMonthlyRate) {
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}
