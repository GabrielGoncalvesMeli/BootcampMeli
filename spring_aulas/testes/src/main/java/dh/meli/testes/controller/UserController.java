package dh.meli.testes.controller;

import dh.meli.testes.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public ResponseEntity<UserDto> getUser(@RequestBody @Valid UserDto newUserDto) {
        return new ResponseEntity<>(new UserDto(), HttpStatus.CREATED);
    }
}
