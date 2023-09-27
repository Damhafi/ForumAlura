package com.damhafi.forumalura.domain.cursos.repository;

import com.damhafi.forumalura.domain.cursos.model.Curso;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CursoRepository extends JpaRepository<Curso, String> {
}
