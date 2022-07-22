package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.model.JoiaBd;
import br.dh.meli.springdata01.model.UserBD;
import br.dh.meli.springdata01.repository.IJoiasBdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoiasService {

    @Autowired
    private IJoiasBdRepo repo;

    public JoiaBd getJoiaById(long id) {
        return (JoiaBd) repo.findById(id).orElse(null);
    }

    public List<JoiaBd> getAllJoias() {
        return (List<JoiaBd>) repo.findAll();
    }

    public void deleteJoiaById(long id) {
        repo.deleteById(id);
    }

    public JoiaBd createNewJoia(JoiaBd joia) {
        return repo.save(joia);
    }

    public JoiaBd updateJoiaById(JoiaBd joia) {
        return repo.save(joia);
    }
}
