import greenfoot.*;
import java.util.*;

public class Controller 
{
    public void flyingControl(Fighter act, int movingSpeed){
        if (Greenfoot.isKeyDown(act.getUPControl())) {
            act.setLocation(act.getX(), act.getY()-movingSpeed)  ;
        }    
        if (Greenfoot.isKeyDown(act.getDOWNControl())) {
            act.setLocation(act.getX(), act.getY()+movingSpeed)  ;
        }    
        if (Greenfoot.isKeyDown(act.getLEFTControl()))  {
            act.setLocation(act.getX()-movingSpeed, act.getY())  ;
        }    
        if (Greenfoot.isKeyDown(act.getRIGHTControl())) {
            act.setLocation(act.getX()+movingSpeed, act.getY())  ;
        } 
    }
    
    public void firingControl(Fighter act, List<GunModel> gunCollections){ 
        if (Greenfoot.isKeyDown("space")) {
            GunModel gun = gunCollections.get(0);
            gun.fireGun(act);
        }
        
        for(int i=1; i<gunCollections.size(); i++){
            GunModel gun = gunCollections.get(i);
            if (Greenfoot.isKeyDown(Integer.toString(i))) {
                GunModel gun1 = gunCollections.get(i);
                gun1.fireGun(act); 
            } 
        } 
    } 
}