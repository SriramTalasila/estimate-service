package com.talasila.estimate.repositories.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.math.BigDecimal;

@Entity
@Table(name = "t_product", schema = "estimate")
@Data
public class TProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq_gen")
    @SequenceGenerator(name = "product_seq_gen", sequenceName = "estimate.seq_t_product", allocationSize = 1)
    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private TCategory category;

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private TUnit unit;
}

