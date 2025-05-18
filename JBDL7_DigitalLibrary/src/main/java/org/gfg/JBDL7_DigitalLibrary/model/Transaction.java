package org.gfg.JBDL7_DigitalLibrary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaction {

    int id;
    Student student;
    Book book;
    double paidAmount;
    Timestamp createdOn;
    Timestamp updatedOn;
    TransactionType type;
}
