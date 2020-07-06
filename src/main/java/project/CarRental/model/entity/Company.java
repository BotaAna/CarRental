package project.CarRental.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    //private List<DepartmentDto> department = Collections.emptyList();


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
}
