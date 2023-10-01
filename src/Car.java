public class Car {

    public void start(){
        startCommand();
        startElectricity();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("Method startElectricity");
    }

    private void startCommand(){
        System.out.println("Method startCommand");
    }

    private void startFuelSystem(){
        System.out.println("Method startFuelSystem");
    }
}
