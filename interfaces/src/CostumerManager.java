public class CostumerManager implements ICostumerDal {

    private ICostumerDal costumerDal;

    public CostumerManager(ICostumerDal costumerDal){
        this.costumerDal = costumerDal;
    }
    public void GetData(){
        costumerDal.GetData();

    }

}
