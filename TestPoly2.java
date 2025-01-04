public class TestPoly2 {
    public static void main (String [] args) {
    Graphique [] tab = new Graphique [6];
    //tab[0] = new Graphique (3,2);//Erreur, classe abstraite est non instanciable
    //Même si la classe Graphique est abstraite, il est tout de même possible
    //de déclarer des variables de ce type qui pourront recevoir des objets
    //créés à partir des sous-classes concrètes :
    tab[0] = new Cercle (3,2,7);
    tab[1] = new Cercle (10,7,3) ;
    tab[2] = new Rectangle (4,7,8,6) ;
    tab[3] = new Rectangle (8,10,12,10);
    tab[4] = new Cercle (8,5,3) ;
    tab[5] = new Rectangle (10,17,3,8) ;
    for (int i=0 ; i <=5 ; i++) { tab[i].affiche(); } }
    }