package com.proyecto.demo.springboot.webflux.springbootwebfluxapi.dao;

import com.proyecto.demo.springboot.webflux.springbootwebfluxapi.documents.Categoria;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;


public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String>{
    public Mono<Categoria> findByNombre(String nombre);

}
