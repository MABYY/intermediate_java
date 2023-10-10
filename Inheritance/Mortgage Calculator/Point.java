package com.codewithmosh;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        //Make sure that the obj is an instance of
        // the Point class

        if (!(obj instanceof Point))
            return false;
        var other = (Point) obj;
        return other.x == x && other.y == y;


        // If you wanted to check they reference the sale object
        // if( this == obj){
        //  return true
        //  }
    }

    // If you override the equals method, it is proper to do the
    // same whit the hashcode() method

    @Override
    public int hashCode() {
        // The default behaviour return the hashed
        // location in memory of an object
        //return super.hashCode();

        // Instead we can return the hashed values
        // If two objects have different locations in memory but
        // the same values, the hashCode will be the same
        return Objects.hash(x, y);
    }
}
