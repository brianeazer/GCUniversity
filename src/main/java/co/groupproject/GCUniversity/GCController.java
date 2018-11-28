package co.groupproject.GCUniversity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GCController {
	
//	@Autowired
//	String something;
	
	@RequestMapping ("/") 
	public ModelAndView index() {
		
		
		return new ModelAndView("home");
	}
	@RequestMapping ("/student-home") 
	public ModelAndView studentHome() {
		ModelAndView mv = new ModelAndView();
		
		
		return mv;
	}
	@RequestMapping ("/student-enroll") 
	public ModelAndView studentEnroll() {
		ModelAndView mv = new ModelAndView();
		
		
		return mv;
	}
	@RequestMapping ("/student-course") 
	public ModelAndView studentCourse() {
		ModelAndView mv = new ModelAndView();
		
		
		return mv;
	}
	@RequestMapping ("/admin-courses") 
	public ModelAndView adminCourses() {
		ModelAndView mv = new ModelAndView();
		
		
		return mv;
	}
	@RequestMapping ("/admin-course") 
	public ModelAndView adminCourse() {
		ModelAndView mv = new ModelAndView();
		
		
		return mv;
	}
	@RequestMapping ("/course-list") 
	public ModelAndView courseList() {
		ModelAndView mv = new ModelAndView();
		
		
		return mv;
	}

}
