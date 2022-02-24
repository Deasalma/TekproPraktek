package soal3;

public class KelasSatu {
	
	/*
	 * Di kelas Java, blok statis adalah satu set instruksi yang dijalankan hanya sekali 
	 * ketika kelas dimuat ke dalam memori. 
	 * Blok statis juga disebut blok inisialisasi statis. 
	 * Ini karena ini adalah opsi untuk menginisialisasi atau mengatur kelas saat run-time 
	 * */
	static {	
		System.out.println(2);
	}
	
	public KelasSatu(int i) { //akan ditampilkan jika objek memiliki parameter
		System.out.println(3);
	}
	
	public KelasSatu() { //akan ditampilkan jika objek tidak memiliki parameter
		System.out.println(4);
	}
	{
		System.out.println(11); //Akan selalu ditampilkan pertama pada class kecuali jika ada block static
	}

}
