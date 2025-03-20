package ex1;

class Parabola{
    private final float a,b,c;

    public Parabola(float a,float b,float c) {
        this.a = a;
        this.b=b;
        this.c=c;
    }

    public Punct getVarf() {
        float xv= -b/(2*a);
        float yv=(-(xv*xv)+4*xv*c)/(4*a);
        return new Punct(xv,yv);
    }
    @Override
    public String toString(){
        return "f(x) = " + a + "x^2 + " + b + "x + " + c;
    }

    public Punct getMijloc(Parabola p){
        Punct v1=this.getVarf();
        Punct v2=p.getVarf();
        float midX=(v1.getX()+ v2.getX())/2;
        float midY=(v2.getY()+v2.getY())/2;

        return new Punct(midX,midY);
    }

    public static Punct calcMijloc(Parabola p1,Parabola p2){
        return p1.getMijloc(p2);
    }

    public float calcLungime(Parabola p){
        Punct v1=this.getVarf();
        Punct v2=p.getVarf();
        return (float) Math.hypot(v2.getX()-v1.getY(), v2.getY()- v1.getY());
    }
    public static float lungimeSegm(Parabola p1,Parabola p2){
        return p1.calcLungime(p2);
    }


}

