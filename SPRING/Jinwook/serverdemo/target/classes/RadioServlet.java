
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RadioServlet() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        String gender = request.getParameter("gender");
        String chk_mail = request.getParameter("chk_mail");
        String content = request.getParameter("content");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("당신이 입력한 정보입니다.<br>");
        out.println("성별: ");
        out.println(gender);
        out.println("<br> 메일 정보 수신 여부 : ");
        out.println(chk_mail);
        out.println("<br> 가입인사 : ");
        out.println(content);
        // 자바 스크립트로 이전 페이지로 이동하는 링크를 만들어 줌
        out.println("</br><a href= 'javascript:history.go(-1)'>다시<a>");
        out.println("</body></html>");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
