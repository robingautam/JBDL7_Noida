package org.gfg.JBDL7_DigitalLibrary.controller;

import org.gfg.JBDL7_DigitalLibrary.model.Book;
import org.gfg.JBDL7_DigitalLibrary.request.CreateBookRequest;
import org.gfg.JBDL7_DigitalLibrary.response.BookResponse;
import org.gfg.JBDL7_DigitalLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping(value = "/create/book", produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookResponse> createBook(@RequestBody CreateBookRequest createBookRequest){
        BookResponse bookResponse = new BookResponse();

        if (createBookRequest==null){
            bookResponse.setErrCode("FAILED");
            bookResponse.setMessage("Request is empty");
            return new ResponseEntity<>(bookResponse, HttpStatus.OK);
        }

       Book book = bookService.createBookInDatabase(createBookRequest);

        if (book==null){
            bookResponse.setErrCode("FAILED");
            bookResponse.setMessage("Data Not Inserted");
            return new ResponseEntity<>(bookResponse, HttpStatus.OK);
        }

        bookResponse.setErrCode("SUCCESS");
        bookResponse.setMessage("Book inserted in database");
        bookResponse.setBookId(book.getBookId()+"");
        bookResponse.setBookName(book.getBookName());

        return new ResponseEntity<>(bookResponse,HttpStatus.CREATED);
    }
}
