package com.amazontask.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Asin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String asinValue;

    @OneToMany(mappedBy = "asin", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Statistics> statisticsList;

}
