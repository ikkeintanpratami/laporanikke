import greenfoot.*; 
 
public class Bullet extends Movable 
{
    private int initX;
    private int initY;
       
    public void setInitialPos(int x, int y){
        this.initX = x;
        this.initY = y;
    }
    
    public Bullet setInitialPosAndReturn(int x, int y){
        this.initX = x;
        this.initY = y;
        return this;
    }
    
    public int getInitX(){ 
        return this.initX;
    }
    
    public int getInitY(){
        return this.initY;
    }
    
    public void keepMove(){
        moveRIGHT();
    }
    
    public void act(){
        if(inTheWolrd())keepMove();
    }    
} 