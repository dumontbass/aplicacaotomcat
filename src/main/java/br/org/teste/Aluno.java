package br.org.teste;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by guilherme on 30/01/14.
 */


@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="NomeAluno")
    private String nome;

    @Column(name="DataNascimento")
    private Date dataNascimento;

    @Column(name="SituacaoAluno")
    private boolean situacaoAluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isSituacaoAluno() {
        return situacaoAluno;
    }

    public void setSituacaoAluno(boolean situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aluno{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", dataNascimento=").append(dataNascimento);
        sb.append(", situacaoAluno=").append(situacaoAluno);
        sb.append('}');
        return sb.toString();
    }
}
