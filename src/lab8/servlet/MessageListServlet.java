package lab8.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageListServlet extends ChatServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ���������� ��������� HTTP-������ UTF-8
		response.setCharacterEncoding("utf8");
		// �������� ������ � ������ ������ HTTP-������
		PrintWriter pw = response.getWriter();
		// ������� � ����� HTML-�������� ��������
		pw.println("<html><head><meta http-equiv='Content-Type' content='text/html; charset=utf-8'/><meta http-equiv='refresh' content='10'></head>");
		pw.println("<body>");
		// � �������� ������� �������� � ����� HTML-�������� ��� �������
		// ���������
		for (int i = messages.size() - 1; i >= 0; i--) {
			ChatMessage aMessage = messages.get(i);
			pw.println("<div><strong>" + aMessage.getAuthor().getName() + "</strong>: " + aMessage.getMessage() + "</div>");
		}
		pw.println("</body></html>");
	}
}
