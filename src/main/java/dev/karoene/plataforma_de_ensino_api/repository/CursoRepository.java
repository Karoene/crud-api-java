package dev.karoene.plataforma_de_ensino_api.repository;

import dev.karoene.plataforma_de_ensino_api.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Notation para indicar que é um Repository
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
