package com.murilosantostelles.maratonajava.javacore.Xcolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // simétrico: para x e y diferentes de null, se x.equals(y) == true, logo y.equals(x) == true
    // transitividade: para x,y,z diferentes de null, se x.equals(y) == true e x.equals(z) == true, logo y.equals(z) == true.
    // consistente: x.equals(x) sempre retorna true se x for diferente de null.
    // para x difente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber) && marca.equals(smartphone.marca);
    }


    // se x.equals(y) == true, y.hashCode() tem que ser == x.hashCode()
    // y.hashCode == x.hashCode() não necessarioamente o equals de y.equals(x) tem que ser true. Se os hascodes forem iguals, não necessariamente o equals tem que ser true
    // y.hashCode() != x.hashCode(), x.equals(y) deverá ser false.
    @Override
    public int hashCode() {
        return this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
