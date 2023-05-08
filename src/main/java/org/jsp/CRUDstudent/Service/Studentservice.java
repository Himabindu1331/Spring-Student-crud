package org.jsp.CRUDstudent.Service;

import java.util.List;

import org.jsp.CRUDstudent.DAO.Studentdao;
import org.jsp.CRUDstudent.DTO.Studentdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentservice {

	@Autowired
	Studentdao dao;
	public Studentdto save(Studentdto studentdto) {
		double percentage=(studentdto.getEnglish_marks()+studentdto.getMath_marks()+studentdto.getScience_marks())/3.0;
		studentdto.setPercentage(percentage);
		if(percentage>85) {
			studentdto.setResult("Distinction");
		}else {
			if(percentage>60) {
				studentdto.setResult("First class");
			}
			else {
				studentdto.setResult("Fail");
			}
		}
		return dao.save(studentdto);
	}
	public List<Studentdto> saveall(List<Studentdto> studentdto){
		for(Studentdto dto : studentdto) {
			double percentage=(dto.getEnglish_marks()+dto.getMath_marks()+dto.getScience_marks())/4.0;
			dto.setPercentage(percentage);
			if(percentage>85) {
				dto.setResult("Distinction");
			}else {
				if(percentage>60) {
					dto.setResult("First class");
				}else {
					dto.setResult("Fail");
				}
			}
		}
		return dao.saveall(studentdto);
	}

}
