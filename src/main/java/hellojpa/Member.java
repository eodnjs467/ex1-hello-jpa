package hellojpa;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "username")
    private String username;

    @Embedded
    private Period priod;

    @Embedded
    private Address address;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city",
                    column=@Column(name = "WORK_CITY")),
            @AttributeOverride(name="street",
                    column=@Column(name = "WORK_STREET")),
            @AttributeOverride(name="zipcode",
                    column=@Column(name = "WORK_ZIPCODE"))
    })
    private Address companyAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Period getPriod() {
        return priod;
    }

    public void setPriod(Period priod) {
        this.priod = priod;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
