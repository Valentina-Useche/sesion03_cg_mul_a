
package sesion02_mul_a;

public class Cilindrica {
    private float r, angulo , z; //radianes

    public Cilindrica(float radio, float angulo, float z) {
        this.r= radio;
        this.angulo = angulo;
        this.z = z;
    }
    public Cilindrica(){
        
    }
    public float getRadio() {
        return r;
    }

    public void setRadio(float radio) {
        this.r= radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
}
