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
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void duck(){
        }
    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public  void performQuack(){
        quackBehavior.quack();
    }
    
     public void setFlyBehavior(FlyBehavior fb){
          flyBehavior =fb;
      }
      public void setQuackBehavior(QuackBehavior qb){
          quackBehavior = qb;
      }
}
