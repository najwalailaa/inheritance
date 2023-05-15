/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasinheritance;

/**
 *
 * @author Najwa
 */
public class buku extends koleksi 
{
    public String penulis;

    public buku(String tittle, String penulis, String penerbit, int year) {
        super(tittle, penerbit, year);
        this.penulis = penulis;
    }
    @Override
    public String  toString()
    {
        return "Judul buku: "+this.tittle + "\nPenulis: "+this.penulis+ "\nPenerbit: "+this.penerbit+"\n\nTahun: "+this.year;
        
    }
}
