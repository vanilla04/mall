package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
    private Long customerId;
    private String address;
    private String status;

    public Shipped(Delivery aggregate){
        super(aggregate);
    }
    public Shipped(){
        super();
    }
}
