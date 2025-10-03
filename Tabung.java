public class Tabung extends Bangun{
    protected int t;
    public void setSuperPh1(double ph1){
        super.ph1 = ph1;
    }

    public void setSuperR(int r){
        super.r = r;
    }

    public void setT(int t){
        this.t = t;
    }

    public void volume(){
        System.out.println("Volume Tabung adalah: " + (super.ph1 * super.r * super.r * t));
    }
}
