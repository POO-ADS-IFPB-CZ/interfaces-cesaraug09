package view;

import model.Triatleta;

public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("Deputado Lobão");
        triatleta.aquecer();
        triatleta.correr();
        triatleta.nadar();
        triatleta.correrDeBicicleta();
    }
}
