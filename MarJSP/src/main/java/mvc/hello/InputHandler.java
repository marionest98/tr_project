package mvc.hello;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.command.CommandHandler;

public class InputHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String id = req.getParameter("id");
		System.out.println("id : "+id);
		String pw = req.getParameter("pw");
		System.out.println("pw : "+pw);
		String adn = req.getParameter("adn");
		String ad = req.getParameter("ad");
		System.out.println("ad : "+ ad + adn);
		if(adn.equals("")) {
			return "/WEB-INF/view/form.jsp";
		}
		return "/WEB-INF/view/input.jsp";
	}
}
