package dh.meli.relationships.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)   // author = nome do campo na tabela adrress q e usadoc como ref
    @JsonIgnoreProperties("author")
    private Address address;

    @ManyToMany
    @JoinTable(name = "book_author",  // nome da tabela de ligação/relacionamento, ela será criada aqui
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"), // atributo do author na tabela de ligação
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id")  //  atributo do livro da tabela de ligação
    )
    @JsonIgnoreProperties("authors")
    private List<Book> books;
}
