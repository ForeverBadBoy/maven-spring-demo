package cn.com.kid.util;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml","classpath:applicationContext.xml"})
public class ApplicationTest {
	@Autowired
	DataSource dataSource;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		/*ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
				"classpath:spring-mvc.xml"
				,"classpath:applicationContext.xml"});
		System.out.println(context.getBean("dataSource"));*/
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
 		System.out.println(dataSource);
 		
	}
}
