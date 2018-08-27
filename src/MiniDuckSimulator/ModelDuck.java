/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniDuckSimulator;

/**
 *
 * @author Nilmini
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior =new Quack();
    }
    public void display(){
        System.out.println("I am model duck");
    }
}
