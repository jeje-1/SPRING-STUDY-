package com.mc.jsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mc.jsp.dto.Student;

/**
 * Servlet implementation class B_EL
 */
@WebServlet("/el/*")
public class B_EL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public B_EL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("el-jstl/el-form").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int math = Integer.parseInt(request.getParameter("math"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int coding = Integer.parseInt(request.getParameter("coding"));
		
		//사용자에게 총점.,평균을 알려주자ㅏ.
		int sum = kor + math + eng + coding;
		double avg = sum/4;
		
		//jsp로 전달될 request 객체에 연산을 마친 합계, 평균값을 저장
		request.setAttribute("sum", sum);
		request.setAttribute("avg", avg);
		request.setAttribute("user", "name");
		
		// request에 자바빈 규약에 따르는 객체를 전달
		Student std = new Student();
		std.setName(name);
		std.setKor(kor);
		std.setEng(eng);
		std.setCoding(coding);
		
		request.setAttribute("std", std);
		
		request.getRequestDispatcher("el-jstl/el").forward(request, response);
		
	}

}
