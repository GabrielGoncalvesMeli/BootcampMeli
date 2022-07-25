package dh.meli.relationships.dto;

import dh.meli.relationships.model.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class AddressDTO {
    public String adress;

    public AddressDTO(Address add) {
        this.adress = add.getLocation();
    }
}
