package com.example.apifuncionarios.resources;

import com.example.apifuncionarios.models.Funcionario;
import com.example.apifuncionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class FuncionarioResource {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping("/funcionario")
    public List<Funcionario> listaFuncionario() {
        return funcionarioRepository.findAll();
    }

    @GetMapping("/funcionario/{id}")
    public Funcionario listaFuncionarioById(@PathVariable(value = "id") long id) {
        return funcionarioRepository.findById(id);
    }

    @PostMapping("/funcionario")
    public Funcionario addFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @DeleteMapping("/funcionario")
    public void deleteFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioRepository.delete(funcionario);
    }

    @PutMapping("/funcionario")
    public Funcionario updateFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

}
