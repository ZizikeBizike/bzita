package aircraftCarrier;

public class Aircraft {

  protected int maxAmmo;
  protected int baseDamage;
  protected int currentAmmo;
  protected int damage;
  protected String type;
  protected int allDamage;
  protected boolean isPriority;
  protected int remainingAmmo;

  int getActualAmmo() {
    return currentAmmo;
  }

  public int fight() {
    damage = currentAmmo * baseDamage;
    currentAmmo = 0;
    allDamage += damage;
    return damage;
  }

  public int refill(int ammoToFillWith) {
    remainingAmmo = ammoToFillWith;
    if ((maxAmmo - currentAmmo) <= ammoToFillWith) {
      remainingAmmo = ammoToFillWith - (maxAmmo - currentAmmo);
      currentAmmo = maxAmmo;
    } else if ((maxAmmo - currentAmmo) > ammoToFillWith) {
      currentAmmo +=  currentAmmo + ammoToFillWith;
      remainingAmmo = 0;
    }
    return remainingAmmo;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage;
  }

  public Aircraft() {
    //actualAmmo = 0;   this is there by default
  }
}
