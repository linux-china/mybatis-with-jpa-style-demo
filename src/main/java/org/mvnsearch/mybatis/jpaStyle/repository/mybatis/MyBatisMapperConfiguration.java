package org.mvnsearch.mybatis.jpaStyle.repository.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mvnsearch.mybatis.jpaStyle.repository.CityRepository;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * mybatis mapper configuration
 *
 * @author linux_china
 */
@Configuration
public class MyBatisMapperConfiguration {

    @Bean
    @Primary
    public MapperFactoryBean<CityRepository> mybatisCityRepository(SqlSessionFactory sqlSessionFactory) {
        MapperFactoryBean<CityRepository> factoryBean = new MapperFactoryBean<>(CityRepository.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }
}
