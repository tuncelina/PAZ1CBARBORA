package sk.upjs.kniznica;

import java.util.List;

public interface KnihaDao {

	//List<Kniha> getAll();

	Kniha pridajKnihu(Kniha kniha) throws KnihaNotFoundException;

	Kniha hladajPodlaNzvu(Kniha kniha) throws KnihaNotFoundException;

	Kniha hladajPodlaAutora(Kniha kniha) throws KnihaNotFoundException;

	Kniha hladajPodlaZnaru(Kniha kniha) throws KnihaNotFoundException;

	Kniha hladajPodlaISBN(Kniha kniha) throws KnihaNotFoundException;
	
	Kniha getById(int knihaId);

}
