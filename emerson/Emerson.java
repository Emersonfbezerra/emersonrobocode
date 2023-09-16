package emerson;
import robocode.*;
import java.awt.Color;



public class Emerson extends Robot{
	public void run(){
		setColors(Color.darkGray,Color.black,Color.lightGray,Color.white,Color.red);
	

       
        while (true) {
            ahead(100);
            turnRight(90);
			}
	}
	//tank robo inimigo detectado
	
	public void onScannedRobot(ScannedRobotEvent e){
		String robotank = e.getName();
		double distancia = e.getDistance();
		System.out.println(robotank + "distancia" + distancia);
		if(distancia < 135){
			fire(3);			
		}else{
			fire(1);
		}

	}
	//colisão com a parede
	public void onHitWall(HitWallEvent e){
		back(50);
		turnRight(90);
	}	

}