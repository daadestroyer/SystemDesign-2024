package DesignPattern.ObserverDesignPatternWeatherStation;	import javax.xml.transform.Templates;

public class Main {
	public static void main(String[] args) {
		// Create WeatherStation
		WeatherStationImpl weatherStationImpl = new WeatherStationImpl();
		
		// add some Display Device observer
		DisplayDeviceObserverImpl display1 = new DisplayDeviceObserverImpl();
		DisplayDeviceObserverImpl display2 = new DisplayDeviceObserverImpl();
		
		// register observer
		weatherStationImpl.addObserver(display1);
		weatherStationImpl.addObserver(display2);
		
		// change weather data
		weatherStationImpl.setWeatherData(30.5f, 65.0f, 1013.0f); // Notify observers of new weather data
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------------");
		weatherStationImpl.setWeatherData(28.0f, 70.0f, 1009.0f); // Notify observers of updated data
	}
}
