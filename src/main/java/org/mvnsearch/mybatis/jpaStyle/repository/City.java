package org.mvnsearch.mybatis.jpaStyle.repository;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * city entity
 *
 * @author linux_china
 */
@Entity
@Table(name = "city")
@Data
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "created_at")
    private Date createdAt;

}