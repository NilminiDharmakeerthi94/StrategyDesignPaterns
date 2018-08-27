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
public class MallerdDuck extends  Duck{

    public MallerdDuck(){
    
       quackBehavior=new Quack();
       flyBehavior=new  FlyWithWings();
    }
    public void display(){System.out.println("I'm mallerd duck");
}}
