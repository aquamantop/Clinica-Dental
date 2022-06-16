package com.example.ClinicaDental.repository;

import com.example.ClinicaDental.entity.Paciente;
import java.util.List;

public interface IPacienteService {

    Paciente guardar(Paciente p);
    Paciente buscar(int id);
    Paciente buscarPorEmail(String email);
    Paciente eliminar(int id);
    List<Paciente> listar();
    Paciente actualizar(Paciente p);

}
