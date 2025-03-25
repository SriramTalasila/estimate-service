package com.talasila.estimate.repositories.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "t_user_role_map", schema = "estimate")
@Data
public class TUserRoleMap {

    @Id
    @Column(name = "user_role_map_id", nullable = false)
    private Long userRoleMapId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private TUser user;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private TRole role;

    @Column(name = "active_ind", nullable = false, columnDefinition = "varchar(1) default 'N'")
    private String activeInd;
}