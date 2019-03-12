package tst.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tst.project.bean.StudentBean;
import tst.project.page.PageBean;

@Mapper
public interface StudentDao {

	public List<StudentBean> getStudents(StudentBean studentBean,PageBean pageBean);

	public StudentBean getStudentDetail(StudentBean studentBean);

}
