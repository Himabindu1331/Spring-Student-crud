package org.jsp.CRUDstudent.Controller;

import java.util.List;

import org.jsp.CRUDstudent.DTO.Studentdto;
import org.jsp.CRUDstudent.Service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@Autowired
	Studentservice service;
	@RequestMapping("students")
	public Studentdto saveStudent(@RequestBody Studentdto studentdto) {
		return service.save(studentdto);
	}
	@PostMapping("students/multiple")
	public List<Studentdto> saveall(@RequestBody List<Studentdto> studentdtos){
		return service.saveall(studentdtos);
	}
}
