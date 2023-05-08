package org.jsp.CRUDstudent.Repository;

import org.jsp.CRUDstudent.DTO.Studentdto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Studentdto, Integer>{

}
