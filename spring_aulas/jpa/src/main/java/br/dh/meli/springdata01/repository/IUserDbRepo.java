package br.dh.meli.springdata01.repository;

import br.dh.meli.springdata01.model.UserBD;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDbRepo extends CrudRepository<UserBD, Long> {
    // CrudRepository já cria os métodos básicos de crud
    // com isso não é necessário declarar nada dentro dessa interface
}
