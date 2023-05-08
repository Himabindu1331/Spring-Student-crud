package org.jsp.CRUDstudent.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Studentdto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	long mobile;
	int math_marks;
	int science_marks;
	int english_marks;
	double percentage;
	String result;
	
}
