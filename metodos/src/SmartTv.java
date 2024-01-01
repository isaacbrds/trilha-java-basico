public class SmartTv {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void reduzirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void reduzirCanal(){
        canal--;
    }

    public void mudarCanal(int canalDesejado){
        canal = canalDesejado;
    }
}
