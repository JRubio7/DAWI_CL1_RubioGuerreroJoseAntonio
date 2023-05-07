package pe.edu.cibertec.DAWI_CL1_RubioGuerreroJoseAntonio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.DAWI_CL1_RubioGuerreroJoseAntonio.model.bd.Especialidad;
import pe.edu.cibertec.DAWI_CL1_RubioGuerreroJoseAntonio.repository.EspecialidadRepository;

public class EspecialidadService {
	
	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listarEstados(){
		
		return especialidadRepository.findAll();
	}
	
	public void registrarEstado(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}

}
