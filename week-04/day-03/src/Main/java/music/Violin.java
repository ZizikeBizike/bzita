package Main.java.music;

public class Violin extends StringedInstrument {

  @Override
  public String sound() {
    return "Screech";
  }

  public Violin() {
    super("Violin", 4);
  }
}
