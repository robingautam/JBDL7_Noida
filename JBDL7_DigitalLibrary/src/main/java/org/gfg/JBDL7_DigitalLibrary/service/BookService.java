package org.gfg.JBDL7_DigitalLibrary.service;

import org.gfg.JBDL7_DigitalLibrary.exception.BookAlreadyPresent;
import org.gfg.JBDL7_DigitalLibrary.model.Author;
import org.gfg.JBDL7_DigitalLibrary.model.Book;
import org.gfg.JBDL7_DigitalLibrary.repository.AuthorDao;
import org.gfg.JBDL7_DigitalLibrary.repository.BookDao;
import org.gfg.JBDL7_DigitalLibrary.request.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    @Autowired
    AuthorDao authorDAO;

    public Book createBookInDatabase(CreateBookRequest createBookRequest){

        String bookId = createBookRequest.getBookId();
        String bookName = createBookRequest.getBookName();
        String bookType = createBookRequest.getBookType().toString();
        String authorEmail = createBookRequest.getAuthorEmail();

        Book bookResult = null;

        try {
            int status = bookDao.findBookById(bookId);
            if (status > 0) {
                throw new BookAlreadyPresent("Book is Already present in the database");
            }

            int result = bookDao.createBookInDatabase(bookId,bookName, bookType, authorEmail);
            if (result<=0){
                return null;
            }

            boolean isAuthorExist ;

            try {
                Author authorExist = authorDAO.findAuthorById(authorEmail);
                isAuthorExist = true;
            }
            catch (Exception e){
                isAuthorExist = false;
            }

            if (isAuthorExist==true){
                return bookResult;
            }

            authorDAO.createAuthor(CreateBookRequest.toAuthor(createBookRequest));

        }
        catch (Exception exception){
            throw new RuntimeException();
        }

        return bookResult;

    }
}
