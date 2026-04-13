//find the volume of the cylinder 
import java.util.*;
class cylinder{
    float r;
    float h;
    public void setr(float r){
        this.r = r;
    }
    public void seth(float h){
        this.h = h;
    }
    double volume(){
        return 3.14*r*r*h;
    }
}

public class practiseone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        cylinder c = new cylinder();
        c.setr(r);
        c.seth(h);
        double volume = c.volume();
        System.out.println(volume); 
    }    
}
