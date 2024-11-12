  
class Collection {  
    static void afficherCuilleres(Usetensile[] us) {         
        int nbCuilleres = 0;  
                for (int i = 0; i < us.length; i++) {
                    if (us[i] instanceof Cuillere){
                        nbCuilleres++;
                    } 
                }  
                System.out.println("Il y a " + nbCuilleres + " cuillères.");  
            }    
            static void afficherSurfaceAssiettes(Usetensile[] us) {         
        double somme = 0;  
                for (int i = 0; i < us.length; i++) {  
                    if (us[i] instanceof AssietteCarre){
                            AssietteCarre ac=(AssietteCarre) us[i];
                            somme+=ac.calculer_surface();
                        }
                    if (us[i] instanceof AssietteRonde){
                        AssietteCarre ar=(AssietteCarre) us[i];
                        somme+=ar.calculer_surface();
                    }
            }  
                System.out.println("Surface totale des assiettes : " + somme);  
            }    
           static void afficherValeurTotale(Usetensile[] us) {         
        double somme = 0;  
                for (int i = 0; i < us.length; i++) {  
                    if (us[i] instanceof Cuillere || us[i] instanceof AssietteRonde){
                        if (2024-us[i].getAf()>50){
                            somme+=2024-us[i].getAf()-50;
                        }
                    }
                    if (us[i] instanceof AssietteCarre){
                        somme+=(2024-us[i].getAf()-50)*5;
                    }
            }  
            System.out.println("Valeur totale de la collection : " + somme);  
        }
    public static void main(String[] args) {         
    Usetensile[] us = new Usetensile[6];         
    us[0] = new AssietteRonde(1926, 8.4);         
    us[1] = new Cuillere(1881, 7.3);
    us[2]= new AssietteCarre(1935, 5.6);
    us[3]= new Cuillere(1917, 8.8);   
    us[4]=new AssietteRonde(1837, 5.4);  
    afficherCuilleres(us);         
    afficherSurfaceAssiettes(us);         
    afficherValeurTotale(us);
} 
}