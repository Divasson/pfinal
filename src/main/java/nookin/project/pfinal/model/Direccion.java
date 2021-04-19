package nookin.project.pfinal.model;

import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Direccion {
    private String direccion;
    private Double latitud;
    private Double longitud;

    public String getLatLonString(){
        return ""+latitud+","+longitud;
    }
}
