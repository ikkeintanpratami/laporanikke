import greenfoot.*;
public class WeakBullet extends Bullet
{
    public WeakBullet(){
        this.setMovingSpeed(20);
    }    
    
     public WeakBullet(int degree){
        this.setMovingSpeed(10);
        this.turn(degree);
    } 
    
    public void keepMove(){
        if(getRotation()==0){
            moveRIGHT();
        }else{ 
            move(this.getMovingSpeed()); 
        } 
    } 
} 