package ssafy.library.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookInfo {

    @Id
    @Column(name = "isbn", unique = true, nullable = false, updatable = false, length = 13)
    private String isbn;
    @Column(nullable = false, updatable = false, length = 50)
    private String author;
    @Column(unique = true, nullable = false, updatable = false)
    private String name;
    @Column(nullable = false, updatable = false)
    private String publisher;
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    public BookInfo(String isbn, String author, String name, String publisher, LocalDateTime createdDate) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.createdDate = createdDate;
    }
}
