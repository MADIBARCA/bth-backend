package kz.bbarss.hrhelper.db.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "Transaction")
public class Transaction {
    private String authorId;
    private String targetId;
}
