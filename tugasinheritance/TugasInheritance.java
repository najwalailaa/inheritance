/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasinheritance;

/**
 *
 * @author Najwa
 */
public class TugasInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        koleksi x = new koleksi ("Java", "Erlangga", 2021);
        System.out.println(x.toString());
        
        System.out.println("\n\n");
        
        buku y = new buku ("Akuntasi Pengantar 1", "Faiz Zamzani","Gava Media", 2009);
        System.out.println(y.toString());
        
        System.out.println("\n\n");
        
        majalah z = new majalah("Metode Penelitian Kualitatif",  "ke satu","Alfabeta", 2017);
        System.out.println(z.toString());
        
         System.out.println("\n\n");
         
         skripsi a = new skripsi( "18081010111", "Arif Himawan", "Pengaruh Mootivasi, Komunikasi, dan Stress Kerja Terhadap Kepuasan Kerja Karyawan", "Universitas K", 2019);
}
}
