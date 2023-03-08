package ssafy.library.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book {

    @Id
    @Column(name = "book_id", unique = true, nullable = false, updatable = false, length = 10)
    private String id;
    @Enumerated(EnumType.STRING)
    private BookStatus status;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "isbn")
    private BookInfo isbn;

    public Book(String id, BookStatus status, BookInfo isbn) {
        this.id = id;
        this.status = status;
        this.isbn = isbn;
    }
}
