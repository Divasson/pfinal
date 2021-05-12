package nookin.project.pfinal.controller;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    @Id
    LocalDate fecha;
    Usuario usuario;
    List<Usuario> invitados;
    Local local;
    int n_personas;
    String promocion;

    public Reserva(LocalDate fecha, Usuario usuario, List<Usuario> invitados, Local local, int n_personas, String promocion) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.invitados = invitados;
        this.local = local;
        this.n_personas = n_personas;
        this.promocion = promocion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getInvitados() {
        return invitados;
    }

    public void setInvitados(List<Usuario> invitados) {
        this.invitados = invitados;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public int getN_personas() {
        return n_personas;
    }

    public void setN_personas(int n_personas) {
        this.n_personas = n_personas;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }
}
