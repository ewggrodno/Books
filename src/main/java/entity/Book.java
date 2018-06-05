package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BOOKS")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "TITLE", length = 100)
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "AUTHOR", length = 100)
    private String author;

    @Column(name = "ISBN", length = 20)
    private String isbn;

    @Column(name = "PRINT_YEAR", length = 4)
    private int printYear;

    @Column(name = "READ_ALREADY")
    private boolean readAlready;
}
