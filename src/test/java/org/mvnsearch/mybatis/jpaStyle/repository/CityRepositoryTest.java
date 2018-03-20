package org.mvnsearch.mybatis.jpaStyle.repository;

import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.Assert;
import org.junit.Test;
import org.mvnsearch.mybatis.jpaStyle.AppBaseTest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * city repository test
 *
 * @author linux_china
 */
@DataSet("/db/dataset/city.xml")
public class CityRepositoryTest extends AppBaseTest {
    @Autowired
    private CityRepository cityRepository;


    @Test
    public void testFindById() {
        Assert.assertNotNull(cityRepository.findById(1));
    }
}
