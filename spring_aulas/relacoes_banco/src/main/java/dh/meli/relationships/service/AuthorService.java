package dh.meli.relationships.service;

import dh.meli.relationships.model.Author;
import dh.meli.relationships.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repo;

    @Transactional   // caso tenha algum problema faz rollback na parte q deu errado
    public Author save(Author author) {
        author.getAddress().setAuthor(author);
        return repo.save(author);
    }
}
