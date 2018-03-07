package Main.java.music;

public class ElectricGuitar extends StringedInstrument{

  @Override
  public String sound(){
    return "Twang";
  }

  public ElectricGuitar(){
    super("Electric Guitar", 6);
  }

  public ElectricGuitar(int numberOfStrings){
    super("Electric Guitar");
    this.numberOfStrings = numberOfStrings;
  }
}
