package Main.java.music;

public class BassGuitar extends StringedInstrument {

  String name = "Bass Guitar";
  int numberOfStrings;

 @Override
  public String sound(){
    return "Duum-duum-duum";
  }

  public BassGuitar(){

  }

  public BassGuitar(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }
}
