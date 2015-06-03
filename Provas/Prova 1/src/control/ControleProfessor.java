package control;

import java.util.ArrayList;

import database.SimulatedDatabase;

public class ControleProfessor {
	
	SimulatedDatabase sm = new SimulatedDatabase();
	
	public ArrayList<String> getProfessoresPorSemestre(int semestre) {
		ArrayList<String> nomeProfessores = new ArrayList<String>();
		int[] semestresProfessor = sm.prof1.getSemestres();
		for (int indice = 0; indice < semestresProfessor.length; indice++) {
			if(semestre == semestresProfessor[indice]) {
				nomeProfessores.add(sm.prof1.getNome());
			}
		}
		
		
		
		return nomeProfessores;
	}

	
	
}
