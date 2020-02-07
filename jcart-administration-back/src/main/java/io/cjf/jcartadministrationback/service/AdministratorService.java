package io.cjf.jcartadministrationback.service;

import io.cjf.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator selectByUsername(String username);

}
