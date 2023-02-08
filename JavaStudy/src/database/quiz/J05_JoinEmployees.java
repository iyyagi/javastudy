package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.OjdbcConnection;
import database.model.Departments;
import database.model.Employees;
import database.model.EmployeesAndDepartments;


public class J05_JoinEmployees {
	/*
	 	employees와 departments를 조인한 결과를 올바른 데이터 모델에 담아 모두 출력해 보세요.
	 
	*/
	
	public static void main(String[] args) {
		List<EmployeesAndDepartments> list = new ArrayList<>();
		String sql = "SELECT * FROM employees INNER JOIN departments USING (department_id)";
		try (
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			) {
			
			while (rs.next()) {
				// 데이터를 담기전에 metadata로 활용할 수 있다.
//				ResultSetMetaData meta = rs.getMetaData();
//				for (int i = 1; i <= meta.getColumnCount(); ++i) {
//					System.out.println(meta.getColumnName(i).toLowerCase());
//				}
				list.add(new EmployeesAndDepartments(rs));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}	
}
