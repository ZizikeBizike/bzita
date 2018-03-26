package aircraftCarrier;

public class Aircraft {

  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;
  private int damage;
  private String type;
  private int allDamage;
  private boolean isPriority;
  private int remainingAmmo;

  public Aircraft() {
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

  public String getStatus() {
    return "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: "
            + allDamage;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setPriority(boolean priority) {
    isPriority = priority;
  }

  public boolean isPriority() {
    return isPriority;
  }

  public int getRemainingAmmo() {
    return remainingAmmo;
  }

  public int getAllDamage() {
    return allDamage;
  }
}
