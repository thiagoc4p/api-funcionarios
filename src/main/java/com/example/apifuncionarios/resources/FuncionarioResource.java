package com.example.apifuncionarios.resources;

import com.example.apifuncionarios.models.Funcionario;
import com.example.apifuncionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/funcionario")
public class FuncionarioResource {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> listaFuncionario() {
        return funcionarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Funcionario listaFuncionarioById(@PathVariable(value = "id") long id) {
        return funcionarioRepository.findById(id);
    }

    @PostMapping
    public Funcionario addFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @DeleteMapping
    public void deleteFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioRepository.delete(funcionario);
    }

    @PutMapping("/update")
    public Funcionario updateFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFuncionarioById(@PathVariable(value = "id") long id) {
        funcionarioRepository.deleteById(id);
    }

}
