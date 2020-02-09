/*
 * DrawingMode.java
 * Author : susemeeee
 * Created Date : 2020-01-17
 */
package com.thunder_cut.graphics.controller;

public enum DrawingMode {
    BRUSH("브러쉬"),ERASER("지우개"),COLOR_CHOOSER("색 변경");

    public final String DISPLAY_NAME;
    DrawingMode(String name){
        this.DISPLAY_NAME = name;
    }
}
