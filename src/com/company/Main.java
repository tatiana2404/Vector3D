package com.company;

public class Main {

    public static void main(String[] args) {
	    Vector3d vector1=new Vector3d(3,6,9);
	    Vector3d vector2=new Vector3d(2,17,13);
        System.out.println(vector1+", "+ vector2 +" Скалярное произведение = "+Vector3d.skalyar(vector1, vector2));
        System.out.println(vector1+", "+ vector2 +" Векторное произведение = "+Vector3d.vect(vector1, vector2));
        System.out.println(vector1+", "+ vector2 +" Сумма векторов = "+Vector3d.sum(vector1, vector2));
    }
}
