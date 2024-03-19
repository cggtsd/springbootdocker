package cgg.springdocker.springbootdocker;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cgg.springdocker.springbootdocker.entity.Book;
import cgg.springdocker.springbootdocker.repositories.BookRepository;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class SpringbootdockerApplication {

	private BookRepository bookRepository;
	
	public SpringbootdockerApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@PostMapping
	public Book saveBook(@RequestBody Book book){
         return bookRepository.save(book);
	}

	@GetMapping
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerApplication.class, args);
	}

}
