package net.sufiyan.employeeservice.service;

import net.sufiyan.employeeservice.dto.APIResponseDto;
import net.sufiyan.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
