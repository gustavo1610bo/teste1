package com.example.teste1.Models;

import com.example.teste1.Enum.CategoriaEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_livro")
public class LivroModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String titulo;
    private CategoriaEnum categoriaEnum;

    public LivroModels() {
    }

    public LivroModels(String nome, String titulo, CategoriaEnum categoriaEnum) {
        this.nome = nome;
        this.titulo = titulo;
        this.categoriaEnum = categoriaEnum;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public CategoriaEnum getCategoriaEnum() {
        return categoriaEnum;
    }

    public void setCategoriaEnum(CategoriaEnum categoriaEnum) {
        this.categoriaEnum = categoriaEnum;
    }
}
