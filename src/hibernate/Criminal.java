package hibernate;
// Generated 08-Aug-2017 14:17:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Criminal generated by hbm2java
 */
@Entity
@Table(name="CRIMINAL"
    ,schema="MONIR"
)
public class Criminal  implements java.io.Serializable {


     private BigDecimal id;
     private String name;
     private String father;
     private String contact;
     private String address;
     private String district;
     private String division;

    public Criminal() {
    }

	
    public Criminal(BigDecimal id) {
        this.id = id;
    }
    public Criminal(BigDecimal id, String name, String father, String contact, String address, String district, String division) {
       this.id = id;
       this.name = name;
       this.father = father;
       this.contact = contact;
       this.address = address;
       this.district = district;
       this.division = division;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=20, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

    
    @Column(name="NAME", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="FATHER", length=100)
    public String getFather() {
        return this.father;
    }
    
    public void setFather(String father) {
        this.father = father;
    }

    
    @Column(name="CONTACT", length=50)
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }

    
    @Column(name="ADDRESS", length=200)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="DISTRICT", length=50)
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }

    
    @Column(name="DIVISION", length=50)
    public String getDivision() {
        return this.division;
    }
    
    public void setDivision(String division) {
        this.division = division;
    }




}


