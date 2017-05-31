import greenfoot.*;
import java.util.*;

public class Fighter extends FighterModel
{
    private Controller controller;
    private int movingSpeed = 4;
    private String moveUP = "up";
    private String moveDOWN = "down";
    private String moveLEFT = "left";
    private String moveRIGHT = "right";
    List<GunModel> gunCollections;  
    
    public Fighter(){}
    
    public Fighter(int speed, String moveUP, String moveDOWN, String moveLEFT, String moveRIGHT){
        this.moveUP = moveUP;
        this.moveDOWN = moveDOWN;
        this.moveLEFT = moveLEFT;
        this.moveRIGHT = moveRIGHT;
        this.movingSpeed = speed;
    }
    
    public void addedToWorld(World world){
        controller = new Controller();
        gunCollections = new ArrayList<GunModel>();  
        gunCollections.add(new DefaultGun());
        gunCollections.add(new TwoAmmoes());
        gunCollections.add(new TwoBlues());
        gunCollections.add(new SpreadingBlues1());
        gunCollections.add(new SpreadingBlues2());
    }
    
    public String getUPControl(){
        return this.moveUP;
    } 
    
    public String getDOWNControl(){
        return this.moveDOWN;
    }
    
    public String getLEFTControl(){
        return this.moveLEFT;
    }
    
    public String getRIGHTControl(){
        return this.moveRIGHT; 
    } 
     
    public void fireGun(List<Bullet> bullets){ 
        for(Iterator<Bullet> i = bullets.iterator(); i.hasNext(); ) {
            Bullet bullet = i.next();
            getWorld().addObject(bullet, bullet.getInitX(), bullet.getInitY());
        }
    }
    
    public void act(){
        controller.flyingControl(this, this.movingSpeed);
        controller.firingControl(this,this.gunCollections);
    }     
}    
