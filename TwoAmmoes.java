import java.util.*;

public class TwoAmmoes extends GunModel 
{
    protected void clockingFire(Fighter fighter){
        List<Bullet> bullets = new ArrayList<Bullet>(); 
        for(int i=1;i<=3;i++){
            bullets.add(new StrongBullet().setInitialPosAndReturn(fighter.Gun1_XPos(i), fighter.Gun1_YPos(i)));
        }
        fighter.fireGun(bullets);
    }
}
 