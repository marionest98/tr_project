package mvc.hello;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.command.CommandHandler;

public class BHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String menu = req.getParameter("menu");
		System.out.println("menu : " + menu);
		req.setAttribute("menu", menu);
		return "/WEB-INF/view/b.jsp";
	}
}
