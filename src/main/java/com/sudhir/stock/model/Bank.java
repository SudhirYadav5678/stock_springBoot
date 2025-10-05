package com.sudhir.stock.model;

import com.sudhir.stock.model.company.Company;
import com.sudhir.stock.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "stock_table")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String bankName;

    @Column(nullable = false)
    private String bankHolderName;

    @Column(nullable = false, unique = true)
    private int accountNo;

    @Column(nullable = false)
    private String ifsc;

    private String bankAddress;

    @Column(unique = true)
    private String panNo;

    @Column(unique = true)
    private String addharNo;

    private String permanentAddress;

    @OneToOne(mappedBy = "bankDetails")
    private User user;

    @OneToOne(mappedBy = "bankDetails")
    private Company company;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
