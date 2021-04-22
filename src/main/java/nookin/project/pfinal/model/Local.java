package nookin.project.pfinal.model;

import java.io.File;
import java.util.List;

import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Local {
    private String nombre;
    private Long id;
    private Direccion direccion;
    private String paginaWeb;
    private String telefono;
    private List<Valoracion> valoraciones;
    private Integer aforo;
    private List<File> imagenes;
    private Integer visitas;
    private Integer sem;
    private List<Categoria> categorias;
    
    
}
