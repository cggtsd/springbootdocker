package cgg.springdocker.springbootdocker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springdocker.springbootdocker.entity.Book;

public interface BookRepository  extends JpaRepository<Book,Integer>{
    
}
