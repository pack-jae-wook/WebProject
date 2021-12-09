package cs.dit.datasource;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.log4j.Log4j;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j*/
public class DataSourceTest {
	@Autowired
	private DataSource ds;
	
	@Test
	public void DataSourceTest() {
		
		/*
		 * log.info("---------------"); log.info(ds.getConnection());
		 */
	}

}
