package exercism_track;

public class cookYourLasagna {

    public int expectedMinutesInOven() {
        return 40;
    }
    // ToDo: define the 'expectedMinutesInOven()' method

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return (expectedMinutesInOven() - actualMinutesInOven);
    }
    // ToDo: define the 'remainingMinutesInOven()' method
    
    public int preparationTimeInMinutes(int numberOfLayers) {
        return (numberOfLayers * 2);
    }
    // TODO: define the 'preparationTimeInMinutes()' method

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
    // TODO: define the 'totalTimeInMinutes()' method
}
