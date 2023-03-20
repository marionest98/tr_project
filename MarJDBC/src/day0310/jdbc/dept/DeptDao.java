package day0310.jdbc.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//수행할 SQL문마다 메서드 선언
public class DeptDao {

	// select * from dept rs => 자바 객체 select : 여러줄, 컬럼 여러개 -> List<dto>

	public List<DeptDTO> deptAll(Connection conn) {
		List<DeptDTO> dlist = new ArrayList<>();

		String sql = "select * from dept";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));

				dlist.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dlist;
	}

	// select * from dept where deptno = ?
	public DeptDTO deptOne(Connection conn, int deptno) {
		DeptDTO dto = null;
		String sql = "select * from dept where deptno = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, deptno);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dto;
	}
	//select * from dept where dname like '%?%'	
	public List<DeptDTO> searchDept(Connection conn, String dname) {
		List<DeptDTO> dlist = new ArrayList<>();
		String sql = "select * from dept where dname like ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {			
			pstmt.setString(1, "%"+dname+"%");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				dlist.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dlist;
	}
	
	//select max(deptno)+10 from dept
	public int getNewNo(Connection conn) {
		int no = 0;
		String sql = "select max(deptno)+10 from dept";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();	
			if(rs.next()) {
				no = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return no;
	}
	
	//insert into dept values(?(deptno), ?(dname), ?(loc))
	public int addDept(Connection conn, DeptDTO dto) {
		int i = 0;
		String sql = "insert into dept values(?, ?, ?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			i = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return i;
	}
	
	//updateDept 스캐너로 부서번호 - 50 수정할 부서명 - IT&PRO    update 수행
	public int updateDept(Connection conn, String dname, int deptno) {
		int i = 0;
		String sql = "update dept set dname = ? where deptno = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);
			
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return i;		
	}
	//deleteDept 스캐너로 부서번호 - 50 삭제할 부서명 - IT&PRO    둘 다 맞는 경우만 삭제
	public int deleteDept(Connection conn, DeptDTO dto) {
		int i = 0;
		String sql = "delete from dept where dname = ? and deptno = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, dto.getDname());
			pstmt.setInt(2, dto.getDeptno());
			
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return i;		
	}
	

	
}
