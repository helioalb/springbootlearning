package me.helioalbano.springbootlearning.jpaandhibernate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity(name = "PersonTable")
@Table(uniqueConstraints = {
    @UniqueConstraint(name = "UniqueNumberAndStatus", columnNames = { "personNumber", "isActive"}),
    @UniqueConstraint(name = "UniqueSecurityAndDepartment", columnNames = { "securityNumber", "departmentCode" }),
    @UniqueConstraint(name = "UniqueNumberAndAddress", columnNames = { "personNumber", "address" })
})
@Data
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Convert(converter = PersonNameConverter.class)
    private PersonName personName;

    private String name;
    private String password;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private Long personNumber;

    private Boolean isActive;
    private String securityNumber;
    private String departmentCode;

    @Column(unique = true)
    @JoinColumn(name = "addressId", referencedColumnName = "id")
    private Address address;
}
