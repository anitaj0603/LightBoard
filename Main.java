public class Main {
    public static void main(String[] args) {
        LightBoard lb = new LightBoard(1000, 1000);
        System.out.println("Probability test: " + lb.test()); 

        boolean[][] testLights = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, false, false, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, false},
            {false, false, false, false, false}
        };
        
        LightBoard sim = new LightBoard(7, 5);
        sim.setLights(testLights);
        
        System.out.println(sim.evaluateLight(0, 3)); 
        System.out.println(sim.evaluateLight(6, 0)); 
        System.out.println(sim.evaluateLight(4, 1)); 
        System.out.println(sim.evaluateLight(5, 4)); 
    }
}