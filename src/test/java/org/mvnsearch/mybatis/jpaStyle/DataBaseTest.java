package org.mvnsearch.mybatis.jpaStyle;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.xml.FlatDtdDataSet;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.FileOutputStream;

/**
 * database test
 *
 * @author linux_china
 */
public class DataBaseTest extends AppBaseTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DataSource dataSource;

    @Test
    public void testSpike() {
        Assert.assertNotNull(jdbcTemplate);
    }

    @Test
    public void generateDTD() throws Exception {
        IDatabaseConnection connection = new DatabaseConnection(dataSource.getConnection());
        FlatDtdDataSet.write(connection.createDataSet(), new FileOutputStream("target/database.dtd"));
    }
}
