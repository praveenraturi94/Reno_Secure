package com.renovite.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.renovite.model.*;

@Repository
public class DBOperationImpl implements DBOperation {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// Find all Employee

	public List<Employee> findAllEmployee() {

		List<Employee> result = jdbcTemplate.query("SELECT * FROM employee_info",
				(rs, rowNum) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getInt("age"), rs.getInt("salary")));

		return result;

	}

	// Add new Employee

	public void addEmployee(Employee employee) {

		jdbcTemplate.update("INSERT INTO employee_info (id,name,age,salary,email) VALUES (?,?,?)", employee.getId(),
				employee.getName(), employee.getAge(), employee.getSalary(), employee.getEmail());

	}

	public List<IsoData> findAll() {

		List<IsoData> result = jdbcTemplate.query("SELECT * FROM INCMSG_AUTH where AUTH_SERIAL_NO=871048",
				(rs, rowNum) -> new IsoData(rs.getInt(1), rs.getLong(2), rs.getDate(3), rs.getString(4),
						rs.getString(5), rs.getLong(6), rs.getLong(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getLong(11), rs.getLong(12), rs.getLong(13), rs.getLong(14), rs.getString(15),
						rs.getString(16), rs.getString(17), rs.getLong(18), rs.getLong(19), rs.getLong(20),
						rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25),
						rs.getString(26), rs.getString(27), rs.getString(28), rs.getString(29), rs.getString(30),
						rs.getString(31), rs.getString(32), rs.getString(33), rs.getString(34), rs.getString(35),
						rs.getString(36), rs.getString(37), rs.getString(38), rs.getString(39), rs.getString(40),
						rs.getString(41), rs.getString(42), rs.getString(43), rs.getString(44), rs.getString(45),
						rs.getString(46), rs.getString(47), rs.getString(48), rs.getString(49), rs.getString(50),
						rs.getLong(51), rs.getLong(52), rs.getLong(53), rs.getString(54), rs.getString(55),
						rs.getString(56), rs.getString(57), rs.getString(58), rs.getString(59), rs.getString(60),
						rs.getString(61), rs.getString(62), rs.getString(63), rs.getString(64), rs.getString(65),
						rs.getString(66), rs.getString(67), rs.getString(68), rs.getString(69), rs.getString(70),
						rs.getString(71), rs.getLong(72), rs.getString(73), rs.getString(74), rs.getString(75),
						rs.getString(76), rs.getString(77), rs.getString(78), rs.getString(79), rs.getString(80),
						rs.getString(81), rs.getString(82), rs.getString(83), rs.getString(84), rs.getString(85),
						rs.getString(86), rs.getString(87), rs.getString(88), rs.getString(89), rs.getString(90),
						rs.getString(91), rs.getString(92), rs.getString(93), rs.getString(94), rs.getString(95),
						rs.getInt(96), rs.getInt(97), rs.getInt(98), rs.getInt(99), rs.getString(100),
						rs.getString(101), rs.getString(102), rs.getString(103), rs.getString(104), rs.getLong(105),
						rs.getString(106), rs.getString(107), rs.getString(108), rs.getString(109), rs.getString(110),
						rs.getString(111), rs.getString(112), rs.getInt(113)));

		return result;

	}

	public Map<String, IsoData> findAllBetween() {

		Map<String, IsoData> isoData = new HashMap<String, IsoData>();
		
		

		String sql = "select * from INCMSG_AUTH where I002_NUMBER IN (select distinct I002_NUMBER from INCMSG_AUTH) and LTIMESTAMP>=date '2017-03-01' and LTIMESTAMP<=date '2017-03-04' and ROWNUM<=1000";
		List<IsoData> result = jdbcTemplate.query(sql,
				(rs, rowNum) -> new IsoData(rs.getInt(1), rs.getLong(2), rs.getDate(3), rs.getString(4),
						rs.getString(5), rs.getLong(6), rs.getLong(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getLong(11), rs.getLong(12), rs.getLong(13), rs.getLong(14), rs.getString(15),
						rs.getString(16), rs.getString(17), rs.getLong(18), rs.getLong(19), rs.getLong(20),
						rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25),
						rs.getString(26), rs.getString(27), rs.getString(28), rs.getString(29), rs.getString(30),
						rs.getString(31), rs.getString(32), rs.getString(33), rs.getString(34), rs.getString(35),
						rs.getString(36), rs.getString(37), rs.getString(38), rs.getString(39), rs.getString(40),
						rs.getString(41), rs.getString(42), rs.getString(43), rs.getString(44), rs.getString(45),
						rs.getString(46), rs.getString(47), rs.getString(48), rs.getString(49), rs.getString(50),
						rs.getLong(51), rs.getLong(52), rs.getLong(53), rs.getString(54), rs.getString(55),
						rs.getString(56), rs.getString(57), rs.getString(58), rs.getString(59), rs.getString(60),
						rs.getString(61), rs.getString(62), rs.getString(63), rs.getString(64), rs.getString(65),
						rs.getString(66), rs.getString(67), rs.getString(68), rs.getString(69), rs.getString(70),
						rs.getString(71), rs.getLong(72), rs.getString(73), rs.getString(74), rs.getString(75),
						rs.getString(76), rs.getString(77), rs.getString(78), rs.getString(79), rs.getString(80),
						rs.getString(81), rs.getString(82), rs.getString(83), rs.getString(84), rs.getString(85),
						rs.getString(86), rs.getString(87), rs.getString(88), rs.getString(89), rs.getString(90),
						rs.getString(91), rs.getString(92), rs.getString(93), rs.getString(94), rs.getString(95),
						rs.getInt(96), rs.getInt(97), rs.getInt(98), rs.getInt(99), rs.getString(100),
						rs.getString(101), rs.getString(102), rs.getString(103), rs.getString(104), rs.getLong(105),
						rs.getString(106), rs.getString(107), rs.getString(108), rs.getString(109), rs.getString(110),
						rs.getString(111), rs.getString(112), rs.getInt(113)));

		
//		IsoData isoData = (IsoData) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(IsoData.class));

		// List<IsoData> result = jdbcTemplate.query("select * from INCMSG_AUTH where
		// I002_NUMBER IN (select distinct I002_NUMBER from INCMSG_AUTH) and
		// LTIMESTAMP>=date '2017-03-01' and LTIMESTAMP<=date '2017-06-01';",
		// (rs, rowNum) -> new IsoData( rs.getInt(1), rs.getLong(2), rs.getDate (3),
		// rs.getString(4), rs.getString(5),
		// rs.getLong(6), rs.getLong(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
		// rs.getLong(11), rs.getLong(12), rs.getLong(13), rs.getLong(14),
		// rs.getString(15),
		// rs.getString(16), rs.getString(17), rs.getLong(18), rs.getLong(19),
		// rs.getLong(20), rs.getString(21), rs.getString(22), rs.getString(23),
		// rs.getString(24), rs.getString(25), rs.getString(26), rs.getString(27),
		// rs.getString(28), rs.getString(29), rs.getString(30), rs.getString(31),
		// rs.getString(32),
		// rs.getString(33), rs.getString(34), rs.getString(35), rs.getString(36),
		// rs.getString(37),
		// rs.getString(38), rs.getString(39), rs.getString(40), rs.getString(41),
		// rs.getString(42),
		// rs.getString(43), rs.getString(44), rs.getString(45), rs.getString(46),
		// rs.getString(47), rs.getString(48), rs.getString(49), rs.getString(50),
		// rs.getLong(51), rs.getLong(52), rs.getLong(53), rs.getString(54),
		// rs.getString(55), rs.getString(56), rs.getString(57), rs.getString(58),
		// rs.getString(59), rs.getString(60), rs.getString(61), rs.getString(62),
		// rs.getString(63), rs.getString(64), rs.getString(65), rs.getString(66),
		// rs.getString(67), rs.getString(68), rs.getString(69), rs.getString(70),
		// rs.getString(71), rs.getLong(72), rs.getString(73), rs.getString(74),
		// rs.getString(75), rs.getString(76), rs.getString(77), rs.getString(78),
		// rs.getString(79), rs.getString(80), rs.getString(81), rs.getString(82),
		// rs.getString(83), rs.getString(84), rs.getString(85), rs.getString(86),
		// rs.getString(87), rs.getString(88), rs.getString(89),
		// rs.getString(90), rs.getString(91), rs.getString(92),
		// rs.getString(93),rs.getString(94),
		// rs.getString(95), rs.getInt(96), rs.getInt(97), rs.getInt(98),
		// rs.getInt(99), rs.getString(100), rs.getString(101), rs.getString(102),
		// rs.getString(103),
		// rs.getString(104), rs.getLong(105), rs.getString(106), rs.getString(107),
		// rs.getString(108), rs.getString(109), rs.getString(110), rs.getString(111),
		// rs.getString(112), rs.getInt(113)));
		 
for(IsoData data: result) {
	isoData.put( Float.toString(data.getAUTH_SERIAL_NO()), data);
}
		return isoData;

	}

}
