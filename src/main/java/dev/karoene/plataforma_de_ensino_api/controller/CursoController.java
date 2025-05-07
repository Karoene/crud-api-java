package dev.karoene.plataforma_de_ensino_api.controller;

import dev.karoene.plataforma_de_ensino_api.model.Curso;
import dev.karoene.plataforma_de_ensino_api.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") //CAMINHO PADRAO DE TODOS OS ENDPOINTS DO CONTROLLER
public class CursoController {

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    CursoService cursoService;

    //PRIMEIRO ENDPOINTS: POST
    //PARA CRIAR UM CURSO
    @PostMapping("/cursos")
    @ResponseStatus(HttpStatus.CREATED) //retorno http
    public Curso criarCurso (@RequestBody Curso curso){
        return cursoService.criarCurso(curso);
    }

    //ENDPOINT PARA GET: RETORNA TODOS OS DADOS DO BANCO
    @GetMapping("/cursos")
    @ResponseStatus(HttpStatus.OK)
    public List<Curso> listarCursos(){return cursoService.listarCursos();}




}
