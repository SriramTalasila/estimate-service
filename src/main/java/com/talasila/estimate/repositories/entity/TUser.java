package com.talasila.estimate.repositories.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "t_user", schema = "estimate")
@Data
public class TUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "estimate.seq_t_user", allocationSize = 1)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "active_ind", nullable = false)
    private String activeInd;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<TBusiness> businesses;
}
