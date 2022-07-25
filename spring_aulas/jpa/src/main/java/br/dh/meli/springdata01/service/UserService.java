package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.exception.BadRequestException;
import br.dh.meli.springdata01.exception.UserNotFoundException;
import br.dh.meli.springdata01.model.UserBD;
import br.dh.meli.springdata01.repository.IUserDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserDbRepo repo;

    @Override
    public UserBD getUserById(long id) {
        return repo.findById(id).orElseThrow(() -> new UserNotFoundException("Usuário não encontrado. id: " + id));
    }

    @Override
    public UserBD insertUser(UserBD newUser) {
        if(newUser.getId() > 0) {
            throw new BadRequestException("O usuário não pode ter id para ser inserido");
        }
        return repo.save(newUser);
    }

    @Override
    public void deleteUser(long id) {
        getUserById(id);
        repo.deleteById(id);
    }

    @Override
    public List<UserBD> listAll() {
        return (List<UserBD>) repo.findAll();
    }

    @Override
    public UserBD update(UserBD user) {
        getUserById(user.getId());
        return repo.save(user);
    }

    @Override
    public UserBD updatePartial(long id, Map<String, String> changes) {
        UserBD userFound = getUserById(id);

        changes.forEach((atribute, value) -> {
            switch (atribute) {
                case "name": userFound.setName(value); break;
                case "email": userFound.setEmail(value); break;
            }
        });
        return repo.save(userFound);
    }

    @Override
    public UserBD getUserByEmail(String email) {
        return repo.findByEmail(email);
    }
}
