package com.bn.school.services;

//Camada da regra de negócio. Aqui é onde será colocada a inteligencia do sistema

import com.bn.school.models.EstudanteModel;
import com.bn.school.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//marcar uma classe como camada de regra de negócio da aplicação
public class EstudanteService {

    @Autowired// Caso não use, vem vazia e não vem as dependencias (injeta dependencia)
    private EstudanteRepository estudanteRepository;

    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();//buscar tudo do banco
    }

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);//salvar model no banco
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);//deletar do banco por id
    }

}