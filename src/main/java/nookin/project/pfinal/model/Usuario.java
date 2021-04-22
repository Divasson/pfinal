package nookin.project.pfinal.model;

import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Usuario {
    private String nombre;
    private Long id;
    private String telefono;
    private String email;
    private String contrasena;
    
}
