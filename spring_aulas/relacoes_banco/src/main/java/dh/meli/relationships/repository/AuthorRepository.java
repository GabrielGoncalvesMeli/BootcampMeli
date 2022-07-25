package dh.meli.relationships.repository;

import dh.meli.relationships.dto.AuthorDTO;
import dh.meli.relationships.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
    @Query("SELECT a from Author as a WHERE a.id = ?1")
    AuthorDTO getById(long id);

    @Query(value = "SELECT * from author where id = ?1", nativeQuery = true)
    Author getNativeById(long id);

    @Query("SELECT a FROM Author as a left join fetch a.address where a.id = :id")
    AuthorDTO getDtoEagle(long id);
}
