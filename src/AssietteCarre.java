public class AssietteCarre extends Assiette{
    private double c;
    public AssietteCarre(int af,double c){
        super(af);
        this.c=c;
    }
    public double calculer_surface(){
        return c*c;
    }
}
