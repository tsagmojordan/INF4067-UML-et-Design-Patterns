import java.util.Scanner;

public class App {

      static Scanner input = new Scanner(System.in);
      public static int choix = 0;

      // cette methode nous permet d'avoir une sorte de tableau de bord pour navigez entre les differents patrons
      public static void presenter(){
            
        System.out.println("*********hello  dear DEV*******");
        System.out.println("veillez choisir le parrtern que vous souhaitez expérimenter");
        System.out.println("entrez 1 pour le parttern FACTORY METHOD");
        System.out.println("entrez 2 pour le pattern ABSTRACT FACTORY");

        try {
             choix = input.nextInt();
        } catch (Exception e) {
            e.getMessage();
            System.out.println("erreur sur la donnée saisie");
            /* System.out.println("veillez saisir de nouveau votre choix");
             choix = input.nextInt(); */
        }
       
      
        
    } 

    public static void main(String[] args) throws Exception {
      
        presenter();//tableau de bord

        switch(choix){
            case 1:
            System.out.println("bon choix");
            System.out.println("qu'est ce que le parttern factory method?");
            break;

            case 2:
             System.out.println("bon choix");
            System.out.println("qu'est ce que le parttern abstract factory ?");
            break;
            
            default : 
            presenter();
        }
        


        
    }

        
}