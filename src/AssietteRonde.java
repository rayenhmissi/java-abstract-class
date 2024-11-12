public class AssietteRonde extends Assiette {
    private double r;
    public AssietteRonde(int af,double r){
        super(af);
        this.r=r;
    }
    public double calculer_surface(){
        return r*r*Math.PI;
    }
}
