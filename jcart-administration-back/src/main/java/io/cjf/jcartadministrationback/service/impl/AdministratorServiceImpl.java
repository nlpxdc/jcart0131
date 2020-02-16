package io.cjf.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.cjf.jcartadministrationback.dao.AdministratorMapper;
import io.cjf.jcartadministrationback.po.Administrator;
import io.cjf.jcartadministrationback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Administrator getById(Integer administratorId) {
        Administrator administrator = administratorMapper.selectByPrimaryKey(administratorId);
        return administrator;
    }

    @Override
    public Administrator getByUsername(String username) {
        Administrator administrator = administratorMapper.selectByUsername(username);
        return administrator;
    }

    @Override
    public void updateById(Administrator administrator) {
        administratorMapper.updateByPrimaryKeySelective(administrator);
    }

    @Override
    public void updateByIdSelective(Administrator administrator) {
        administratorMapper.updateByPrimaryKeySelective(administrator);
    }

    @Override
    public Page<Administrator> getWithPage(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<Administrator> administratorsPage = administratorMapper.selectWithPage();
        return administratorsPage;
    }

    @Override
    public Integer create(Administrator administrator) {
        administratorMapper.insert(administrator);
        Integer administratorId = administrator.getAdministratorId();
        return administratorId;
    }
}
