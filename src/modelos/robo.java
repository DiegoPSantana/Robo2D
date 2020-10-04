package modelos;
/**
 *
 * @author D1350
 */
public class robo {  
    
    private int runAtual = 0;
    private int idleAtual = 0;
    private int timer;
    private int largura = 562;
    private int altura = 519;
    private int direcao;
    private int ultimaDirecao;
    private int posX = 300;
    private int posY = 100;
    private int velocidade;
    private int puloAtual = 0;
    private boolean pulo;
    private int alturaPulo;
    private int deadAtual = 0;
    private boolean dead;
    private int atirouAtual = 0;
    private boolean atirou;
    private int tiroAtualParado;
    private boolean atirouParado;

    public int getRunAtual() {
        return runAtual;
    }

    public void setRunAtual(int runAtual) {
        this.runAtual = runAtual;
    }

    public int getIdleAtual() {
        return idleAtual;
    }

    public void setIdleAtual(int idleAtual) {
        this.idleAtual = idleAtual;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }

    public int getUltimaDirecao() {
        return ultimaDirecao;
    }

    public void setUltimaDirecao(int ultimaDirecao) {
        this.ultimaDirecao = ultimaDirecao;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getPuloAtual() {
        return puloAtual;
    }

    public void setPuloAtual(int puloAtual) {
        this.puloAtual = puloAtual;
    }

    public boolean isPulo() {
        return pulo;
    }

    public void setPulo(boolean pulo) {
        this.pulo = pulo;
    }

    public int getAlturaPulo() {
        return alturaPulo;
    }

    public void setAlturaPulo(int alturaPulo) {
        this.alturaPulo = alturaPulo;
    }

    public int getDeadAtual() {
        return deadAtual;
    }

    public void setDeadAtual(int deadAtual) {
        this.deadAtual = deadAtual;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getAtirouAtual() {
        return atirouAtual;
    }

    public void setAtirouAtual(int atirouAtual) {
        this.atirouAtual = atirouAtual;
    }

    public boolean isAtirou() {
        return atirou;
    }

    public void setAtirou(boolean atirou) {
        this.atirou = atirou;
    }

    public int getTiroAtualParado() {
        return tiroAtualParado;
    }

    public void setTiroAtualParado(int tiroAtualParado) {
        this.tiroAtualParado = tiroAtualParado;
    }

    public boolean isAtirouParado() {
        return atirouParado;
    }

    public void setAtirouParado(boolean atirouParado) {
        this.atirouParado = atirouParado;
    }
    
    
    
}
