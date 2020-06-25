/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Vistas.*;
/**
 *
 * @author Esteban
 */
public interface ModelSubject {
	void registerObserver(ViewObserver o);
	void removeObserver(ViewObserver o);
	void notifyObserver();

}
