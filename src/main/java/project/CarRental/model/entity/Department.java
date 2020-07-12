package project.CarRental.model.entity;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String depAddress;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;



    //private List<EmployeeDto> depEmployees = Collections.emptyList();
    //private List<CarDto> depCars = Collections.emptyList();



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepAddress() {
        return depAddress;
    }

    public void setDepAddress(String depAddress) {
        this.depAddress = depAddress;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
