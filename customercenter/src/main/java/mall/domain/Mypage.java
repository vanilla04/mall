package mall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Mypage_table")
@Data
public class Mypage {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long customerId;
        private String productName;
        private Long orderId;
        private Integer qty;
        private String address;
        private String status;


}
