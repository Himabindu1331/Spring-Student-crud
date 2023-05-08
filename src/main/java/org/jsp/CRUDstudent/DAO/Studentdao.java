package org.jsp.CRUDstudent.DAO;

import java.util.List;

import org.jsp.CRUDstudent.DTO.Studentdto;
import org.jsp.CRUDstudent.Repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Studentdao {
	@Autowired
	Studentrepository repository;

	public Studentdto save(Studentdto studentdto) {
		return repository.save(studentdto);

	}

	public List<Studentdto> saveall(List<Studentdto> studentdto) {
		return repository.saveAll(studentdto);
		// TODO Auto-generated method stub

	}

}
