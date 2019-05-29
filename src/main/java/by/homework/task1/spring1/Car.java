package by.homework.task1.spring1;

/**
 * Created by Rusinovich on 29.05.2019.
 */
public class Car {

    private final Wheel firstWheel;
    private final Wheel secondWheel;
    private final Wheel thirdWheel;
    private final Wheel fourthWheel;
    private final Engine engine;
    private final Suspension suspension;

    public Car(Wheel firstWheel, Wheel secondWheel, Wheel thirdWheel, Wheel fourthWheel, Engine engine, Suspension suspension) {
        this.firstWheel = firstWheel;
        this.secondWheel = secondWheel;
        this.thirdWheel = thirdWheel;
        this.fourthWheel = fourthWheel;
        this.engine = engine;
        this.suspension = suspension;
    }

    public Wheel getFirstWheel() {
        return firstWheel;
    }

    public Wheel getSecondWheel() {
        return secondWheel;
    }

    public Wheel getThirdWheel() {
        return thirdWheel;
    }

    public Wheel getFourthWheel() {
        return fourthWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void Collect(){
        firstWheel.Rotate();
        secondWheel.Rotate();
        thirdWheel.Rotate();
        fourthWheel.Rotate();
        engine.Install();
        suspension.Exposed();
    }
}
