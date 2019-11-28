package sk.upjs.kniznica;

import java.util.List;

public interface OsobaDao {

	List<Osoba> getAll();
	
	Osoba pridajOsobu(Osoba osoba);
	
	Osoba hladajOsobu(Osoba osoba) throws OsobaNotFoundException;
	
	Osoba getById(int osobaId);
	
}
