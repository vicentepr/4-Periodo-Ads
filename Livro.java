package com.bibliotecaabc.model;

public class Livro {

    private Integer id;
    private String issn;
    private String titulo;
    private String sinopse;
    private Integer ano;
    private Integer numeroDePaginas;

    public Livro() {
    }

    public Livro(Integer id, String issn, String titulo, String sinopse, Integer ano, Integer numeroDePaginas) {
        this.id = id;
        this.issn = issn;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.ano = ano;
        this.numeroDePaginas = numeroDePaginas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
