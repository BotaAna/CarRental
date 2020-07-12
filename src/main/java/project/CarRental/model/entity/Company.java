package project.CarRental.model.entity;

import project.CarRental.model.dto.DepartmentDto;

import javax.persistence.*;
import java.util.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String companyName;
    private String companyDomain;
    private String companyContactAddress;
    private String companyOwner;
    //companyLogotype;
    //@OneToMany(mappedBy = "company")
    //private Set<Department> departmentsList = new HashSet<>();


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
    public Set<Department> getDepartmentsList() {
        return departmentsList;
    }

    public void setDepartmentsList(Set<Department> departmentsList) {
        this.departmentsList = departmentsList;
    }

 */

}
