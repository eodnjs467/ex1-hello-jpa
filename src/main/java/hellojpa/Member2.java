package hellojpa;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        sequenceName = "MEMBER_SEQ",        // mapping 할 데이터베이스 시퀀스 이름
        initialValue = 1, allocationSize = 50)  // allocationSize ->  성능최적화 사용됨
public class Member2 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "MEMBER_SEQ_GENERATOR")
    private Long id;

    @Column(name = "name", nullable = false)
    private String userName;

    public Member2(){}

    public Member2(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
