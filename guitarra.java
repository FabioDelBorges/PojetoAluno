// declaração de classe
public class Guitarra{

private String numeroSerie, fabricante, modelo, tipo, madeira;
private double preço;

// Criação do construtor da classe Guitarra

public Guitarra ( 
    
String numeroSerie, 
String fabricante, 
String modelo, 
String tipo, 
String madeira, 
double preço) {

this.numeroSerie = numeroSerie;
this.fabricante = fabricante;
this.modelo = modelo;
this.tipo = tipo;
this.madeira =madeira;
this.preço = preço;


}

public String getNumeroSerie{
return numeroSerie;

}
 
public void setNumeroSerie( String numeroSerie){
    this.numeroSerie = numeroSerie;
}

public String getFabricante(){
    return fabricante;
}

public void setFabricante(String fabricante){
    this.fabricante = fabricante;
}

public String getModelo(){
    return modelo = modelo;
}

public void setModelo(String modelo){
    this.modelo = modelo;

}

public String getTipo(){
    return tipo;

}

public void setTipo(String tipo){
    this.tipo = tipo;

}
public String getMadeira(){
    return madeira;

}

public void setMadeira(String madeira){
    this.madeira = madeira;

}

public double getPreço(){
    return preço;

}

public void setPreço(double preço){
    this.preço = preço;

}
// o metodo main() é o metodo principal da classe 
public static void main(String[] args){
    // instanciamos um objeto chamado "minhaguitarra" que será do tipo "Guitarra"
    // Os valores passados são usados pelo construtor da classe para criar p objeto
    Guitarra minhaguitarra = new Guitarra("01020304", "fender", "telecaster", "eletrica", "mogno", 1500);
    // Testando os dados da classe, imprimindo a saída simples no terminal
    System.out.println(minhaguitarra.getNumeroSerie());
    System.out.println(minhaguitarra.getMadeira());
    System.out.println(minhaguitarra.getpreço());
    System.out.println(minhaguitarra.getTipo());
 }

}