/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{

    public Rectangle() {
        System.out.println("\nChào các bạn!  Đây là hình Rectangle");
    }

   @Override
    public String draw() {
        brush ="Chuẩn bị vẽ bằng bút chì màu đen";
        paper ="\nchuẩn bị giấy vẽ màu trắng";
        frame ="\nChuẩn bị khung vẽ A4";
        return brush + paper + frame;
    }
}
