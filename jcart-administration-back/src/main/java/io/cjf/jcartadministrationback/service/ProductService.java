package io.cjf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.cjf.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.cjf.jcartadministrationback.dto.out.ProductListOutDTO;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    //todo search with params
    Page<ProductListOutDTO> search(Integer pageNum);

}
