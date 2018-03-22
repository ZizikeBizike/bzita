package aircraftCarrier;

import java.util.ArrayList;

public class AircraftCarrier {

  private int storeOfAmmo;
  private int initialCarrierAmmo;
  private int currentCarrierAmmo;
  private int healthPoint;
  private int allAmmoAmountNeeded = 0;
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

  public int countAllAmmoAmountNeeded() {
    for (int i = 0; i < listOfAircrafts.size(); i++) {
      allAmmoAmountNeeded += (listOfAircrafts.get(i).getMaxAmmo() - listOfAircrafts.get(i).getCurrentAmmo());
    }
    return allAmmoAmountNeeded;
  }

  public void fillAircraft() {
    countAllAmmoAmountNeeded();

    if (currentCarrierAmmo == 0) {
      throw new ArithmeticException("There is no ammo");
    } else if (allAmmoAmountNeeded <= currentCarrierAmmo) {
      for (int i = 0; i < listOfAircrafts.size(); i++) {
        listOfAircrafts.get(i).refill(currentCarrierAmmo);
        currentCarrierAmmo = listOfAircrafts.get(i).getRemainingAmmo();
      }
    } else {
      for (int i = 0; i < listOfAircrafts.size(); i++) {
        if (listOfAircrafts.get(i).isPriority()) {
          listOfAircrafts.get(i).refill(currentCarrierAmmo);
          currentCarrierAmmo = listOfAircrafts.get(i).getRemainingAmmo();
        } else if (!listOfAircrafts.get(i).isPriority()) {
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
    aircraftCarrier.healthPoint -= totalDamage;
    return totalDamage;
  }

  public int sufferDamage() {
    if (totalDamage > healthPoint) {
      healthPoint = 0;
    } else {
      healthPoint -= totalDamage;
    }
    return healthPoint;
  }

  public void getStatus() {
    if (healthPoint == 0) {
      System.out.println("It's dead Jim :-(");
    } else {
      System.out.println("HP: " + healthPoint + ", Aircraft count: " + listOfAircrafts.size() + ", Ammo Storage: " + currentCarrierAmmo + ", Total damage: " + totalDamage);
      System.out.println("Aircrafts:");
      for (int i = 0; i < listOfAircrafts.size(); i++) {
        System.out.println(listOfAircrafts.get(i).getStatus());
      }
    }
    System.out.println("");
  }
}

