package classes;

import java.time.LocalDate;

public class Figurinha {
  private String nome;
  private LocalDate dataDeNascimento;
  private double altura;
  private double peso;
  private String posicao;
  private String pais;


  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataDeNascimento() {
    return this.dataDeNascimento;
  }

  public void setDataDeNascimento(LocalDate dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getPosicao() {
    return this.posicao;
  }

  public void setPosicao(String posicao) {
    this.posicao = posicao;
  }

  public String getPais() {
    return this.pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }
  
  @Override
  public String toString() {
      return nome;
  }

}
