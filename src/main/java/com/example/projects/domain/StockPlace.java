package com.example.projects.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "stock_place")
public class StockPlace implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "stock_place")
    private String stockPlace;

//    @OneToMany(mappedBy = "stockPlace")
//    List<Stock> stocks;
//
//    @ManyToOne
//    @JoinColumn(name = "company_id")
//    Company company;
}
