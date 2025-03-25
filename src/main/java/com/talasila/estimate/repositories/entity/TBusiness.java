package com.talasila.estimate.repositories.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "t_business", schema = "estimate")
@Data
public class TBusiness {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "business_seq_gen")
    @SequenceGenerator(name = "business_seq_gen", sequenceName = "estimate.seq_t_business", allocationSize = 1)
    @Column(name = "business_id", nullable = false)
    private Long businessId;

    @Column(name = "business_name", nullable = false, unique = true)
    private String businessName;

    @Column(name = "phone_one")
    private String phoneOne;

    @Column(name = "phone_two")
    private String phoneTwo;

    @Column(name = "address_lane_one")
    private String addressLaneOne;

    @Column(name = "address_lane_two")
    private String addressLaneTwo;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "gst_number")
    private String gstNumber;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private TUser owner;  // Foreign key reference to `t_user`
}