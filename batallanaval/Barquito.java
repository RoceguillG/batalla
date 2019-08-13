package batallanaval;
/**
 *
 * @author Rocio L.
 */
public class Barquito {
String [] barquito4C={"████"};
String [] barquito3C={"███"};
String [] barquito2C={"██"};
String [] barquito1C={"█"};

Barquito(int tamBarquito){
    switch(tamBarquito){
        case 1:
            System.out.println(barquito1C );
            break;
        case 2:
            System.out.println(barquito2C);
            break;
        
        case 3:
            System.out.println(barquito3C);
            break;
        
        case 4:
            System.out.println(barquito4C);
            break;    
        default:
            System.out.println("introduce la opcion correcta");
            break;
    }  
}




    
}
