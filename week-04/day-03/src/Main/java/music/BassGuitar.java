package Main.java.music;

public class BassGuitar extends StringedInstrument {

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  public BassGuitar() {
    super("Bass Guitar", 4);
  }

  public BassGuitar(int numberOfStrings) {
    super("Bass Guitar");
    this.numberOfStrings = numberOfStrings;
  }
}
