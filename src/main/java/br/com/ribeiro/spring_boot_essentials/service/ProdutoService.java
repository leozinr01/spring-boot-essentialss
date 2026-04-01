package br.com.ribeiro.spring_boot_essentials.service;

import br.com.ribeiro.spring_boot_essentials.database.model.ProdutoEntity;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Builder
public class ProdutoService {

    private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

    static {
        PRODUTOS.add(ProdutoEntity.builder()
                .id(1)
                .nome("Notebook")
                .preco(new BigDecimal(5000))
                .quantidade(10)
                .build());

        PRODUTOS.add(ProdutoEntity.builder()
                .id(2)
                .nome("Iphone")
                .preco(new BigDecimal(7000))
                .quantidade(10)
                .build());

        PRODUTOS.add(ProdutoEntity.builder()
                .id(3)
                .nome("Mouse")
                .preco(new BigDecimal(500))
                .quantidade(10)
                .build());
    }

    public List<ProdutoEntity>findAll() {
        return new ArrayList<>(PRODUTOS);
    }
}


