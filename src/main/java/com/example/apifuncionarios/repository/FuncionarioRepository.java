package com.example.apifuncionarios.repository;

import com.example.apifuncionarios.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Funcionario findById(long id);

}
