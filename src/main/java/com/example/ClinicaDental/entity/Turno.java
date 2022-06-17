package com.example.ClinicaDental.entity;


import java.time.LocalDateTime;

public class Turno {
    private Integer id;
    private Odontologo odontologo;
    private Paciente paciente;
    private LocalDateTime fechaHora;

    public Turno(int id, Odontologo odontologo, Paciente paciente, LocalDateTime fechaHora) {
        this.id = id;
        this.odontologo = odontologo;
        this.paciente = paciente;
        this.fechaHora = fechaHora;
    }

    public Turno() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "--Turno--" +
                "\nFecha y hora: " + fechaHora +
                "\n\n" + paciente.toString() +
                "\n\n" + odontologo.toString();
    }

}
