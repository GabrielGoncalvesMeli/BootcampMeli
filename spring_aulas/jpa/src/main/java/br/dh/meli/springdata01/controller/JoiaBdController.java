package br.dh.meli.springdata01.controller;

import br.dh.meli.springdata01.model.JoiaBd;
import br.dh.meli.springdata01.service.JoiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/joias")
public class JoiaBdController {
    @Autowired
    private JoiasService service;

    @GetMapping("/{id}")
    public ResponseEntity<JoiaBd> getJoiaById(@PathVariable long id) {
        JoiaBd joiaBd = service.getJoiaById(id);
        return joiaBd != null ? ResponseEntity.ok(joiaBd) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<JoiaBd>> getAllJoias() {
        return ResponseEntity.ok(service.getAllJoias());
    }

    @PostMapping("/inserir")
    public ResponseEntity<JoiaBd> saveAJoia(@RequestBody JoiaBd joiaBd) {
        return ResponseEntity.ok(service.createNewJoia(joiaBd));
    }

    @PutMapping("atualizar/{id}")
    public ResponseEntity<JoiaBd> updateJoia(@RequestBody JoiaBd joiaBd){
        return ResponseEntity.ok(service.updateJoiaById(joiaBd));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteById(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }
}
