package com.eshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private double rating;

    @ElementCollection
    private List<String> images;

    @JsonIgnore
    @ManyToOne
    private Product product;

    @ManyToOne
    private User user;

    private LocalDateTime createAt = LocalDateTime.now();

}
