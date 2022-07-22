package br.dh.meli.springdata01.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "joias")
public class JoiaBd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "material", length = 20, nullable = false)
    private String material;

    @Column(name = "peso", nullable = false)
    private Double peso;

    @Column(name = "quilates", nullable = false)
    private int quilates;
}
