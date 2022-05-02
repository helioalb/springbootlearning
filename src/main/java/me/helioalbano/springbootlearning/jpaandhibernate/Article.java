package me.helioalbano.springbootlearning.jpaandhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "MyArticle")
@Table(name = "ARTICLES")
public class Article {

    @Id
    private Long id;
}
