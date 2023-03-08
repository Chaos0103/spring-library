package ssafy.library.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Loan {

    @Id
    @GeneratedValue
    @Column(name = "loan_id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private LoanStatus status;
    @Column(updatable = false)
    private LocalDateTime loanedDate;
    private LocalDateTime returnDate;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    protected Loan() {
        this.status = LoanStatus.LOAN;
        this.loanedDate = LocalDateTime.now();
        this.returnDate = loanedDate.plusDays(7);
    }

    public Loan(Member member, Book book) {
        this();
        this.member = member;
        this.book = book;
    }
}
