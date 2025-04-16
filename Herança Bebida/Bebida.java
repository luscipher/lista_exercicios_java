public class Bebida {
    private String nome;
    private String marca;
    public Bebida(){
        this.marca = "";
        this.nome = "";
    }
    public Bebida(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
