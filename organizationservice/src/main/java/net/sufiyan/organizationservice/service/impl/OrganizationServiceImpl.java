package net.sufiyan.organizationservice.service.impl;

import lombok.AllArgsConstructor;
import net.sufiyan.organizationservice.dto.OrganizationDto;
import net.sufiyan.organizationservice.entity.Organization;
import net.sufiyan.organizationservice.mapper.OrganizationMapper;
import net.sufiyan.organizationservice.repository.OrganizationRepository;
import net.sufiyan.organizationservice.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);
        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
