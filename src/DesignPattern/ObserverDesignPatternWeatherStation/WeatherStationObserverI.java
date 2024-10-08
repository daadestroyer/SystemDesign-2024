package DesignPattern.ObserverDesignPatternWeatherStation;

public interface WeatherStationObserverI {
	public void addObserver(DisplayDeviceObserverI displayDeviceObserverI);
	public void removeObserver(DisplayDeviceObserverI displayDeviceObserverI);
	public void notifyObserver();
}
