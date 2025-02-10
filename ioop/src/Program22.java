package src;
// Create a weather class

class Weather {
    static class Forecast {
        public static String predictWeather(float temp, float humidity) {
            if (temp > 25 && humidity < 70) {
                return "Sunny";
            }
			else if (temp > 25 && humidity >= 70) {
                return "Rainy";
            }
			else if (temp <= 25 && humidity > 60) {
                return "Rainy";
            }
			else {
                return "Cloudy";
            }
        }

        public static void displayForecast(String city, float temp, float humidity) {
            String weatherCondition = predictWeather(temp, humidity);
            System.out.println("Weather forecast for " + city + ":");
            System.out.println("Temperature: " + temp + "°C, Humidity: " + humidity + "%");
            System.out.println("Condition: " + weatherCondition);
            System.out.println();
        }
    }
}

public class Program22 {
	public static void main(String[] args) {
        Weather.Forecast.displayForecast("New York", 28f, 65f);
        Weather.Forecast.displayForecast("London", 18f, 85f);
        Weather.Forecast.displayForecast("Tokyo", 22f, 55f);
        Weather.Forecast.displayForecast("Sydney", 30f, 75f);
    }
}