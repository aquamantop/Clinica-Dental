package com.example.ClinicaDental.entity;

public class Odontologo {
    private Integer id;
    private String apellido;
    private String nombre;
    private int matricula;

    public Odontologo(String apellido, String nombre, int matricula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public Odontologo(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "--Odontologo--" +
                "\nApellido: " + apellido + "/" +
                "\nNombre: " + nombre + "/" +
                "\nMatricula: " + matricula;
    }

}
