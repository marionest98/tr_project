package mvc.hello;

import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.command.CommandHandler;

public class AHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<String> lunch = new ArrayList<>();
		lunch.add("부대찌개");
		lunch.add("햄버거");
		lunch.add("국밥");
		lunch.add("치킨");
		
		req.setAttribute("menu", lunch);
		return "/WEB-INF/view/a.jsp";
	}
}
