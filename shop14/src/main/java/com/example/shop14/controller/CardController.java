package com.example.shop14.controller;


import com.example.shop14.entity.Card;
import com.example.shop14.entity.Product;
import com.example.shop14.repo.CardRepository;
import com.example.shop14.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CardController {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/cards/{id}")
    public Optional<Card> getCardById(
            @PathVariable Long id
    )
    {
        return cardRepository.findById(id);
    }

    @DeleteMapping("/cards/{id}")
    public ResponseEntity<HttpStatus> deleteCardById(
            @PathVariable Long id
    )
    {
        List<Product> products = new ArrayList<>();

        // нужно найти все продукты для карты
        productRepository.findProductsByCardsId(id).forEach(products::add);
        // из них карту удалить и сохранить их
        products.forEach(
                p -> p.removeCard(id)
        );
        productRepository.saveAll(products);
        // только потом удалить карту из репозитори
        cardRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

/*
Добавьте и реализуйте в контроллере карт методы
// DELETE http://localhost:8080/products/%7BproductId%7D/cards/%7BcardId%7D - удаление продукта из карты
public ResponseEntity deleteCardFromProduct(
Long productId,
Long cardId
)
*/
@DeleteMapping("http://localhost:8080/products/{productId}/cards/{cardId}")
public ResponseEntity deleteCardFromProduct(
@PathVariable Long productId,
@PathVariable Long cardId
)
{
    // это е сдеоано!!!!!!!!!!!!!!!! не домыслил!!!!!!!!!!!!
    // удаление продукта из карты
    cardRepository.findById(cardId);

    return  new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
}

/*
// POST http://localhost:8080/products/%7BproductId%7D/cards - создание карты для продукта
public ResponseEntity addCard(
    Long productId,
    Card cardRequest
)
*/
@PostMapping("http://localhost:8080/products/{productId}/cards")
    public ResponseEntity addCard(
        @PathVariable Long productId,
        @RequestBody Card cardRequest
    )
{
    cardRepository.save(cardRequest);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
/*
// GET http://localhost:8080/cards/%7BcardId%7D/products - все продукты для карты
public ResponseEntity> getAllProductsByCardId(
    Long cardId
)
 */
@GetMapping("http://localhost:8080/cards/{cardId}/products")
    public ResponseEntity getAllProductsByCardId(
            @PathVariable  Long cardId
    )
    {
        List<Product> products = new ArrayList<>();

        productRepository.findProductsByCardsId(cardId).forEach(products::add);
        productRepository.saveAll(products);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}