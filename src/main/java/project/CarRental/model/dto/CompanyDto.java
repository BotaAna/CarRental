package project.CarRental.model.dto;

import java.util.Collections;
import java.util.List;

public class CompanyDto {

    private Integer id;
    private String companyName;
    private String companyDomain;
    private String companyContactAddress;
    private String companyOwner;
    //companyLogotype;
    //private List<DepartmentDto> department = Collections.emptyList();


    public CompanyDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDomain() {
        return companyDomain;
    }

    public void setCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
    }

    public String getCompanyContactAddress() {
        return companyContactAddress;
    }

    public void setCompanyContactAddress(String companyContactAddress) {
        this.companyContactAddress = companyContactAddress;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }
/*
    public List<DepartmentDto> getDepartment() {
        return department;
    }

    public void setDepartment(List<DepartmentDto> department) {
        this.department = department;
    }

 */
}
