package Main.java.music;

public class Violin extends StringedInstrument {

  String name = "Violin";
  int numberOfStrings = 4;

  @Override
  public String sound(){
    return "Screech";
  }
  public Violin(){

  }
}
