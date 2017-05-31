import greenfoot.*;


public class Movable extends Actor
{
    private int movingSpeed = 1; //default speed is 1
    
    public void setMovingSpeed(int movingSpeed){
        this.movingSpeed = movingSpeed; 
    } 
     
    public int getMovingSpeed(){ 
        return this.movingSpeed; 
        }
    
    public void moveUP(){
        this.setLocation(this.getX(), this.getY() - this.movingSpeed);
    }
    
    public void moveDOWN(){
        this.setLocation(this.getX(), this.getY() + this.movingSpeed);
    }
    
    public void moveLEFT(){
        this.setLocation(this.getX() - this.movingSpeed, this.getY());
    }
    
    public void moveRIGHT(){
        this.setLocation(this.getX() + this.movingSpeed, this.getY()); 
    }
    
    public void moveDegree(int degree){
        this.turn(degree);
        this.move(movingSpeed);
    }
    
    public boolean inTheWolrd(){
        if(isAtEdge()){
            getWorld().removeObject(this);
            return false;
        }
        return true;
    }  
} 