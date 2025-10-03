package com.sudhir.stock.model.company;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company_table")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {


}
