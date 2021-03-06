package io.cjf.jcartadministrationback.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.cjf.jcartadministrationback.dao.ProductDetailMapper;
import io.cjf.jcartadministrationback.dao.ProductMapper;
import io.cjf.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.cjf.jcartadministrationback.dto.out.ProductListOutDTO;
import io.cjf.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.cjf.jcartadministrationback.po.Product;
import io.cjf.jcartadministrationback.po.ProductDetail;
import io.cjf.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    @Transactional
    public Integer create(ProductCreateInDTO productCreateInDTO) {

        Product product = new Product();
        product.setProductCode(productCreateInDTO.getProductCode());
        product.setProductName(productCreateInDTO.getProductName());
        String description = productCreateInDTO.getDescription();
        product.setProductAbstract(description.substring(0, Math.min(100, description.length())));
        product.setPrice(productCreateInDTO.getPrice());
        product.setDiscount(productCreateInDTO.getDiscount());
        product.setQuantity(productCreateInDTO.getQuantity());
        product.setStatus(productCreateInDTO.getStatus());
        product.setMainPicUrl(productCreateInDTO.getMainPicUrl());
        product.setRewordPoints(productCreateInDTO.getRewordPoints());
        productMapper.insertSelective(product);
        Integer productId = product.getProductId();

        ProductDetail productDetail = new ProductDetail();
        productDetail.setProductId(productId);
        productDetail.setDescription(productCreateInDTO.getDescription());
        productDetail.setOtherPicUrls(JSON.toJSONString(productCreateInDTO.getOtherPicUrls()));
        productDetailMapper.insertSelective(productDetail);

        return productId;
    }

    @Override
    public void update(ProductUpdateInDTO productUpdateInDTO) {
        Product product = new Product();
        product.setProductId(productUpdateInDTO.getProductId());
        product.setProductCode(productUpdateInDTO.getProductCode());
        product.setProductName(productUpdateInDTO.getProductName());
        String description = productUpdateInDTO.getDescription();
        product.setProductAbstract(description.substring(0, Math.min(100, description.length())));
        product.setPrice(productUpdateInDTO.getPrice());
        product.setDiscount(productUpdateInDTO.getDiscount());
        product.setQuantity(productUpdateInDTO.getQuantity());
        product.setStatus(productUpdateInDTO.getStatus());
        product.setMainPicUrl(productUpdateInDTO.getMainPicUrl());
        product.setRewordPoints(productUpdateInDTO.getRewordPoints());
        productMapper.updateByPrimaryKeySelective(product);

        ProductDetail productDetail = new ProductDetail();
        productDetail.setProductId(productUpdateInDTO.getProductId());
        productDetail.setDescription(productUpdateInDTO.getDescription());
        productDetail.setOtherPicUrls(JSON.toJSONString(productUpdateInDTO.getOtherPicUrls()));
        productDetailMapper.updateByPrimaryKeySelective(productDetail);
    }

    @Override
    public Page<ProductListOutDTO> search(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<ProductListOutDTO> productListOutDTOS = productMapper.search();
        return productListOutDTOS;
    }

    @Override
    public ProductShowOutDTO getById(Integer productId) {
        Product product = productMapper.selectByPrimaryKey(productId);
        ProductShowOutDTO productShowOutDTO = new ProductShowOutDTO();
        productShowOutDTO.setProductId(product.getProductId());
        productShowOutDTO.setProductCode(product.getProductCode());
        productShowOutDTO.setProductName(product.getProductName());
        productShowOutDTO.setMainPicUrl(product.getMainPicUrl());
        productShowOutDTO.setPrice(product.getPrice());
        productShowOutDTO.setDiscount(product.getDiscount());
        productShowOutDTO.setQuantity(product.getQuantity());
        productShowOutDTO.setStatus(product.getStatus());
        productShowOutDTO.setRewordPoints(product.getRewordPoints());

        ProductDetail productDetail = productDetailMapper.selectByPrimaryKey(productId);
        productShowOutDTO.setDescription(productDetail.getDescription());
        String otherPicUrlsJsonstr = productDetail.getOtherPicUrls();
        List<String> otherPicUrls = JSON.parseArray(otherPicUrlsJsonstr, String.class);
        productShowOutDTO.setOtherPicUrls(otherPicUrls);

        return productShowOutDTO;
    }
}
