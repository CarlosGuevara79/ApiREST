package com.empresas.Empresa.DAO;

import com.empresas.Empresa.Model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaDAO extends JpaRepository<Empresa, Integer> {


        }
