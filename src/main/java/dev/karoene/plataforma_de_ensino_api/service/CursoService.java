package dev.karoene.plataforma_de_ensino_api.service;

import dev.karoene.plataforma_de_ensino_api.model.Curso;
import dev.karoene.plataforma_de_ensino_api.repository.CursoRepository;
import org.springframework.http.ResponseEntity;
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

    /* retorna os dados do curso passado no ID. Por isso o retorno responseEntity.
    map para verificar se encontra o curso e responde ok, caso não responde notFound.
    */
    public ResponseEntity<Curso> buscarCursoPorId(Long id){
        return cursoRepository.findById(id)
                .map(curso -> ResponseEntity.ok().body(curso))
                .orElse(ResponseEntity.notFound().build());   //LAMBDA EXPRESSIONS
    }

    public ResponseEntity<Curso> atualizarPorId(Curso curso, Long id){
        return cursoRepository.findById(id)
                .map(cursoToUpdate -> {  //EXPRESSAO LAMBDA
                    cursoToUpdate.setNome(curso.getNome());
                    cursoToUpdate.setPessoaInstrutora(curso.getPessoaInstrutora());
                    cursoToUpdate.setPreco(curso.getPreco());
                    Curso update = cursoRepository.save(cursoToUpdate);
                    return ResponseEntity.ok().body(update);  //pode retornar 200(ok) ou 204, vc decide
                }).orElse(ResponseEntity.notFound().build());
    }

    public void excluirPorid(Curso curso, long id){ cursoRepository.delete(curso);}
}
