package ssafy.library.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Reservation {

    @Id
    @GeneratedValue
    @Column(name = "reservation_id")
    private Long id;
    @Column(updatable = false)
    private LocalDateTime reservationTime;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    protected Reservation() {
        this.reservationTime = LocalDateTime.now();
    }

    public Reservation(Member member, Book book) {
        this();
        this.member = member;
        this.book = book;
    }
}
