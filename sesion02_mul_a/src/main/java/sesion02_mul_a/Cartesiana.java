
package sesion02_mul_a;

public class Cartesiana {
    private float x;
    private float y;
    
    public Cartesiana(float x, float y){
        this.x = x;
        this.y = y;
}  
    
    public Cartesiana(){
        
    }
    
    //POLAR A CARTESIANA
    public Cartesiana polar_cartesiano(float radio, float angulo){
        float x = radio*(float)Math.cos(angulo);
        float y= radio*(float)Math.sin(angulo);
        return new Cartesiana(x,y);
    }
   
    public Cartesiana polar_cartesiano(Polar p){
        return polar_cartesiano(p.getRadio()*(float)Math.cos(p.getAngulo()),p.getRadio()*(float)Math.sin(p.getAngulo())); 
    }
    
    //CARTESIANA A POLAR
    public Polar cartesiano_polar(float x, float y){
        float radio = (float)Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2));
        float angulo= (float)Math.atan(y/x);  
        return new Polar(radio,angulo);
    }
    public Polar cartesiano_polar(Cartesiana c){
        return cartesiano_polar(c.getX(),c.getY());       
    }
    // CILINDRICA A ESFERICA
    public Esferica cilindrica_esferica (float r, float angulo, float z){
        float radio=(float)Math.sqrt(Math.pow(r, 2)+Math.pow(z, 2));
        float angulo_polar= (float)Math.atan(r/z);
        float angulo2= angulo;
        return new Esferica(radio,angulo,angulo2);
    }
    
    //ESFERICA A CILINDRICA
    public Cilindrica esferica_cilindrica (float p, float angulo_polar, float angulo2){
        float r = p * (float) Math.sin(angulo_polar);
        float angulo = angulo2;
        float z = p *(float) Math.cos(angulo_polar);
        return new Cilindrica(r,angulo,z);
    }
    
    
    
    
    
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
}

