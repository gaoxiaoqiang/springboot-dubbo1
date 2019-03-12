package tst.project.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import tst.project.bean.StudentBean;
import tst.project.interfaces.IStudentService;
import tst.project.page.PageBean;


@RestController
@RequestMapping(value="/studentController")
public class StudentController {
	
	@Autowired
	IStudentService studentService;
	@RequestMapping(value="/getStudents")
	public String getStudents(StudentBean studentBean,HttpServletRequest request,HttpServletResponse response,PageBean pageBean) throws Exception{
		Object studentBeans=studentService.getStudents(studentBean,pageBean);
		String a=new Gson().toJson(studentBeans);
		System.out.println(a);
		System.out.println("--");
		
		return a;	
	}
	
	
	@RequestMapping(value="/getStudentDetail",produces="application/xml;charset=UTF-8")
	public String getStudentDetail(StudentBean studentBean) {
	StudentBean studentBean2=	studentService.getStudentDetail(studentBean);
	String a=new Gson().toJson(studentBean2);
		System.out.println(new Gson().toJson(studentBean2));
		return a;
		
	}
	

}
