package com.ean.db.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

// 기존 JDBC 프로그램 구현 => DBMS와 연동
// 클라이언트로부터 요청이 있을 때마다 DB서버와 연결하기 위해서
// Connection 객체를 얻어내야 했음

// 단점
//		1. Connection 과정은 일정 시간이 필요한 작업
//		2. 불필요한 연결에 의한 서버 자원을 낭비

// 단점 보완 => DBCP (Database Connection Pool)
//		여러개의 DB Connection을 하나의 Pool에 모아놓고 관리
// 		필요할 때마다 Pool에서 불러다가 사용하면 됨 !
//		만약, 빌려올 수 있는 Connection이 없다면, Connection 객체가 반환할 때까지
//			클라이언트는 대기 상태로 전환
//		사용이 끝난 Connection 객체는 다시 Pool로 봔환

//		JNDI (Java Naming and Directory Interface)
//		: Java 기술로 지정된 API로 어떤 파일/프로그램에 이름 지정 및 디렉토리 지정이 가능함
//		InitialContext() : 이름이 있는 객체를 찾을 때 사용하기 위한 객체
//		DataSource : 커넥션 풀의 Connection을 관리하기 위한 객체
//			lookup메소드를 통해서 관리, Connection 객체를 가져올 수 있음

public class EanDBManager {
	
	public static Connection connect(String poolName) throws SQLException, NamingException {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/" + poolName);
									// -> Context.xml이 있는 경로
		return ds.getConnection();
	}
	
	public static void close(Connection con, PreparedStatement pstm, ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
		}
		try {
			pstm.close();
		} catch (Exception e) {
		}
		try {
			con.close();
		} catch (Exception e) {
		}
		
	}	
}
