public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 m = new Matematika2();
        int a = 20;
        int b = 10;

        int hasilPertambahan = m.pertambahan(a, b);
        int hasilPengurangan = m.pengurangan(a, b);
        int hasilPerkalian = m.perkalian(a, b);
        int hasilPembagian = m.pembagian(21, 2);
        int hasilModulus = m.modulus(a, b);

        System.out.println("Penjumlahan: " + a + "+" + b + "=" + hasilPertambahan);
        System.out.println("Pengurangan: " + b + "-" + 5 + "=" + hasilPengurangan);
        System.out.println("Perkalian: " + b + "*" + 3 + "=" + hasilPerkalian);
        System.out.println("Pembagian: 21/2 = " + hasilPembagian);
        System.out.println("modulus: " + a + "%" + b + "=" + hasilModulus);

    }
}
