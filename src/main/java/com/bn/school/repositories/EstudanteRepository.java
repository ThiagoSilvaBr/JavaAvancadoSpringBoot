//Camada que conversa diretamente com o banco
package com.bn.school.repositories;

import com.bn.school.models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long>{//Adicionar a model e o tipo do id {
}