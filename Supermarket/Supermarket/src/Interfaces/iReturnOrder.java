package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    void takeInQueue(iActorBehaviuor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
    
}
