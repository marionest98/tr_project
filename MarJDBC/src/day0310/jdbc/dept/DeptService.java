package day0310.jdbc.dept;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class DeptService {

	DeptDao dao = new DeptDao();

	public void deptAll(Connection conn) {
		List<DeptDTO> dlist = dao.deptAll(conn);
		System.out.println("전체 부서 정보");
		for (DeptDTO dept : dlist) {
			System.out.println(dept);
		}
		System.out.println("========END========");

	}

	public void deptOne(Connection conn) {
		System.out.println("부서번호를 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		int deptno = scanner.nextInt();
		DeptDTO dto = dao.deptOne(conn, deptno);

		if (dto == null) {
			System.out.println("입력하신 부서는 없습니다.");
		} else {
			System.out.println(dto);
		}
		System.out.println("========END========");

	}

	public void searchDept(Connection conn) {
		System.out.println("부서이름 입력하세요> ");
		Scanner scanner = new Scanner(System.in);
		String dname = scanner.next();
		List<DeptDTO> dlist = dao.searchDept(conn, dname);
		if (dlist.size() == 0) {
			System.out.println("입력하신 부서는 없습니다.");
		} else {
			System.out.println("부서들 정보");
			for (DeptDTO dept : dlist) {
				System.out.println(dept);
			}
		}
		System.out.println("========END========");

	}
	
	public void addDept(Connection conn) {
		System.out.println("새로운 부서를 추가합니다.");
		int no = dao.getNewNo(conn);
		Scanner scanner = new Scanner(System.in);
		System.out.println("부서이름> ");
		String dname = scanner.next();
		System.out.println("근무지> ");
		String loc = scanner.next();
		DeptDTO dto = new DeptDTO(no, dname, loc);
		int i = dao.addDept(conn, dto);
		if(i != 0) {
			System.out.println("부서 입력 완료");
			System.out.println(dto);
		}	
		
	}
	
	public void updateDept(Connection conn) {
		System.out.println("부서 이름을 수정합니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("부서번호> ");
		int deptno = scanner.nextInt();
		System.out.println("부서이름> ");
		String dname = scanner.next();	
		int i = dao.updateDept(conn, dname, deptno);
		if(i != 0) {
			System.out.println("부서 수정 완료");
		}else {
			System.out.println("입력하신 부서는 없습니다.");
		}		
	}
	
	public void deleteDept(Connection conn) {
		System.out.println("부서를 삭제합니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 부서번호> ");
		int deptno = scanner.nextInt();
		System.out.println("삭제할 부서이름> ");
		String dname = scanner.next();	
		DeptDTO dto = new DeptDTO(deptno, dname, null);
		int i = dao.deleteDept(conn, dto);
		if(i != 0) {
			System.out.println("부서 삭제 완료");
		}else {
			System.out.println("입력하신 부서는 없습니다.");
		}
		
	}

}
