
package masodikcsolti;

import Osztályok.Ember;


public class MasodikCsolti {

    
    public static void main(String[] args) {
        Ember ember = new Ember("Pál", 2000, 10);
        System.out.println(ember.bemutatkozik());
        Ember ember2 = new Ember("Pál", 2000);
        System.out.println(ember2.bemutatkozik());
        Ember ember3 = new Ember("Pál");
        System.out.println(ember3.bemutatkozik());
    }
    
    
    
    
    
}
