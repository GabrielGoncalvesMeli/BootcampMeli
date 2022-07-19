package dh.meli.testes.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserDto {

    @NotBlank(message = "O campo nome é obrigatório")
    private String name;

    @NotBlank(message = "O campo email é obrigatório")
    @Email(message = "o e-mail deve ser válido")
    private String email;

    @Min(value = 18, message = "Idade mínima é de 18 anos")
    private int idade;
}
