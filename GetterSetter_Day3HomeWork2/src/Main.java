public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Telefon","Samsung",10000,21);
        /*product.setId(1);
        product.setName("Cep Telefonu");
        product.setDescription("Samsung Note");
        product.setPrice(10000);
        product.setStockAmount(13);
        product.getCode();*/

        ProductManager productManager = new ProductManager();
        productManager.add();

        System.out.println(product.getCode() + " " + product.getName());
    }
}