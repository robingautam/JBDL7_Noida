package org.gfg.JBDL7_DigitalLibrary.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.gfg.JBDL7_DigitalLibrary.model.Book;
import org.gfg.JBDL7_DigitalLibrary.model.TransactionType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse extends Response {
    private String transactionType;
    private String bookName;
}
