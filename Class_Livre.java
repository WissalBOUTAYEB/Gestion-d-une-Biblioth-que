
public class Class_Livre {
	
	
	String titre;
	String auteur;
	int anee_Publication;
	
	public Class_Livre() {
		
     this.titre=titre;
     this.auteur=auteur;
     this.anee_Publication=anee_Publication;
     
	}
	
	public  void afficherDetails(String titre,String auteur,int anee_Publication ) {
		
		System.out.println("le Nom de Votre Livre est" + titre +" L'auteur est" + auteur +"Annee de Publication est"+ anee_Publication );
	}

	public static void main(String[] args) {
		Class_Livre obg1= new Class_Livre();
		obg1.afficherDetails("Harry_Potter","Jack",1951);
		
		
		
		
		
		// TODO Auto-generated method stub

	}	

}
