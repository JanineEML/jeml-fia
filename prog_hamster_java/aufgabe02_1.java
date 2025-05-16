import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class aufgabe02_1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    /*
     * Bisher bekannte Befehle:
     * vor(); 		-> Hamster geht genau 1 Feld nach vorne
     * linksUm(); 	-> Hamster dreht sich um 90� nach links
     * nimm();		-> Hamster nimmt genau 1 Korn auf dem Feld auf
     * gib();		-> Hamster legt genau 1 Korn auf dem Feld ab
     */
     
     geheVor(2);
     
     nimm();
     
     vor();
     
     rechtsUm();
     
     vor();
     
     nimm();
     
     geheVor(2);
     
     gib();
     gib();
}

void rechtsUm() {
	linksUm();
	linksUm();
	linksUm();
}

void kehrtUm() {
	linksUm();
	linksUm();
}

void geheVor(int anzahlFelder) {
	// anzahlFelder ist ein Platzhalter und muss ein Integer (int, Zahl) sein. Dieser Wert
	// wird beim Aufruf der Methode im Programm angegeben: geheVor(5).
	
	// int i = 0 ist die Z�hlvariable. Diese z�hlt von 0 beginnend zu anzahlFelder hoch
	
	// i < anzahlFelder bis wann gez�hlt wird. Sei anzahlFelder = 5. Damit werden 5 Durch-
	// l�ufe durchgef�hrt: 0, 1, 2, 3, 4.
	// Falls i <= anzahlFelder kommt noch ein Durchlauf hinzu: 0, 1, 2, 3, 4, 5.
	
	// i++ bedeutet dass am Ende jedes Durchlaufs i um 1 erh�ht wird. i++ hei�t i+1.
	
	for(int i = 0; i < anzahlFelder; i++) {
		vor();
	}
}}