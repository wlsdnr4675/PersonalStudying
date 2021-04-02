
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public InfoServlet() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        int age = Integer.parseInt(request.getParameter("age"));
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("당신이 입력한 정보입니다.<br>");
        out.println("아이디: ");
        out.println(id);
        out.println("<br> 나이 : ");
        out.println(age);
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
