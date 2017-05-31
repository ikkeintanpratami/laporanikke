import java.util.*;

public class SpreadingBlues1 extends GunModel  
{
    protected void clockingFire(Fighter fighter){
        List<Bullet> bullets = new ArrayList<Bullet>(); 
        for(int i=1;i<=2;i++){
            bullets.add(new WeakBullet().setInitialPosAndReturn(fighter.Gun2_XPos(i+3), fighter.Gun2_YPos(i+3)));
        }
        fighter.fireGun(bullets);
    }
} 