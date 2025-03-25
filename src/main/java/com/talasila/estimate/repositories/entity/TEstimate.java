package com.talasila.estimate.repositories.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_estimate", schema = "estimate")
@Data
public class TEstimate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estimate_seq_gen")
    @SequenceGenerator(name = "estimate_seq_gen", sequenceName = "estimate.seq_t_estimate", allocationSize = 1)
    @Column(name = "estimate_id", nullable = false)
    private Long estimateId;

    @Column(name = "estimate_date", nullable = false)
    private LocalDateTime estimateDate;

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "discount_amount", nullable = false)
    private BigDecimal discountAmount;

    @Column(name = "net_amount", nullable = false)
    private BigDecimal netAmount;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private TCustomer customer;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private TBusiness business;
}