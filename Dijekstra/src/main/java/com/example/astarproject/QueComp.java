package com.example.astarproject;

import java.util.Comparator;

public class QueComp implements Comparator<Node>{

    public  QueComp() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public int compare(Node o1, Node o2) {
    	double x1 = o1.getCurrent().getCoordinateX();
        double y1 = o1.getCurrent().getCoordinateY();
        double x2 = o2.getCurrent().getCoordinateX();
        double y2 = o2.getCurrent().getCoordinateY();
        return (int) Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
    }

}
