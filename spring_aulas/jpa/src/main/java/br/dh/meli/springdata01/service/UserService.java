package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.model.UserBD;
import br.dh.meli.springdata01.repository.IUserDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserDbRepo repo;

    public UserBD getUserById(long id) {
        return (UserBD) repo.findById(id).orElse(null);
    }
}
