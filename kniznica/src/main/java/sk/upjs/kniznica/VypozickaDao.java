package sk.upjs.kniznica;

import java.util.List;

public interface VypozickaDao {
	
	List<Vypozicka> getByOsobaId(int osobaId);
	
	Vypozicka ulozVypozicku(Vypozicka vypozicka) throws VypozickaNotFoundException;
	
	Vypozicka getById(int id);
	
	

}
