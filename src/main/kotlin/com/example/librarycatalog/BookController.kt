package com.example.librarycatalog

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/books")

class BookController(private val bookRepository: BookRepository) {
    @GetMapping
    fun getAllBooks(): List<Book> = bookRepository.findAll()
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createBook(@RequestBody book: Book): Book= bookRepository.save(book)
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteBook(@PathVariable id: Long){
        bookRepository.deleteById(id)
    }

}