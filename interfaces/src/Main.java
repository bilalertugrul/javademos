public class Main {
    public static void main(String[] args) {

        CostumerManager costumerManager = new CostumerManager(new MySqlDatabaseDal());
        costumerManager.GetData();

    }
}