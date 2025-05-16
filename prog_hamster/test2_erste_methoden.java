import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class test2_erste_methoden extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    vorNimm();
    rechtsUm();
    vorNimm();
    rechtsUm();
    vorNimm();
    rechtsUm();
    vorNimm();
    rechtsUm();
}


/*
 *
 *
 */

void rechtsUm() {
	linksUm();
	linksUm();
	linksUm();
}

void kehreUm() {
	linksUm();
	linksUm();
}

void vorNimm() {
	vor();
	vor();
	vor();
	vor();
	nimm();
	vor();
	vor();
	vor();
}

void geheVor(int anzahlFelder) {
	for (int i = 0; i < anzahlFelder; i++) {
		vor();
	}
}

void geheBisWand() {
	while (vornFrei()) {
		vor();
	}
}}