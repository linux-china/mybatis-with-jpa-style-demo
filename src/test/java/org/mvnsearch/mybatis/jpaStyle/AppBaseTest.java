package org.mvnsearch.mybatis.jpaStyle;

import com.github.database.rider.spring.api.DBRider;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * app base test
 *
 * @author linux_china
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@DBRider
public abstract class AppBaseTest {

}
