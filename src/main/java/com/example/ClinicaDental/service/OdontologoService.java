package com.example.ClinicaDental.service;

import com.example.ClinicaDental.entity.Odontologo;
import com.example.ClinicaDental.repository.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService implements IOdontologoService {

    @Autowired
    IOdontologoService odontologoService;

    @Override
    public List<Odontologo> listar() {
        return odontologoService.listar();
    }

    @Override
    public Odontologo actualizar(Odontologo odontologo) {
        return odontologoService.actualizar(odontologo);
    }

    @Override
    public Odontologo guardar(Odontologo odontologo){
        return odontologoService.guardar(odontologo);
    }

    @Override
    public Odontologo eliminar(int id){
        return odontologoService.eliminar(id);
    }

    @Override
    public Odontologo buscar(int id){
        return odontologoService.buscar(id);
    }


}
