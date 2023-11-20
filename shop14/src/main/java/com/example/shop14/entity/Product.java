package com.example.shop14.entity;
//package com.example.shop14.entity;

import com.example.shop14.validation.Between;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@ToString
// @EqualsAndHashCode
public class Product {
    @Id
    // стратегия автогенерации ключа
    // IDENTITY - ключ будет генеритья автоматически авеличивающимся значением в колонке
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Length(min= 5, max = 50, message = "Product name must be from 5 to 50 characters")
    // @Pattern(regexp = "^.{5,50}$", message = "Product name must be from 5 to 50 characters")
    // @Email
    @Column(name = "PRODUCT_NAME", length = 50, nullable = false, unique = false)
    private String name;
    
    //@Min(value = 0, message = "Price should be positive")
   // @Max(value = 50, message = "Price should be more 50")
    @Between(from = 0.01, to=50.5, message = "Price must be between 0.01 and 50.5")
    @Positive(message = "Price should be positive")
    @Column(name = "PRODUCT_PRICE", columnDefinition = "Decimal(10, 2) default '0.0'", nullable = false)
    private BigDecimal price;

    @Column(name = "PRODUCT_IS_ACTIVE", columnDefinition = "Boolean default 'true'", nullable = false)
    private boolean isActive;

    @OneToMany(
            mappedBy = "product", // метит сущность Product основной в этом соотношении
            orphanRemoval = true, // если удаляем продукт, удаляем и все его комменты
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    private Set<Comment> comments;

    @ManyToMany (
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "product_card",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id")
    )
    private Set<Card> cards = new HashSet<>();

    // добавление карты к продукту
    public void addCard(Card card)
    {
        cards.add(card); // добаление карты
        card.getProducts().add(this); // добавление товара в товары этой карты
    }

    // удаление карты из продукта
    public void removeCard(long cardId)
    {
        Card card = cards.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
        if(card != null)
        {
            cards.remove(card);
            card.getProducts().remove(this);
        }
    }
}