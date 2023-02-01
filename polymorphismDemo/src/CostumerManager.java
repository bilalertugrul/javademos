public class CostumerManager {
    private BaseLogger logger;

    public CostumerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void Add(){
        System.out.println("Added Costumer");
        this.logger.Log("log mesaji");

    }
}
