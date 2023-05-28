/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StatePattern4;

/**
 *
 * @author A
 */
public class ShipState implements OrderState{

    @Override
    public void ProcessOrder(Order order) {
        System.out.println("The order already processed");
    }

    @Override
    public void ShipOrder(Order order) {
        System.out.println("Shipping order...");
    }

    @Override
    public void CancelOrder(Order order) {
        System.out.println("Can not cancel the order");
    }
    
}
