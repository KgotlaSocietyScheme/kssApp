package org.kgotla.society.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Role")
@Entity
@Data
public class Role {
    @Id
    @Column(name = "RoleID")
    private Long roleID;
    @Column(name = "RoleName")
    private String roleName;
    @Column(name = "RoleType")
    private String roleType;
}
