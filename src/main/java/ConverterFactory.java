public class ConverterFactory {

    public TemperatureConverter getConverter(Locale thisLocale) {
        TemperatureConverter toReturn = null;
        switch (thisLocale.thisLocale) {
            case "US" :
                toReturn = new ConverterToFahrenheit();
                break;
            case "CH" :
                toReturn = new ConverterToKelvin();
                break;
            default:
                toReturn = new ConverterCelsius();
    }
    return toReturn;
    };
}
