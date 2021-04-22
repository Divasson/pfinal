package nookin.project.pfinal.model;

import java.util.List;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UsuarioCliente extends Usuario{
    private Integer saldo;
    private List<Local> localesPreferidos;
}
