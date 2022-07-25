package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.model.UserBD;

import java.util.List;
import java.util.Map;

public interface IUserService {
    UserBD getUserById(long id);
    UserBD insertUser(UserBD newUser);
    UserBD update(UserBD user);
    UserBD updatePartial(long id, Map<String, String> changes);
    UserBD getUserByEmail(String email);
    void deleteUser(long id);
    List<UserBD> listAll();
}
