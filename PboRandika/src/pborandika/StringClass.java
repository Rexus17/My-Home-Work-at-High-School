package pborandika;

public class StringClass {
    public static void main(String[] args) {
        String nama = "Randika";
        System.out.println(nama);
        
        String kelas = new String("XII RPL");
        System.out.println("Kelas: " + kelas);
        
        String text = "Ini adalah sebuah text string di Java";
        System.out.println("Panjang teks: " + text.length() + " Teks nya: " + text);
        
        String str1 = "Hello ";
        String str2 = "World";
        System.out.println(str1.concat(str2));
    }
}
