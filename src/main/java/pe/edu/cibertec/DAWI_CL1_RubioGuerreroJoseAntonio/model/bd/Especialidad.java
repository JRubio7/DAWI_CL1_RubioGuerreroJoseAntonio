package pe.edu.cibertec.DAWI_CL1_RubioGuerreroJoseAntonio.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
	
	@Id	
	@Column(name= "idesp")
	private String idesp;
	@Column(name= "nomesp")
	private String nomesp;
	@Column(name= "costo")
	private String costo;
}
