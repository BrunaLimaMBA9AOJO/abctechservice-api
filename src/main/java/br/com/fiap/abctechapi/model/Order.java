package br.com.fiap.abctechapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long Id;

    @Column(name = "operator_id", nullable = false)
    private Long operatorId;

    @ManyToMany
    private List<Assistance> services;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "start_order_location_id", foreignKey = @ForeignKey(name = "FK_start_order_id"))
    private OrderLocation startOrderLocation;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "end_order_location_id", foreignKey = @ForeignKey(name = "FK_end_order_id"))
    private OrderLocation endOrderLocation;
}
