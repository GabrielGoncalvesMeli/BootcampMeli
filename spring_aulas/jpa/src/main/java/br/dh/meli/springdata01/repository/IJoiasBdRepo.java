package br.dh.meli.springdata01.repository;

import br.dh.meli.springdata01.model.JoiaBd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoiasBdRepo extends CrudRepository<JoiaBd, Long> {

}
