public class Cercle extends Graphique {
    private final double rayon;
    public Cercle(int x,int y,double rayon){super(x, y); 
     this.rayon = rayon;
    }
    public double getRayon(){ return rayon;}
    public double perimetre() { return 2*Math.PI *rayon; }
    public double surface() {return Math.PI*rayon*rayon; }
    @Override
    public void affiche() {
        System.out.println("Cercle-Centre:("+x+","+y+"),Rayon:"+rayon);
    }
}
