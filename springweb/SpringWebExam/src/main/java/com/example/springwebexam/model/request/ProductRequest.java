package com.example.springwebexam.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductRequest {

    Integer id;

    @NotBlank
    @Size(max = 255)
    String name;

    @NotNull
    @Min(value = 0, message = "Price must be greater than 0")
    Double price;

    String description;

    String avatar;

}
