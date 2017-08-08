package hibernate;
// Generated 08-Aug-2017 14:17:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DemoUsers generated by hbm2java
 */
@Entity
@Table(name="DEMO_USERS"
    ,schema="MONIR"
)
public class DemoUsers  implements java.io.Serializable {


     private BigDecimal userId;
     private String userName;
     private String password;
     private Date createdOn;
     private BigDecimal quota;
     private Character products;
     private Date expiresOn;
     private Character adminUser;
     private Set demoOrderses = new HashSet(0);

    public DemoUsers() {
    }

	
    public DemoUsers(BigDecimal userId) {
        this.userId = userId;
    }
    public DemoUsers(BigDecimal userId, String userName, String password, Date createdOn, BigDecimal quota, Character products, Date expiresOn, Character adminUser, Set demoOrderses) {
       this.userId = userId;
       this.userName = userName;
       this.password = password;
       this.createdOn = createdOn;
       this.quota = quota;
       this.products = products;
       this.expiresOn = expiresOn;
       this.adminUser = adminUser;
       this.demoOrderses = demoOrderses;
    }
   
     @Id 

    
    @Column(name="USER_ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getUserId() {
        return this.userId;
    }
    
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    
    @Column(name="USER_NAME", length=100)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="PASSWORD", length=4000)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATED_ON", length=7)
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    
    @Column(name="QUOTA", precision=22, scale=0)
    public BigDecimal getQuota() {
        return this.quota;
    }
    
    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    
    @Column(name="PRODUCTS", length=1)
    public Character getProducts() {
        return this.products;
    }
    
    public void setProducts(Character products) {
        this.products = products;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="EXPIRES_ON", length=7)
    public Date getExpiresOn() {
        return this.expiresOn;
    }
    
    public void setExpiresOn(Date expiresOn) {
        this.expiresOn = expiresOn;
    }

    
    @Column(name="ADMIN_USER", length=1)
    public Character getAdminUser() {
        return this.adminUser;
    }
    
    public void setAdminUser(Character adminUser) {
        this.adminUser = adminUser;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="demoUsers")
    public Set getDemoOrderses() {
        return this.demoOrderses;
    }
    
    public void setDemoOrderses(Set demoOrderses) {
        this.demoOrderses = demoOrderses;
    }




}

