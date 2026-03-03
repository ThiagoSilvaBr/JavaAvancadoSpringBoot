//O Model representa os dados do sistema. Aqui ficam as classes que representam tabelas no banco

package com.bn.school.models;

import jakarta.persistence.*;

@Entity // mapeando como entidade da tabela do banco do projeto
@Table(name = "tb_aluno") // Utiliza para alterar o nome da tabela
public class EstudanteModel {

    @Id // identifica como id
    @GeneratedValue (strategy = GenerationType.IDENTITY)// gera o id automaticamente
    // atalho = GeneratedValue(), Ctrl+Space: strategy, Ctrl+Space: identity

    private Long id;
    @Column(name = "estudanteNome")
    private String nome;
    @Column(name = "estudanteEmail")
    private String email;
    @Column(name = "estudanteIdade")
    private Integer idade;

    public EstudanteModel(){//SpringBoot precisa de contrutor vazio
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmai(String emai) {
        this.email = emai;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmai() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }

}