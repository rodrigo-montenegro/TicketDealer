package Model;
import Vistas.*;
public interface ModelSubject {
	void registerObserver(ViewObserver o);
	void removeObserver(ViewObserver o);
	void notifyObserver();
}
