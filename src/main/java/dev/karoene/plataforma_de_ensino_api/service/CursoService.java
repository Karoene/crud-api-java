package dev.karoene.plataforma_de_ensino_api.service;

import dev.karoene.plataforma_de_ensino_api.model.Curso;
import dev.karoene.plataforma_de_ensino_api.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    //injecao de dependencias, chamando objeto de uma classe na outra
    private CursoRepository cursoRepository;

    public Curso criarCurso(Curso curso){
        return cursoRepository.save(curso);
    }

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }
}
