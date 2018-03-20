package org.mvnsearch.mybatis.jpaStyle.repository;

import org.springframework.data.repository.Repository;

/**
 * city repository
 *
 * @author linux_china
 */
public interface CityRepository extends Repository<City, Integer> {

    City findById(Integer id);

}
