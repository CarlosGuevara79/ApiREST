package com.empresas.Empresa.Rest;

import com.empresas.Empresa.DAO.EmpresaDAO;
import com.empresas.Empresa.Model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaRest {

    @Autowired //creamos una instancia ya que esta tiene los metodos para nuestra bd.
   private EmpresaDAO empresaDAO;

    @GetMapping("/")
    public List<Empresa> listar(){

        return empresaDAO.findAll();

    }
    @GetMapping("/{id}")
    public Optional<Empresa> listarporID(@PathVariable("id") Integer id){
        return empresaDAO.findById(id);
    }

    @PostMapping("/save")
    public Empresa save(@RequestBody Empresa empresa){
    return empresaDAO.save(empresa);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        empresaDAO.deleteById(id);
    }

    @PutMapping("/update")
    public Empresa update(@RequestBody Empresa empresa){
        return empresaDAO.save(empresa);
        }




}
