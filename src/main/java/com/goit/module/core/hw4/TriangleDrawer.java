package com.goit.module.core.hw4;

public class TriangleDrawer {

    public String drawTriangle(int side) {
        StringBuilder triangle = new StringBuilder();
        while (side > 0) {
            triangle.append("*".repeat(side)).append("\n");
            side--;
        }
        return triangle.toString();
    }

    public static void main(String[] args) {
        TriangleDrawer triangleDrawer = new TriangleDrawer();
        System.out.println(new TriangleDrawer().drawTriangle(3));
    }
}
