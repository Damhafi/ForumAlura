package com.damhafi.forumalura.controller;

import com.damhafi.forumalura.domain.cursos.dto.DadosCriacaoCursoDTO;
import com.damhafi.forumalura.domain.cursos.repository.CursoRepository;
import com.damhafi.forumalura.domain.cursos.service.CrudCursos;
import jakarta.validation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/curso")
public class CursoController {
    
    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private CrudCursos crudCursos;
    @PostMapping
    public ResponseEntity postCurso(@RequestBody @Valid DadosCriacaoCursoDTO cursoPostDto){
        return crudCursos.cadastraCursos(cursoPostDto);
    }

    @GetMapping
    public ResponseEntity cursos(){
        return crudCursos.listaCurso();
    }

}
