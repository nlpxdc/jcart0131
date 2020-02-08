package io.cjf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.cjf.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void updateById(Administrator administrator);

    void updateByIdSelective(Administrator administrator);

    Page<Administrator> getWithPage(Integer pageNum);

    Integer create(Administrator administrator);

}
