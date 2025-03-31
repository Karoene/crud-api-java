package dev.karoene.plataforma_de_ensino_api.model;
//ARQUIVO DA TABELA DO BD
import jakarta.persistence.*;

//Notation Entity: indica que essa classe é uma entidade de dados
@Entity
//Notation Table: vai ser a tabela do BD + nome
@Table(name = "curso")
public class Curso {
    //Notation Id: qual será a PRIMARY KEY
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //gera automaticamente um ID
    private long id;

    //campos normais do BD. Nullable: indica que nao sao nulos
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private double preco;
    @Column(nullable = false)
    private String pessoaInstrutora;

    //getters e setters dos campos
    public String getPessoaInstrutora() {
        return pessoaInstrutora;
    }

    public void setPessoaInstrutora(String pessoaInstrutora) {
        this.pessoaInstrutora = pessoaInstrutora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
