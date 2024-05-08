package br.com.fiap.cp3.dto;


import br.com.fiap.cp3.models.Departamento;
import br.com.fiap.cp3.models.Empregado;
import br.com.fiap.cp3.models.Projeto;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmpregadoDTO {

    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "O nome deve ter no mínimo 3 carateres")
    private String nome;

    @NotBlank(message = "Campo requerido")
    @Email
    private String email;

    @NotNull(message = "Campo requerido")
    @Positive(message = "O Salario deve ser positivo")
    private Double salario;

    private Departamento departamento;

    private List<Projeto> projetos = new ArrayList<>();

    public EmpregadoDTO(Empregado entity) {
        id = entity.getId();
        nome = entity.getNome();
        email = entity.getEmail();
        salario = entity.getSalario();
        departamento = entity.getDepartamento();

        for(Projeto projeto : entity.getProjetos()){
            projetos.add(projeto);
        }
    }
}
