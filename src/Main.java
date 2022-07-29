public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();

        System.out.println(coche.numpuertas);
        System.out.println(coche.velocidadmax);
        System.out.println(coche.velocidad);
        coche.aumentavelocidad();
        System.out.println(coche.velocidad);

        Coche coche2=new Coche(3,110);
        System.out.println(coche2.numpuertas);
        System.out.println(coche2.velocidadmax);
        System.out.println(coche2.velocidad);
        coche2.aumentavelocidad();
        System.out.println(coche2.velocidad);

    }
}

class Coche{
    public int numpuertas;
    public float velocidad;
    public float velocidadmax;

    public void aumentavelocidad(){
        if ((velocidad+15)<=velocidadmax )
            velocidad+=15;
        else
            velocidad=velocidadmax;
    }

    public void disminuyevelocidad(){
        if ((velocidad-15)>=0 )
            velocidad-=15;
        else
            velocidad=0;
    }
    Coche(){
        numpuertas=5;
        velocidadmax=120;
    }

    Coche(int puertas, int vel){
        numpuertas=puertas;
        velocidadmax=vel;
    }
}