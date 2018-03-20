MyBatis with JPA Style
======================
Write JPA repository interface with MyBatis as backend.

# Why?

I want user JPA to write code, but my workmates and DBA guys asked me to use MyBatis.  :(

And I write the JPA interface and relate interface api with MyBatis sentence.

# Tips

* Include following dependencies in your pom.xml

```
        <dependency>
            <groupId>org.springframework.data</groupId>
            <artifactId>spring-data-commons</artifactId>
            <version>1.13.10.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>javax.persistence</groupId>
            <artifactId>javax.persistence-api</artifactId>
            <version>2.2</version>
        </dependency>
```

* If you want to enable JPA auto configuration, just add spring-boot-starter-data-jpa
* IntelliJ IDEA has good support for JPA, and it's very convenient to write JPA interface.


# References

* Spring Data JPA: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/