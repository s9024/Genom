package genetic;

public class Chromosom {

    int rozmiar_populacji;
    int kod;
    float ocena;
    
    public String toString() {
    return "ocena :'" + this.ocena + " kod:" + this.kod;
    }
    
    void setOcena(float o) {
	this.ocena = o;
    }

    void setKod(int o) {
            this.kod = o;
    }

    float getOcena() {
            return this.ocena;
    }

    int getKod() {
            return this.kod;
    }
    
}
