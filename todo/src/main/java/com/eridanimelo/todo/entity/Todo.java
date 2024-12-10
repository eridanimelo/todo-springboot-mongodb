package com.eridanimelo.todo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "todos")
@Schema(description = "Details of a TODO")
public class Todo {

    @Id
    @Schema(description = "The unique ID", example = "64c9b91b601d2c6b9f1b2a8a", required = false)
    private String id;

    @Schema(description = "The title of the TODO", example = "Learn Lombok", required = true)
    private String title;

    @Schema(description = "The description of TODO", example = "Understand how Lombok works in the project", required = true)
    private String description;

    @Schema(description = "Completion Status", example = "false", required = true)
    private boolean completed;

}
