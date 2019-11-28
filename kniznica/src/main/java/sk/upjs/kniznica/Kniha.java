package sk.upjs.kniznica;

import java.util.List;

public class Kniha {

	private String autor;
	private String nazov;
	private String zaner;
	private String ISBN;
	private int pocet_knih;
	private List<Kniha> knihy;

	public String getAutor() {
		return autor;
	}

	public String getNazov() {
		return nazov;
	}

	public String getZaner() {
		return zaner;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getPocet_knih() {
		return pocet_knih;
	}

	public void pridajKnihu(String autor, String nazov, String zaner, String ISBN) {

	}

	public void hladajPodlaNazvu(String nazov) {

	}

	public void hladajPodlaAutora(String autor) {

	}

	public void hladajPodlaZanru(String zaner) {

	}

	public void hladajPodlaISBN(String ISBN) {

	}

}
