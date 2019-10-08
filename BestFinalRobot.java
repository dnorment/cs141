package norment;

/** * BestFinalRobot * 
 * @author Daniel Norment
 * @author Zichi Chen
 */
 
import robocode.*; 
import static robocode.util.Utils.normalRelativeAngleDegrees;
import java.awt.*;

public class BestFinalRobot extends AdvancedRobot 
{ 
	int radarTime = 0; //counter for direction or unlock 
	double turnGun; //amt to turn 
	double enemyEnergy = 100; 
	int moving = 1; //relative direction
	
	public void flipDir() 
	{ 
		moving *= -1; 
	}
	
	public void run() 
	{ 
		double bfHeight = getHeight(); //battlefield dims 
		double bfWidth = getWidth(); 
		setBodyColor(new Color(100, 100, 90)); 
		setGunColor(new Color(90, 90, 200)); 
		setRadarColor(new Color(20, 20, 170)); 
		setScanColor(Color.white); 
		setBulletColor(Color.blue);
		setAdjustGunForRobotTurn(true); 
		turnGun = 15;
		
		while(true)
		{ 
			turnGunRight(turnGun); 
			radarTime++; 
			if (radarTime > 3) 
			{ 
				turnGun = -10; //l 
			} 
			if (radarTime > 6) 
			{ 
				turnGun = 10; //r 
			} 
			if (Math.abs(getX() - bfWidth) < 50 || Math.abs(getY() - bfHeight) < 50) 
			{ 
				setBack(moving * 20); //avoid walls
			} 
		}
	} 
	
	public void onScannedRobot(ScannedRobotEvent e) 
	{
		turnGun = normalRelativeAngleDegrees(e.getBearing() + getHeading() - getRadarHeading()); //degrees to enemy 
		turnGunRight(turnGun); 
		radarTime = 0; 
		turnRight(e.getBearing() + 90 - (e.getDistance() % 45) * moving);
		double energyDelta = enemyEnergy - e.getEnergy(); 
		if ((energyDelta > 0 && energyDelta <= 3) || (false))
		{
			flipDir(); 
			setAhead(moving * e.getDistance()/3);
		} 
		fire(Math.max(350/e.getDistance(), 2)); //fires based on distance
		enemyEnergy = e.getEnergy();
	}
	
	public void onHitByBullet(HitByBulletEvent e) 
	{
		
	}

	public void onHitWall(HitWallEvent e) 
	{ 
		setBack(moving * 20); 
	}
}
