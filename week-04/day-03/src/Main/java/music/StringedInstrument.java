package Main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  public StringedInstrument(String name) {
    super(name);
  }

  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + ("-stringed instrument that goes ") + sound());
  }

  abstract String sound();
}
