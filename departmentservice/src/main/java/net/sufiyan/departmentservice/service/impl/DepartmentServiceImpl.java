package net.sufiyan.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import net.sufiyan.departmentservice.dto.DepartmentDto;
import net.sufiyan.departmentservice.entity.Department;
import net.sufiyan.departmentservice.mapper.DepartmentMapper;
import net.sufiyan.departmentservice.repository.DepartmentRepository;
import net.sufiyan.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);
        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);
        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);
        return departmentDto;
    }
}
