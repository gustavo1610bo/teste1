package com.example.teste1.Services;

import com.example.teste1.Models.LivroModels;
import com.example.teste1.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public LivroModels adicionar(LivroModels livroModels){
        return livroRepository.save(livroModels);
    }

    public List<LivroModels> buscaTudo(){
        return livroRepository.findAll();
    }

    public LivroModels buscaPorId(Long id){
        return livroRepository.findById(id).orElse(null);
    }

    public LivroModels atualizar(Long id, LivroModels livroModels){
        LivroModels atualizado = livroRepository.findById(id).orElse(null);
        atualizado.setNome(livroModels.getNome());
        atualizado.setAutor(livroModels.getAutor());
        atualizado.setCategoria(livroModels.getCategoria());
        return livroRepository.save(atualizado);
    }

    public void deletar(Long id){
        livroRepository.deleteById(id);
    }

}
