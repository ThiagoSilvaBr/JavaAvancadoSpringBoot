
//Camada que recebe requisiçao HTTP

package com.bn.school.controllers;

import com.bn.school.models.EstudanteModel;
import com.bn.school.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //indica que é a classe controller que recebe a url
@RequestMapping("/estudantes") //mapeamento a ser feito na rota
public class EstudanteController {

    @Autowired//Caso não use, vem vazia e não vem as dependencias (injeta dependencia)
    private EstudanteService estudanteService;

    @GetMapping// Lista os dados, para mostrar que queremos utiliza-lo
    public List<EstudanteModel> findAll(){
        return estudanteService.findAll();
    }

    @PostMapping// Setou que é um metodo de criação
    public EstudanteModel criarEstudante(@RequestBody/* A requisição será pelo corpo*/ EstudanteModel estudanteModel){
        return estudanteService.criarEstudante(estudanteModel);
    }

    @DeleteMapping("/{id}")// Idenfica que irá deletar da tabela
    public void deletarEstudante(@PathVariable/* A requisição será pela url*/ Long id){
        estudanteService.deletarEstudante(id);
    }
}