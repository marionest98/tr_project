package mvc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/simple")
public class SimpleController extends HttpServlet {

	private static final long serialVersionUID = 1L;//버전 비교용 없어도 됨
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		// 2단계, 요청 파악
		// request 객체로부터 사용자의 요청을 파악하는 코드 -무슨타입인지 받음
		String type = request.getParameter("type");
		
		// 3단계, 요청한 기능을 수행한다.
		// 사용자에 요청에 따라 알맞은 코드
		// type을 분석해서 처리 끝!
		Object resultObject = null;
		if (type == null || type.equals("greeting")) {
			resultObject = "안녕하세요.";
		} else if (type.equals("date")) {
			resultObject = new java.util.Date();
		} else {
			resultObject = "Invalid Type";
		}
		
		// 4단계, request나 session에 처리 결과를 저장
		request.setAttribute("result", resultObject);
		request.setAttribute("type", type);
		
		// 5단계, RequestDispatcher를 사용하여 알맞은 뷰로 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher("/simpleView.jsp");
		dispatcher.forward(request, response);
	}
}
