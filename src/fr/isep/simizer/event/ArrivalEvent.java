package fr.isep.simizer.event;

import fr.isep.simizer.network.ClientGenerator;

public class ArrivalEvent extends Event<Long, ClientGenerator> {

  public ArrivalEvent(long timestamp, Long nb, ClientGenerator cg) {
    super(timestamp, nb, cg);
  }

  @Override
  public void dispatch() {
    target.onArrivalEvent(this.timestamp, this);
  }

}
