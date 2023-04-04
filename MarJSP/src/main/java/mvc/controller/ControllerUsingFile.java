package mvc.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.command.CommandHandler;
import mvc.command.NullHandler;

@WebServlet(value="/ControllerUsingFile")
public class ControllerUsingFile extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	// <커맨드, 핸들러인스턴스> 매핑 정보 저장
	private Map<String, CommandHandler> commandHandlerMap = new HashMap<>();
	
	public void init() throws ServletException {
		Properties prop = new Properties();
		String configFilePath = getServletContext().getRealPath("/WEB-INF/commandHandler.properties");
								//어플리케이션 경로 + 안에 있는 경로
		try (FileReader fis = new FileReader(configFilePath)) {
			prop.load(fis);//스트림 통해서 읽어온 데이터를 properties객체에 저장
		} catch (IOException e) {
			throw new ServletException(e);
		}
		Iterator keyIter = prop.keySet().iterator();
		while (keyIter.hasNext()) {
			String command = (String) keyIter.next();
			String handlerClassName = prop.getProperty(command);
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);
				//클래스명에 맞는 클래스 찾아서
				CommandHandler handlerInstance = (CommandHandler) handlerClass.newInstance();
				//객체 생성
				commandHandlerMap.put(command, handlerInstance);
				//요청 - 생성한 객체를 매핑해 map에 저장
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}//response 클라이언트에 전달
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("cmd");
	}
	
	
	

}
