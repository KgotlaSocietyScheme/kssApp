package org.kgotla.society.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "MemberRole")
@Entity
@Data
public class MemberRole {
    @Id
    @Column(name = "MemberID")
    private Long memberID;
    @Column(name = "RoleID")
    private Long roleID;
}
