import java.util.Date;


class Salary 
{
    private static Date dateEntreeService = new Date();
    
    public static void main(String[] args) 
    { 
        Personnel Personne = new Personnel();

        Personne.ajouterEmploye(new Representant(   "10hhA95FS", "IGOiurR", "haou", 25, dateEntreeService, 11000));

        Personne.ajouterEmploye(new Technicien("16B432lff", "QWERTY", "GREDENKO", 28, dateEntreeService, 11000));

        Personne.ajouterEmploye(new Manutentionnaire(   "16B432OOIFS", "BE", "MANUEL", 19, dateEntreeService, 11000));


        Personne.ajouterEmploye(new ManutentionnaireArisque(    "16BHAL5", "TCHAFROS", "AZERTY", 39, dateEntreeService, 11000));
 
        Personne.afficherSalaires();
        
        System.out.println("Le salaire moyen dans l'entreprise vaut "+ Personne.salaireMoyen() + " FCFA.");
 
    }
}