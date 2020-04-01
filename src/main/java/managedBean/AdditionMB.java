package managedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import testsUnitaires.Addition;

@ManagedBean
@Named
@ViewScoped
public class AdditionMB implements Serializable {

	private static final long serialVersionUID = -6474787997315025586L;

		private String nombre1;
		
		private String nombre2;
		
		private String resultat;
		
		private Addition addition = new Addition();
		
		public String add() {
			
			System.out.println("============> "+nombre1);
			System.out.println("============> "+nombre2);
			
			int i1 = Integer.parseInt(nombre1);
			int i2 = Integer.parseInt(nombre2);
			
			// ""+int => tranforme l'int en String
			return resultat=("" + addition.additionner(i1,i2));
		}
				
		public AdditionMB() {
		}


		public String getNombre1() {
			return nombre1;
		}


		public void setNombre1(String nombre1) {
			this.nombre1 = nombre1;
		}


		public String getNombre2() {
			return nombre2;
		}


		public void setNombre2(String nombre2) {
			this.nombre2 = nombre2;
		}

		public String getResultat() {
			return resultat;
		}

		public void setResultat(String resultat) {
			this.resultat = resultat;
		}

		
		
		
}
