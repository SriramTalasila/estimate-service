package com.talasila.estimate.repositories.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.math.BigDecimal;

@Entity
@Table(name = "t_category_discount", schema = "estimate")
@Data
public class TCategoryDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_discount_seq_gen")
    @SequenceGenerator(name = "category_discount_seq_gen", sequenceName = "estimate.seq_t_category_discount", allocationSize = 1)
    @Column(name = "discount_id", nullable = false)
    private Long discountId;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private TCategory category;

    @Column(name = "discount_percentage", nullable = false)
    private BigDecimal discountPercentage;

    @ManyToOne
    @JoinColumn(name = "estimate_id", nullable = false)
    private TEstimate estimate;
}
