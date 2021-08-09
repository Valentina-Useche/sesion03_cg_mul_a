
package sesion02_mul_a;

public class Esferica {
    private float p, angulo_polar , angulo2;

    public Esferica(float radio, float angulo_polar, float angulo2) {
        this.p = radio; //distancia desde el origen a un punto
        this.angulo_polar = angulo_polar; //angulo respecto al eje x de la proyeccion de un punto sobre el plano x/y
        this.angulo2 = angulo2; //angulo del vector formado por el punto y elorigen con respecto a el eje z
    }

    public float getRadio() {
        return p;
    }

    public void setRadio(float radio) {
        this.p = radio;
    }

    public float getAngulo_polar() {
        return angulo_polar;
    }

    public void setAngulo_polar(float angulo_polar) {
        this.angulo_polar = angulo_polar;
    }

    public float getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(float angulo2) {
        this.angulo2 = angulo2;
    }
    
}
