package nookin.project.pfinal.model;

import java.util.List;

import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class LocalesNuestros extends Local{
    private String cuentaPayPal;
    private String cuentaBancaria;
    private Integer saldo;
    private String email;
    private List<Reserva> reservas;
}
