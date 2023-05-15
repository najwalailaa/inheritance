/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasinheritance;

/**
 *
 * @author Najwa
 */
public class skripsi extends buku 
{
public String npm;

    public skripsi(String npm, String tittle, String penulis, String penerbit, int year) 
    {
        super( tittle, penulis, penerbit, year);
        this.npm = npm;
    }
        @Override
    public String  toString()
    {
return "Judul buku: "+this.tittle +"\nPenulis: "+this.penulis+"\nNPM: "+ this.npm+"\nPenerbit: "+this.penerbit+ "\nTahun: "+this.year;
}
}
