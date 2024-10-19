package kz.bbarss.hrhelper.db.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "JobOfferTag")
public class JobOfferTag {
    @Id
    private String id;
    private String name;
}
