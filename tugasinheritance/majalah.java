/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasinheritance;

/**
 *
 * @author Najwa
 */
public class majalah extends koleksi 
{
    public String edisi;
    public majalah(String edisi, String tittle, String penerbit, int year) {
        super(tittle, penerbit, year);
        this.edisi = edisi;
    }
        @Override
    public String  toString()
    {
        return "Judul buku: "+this.tittle+"\nEdisi: "+this.edisi + "\nPenerbit: "+this.penerbit + "\nTahun: "+this.year;
    }
}
