/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan53;

import m10119002.pbo.latihan53.target.Rabbit;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program rabbit
 * Pertemuan 5
 * 
 */
public class Program {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is ".concat(rabbit.getName()));
        System.out.println(rabbit.getName().concat(" is Vegetarian? ").
                concat(Boolean.toString(rabbit.isVegetarian())));
        System.out.println(rabbit.getName().concat(" eats ").
                concat(rabbit.getEats()));
        System.out.println(rabbit.getName().concat(" has ").
                concat(Integer.toString(rabbit.getNoOfLegs())).
                concat(" legs."));
        System.out.println(rabbit.getName().concat(" color is ").
                concat(rabbit.getColor()));
    }
}
