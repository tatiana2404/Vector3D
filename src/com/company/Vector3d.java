package com.company;

public class Vector3d {
    private int x;
    private int y;
    private int z;
    //private int scal;
    public Vector3d(){}
    public Vector3d(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x=x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public static int skalyar(Vector3d v1, Vector3d v2){
        int scal=v1.x*v2.x+v1.y+v2.y+v1.z+v2.z;
        return scal;
    }
    public static Vector3d vect(Vector3d v1, Vector3d v2){
        Vector3d v3=new Vector3d();
        v3.x=v1.y*v2.z-v1.z*v2.y;
        v3.y=v1.z*v2.x-v1.x*v2.z;
        v3.z=v1.x*v2.y-v1.y*v2.x;
        return v3;
    }
    public static Vector3d sum(Vector3d v1, Vector3d v2){
        Vector3d vec=new Vector3d();
        vec.x=v1.x+v2.x;
        vec.y=v1.y+v2.y;
        vec.z=v1.z+v2.z;
        return vec;
    }

    @Override
    public String toString() {
        return "Вектор(" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ')';
    }
}
