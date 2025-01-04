public class Rectangle extends Graphique {
    private final double largeur;
    private final double hauteur;
    public Rectangle(int x,int y,double largeur,double hauteur) {
        super(x, y);
        this.largeur=largeur;
    this.hauteur=hauteur;
    }
    public double getLargeur(){return largeur;}
    public double getHauteur(){return hauteur;}
    public double perimetre(){ return 2 * (largeur + hauteur);}
    public double surface(){ return largeur*hauteur;}
    @Override
    public void affiche(){
        System.out.println("Rectangle-Coin sup gauche: ("+x+","+y+"),Largeur:"+largeur+",Hauteur:"+hauteur);
    }}
