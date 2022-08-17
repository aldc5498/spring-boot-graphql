package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {


	private final BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDescription("For learning java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("ABC");

		Book b2 = new Book();
		b2.setTitle("Complete Reference");
		b2.setDescription("For learning java");
		b2.setPages(2000);
		b2.setPrice(5000);
		b2.setAuthor("XYZ");

		Book b3 = new Book();
		b3.setTitle("Head First Java ");
		b3.setDescription("For starting java");
		b3.setPages(1000);
		b3.setPrice(2000);
		b3.setAuthor("PQR");

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}



}
