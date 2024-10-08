package DesignPattern.ObserverDesignPatternWeatherStation;

public class DisplayDeviceObserverImpl implements DisplayDeviceObserverI{
	private float temperature;
    private float humidity;
    private float pressure;
	
    
	private void display() {
		System.out.println("Current Weather:");
		System.out.println("-----------------");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
		
	}


	@Override
	public void update(float temprature, float humidity, float pressure) {
		this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display(); // Display updated data
        System.out.println("---END---");
        System.out.println();
	}
	
}
