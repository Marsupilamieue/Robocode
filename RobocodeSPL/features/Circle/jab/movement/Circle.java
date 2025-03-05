package jab.movement;

import jab.module.Module;
import jab.module.Movement;

public class Circle extends Movement {

    private boolean toggleDirection = true;

    public Circle(Module bot) {
        super(bot);
    }

    public void move() {
        bot.setMaxVelocity(8);
        bot.setAhead(100); 
        
        if (toggleDirection) {
            bot.setTurnRight(45);
        } else {
            bot.setTurnLeft(45); 
        }
        toggleDirection = !toggleDirection;
    }
}
