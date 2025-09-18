public class Demokonversisuhu {
    public static void main(String[] args) {
        KonversiSuhu2 suhu = new KonversiSuhu2();
        
        System.out.println("--------------------KonversiSuhu--------------------");
        System.out.println("====================================================");
        System.out.println("Celcius = 20");
        System.out.println("Fahrenheit = 40");
        System.out.println("=====================================================");
        System.out.println("Celciustofahrenheit =" + suhu.celciustofahrenheit(20));
        System.out.println("Celciustoreamur =" + suhu.celciustoreamur(20));
        System.out.println("Fahrenheittoreamur =" + suhu.fahrenheittoreamur(40));
    }
}

