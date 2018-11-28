package co.groupproject.GCUniversity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.groupproject.GCUniversity.dao.AdminDao;
import co.groupproject.GCUniversity.dao.StudentDao;
import co.groupproject.GCUniversity.dao.UserDao;
import co.groupproject.GCUniversity.model.User;

@Controller
public class GCController {

	@Autowired
	UserDao userDao;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("home");
	}

	@PostMapping("/")
	public ModelAndView adminOrUser(@RequestParam(name = "lastName") String lastName) {
		
		User user = userDao.findByLastname(lastName);
		ModelAndView mv = new ModelAndView();
		return mv;

	}

	@RequestMapping("/student-home")
	public ModelAndView studentHome() {
		ModelAndView mv = new ModelAndView();

		return mv;
	}

	@RequestMapping("/student-enroll")
	public ModelAndView studentEnroll() {
		ModelAndView mv = new ModelAndView();

		return mv;
	}

	@RequestMapping("/student-course")
	public ModelAndView studentCourse() {
		ModelAndView mv = new ModelAndView();

		return mv;
	}

	@RequestMapping("/admin-courses")
	public ModelAndView adminCourses() {
		ModelAndView mv = new ModelAndView();

		return mv;
	}

	@RequestMapping("/admin-course")
	public ModelAndView adminCourse() {
		ModelAndView mv = new ModelAndView();

		return mv;
	}

	@RequestMapping("/course-list")
	public ModelAndView courseList() {
		ModelAndView mv = new ModelAndView();

		return mv;
	}

}
