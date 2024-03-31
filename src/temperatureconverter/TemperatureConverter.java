package temperatureconverter;
import java.util.Scanner;

class celsiustoFahrenheit
{
    public  double celsius;
    public  double calculate(double c)
    {
        celsius = (c*9/5)+32;
        return celsius;
    }
}
class fahreniteToCelsius
{
    public  double fahrenite;
    public  double calculate(double f)
    {
        fahrenite=(f-32)*5/9;
        return fahrenite;
    }
}
public class TemperatureConverter 
{
    public static void main(String[] args) 
    {
        double tempValue;
        String mesUnit;
        System.out.println("Temperature Converter");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature value: ");
        tempValue=sc.nextDouble();
        System.out.println("Enter the measurement unit (C for Celsius & F for Fahrenite) : ");
        mesUnit=sc.next().toUpperCase();
        celsiustoFahrenheit c=new celsiustoFahrenheit();
        fahreniteToCelsius f=new fahreniteToCelsius();
        
        switch (mesUnit) {
            case "C" -> {
                c.calculate(tempValue);
                System.out.println(tempValue+" degree Celsius = "+c.celsius+" degree Fahrenite");
            }
            case "F" -> {
                f.calculate(tempValue);
                System.out.println(tempValue+" degree Fahrenite  = "+f.fahrenite+" degree Celsius");
            }
            default -> System.out.println("Inavlid input, please enter C or F");
        }
        sc.close();
    }
    
}
