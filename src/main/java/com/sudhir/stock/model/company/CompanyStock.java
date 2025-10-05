package com.sudhir.stock.model.company;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companyStocks_table")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float totalShares;
    private Float availableShares;
    private Float currentPrice;

//    @ElementCollection
//    @CollectionTable(
//            name = "company_stock_price_history",
//            joinColumns = @JoinColumn(name = "company_stock_id")
//    )
    @Column(name = "price")
    private List<Float> priceHistory = new ArrayList<>();

    @OneToOne(mappedBy = "stockDetails")
    private Company company;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
