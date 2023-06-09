package mall.domain;

import mall.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Stock_table")
@Data

public class Stock  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private Integer stock;


    public static StockRepository repository(){
        StockRepository stockRepository = ProductApplication.applicationContext.getBean(StockRepository.class);
        return stockRepository;
    }




    public static void decreaseStock(Shipped shipped){

        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        */

        /** Example 2:  finding and process
        
        repository().findById(shipped.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);


         });
        */

        
    }
    public static void increaseStock(ShippingCanceled shippingCanceled){

        /** Example 1:  new item 
        Stock stock = new Stock();
        repository().save(stock);

        */

        /** Example 2:  finding and process
        
        repository().findById(shippingCanceled.get???()).ifPresent(stock->{
            
            stock // do something
            repository().save(stock);


         });
        */

        
    }


}
