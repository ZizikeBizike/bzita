package aircraftCarrier;

//import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

  public static void main(String[] args) {

    AircraftCarrier aircraftCarrier1 = new AircraftCarrier(200, 1000);

    Aircraft f35number1 = new F35();
    Aircraft f35number2 = new F35();
    Aircraft f16number1 = new F16();
    Aircraft f16number2 = new F16();

    aircraftCarrier1.addAircraft(f35number1);
    aircraftCarrier1.addAircraft(f35number2);
    aircraftCarrier1.addAircraft(f16number1);
    aircraftCarrier1.addAircraft(f16number2);

    AircraftCarrier aircraftCarrier2 = new AircraftCarrier(300, 3000);

    Aircraft f35number3 = new F35();
    Aircraft f35number4 = new F35();
    Aircraft f35number5 = new F35();
    Aircraft f16number3 = new F16();
    Aircraft f16number4 = new F16();

    aircraftCarrier2.addAircraft(f35number3);
    aircraftCarrier2.addAircraft(f35number4);
    aircraftCarrier2.addAircraft(f35number5);
    aircraftCarrier2.addAircraft(f16number3);
    aircraftCarrier2.addAircraft(f16number4);

    System.out.println("Status of aircrafts and aircraftcarriers at the beginning\n");

    System.out.println(aircraftCarrier1.getStatus());
    System.out.println(aircraftCarrier2.getStatus());

    System.out.println("Status after filling the aircrafts with ammo\n");

    aircraftCarrier1.fillAircraft();
    aircraftCarrier2.fillAircraft();
    System.out.println(aircraftCarrier1.getStatus());
    System.out.println(aircraftCarrier2.getStatus());

    System.out.println("Status after first battle, AircraftCarrier1 attacks\n");

    aircraftCarrier1.fight(aircraftCarrier2);
    System.out.println(aircraftCarrier1.getStatus());
    System.out.println(aircraftCarrier2.getStatus());

    System.out.println("AircraftCarrier2 attacks\n");

    aircraftCarrier2.fight(aircraftCarrier1);
    System.out.println(aircraftCarrier1.getStatus());
    System.out.println(aircraftCarrier2.getStatus());
  }
}
