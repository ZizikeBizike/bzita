package aircraftCarrier;

import java.util.ArrayList;

public class AircraftCarrier {

  private int initialCarrierAmmo;
  private int currentCarrierAmmo;
  private int healthPoint;
  private int totalDamage;

  public AircraftCarrier(int initialCarrierAmmo, int healthPoint) {
    this.initialCarrierAmmo = initialCarrierAmmo;
    currentCarrierAmmo = initialCarrierAmmo;
    this.healthPoint = healthPoint;
  }

  ArrayList<Aircraft> listOfAircrafts = new ArrayList<>();

  public void addAircraft(Aircraft aircraft) {
    listOfAircrafts.add(aircraft);
  }

  public void fillAircraft() {
    if (currentCarrierAmmo == 0) {
      throw new AmmoException("There is no ammo");
    } else {
      for (int i = 0; i < listOfAircrafts.size(); i++) {
        if (listOfAircrafts.get(i).isPriority()) {
          listOfAircrafts.get(i).refill(currentCarrierAmmo);
          currentCarrierAmmo = listOfAircrafts.get(i).getRemainingAmmo();
        }
      }
      for (int i = 0; i < listOfAircrafts.size(); i++) {
        if (!listOfAircrafts.get(i).isPriority()) {
          listOfAircrafts.get(i).refill(currentCarrierAmmo);
          currentCarrierAmmo = listOfAircrafts.get(i).getRemainingAmmo();
        }
      }
    }
  }

  public int fight(AircraftCarrier aircraftCarrier) {
    for (int i = 0; i < listOfAircrafts.size(); i++) {
      listOfAircrafts.get(i).fight();
      totalDamage += listOfAircrafts.get(i).getAllDamage();
    }
    if (aircraftCarrier.healthPoint <= totalDamage) {
      aircraftCarrier.healthPoint = 0;
    } else {
      aircraftCarrier.healthPoint -= totalDamage;
    }
    return totalDamage;
  }

  public String getStatus() {
    if (healthPoint == 0) {
      return "It's dead Jim :-(\n";
    } else {
      return "HP: " + healthPoint + ", Aircraft count: " + listOfAircrafts.size() + ", Ammo Storage: "
              + currentCarrierAmmo + ", Total damage: " + totalDamage + "\n" + "Aircrafts:" + "\n"
              + getStatusOfAircrafts();
    }
  }

  public String getStatusOfAircrafts() {
    String printableListOfAircrafts = "";
    for (int i = 0; i < listOfAircrafts.size(); i++) {
      printableListOfAircrafts += listOfAircrafts.get(i).getStatus() + "\n";
    }
    return printableListOfAircrafts;
  }
}




  /*public void getStatus() {
    if (healthPoint == 0) {
      System.out.println("It's dead Jim :-(");
    } else {
      System.out.println("HP: " + healthPoint + ", Aircraft count: " + listOfAircrafts.size() + ", Ammo Storage: "
              + currentCarrierAmmo + ", Total damage: " + totalDamage);
      System.out.println("Aircrafts:");
      for (int i = 0; i < listOfAircrafts.size(); i++) {
        System.out.println(listOfAircrafts.get(i).getStatus());
      }
    }
    System.out.println("");
  }*/

