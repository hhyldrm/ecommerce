package com.hhy.springmvc;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.cglib.core.TinyBitSet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	
//	//1.way 
//	
//	@RequestMapping("add")
//	public String addNums1(HttpServletRequest req) {
//		int a =Integer.parseInt(req.getParameter("no1"));
//		int b = Integer.parseInt(req.getParameter("no2"));
//		int sum = a+b;
//		
//		int product = a*b;
		
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("sumOfTwoIntegers", sum);
//		session.setAttribute("productOfTwoIntegers", product);
//		
//		return "result.jsp";
//	}
	
	//2.way
//	@RequestMapping("add")
//	public String addNums2(@RequestParam("no1") int a, @RequestParam("no2") int b, HttpSession session) {
//		int sum = a+b;
//		int product =a*b;
//		session.setAttribute("sumOfTwoIntegers", sum);
//		session.setAttribute("productOfTwoIntegers", product);
//		
//		return "result";
//		
//	}
	//3.way
//
//	@RequestMapping("add")
//	public ModelAndView addNums3(@RequestParam("no1") int a, @RequestParam("no2") int b) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		int sum = a+b;
//		int product =a*b;
//		mv.addObject("sumOfTwoIntegers", sum);
//		mv.addObject("productOfTwoIntegers", product);
//		
//		return mv;
		
//	}
	//4.way
//	@RequestMapping("add")
//	public ModelAndView addNums4(@RequestParam("no1") int a, @RequestParam("no2") int b) {
//		
//		ModelAndView mv = new ModelAndView("result");
//		int sum = a+b;
//		int product =a*b;
//		mv.addObject("sumOfTwoIntegers", sum);
//		mv.addObject("productOfTwoIntegers", product);
//		
//		return mv;
//		
//	}
	//5.way
	
//	@RequestMapping("add")
//	public String  addNums5(@RequestParam("no1") int a, @RequestParam("no2") int b, Model  m) 
//	{
//		
//		
//		int sum = a+b;
//		int product =a*b;
//		m.addAttribute("sumOfTwoIntegers", sum);
//		m.addAttribute("productOfTwoIntegers", product);
//		
//		return "result";
//		
//	}
	
//	@RequestMapping("add")
//	public String  addNums5(@RequestParam("no1") int a, @RequestParam("no2") int b, Model  m) 
//	{
//		
//		int sum = a+b;
//		int product =a*b;
//		m.addAttribute("sumOfTwoIntegers", sum).addAttribute("productOfTwoIntegers", product);
//		
//		return "result";
//		
//	}
	//6.way
	
//	@RequestMapping("add")
//	public String  addNums5(@RequestParam("no1") int a, @RequestParam("no2") int b, ModelMap  mm) 
//	{
//		
//		
//		int sum = a+b;
//		int product =a*b;
//		mm.addAttribute("sumOfTwoIntegers", sum);
//		mm.addAttribute("productOfTwoIntegers", product);
//		
//		return "result";
//		
//	}
	//******************************************************************************************************************************************
	
	//Student Method:
	
	//1.way
	
//	@RequestMapping("addStudent")
//	public String addStudent1(@RequestParam("id") int id, @RequestParam("name") String name, Model m)
//	{
		//first object creation way
//		Student student = new Student();
//		student.setId(id);
//		student.setName(name);
//		
		
		//second object creation way
//		Student student = new Student(id, name);
//		m.addAttribute("studentObject", student);
//		
//		return "result";
//	}
	
	//2.way
	
//	@RequestMapping("addStudent")
//	public String addstudent2 (@ModelAttribute Student student, Model m)
//	{
//		m.addAttribute("studentObject", student);
//		return "result";
//	}
	
	//3.way
	
//		@RequestMapping("addStudent")
//		public String addstudent2 (@ModelAttribute("studentObject") Student student)
//		{
//			
//			return "result";
//		}
//	
//		// How to get specific field from the object, youu needto use ModelAttribute
//		@ModelAttribute()
//		public void greetStudent(Model m, Student student)
//		{
//			
//			m.addAttribute("greetStudent",student.getName());	
//		}
//		
		//How to use POST method
		//1.way
		/*to use post method
		 * 1-inside the method paranthesis type method= RequestMethod.POST
		 * 2-the go to index.jsp file and add method = "post" inside the form tag
		 */
		
//	@RequestMapping(value="addStudent", method=RequestMethod.POST)
//	public String addstudent4 (@ModelAttribute("studentObject") Student student)
//	{
//		
//		return "result";
//	}
//
//	// How to get specific field from the object, youu needto use ModelAttribute
//	@ModelAttribute()
//	public void greetStudent(Model m, Student student)
//	{
//		
//		m.addAttribute("greetStudent",student.getName());	
//	}
	
	//2.way
	/*to use post method:
	 * 1-Use @PostMapping("addStudent") with action name from the form tag
	 * 2- then got to index.jsp and method="post" inside form tag
	 */

//	@PostMapping("addStudent")//****
//	public String addstudent5 (@ModelAttribute("studentObject") Student student)
//	{
//		
//		return "result";
//	}
//
//	// How to get specific field from the object, youu need to use ModelAttribute
//	@ModelAttribute()
//	public void greetStudent(Model m, Student student)
//	{
//		
//		m.addAttribute("greetStudent",student.getName());	
//	}
		
	
	
	
	
	
		//How to use GET Method
		//1.way
		/*1-Inside the method paranthesis type "method=RequestMethod.GET"
		  2-Go to index.jsp and add "method= get"
		  3-Goto result.jsp file and type ==> ${studentList}
		 */
//	@RequestMapping(value = "getStudent", method = RequestMethod.GET)
//	public String getStudent(Model m )
//	{
//		List <Student> students = new ArrayList<>();
//		students.add(new Student(101,"Ali Can"));
//		students.add(new Student(102,"Veli Han"));
//		students.add(new Student(103,"Melih Asim"));
//		students.add(new Student(104,"Nezih Eren"));
//		students.add(new Student(105,"Mary Star"));
//		
//		m.addAttribute("studentList", students);
//		return "result";
//	}
	
	//2.way
	
//	@GetMapping("getStudent")
//	public String getStudent(Model m )
//	{
//		List <Student> students = new ArrayList<>();
//		students.add(new Student(101,"Ali Can"));
//		students.add(new Student(102,"Veli Han"));
//		students.add(new Student(103,"Melih Asim"));
//		students.add(new Student(104,"Nezih Eren"));
//		students.add(new Student(105,"Mary Star"));
//		
//		m.addAttribute("studentList", students);
//		return "result";
//	}
	
	//How to get a specific student
	@GetMapping("getStudentWithId")
	public String getSpecificStudent(@RequestParam("id") int id, Model m )
	{
		List <Student> students = new ArrayList<>();
		students.add(new Student(101,"Ali Can"));
		students.add(new Student(102,"Veli Han"));
		students.add(new Student(103,"Melih Asim"));
		students.add(new Student(104,"Nezih Eren"));
		students.add(new Student(105,"Mary Star"));
		
		
		int idx = -1; //Index value normally cannot be - , but if we put 0 it is the 1st index --> -1 is a false index
		for(Student w : students)
		{
			if(id==w.getId())
			{
			idx = students.indexOf(w);
			}
		}
		if (idx==-1) //means there is no such id
		{
			m.addAttribute("specificStudent", " There is no such ID");
		}else
		{
			m.addAttribute("specificStudent", students.get(idx));	
		}
		return "result";
	}
	
	
	
	
	
	
	
	
}
