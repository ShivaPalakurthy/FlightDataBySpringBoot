package com.flight;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

class FlightDataDAOTest {
	private FlightDataDAO dao;
	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		datasource.setUsername("c##shivapalakurthy");
		datasource.setPassword("1234567890");
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		
		dao=new FlightDataDAO(new JdbcTemplate(datasource));
	}

	@Test
	void testList() {
		List<FlightData> fd=dao.list();
		assertTrue(fd.isEmpty());
	}

	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
