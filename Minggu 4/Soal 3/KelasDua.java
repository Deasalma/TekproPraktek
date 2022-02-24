package soal3;

public class KelasDua {
	{
		System.out.println(5);
	}

	public static void main(String[] args) {
		System.out.println(6); //akan dijalankan pertama kali karena pada main program akan dijalankan secara sequentiak
		KelasSatu satu = new KelasSatu(); //membuat objek satu dengan tipe data KelasSatu
		KelasSatu dua = new KelasSatu(10); // membuat objek dua dengan tipe data KelasSatu
	}
}
