package com.example.teste1.Models;

import com.example.teste1.Enum.CategoriaEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_livros")
public class LivroModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    private String autor;
    private CategoriaEnum categoriaEnum;

    public LivroModels() {
    }

    public LivroModels(String nome, String categoria, String autor, CategoriaEnum categoriaEnum) {
        this.nome = nome;
        this.categoria = categoria;
        this.autor = autor;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public CategoriaEnum getCategoriaEnum() {
        return categoriaEnum;
    }

    public void setCategoriaEnum(CategoriaEnum categoriaEnum) {
        this.categoriaEnum = categoriaEnum;
    }
}
