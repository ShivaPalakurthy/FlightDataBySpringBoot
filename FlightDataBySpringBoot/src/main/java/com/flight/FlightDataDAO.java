package com.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FlightDataDAO {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public FlightDataDAO(JdbcTemplate jdbctemplate) { 
		this.jdbctemplate = jdbctemplate;
	}

	public List<FlightData> list(){
		String sql="SELECT * FROM FLIGHT_DATA";
		List<FlightData> fd= jdbctemplate.query(sql,BeanPropertyRowMapper.newInstance(FlightData.class));
		return fd;
	}
	
	public void save(FlightData fd) {
		
	}
	
	public FlightData get(int id) {
		return null;
	}
	public void update(FlightData fd) {
		
	}
	public void delete (int id) {
		
	}
}
