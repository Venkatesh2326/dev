package com.teachers.teachers.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
		private int teacherid;

		private String teachername;

	    
		public Teacher() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public int getTeacherid() {
			return teacherid;
		}

		public void setTeacherid(int teacherid) {
			this.teacherid = teacherid;
		}

		public String getTeachername() {
			return teachername;
		}

		public void setTeachername(String teachername) {
			this.teachername = teachername;
		}

	


}
