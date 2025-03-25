package com.talasila.estimate.repositories.entity;


import jakarta.persistence.*;
import lombok.Data;


import java.math.BigDecimal;

@Entity
@Table(name = "t_estimate_details", schema = "estimate")
@Data
public class TEstimateDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estimate_details_seq_gen")
    @SequenceGenerator(name = "estimate_details_seq_gen", sequenceName = "estimate.seq_t_estimate_details", allocationSize = 1)
    @Column(name = "estimate_detail_id", nullable = false)
    private Long estimateDetailId;

    @ManyToOne
    @JoinColumn(name = "estimate_id", nullable = false)
    private TEstimate estimate;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private TProduct product;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private TCategory category;

    @Column(name = "quantity", nullable = false)
    private BigDecimal quantity;

    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;

    @Column(name = "product_discount", nullable = false)
    private BigDecimal productDiscount;

    @Column(name = "apply_cat_disc", nullable = false, length = 1)
    private String applyCategoryDiscount;

    @Column(name = "line_total", nullable = false)
    private BigDecimal lineTotal;
}
