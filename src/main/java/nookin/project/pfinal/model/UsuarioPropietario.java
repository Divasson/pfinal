package nookin.project.pfinal.model;

import java.util.*;
import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UsuarioPropietario extends Usuario{
    private List<Local> localesEnPropiedad;
    
}
