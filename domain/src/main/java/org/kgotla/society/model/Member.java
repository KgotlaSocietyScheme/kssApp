package org.kgotla.society.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Members")
public class Member extends AuditModel{
    @Id
//    @GeneratedValue
    @Column(name = "memberID")
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "idNumber")
    private String idNumber;
    @Column(name = "emailAddress")
    private String emailAddress;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "password")
    private String password;
}
