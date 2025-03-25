package com.talasila.estimate.repositories.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "t_unit", schema = "estimate")
@Data
public class TUnit {

    @Id
    @Column(name = "unit_id", nullable = false)
    private Long unitId;

    @Column(name = "unit_name", nullable = false, unique = true)
    private String unitName;
}