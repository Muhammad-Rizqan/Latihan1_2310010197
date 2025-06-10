package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //Membuat objek
        Matematika rizqan = new Matematika(9,7);
        
        System.out.println("Hasil penjumlahan: "+rizqan.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+rizqan.setPengurangan());
        System.out.println("Hasil perkalian: "+rizqan.setPerkalian());
        System.out.println("Hasil pembagian: "+rizqan.setPembagian());
        
    }
}
