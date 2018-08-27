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
public class MiniDuckSimulators  {
    public static void main(String[] args) {
        Duck mallerd = new MallerdDuck();
        mallerd.performQuack();
        mallerd.performFly();
        
        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();
    }
    
}
