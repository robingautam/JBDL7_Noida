package org.gfg.JBDL7_DigitalLibrary.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookTransactionRequest {
    int studentId;
    int bookId;
    String amount;
    String requestType;
}
