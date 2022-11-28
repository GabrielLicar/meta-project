package com.gablicar.meta.controllers;

import com.gablicar.meta.entities.Sale;
import com.gablicar.meta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping()
    public List<Sale> findSales(){
        return service.findSales();
    }

}