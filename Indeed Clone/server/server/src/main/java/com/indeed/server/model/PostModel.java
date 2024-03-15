package com.indeed.server.model;

import com.mongodb.client.model.Collation;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collation = "POST")
@Data
public class PostModel  {

    @NotNull
    @NotEmpty
    private String profile;

    @NotNull
    private String type;

    @NotNull
    private String description;

    @NotNull
    private String experience;

    @NotNull
    private String  technology[];

    @NotNull
    private String salary;

    @CreatedDate
    private Date createdAt;
}