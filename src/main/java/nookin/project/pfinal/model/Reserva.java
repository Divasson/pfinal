package nookin.project.pfinal.model;

import java.util.Date;
import java.util.List;

import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Reserva {
    private Date fecha;
    private Usuario usuarioReserva;
    private List<Usuario> usuariosInvitados;
    private Local localReserva;
    private Integer numPersonas;
    private String promocion;
    private Long id;
    private String estado;
}
