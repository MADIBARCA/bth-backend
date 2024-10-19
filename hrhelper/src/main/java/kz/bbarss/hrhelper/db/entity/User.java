package kz.bbarss.hrhelper.db.entity;

import kz.bbarss.hrhelper.db.enums.UserType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "Users")
public class User {
    @Id
    private String id;
    private String name;
    private UserType type;
    private String description;
    private List<String> tagIds;
    @CreatedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdDate;
}
