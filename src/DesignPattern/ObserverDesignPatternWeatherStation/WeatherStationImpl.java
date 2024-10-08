package DesignPattern.ObserverDesignPatternWeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStationObserverI{

	private List<DisplayDeviceObserverI> observerList = new ArrayList<>();
	private float temprature;
	private float humidity;
	private float pressure;
	
	public void setWeatherData(float temprature,float humidity,float pressure) {
		this.temprature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.notifyObserver();
		
	}
	@Override
	public void addObserver(DisplayDeviceObserverI displayDeviceObserverI) {
		this.observerList.add(displayDeviceObserverI);
	}

	@Override
	public void removeObserver(DisplayDeviceObserverI displayDeviceObserverI) {
		this.observerList.remove(displayDeviceObserverI);
		
	}

	@Override
	public void notifyObserver() {
		for(DisplayDeviceObserverI observerI : observerList) {
			observerI.update(temprature,humidity,pressure);
		}
	}

}
