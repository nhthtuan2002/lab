package com.example.t2009m1_spring.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String slug;
    private String thumbnail;
    private String description;
    private int status;

}
