package cn.com.kid.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerDemo {
	JdbcTemplate jdbcTemplate ;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	DataSource datasource;
	
	public DataSource getDatasource() {
		return datasource;
	}
	@Resource(name="dataSource")
	public void setDatasource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		this.datasource = datasource;
	}

	@RequestMapping("viewIndex.htm")
	public String viewIndex(HttpServletRequest request){
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
		System.out.println(jdbcTemplate.queryForList("select sysdate from dual"));
		return "viewIndex";
	}
}
