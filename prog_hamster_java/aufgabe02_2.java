import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class aufgabe02_2 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    /*
     * Bisher bekannte Befehle:
     * vor(); 		-> Hamster geht genau 1 Feld nach vorne
     * linksUm(); 	-> Hamster dreht sich um 90° nach links
     * nimm();		-> Hamster nimmt genau 1 Korn auf dem Feld auf
     * gib();		-> Hamster legt genau 1 Korn auf dem Feld ab
     * maulLeer();	-> Gibt Boolean wahr aus wenn keine Körner im Maul,
     *				   sonst false.
     * kornDa();	-> prüft ob auf dem aktuellen Feld ein Korn liegt,
     *				   gibt boolean zurück.
     */
     
     rechtsUm(); // linksUm(); x3
     geheVor(2);
     
     linksUm();
     sucheKorn(3); // vor(); x3, nimm(); x1
     
     linksUm();
     geheVor(2); // vor(); x2
     
     rechtsUm();
     sucheKorn(4);
     // vor(); x2, nimm(); x2, vor(); x2
     
     rechtsUm();
     sucheKorn(7); // vor(); x7, nimm(); x1
     
     kehreUm();
     geheVor(2);
     
     linksUm();
     geheVor(7);
     
     linksUm();
     geheVor(2);
     gibAlle();
}

void rechtsUm() {
	linksUm();
	linksUm();
	linksUm();
}

void kehreUm() {
	linksUm();
	linksUm();
}

void nimmGenau(int anzahlKoerner) {
	for(int i = 0; i < anzahlKoerner; i++) {
		nimm();
	}
}

void gibGenau(int anzahlKoerner) {
	for(int i = 0; i < anzahlKoerner; i++) {
		gib();
	}
}

void gibAlle() {
	while (maulLeer() != true) {
		gib();
	}
}

void geheVor(int anzahlFelder) {
	// anzahlFelder ist ein Platzhalter und muss ein Integer (int, Zahl) sein. Dieser Wert
	// wird beim Aufruf der Methode im Programm angegeben: geheVor(5).
	
	// int i = 0 ist die Zählvariable. Diese zählt von 0 beginnend zu anzahlFelder hoch
	
	// i < anzahlFelder bis wann gezählt wird. Sei anzahlFelder = 5. Damit werden 5 Durch-
	// läufe durchgeführt: 0, 1, 2, 3, 4.
	// Falls i <= anzahlFelder kommt noch ein Durchlauf hinzu: 0, 1, 2, 3, 4, 5.
	
	// i++ bedeutet dass am Ende jedes Durchlaufs i um 1 erhöht wird. i++ heißt i+1.
	
	for(int i = 0; i < anzahlFelder; i++) {
		vor();
	}
}

void sucheKorn(int anzahlFelder) {
	for(int i = 0; i < anzahlFelder; i++) {
		vor();
		
		// Prüfe ob auf dem neuen Feld ein Korn ist und nehme es auf.
		while(kornDa()) {
			nimm();
		}
	}
}}