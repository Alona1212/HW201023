public class Storage {

    //array with products (Tech,Book,Food)
    private Product[] products = new Product[5];

    private int counter = 0;

    public void loadProductToStorage(Product product) {
        products[counter] = product;
        counter++;
    }

    public void printAllProductsFromStorage() {
        for( int i = 0; i < counter; i++) {
            System.out.println("Product = " + products[i]);
        }
    }
}
