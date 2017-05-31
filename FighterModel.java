import greenfoot.*;

public class FighterModel extends Actor
{
    
    public int Gun1_XPos(int wingPos){
        switch(wingPos){
            case 1:
                    return this.getX() + 75;
            case 2:
                    return this.getX() + 40;
            case 3:
                    return this.getX() + 40;
            default:
                    return this.getX() + 20; //default GUN
        } 
    }
    
    public int Gun1_YPos(int wingPos){
        switch(wingPos){
            case 1:
                    return this.getY();
            case 2:
                    return this.getY() - 75;
            case 3:
                    return this.getY() + 75 ;
            default:
                    return this.getY() - 40; //default GUN
        }
    }
    
    public int Gun2_XPos(int wingPos){
        switch(wingPos){
            case 1:
                    return this.getX() - 20;
            case 2:
                    return this.getX() - 10;
            case 3: 
                    return this.getX() - 10;
            case 4:
                    return this.getX() + 10;
            case 5:
                    return this.getX() + 20;
            default:
                    return this.getX();
        }
    }
     
    public int Gun2_YPos(int wingPos){ 
        switch(wingPos){ 
            case 1: 
                    return this.getY() - 10;
            case 2:
                    return this.getY() - 20;
            case 3:
                    return this.getY() - 40;
            case 4:
                    return this.getY() - 20;
            case 5:
                    return this.getY() - 10;
            default:
                    return this.getY();
        }
    }
    
}