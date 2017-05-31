import java.util.*;

public class SpreadingBlues2 extends GunModel 
{
    protected void clockingFire(Fighter fighter){
        List<Bullet> bullets = new ArrayList<Bullet>(); 
        bullets.add(new WeakBullet(5).setInitialPosAndReturn(fighter.Gun2_XPos(3), fighter.Gun2_YPos(3)));
        bullets.add(new WeakBullet(295).setInitialPosAndReturn(fighter.Gun2_XPos(2), fighter.Gun2_YPos(2)));
        bullets.add(new WeakBullet(320).setInitialPosAndReturn(fighter.Gun2_XPos(1), fighter.Gun2_YPos(1)));
        bullets.add(new WeakBullet(250).setInitialPosAndReturn(fighter.Gun2_XPos(3), fighter.Gun2_YPos(3)));
        bullets.add(new WeakBullet(225).setInitialPosAndReturn(fighter.Gun2_XPos(4),  fighter.Gun2_YPos(4))); 
        fighter.fireGun(bullets); 
    } 
}