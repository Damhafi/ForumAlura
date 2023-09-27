package com.damhafi.forumalura.domain.resposta.repository;

import com.damhafi.forumalura.domain.resposta.model.Resposta;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, String> {
}
