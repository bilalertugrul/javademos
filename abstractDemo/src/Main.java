public class Main {
    public static void main(String[] args) {
        CostumerManager costumerManager = new CostumerManager();
        costumerManager.dataBaseManager = new MySglDatabaseManager();
        costumerManager.getCostumers();
    }
}