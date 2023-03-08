package ssafy.library.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    @Column(nullable = false, updatable = false, length = 50)
    private String name;
    @Column(nullable = false, updatable = false, length = 6)
    private String birth;
    @Column(unique = true, nullable = false, length = 11)
    private String phone;
    @Column(unique = true, nullable = false, length = 100)
    private String email;
    @Embedded
    private Address address;

    public Member(String name, String birth, String phone, String email, Address address) {
        this.name = name;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
