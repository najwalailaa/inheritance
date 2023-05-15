/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasinheritance;

/**
 *
 * @author Najwa
 */
public class koleksi {
        String tittle;
        String penerbit;
        int year;
            public koleksi(String tittle, String penerbit, int year)
            {
                this.tittle = tittle;
                this.penerbit = penerbit;
                this.year = year;
            }
            public String toString()
            {
                System.out.println("Judul\t\t: "+this.tittle);
                System.out.println("Penerbit\t: "+this.penerbit);
                System.out.println("Tahun\t: "+this.year);
            return "Judul buku: "+this.tittle + "\nPenerbit: "+this.penerbit+"\n\nTahun: "+this.year;
            }
}
