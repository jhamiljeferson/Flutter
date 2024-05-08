package br.com.fiap.cp3.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"nome", "email", "salario", "departamento"})

@Entity
@Table(name = "tb_empregado")
public class Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private Double salario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departamento_id", nullable = false) //PK
    private Departamento departamento;

    //relacionamento
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_empregado_projeto",
            joinColumns = @JoinColumn(name = "empregado_id"),
            inverseJoinColumns = @JoinColumn(name = "projeto_id"))
    private Set<Projeto> projetos = new HashSet<>();

}
