package dev.karoene.plataforma_de_ensino_api.controller;

import dev.karoene.plataforma_de_ensino_api.model.Curso;
import dev.karoene.plataforma_de_ensino_api.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/api") //CAMINHO PADRAO DE TODOS OS ENDPOINTS DO CONTROLLER
public class CursoController {

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    CursoService cursoService;

    //PRIMEIRO ENDPOINTS: POST    -  PARA CRIAR UM CURSO
    @PostMapping("/cursos")
    @ResponseStatus(HttpStatus.CREATED) //retorno http
    public Curso criarCurso (@RequestBody Curso curso){
        return cursoService.criarCurso(curso);
    }

    //ENDPOINT PARA GET: RETORNA TODOS OS DADOS DO BANCO
    @GetMapping("/cursos")
    @ResponseStatus(HttpStatus.OK)
    public List<Curso> listarCursos(){return cursoService.listarCursos();}

    //ENDPOINT GET : RETORNA CURSO PELO ID , sem passar um BODY (body: json com dados)
    @GetMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Curso> buscarCursoId
            (@PathVariable (value = "id") Long id){//variavel de caminho para buscar item especifico
        return cursoService.buscarCursoPorId(id);
    }

    //ENDPOINT PUT
    @PutMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Curso> atualizarCursoPeloId
            (@PathVariable (value = "id") Long id,
            @RequestBody Curso curso){  //para pegar os dados do body/curso
        return cursoService.atualizarPorId(curso, id);
    }




}
